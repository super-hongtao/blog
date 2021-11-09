package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.Tag;
import com.ft.blog.system.mapper.TagMapper;
import com.ft.blog.system.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {
    @Autowired
    TagMapper tagMapper;

    @Override
    @Transactional
    public List<Tag> selectByArticleId(Integer id){
       return tagMapper.selectByArticleId(id);
    }
}
