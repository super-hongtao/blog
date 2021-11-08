package com.ft.blog.system.mapper;

import com.ft.blog.system.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
public interface CommentMapper extends BaseMapper<Comment> {

      public List<Comment> selectByArticleId(Integer id);
}
