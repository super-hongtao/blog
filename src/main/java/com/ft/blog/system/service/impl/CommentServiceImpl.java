package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.Comment;
import com.ft.blog.system.mapper.CommentMapper;
import com.ft.blog.system.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {
    @Autowired
    CommentMapper commentMapper;
    @Override
    public List<Comment> selectByArticleId (Integer id) {
        return commentMapper.selectByArticleId(id);
    }
}
