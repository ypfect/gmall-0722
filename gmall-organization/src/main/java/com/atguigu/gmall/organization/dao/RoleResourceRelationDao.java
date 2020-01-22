package com.atguigu.gmall.organization.dao;

import com.atguigu.gmall.organization.entity.RoleResourceRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色和资源关系表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:27
 */
@Mapper
public interface RoleResourceRelationDao extends BaseMapper<RoleResourceRelationEntity> {
	
}
