package com.summer.service.impl;

import com.summer.model.Movie;
import com.summer.service.MovieService;
import io.searchbox.client.JestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @since 2019/7/11 9:26
 */

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    JestClient jestClient;


    @Override
    public List<Movie> getMoviesByName(String moiveName) {
        return null;
    }

    @Override
    public List<Movie> getMoviesByDaoyan(String moiveDaoyan) {
        return null;
    }

    @Override
    public List<Movie> getMoviesByZhuyan(String movieZhuyan) {
        return null;
    }

    @Override
    public List<Movie> getMoviesByJianjie(String moiveJianjie) {
        return null;
    }

    @Override
    public List<Movie> getMoviesOrderByPingfen(int pageSize, int page) {
        return null;
    }

    @Override
    public List<Movie> getMoviesOrderByRemen(int pageSize, int page) {
        return null;
    }

    @Override
    public void setCommentId(String commentId, int movieId) {

    }

    @Override
    public void setRemenZhishu(int remenZhishu, int movieId) {

    }
}
