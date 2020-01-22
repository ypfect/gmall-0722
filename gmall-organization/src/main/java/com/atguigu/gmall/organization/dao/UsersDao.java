package com.atguigu.gmall.organization.dao;

import com.atguigu.gmall.organization.entity.UsersEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:29
 */
@Mapper
public interface UsersDao extends BaseMapper<UsersEntity> {
	
}
