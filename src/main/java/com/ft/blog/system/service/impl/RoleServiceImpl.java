package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.Role;
import com.ft.blog.system.mapper.RoleMapper;
import com.ft.blog.system.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public Integer insert (Role role) {
        return roleMapper.insert(role);
    }

    @Transactional
    @Override
    public List<Role> selectRoleUserid (int userid) {
        return roleMapper.selectUserid(userid);
    }
}
