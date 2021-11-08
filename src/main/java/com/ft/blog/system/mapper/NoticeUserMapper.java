package com.ft.blog.system.mapper;

import com.ft.blog.system.entity.NoticeUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
public interface NoticeUserMapper extends BaseMapper<NoticeUser> {
        public List<NoticeUser> selectNotUser(Integer id);
}
