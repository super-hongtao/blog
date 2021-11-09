package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.RoleUser;
import com.ft.blog.system.mapper.RoleUserMapper;
import com.ft.blog.system.service.IRoleUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RoleUserServiceImpl extends ServiceImpl<RoleUserMapper, RoleUser> implements IRoleUserService {

}
