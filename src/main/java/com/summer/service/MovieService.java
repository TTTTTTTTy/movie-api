package com.summer.service;

import com.summer.model.Movie;

import java.util.List;

/**
 * @author Administrator
 * @since 2019/7/10 16:32
 */
public interface MovieService {

    List<Movie>  getMoviesByName(String moiveName);

    List<Movie>  getMoviesByDaoyan(String moiveDaoyan);

    List<Movie>  getMoviesByZhuyan(String movieZhuyan);

    List<Movie>  getMoviesByJianjie(String moiveJianjie);

    List<Movie>  getMoviesOrderByPingfen(int pageSize, int page);

    List<Movie>  getMoviesOrderByRemen(int pageSize, int page);

    void setCommentId(String commentId, int movieId);

    void setRemenZhishu(int remenZhishu, int movieId);

}
