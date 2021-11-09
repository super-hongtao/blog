package com.ft.blog.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ft.blog.system.entity.Menu;
import com.ft.blog.util.TreeMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IMenuService extends IService<Menu> {
    public List<TreeMenu> selectMenuAllMy();

    public List<Menu> selectMenuAll();


}
