package com.ft.blog.system.service;

import com.ft.blog.system.entity.Arttype;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 资源类型表 服务类
 * </p>
 */
public interface IArttypeService extends IService<Arttype> {
    public List<Arttype> selectArttype();
    public List<Arttype> selectAll();
}
