package com.summer.util;

import com.summer.mapper.MovieMapper;
import com.summer.model.Movie;
import com.summer.model.MovieExample;
import com.summer.service.impl.CommentEmotion;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

/**
 * @author Administrator
 * @since 2019/7/14 16:09
 */
public class UpdateMovieEmotions {

    private CommentEmotion commentEmotion;

    private MovieMapper movieMapper;

    public UpdateMovieEmotions(CommentEmotion commentEmotion, MovieMapper movieMapper) {
        this.commentEmotion = commentEmotion;
        this.movieMapper = movieMapper;
    }

    public void update() throws InterruptedException, IOException {
        MovieExample movieExample = new MovieExample();
        movieExample.createCriteria().andIdGreaterThan(1599);
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        System.out.println("开始判断评论情感倾向");
        System.out.println("-----------------------------------");
        for(Movie movie : movies){
            if(movie.getPinglun1() != null){
                movie.setEmotion1(commentEmotion.sendPost(movie.getPinglun1()));
                Thread.sleep(1000);
            }
            if(movie.getPinglun2() != null){
                movie.setEmotion2(commentEmotion.sendPost(movie.getPinglun2()));
                Thread.sleep(1000);
            }
            if(movie.getPinglun3() != null){
                movie.setEmotion3(commentEmotion.sendPost(movie.getPinglun3()));
                Thread.sleep(1000);
            }
            if(movie.getPinglun4() != null){
                movie.setEmotion4(commentEmotion.sendPost(movie.getPinglun4()));
                Thread.sleep(1000);
            }
            if(movie.getPinglun5() != null){
                movie.setEmotion5(commentEmotion.sendPost(movie.getPinglun5()));
                Thread.sleep(1000);
            }
            movieMapper.updateByPrimaryKeySelective(movie);
        }
        System.out.println("-----------------------------------");
        System.out.println("判断评论情感倾向结束");
    }
}
