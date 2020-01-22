package com.atguigu.gmall.organization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.organization.entity.PositionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 岗位表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:31
 */
public interface PositionService extends IService<PositionEntity> {

    PageVo queryPage(QueryCondition params);
}

