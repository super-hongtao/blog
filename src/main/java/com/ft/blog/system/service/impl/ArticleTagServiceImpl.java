package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.ArticleTag;
import com.ft.blog.system.mapper.ArticleTagMapper;
import com.ft.blog.system.service.IArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表和标签表 服务实现类
 * </p>
 *
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements IArticleTagService {

}
