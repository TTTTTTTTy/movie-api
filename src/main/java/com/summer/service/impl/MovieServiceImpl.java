package com.summer.service.impl;

import com.summer.mapper.MovieMapper;
import com.summer.model.Comment;
import com.summer.model.Movie;
import com.summer.service.CommentService;
import com.summer.service.MovieService;
import com.summer.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 * @since 2019/7/11 9:26
 */

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    ESClient esClient;

    @Autowired
    CommentService commentService;

    @Autowired
    CommentEmotion commentEmotion;

    @Autowired
    MovieMapper movieMapper;

    @Override
    public List<Movie> searchMovies(String key, String value) throws IOException {
        List<String> source = new ArrayList<>();
        source.add("id");
        source.add("movie_name");
        source.add("movie_bianju");
        source.add("movie_daoyan");
        source.add("movie_zhuyan");
        source.add("movie_leixing");
        source.add("pingfen");
        source.add("tupian_url");
        QueryMatch queryMatch;
        if(key.equals("jianjie")){
            source.add("jianjie");
            queryMatch = new QueryMatch(key, value, Analyzer.IK_SMART, 50);
        }
        else{
            queryMatch = new QueryMatch(key, value, Analyzer.STANDARD, 67);
        }
        String json = esClient.queryString(source, queryMatch, null, null);
        return esClient.search(json, "movie-1");
    }

    @Override
    public List<Movie> getMoviesByKind(String kind, int pageSize, int page) throws IOException {
        List<String> source = new ArrayList<>();
        source.add("id");
        source.add("movie_name");
        source.add("movie_daoyan");
        source.add("pingfen");
        source.add("tupian_url");
        QueryMatch queryMatch = new QueryMatch("movie_leixing", kind);
        queryMatch.setAnalyzer(Analyzer.IK_SMART);
        String json = esClient.queryString(source, queryMatch, null, null, page * pageSize, pageSize);
        return esClient.search(json, "movie-1");
    }

    @Override
    public List<Movie> getMovies(String key, int pageSize, int page) throws IOException {
        List<String> source = new ArrayList<>();
        source.add("id");
        source.add("movie_name");
        source.add("movie_daoyan");
        source.add("pingfen");
        source.add("remenzhishu");
        source.add("tupian_url");
        QueryRange queryRange = new QueryRange();
        queryRange.setField(key);
        List<KeyValue> options = new LinkedList<>();
        if(key.equals("pingfen")){
            KeyValue option = new KeyValue("gte", "8");
            options.add(option);
        }
        else{
            KeyValue option = new KeyValue("gte", "100");
            options.add(option);
        }
        queryRange.setOption(options);
        KeyValue sort = new KeyValue(key, Sort.DESC.getSort());
        String json = esClient.queryString(source, null, queryRange, sort, page * pageSize, pageSize);
        return esClient.search(json, "movie-1");
    }

    @Override
    public Movie getMovie(String id) throws IOException {
        Movie movie =  esClient.searchDoc(id, "movie-1");
        if(movie == null || movie.getComment_id() == null){
            return movie;
        }
        List<Comment> comments = new ArrayList<>();
        String[] ids = movie.getComment_id().split(",");
        for(int i = 0; i < ids.length; i++){
            int commentId = Integer.parseInt(ids[i]);
            comments.add(commentService.getComment(commentId));
        }
        movie.setComments(comments);
        return movie;
    }


    @Override
    public void addComment(String movieId, String username, String content) throws IOException {
        Comment comment = new Comment();
        comment.setUsername(username);
        comment.setContent(content);
        comment.setEmotion(commentEmotion.sendPost(content));
        int commentId = commentService.addComment(comment);
        Movie movie = esClient.searchDoc(movieId, "movie-1");
        String ids = movie.getComment_id();
        if(ids == null){
            movie.setComment_id(String.valueOf(commentId));
        }
        else{
            ids += "," + commentId;
            movie.setComment_id(ids);
        }
        esClient.insertOrUpdateDoc(String.valueOf(movie.getId()), movie, "movie-1");
        movieMapper.updateByPrimaryKeySelective(movie);

    }

    @Override
    public void updateRemenZhishu(String movieId) throws IOException {
        Movie movie = esClient.searchDoc(movieId, "movie-1");
        movie.setRemenzhishu(movie.getRemenzhishu() + 1);
        esClient.insertOrUpdateDoc(String.valueOf(movie.getId()), movie, "movie-1");
        movieMapper.updateByPrimaryKeySelective(movie);
    }
}
