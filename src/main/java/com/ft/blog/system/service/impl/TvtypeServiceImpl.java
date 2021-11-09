package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.Tvtype;
import com.ft.blog.system.mapper.TvtypeMapper;
import com.ft.blog.system.service.ITvtypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class TvtypeServiceImpl extends ServiceImpl<TvtypeMapper, Tvtype> implements ITvtypeService {
   @Autowired
    TvtypeMapper tvtypeMapper;
    @Override
    public Tvtype[] selectDistinct () {
        return tvtypeMapper.selectDistinct();
    }
}
