package com.summer;

import com.summer.mapper.MovieMapper;
import com.summer.model.Comment;
import com.summer.model.Movie;
import com.summer.service.CommentService;
import com.summer.service.MovieService;
import com.summer.service.impl.CommentEmotion;
import com.summer.service.impl.ESClient;
import com.summer.util.UpdateMovieEmotions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieApiApplicationTests {

    @Autowired
    MovieService movieService;

    @Autowired
    CommentEmotion commentEmotion;

    @Autowired
    MovieMapper movieMapper;

    @Test
    public void contextLoads() throws IOException, InterruptedException {
        UpdateMovieEmotions updateMovieEmotions = new UpdateMovieEmotions(commentEmotion, movieMapper);
        updateMovieEmotions.update();
    }



    @Test
    public void testSearch() throws IOException {
//        Movie movie = esClient.searchDoc("1618", "movie-1");
//        System.out.println(movie.getId());
//        movie.setRemenzhishu(14);
//        boolean result = esClient.insertOrUpdateDoc(movie, "movie-1");
//        System.out.println(result);
    }

    @Test
    public void testInsert() throws IOException {
        Comment comment = new Comment();
        comment.setContent("测试添加评论");
        comment.setUsername("admin");
     //   System.err.println(commentService.addComment(comment));
    }

    @Test
    public void testUpdate() throws IOException {
        movieService.updateRemenZhishu("1342");
        Movie movie = movieService.getMovie("1342");
        System.out.println();
    }



}
