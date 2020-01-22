package com.atguigu.gmall.organization.dao;

import com.atguigu.gmall.organization.entity.MenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:31
 */
@Mapper
public interface MenuDao extends BaseMapper<MenuEntity> {
	
}
