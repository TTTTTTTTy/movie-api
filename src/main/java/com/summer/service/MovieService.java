package com.summer.service;

import com.summer.model.Movie;

import java.io.IOException;
import java.util.List;

/**
 * @author Administrator
 * @since 2019/7/10 16:32
 */
public interface MovieService {

    List<Movie>  searchMovies(String key, String value) throws IOException;

    List<Movie>  getMoviesByKind(String kind, int pageSize, int page) throws IOException;

    List<Movie>  getMovies(String key, int pageSize, int page) throws IOException;

    Movie getMovie(String id) throws IOException;

    void addComment(String movieId, String username, String content) throws IOException;

    void updateRemenZhishu(String movieId) throws IOException;

}
