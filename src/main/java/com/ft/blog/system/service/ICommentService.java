package com.ft.blog.system.service;

import com.ft.blog.system.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface ICommentService extends IService<Comment> {
    public List<Comment> selectByArticleId(Integer id);
}
