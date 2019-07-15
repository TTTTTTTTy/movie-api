package com.summer.service;

import com.summer.model.Comment;

/**
 * @author Administrator
 * @since 2019/7/13 10:29
 */
public interface CommentService {

    int addComment(Comment comment);

    int updateComment(Comment comment);

    Comment getComment(int id);

}
