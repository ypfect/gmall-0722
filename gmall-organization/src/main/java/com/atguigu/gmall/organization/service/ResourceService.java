package com.atguigu.gmall.organization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.organization.entity.ResourceEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 资源表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:28
 */
public interface ResourceService extends IService<ResourceEntity> {

    PageVo queryPage(QueryCondition params);
}

