package com.atguigu.gmall.organization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.organization.entity.RoleMenuRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 角色和菜单关系表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:29
 */
public interface RoleMenuRelationService extends IService<RoleMenuRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

