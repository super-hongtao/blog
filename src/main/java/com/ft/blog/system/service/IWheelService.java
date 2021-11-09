package com.ft.blog.system.service;

import com.ft.blog.system.entity.Wheel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 轮播表 服务类
 * </p>
 */
public interface IWheelService extends IService<Wheel> {
    public List<Wheel> selectAll();
}
