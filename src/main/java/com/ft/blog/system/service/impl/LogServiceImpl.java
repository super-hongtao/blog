package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.Log;
import com.ft.blog.system.mapper.LogMapper;
import com.ft.blog.system.service.ILogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
