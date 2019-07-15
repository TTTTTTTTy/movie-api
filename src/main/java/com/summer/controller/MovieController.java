package com.summer.controller;

import com.summer.model.Comment;
import com.summer.model.Movie;
import com.summer.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author Administrator
 * @since 2019/7/12 14:10
 */

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/search/movieName")
    public ResponseEntity<List<Movie>> searchMovieName(@RequestParam String movieName) {
        try {
            return ResponseEntity.ok(movieService.searchMovies("movie_name", movieName));
        } catch (IOException e) {
            return new ResponseEntity<>(null, HttpStatus.REQUEST_TIMEOUT);
        }
    }

    @GetMapping("/search/movieDaoyan")
    public ResponseEntity<List<Movie>> searchMovieDaoyan(@RequestParam String movieDaoyan) {
        try {
            return ResponseEntity.ok(movieService.searchMovies("movie_daoyan", movieDaoyan));
        } catch (IOException e) {
            return new ResponseEntity<>(null, HttpStatus.REQUEST_TIMEOUT);
        }
    }

    @GetMapping("/search/movieZhuyan")
    public ResponseEntity<List<Movie>> searchMovieZhuyan(@RequestParam String movieZhuyan) {
        try {
            return ResponseEntity.ok(movieService.searchMovies("movie_zhuyan", movieZhuyan));
        } catch (IOException e) {
            return new ResponseEntity<>(null, HttpStatus.REQUEST_TIMEOUT);
        }
    }

    @GetMapping("/search/jianjie")
    public ResponseEntity<List<Movie>> searchJianjie(@RequestParam String jianjie) {
        try {
            return ResponseEntity.ok(movieService.searchMovies("jianjie", jianjie));
        } catch (IOException e) {
            return new ResponseEntity<>(null, HttpStatus.REQUEST_TIMEOUT);
        }
    }

    @GetMapping("/movie/leixing")
    public ResponseEntity<List<Movie>> movieLeixing(@RequestParam String leixing, @RequestParam Integer page,
                                                    @RequestParam Integer pageSize) {
        try {
            return ResponseEntity.ok(movieService.getMoviesByKind(leixing, pageSize, page));
        } catch (IOException e) {
            return new ResponseEntity<>(null, HttpStatus.REQUEST_TIMEOUT);
        }
    }

    @GetMapping("/movie")
    public ResponseEntity<List<Movie>> moviePingfen(@RequestParam String key, @RequestParam Integer page,
                                                    @RequestParam Integer pageSize) {
        if(!key.equals("pingfen") && !key.equals("remenzhishu")){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        try {
            return ResponseEntity.ok(movieService.getMovies(key, pageSize, page));
        } catch (IOException e) {
            return new ResponseEntity<>(null, HttpStatus.REQUEST_TIMEOUT);
        }
    }

    @GetMapping("/movieDetails")
    public ResponseEntity<Movie> getMovieDetails(@RequestParam String id) {
        try {
            movieService.updateRemenZhishu(id);
            return ResponseEntity.ok(movieService.getMovie(id));
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/comment")
    public ResponseEntity<String> addComment(@RequestParam String movieId, @RequestParam String username, @RequestParam String content) {
        try {
            movieService.addComment(movieId, username, content);
            return ResponseEntity.ok("评论成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("评论失败", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
