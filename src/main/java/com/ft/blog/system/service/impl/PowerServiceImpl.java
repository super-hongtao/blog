package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.Power;
import com.ft.blog.system.mapper.PowerMapper;
import com.ft.blog.system.service.IPowerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class PowerServiceImpl extends ServiceImpl<PowerMapper, Power> implements IPowerService {

    @Autowired
    PowerMapper powerMapper;

    @Override
    public List<Power> MySelectByAllMenu () {
        return powerMapper.selectAllMenu();
    }

    @Override
    public List<Power> selectByUserId (Integer id) {
        return powerMapper.selectByUserId(id);
    }
}
