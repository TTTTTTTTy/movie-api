package com.summer.service.impl;

import com.summer.mapper.CommentMapper;
import com.summer.model.Comment;
import com.summer.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @since 2019/7/13 10:32
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public int addComment(Comment comment) {
        commentMapper.insertSelective(comment);
        return comment.getId();
    }

    @Override
    public int updateComment(Comment comment) {
        return commentMapper.updateByPrimaryKeySelective(comment);
    }

    @Override
    public Comment getComment(int id) {
        return commentMapper.selectByPrimaryKey(id);
    }
}
