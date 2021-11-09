package com.ft.blog.system.service;

import com.ft.blog.system.entity.Dept;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ft.blog.system.entity.Tree;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IDeptService extends IService<Dept> {

    public List<Tree<Dept>> getTree();
    public Tree<Dept> getuserTree();
}
