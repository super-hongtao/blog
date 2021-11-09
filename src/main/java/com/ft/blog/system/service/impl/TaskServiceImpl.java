package com.ft.blog.system.service.impl;

import com.ft.blog.system.entity.Task;
import com.ft.blog.system.mapper.TaskMapper;
import com.ft.blog.system.service.ITaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements ITaskService {

}
