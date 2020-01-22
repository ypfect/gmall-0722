package com.atguigu.gmall.organization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.organization.entity.RoleResourceRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 角色和资源关系表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:27
 */
public interface RoleResourceRelationService extends IService<RoleResourceRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

