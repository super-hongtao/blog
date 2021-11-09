package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.Arttype;
import com.ft.blog.system.entity.Wheel;
import com.ft.blog.system.mapper.WheelMapper;
import com.ft.blog.system.service.IArttypeService;
import com.ft.blog.system.service.IWheelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 轮播表 服务实现类
 * </p>
 */
@Service
public class WheelServiceImpl extends ServiceImpl<WheelMapper, Wheel> implements IWheelService {
     @Autowired
   WheelMapper wheelMapper;
    @Override
    public List<Wheel> selectAll () {
        List<Wheel> wheels = wheelMapper.selectAll();
        return wheels;
    }
}
