package com.atguigu.gmall.organization.dao;

import com.atguigu.gmall.organization.entity.UserRoleRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户和角色关系表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:28
 */
@Mapper
public interface UserRoleRelationDao extends BaseMapper<UserRoleRelationEntity> {
	
}
