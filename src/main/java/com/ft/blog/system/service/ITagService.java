package com.ft.blog.system.service;

import com.ft.blog.system.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface ITagService extends IService<Tag> {
   public List<Tag> selectByArticleId(Integer id);
}
