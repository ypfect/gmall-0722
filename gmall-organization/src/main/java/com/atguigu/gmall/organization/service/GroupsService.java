package com.atguigu.gmall.organization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.organization.entity.GroupsEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 用户组表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:32
 */
public interface GroupsService extends IService<GroupsEntity> {

    PageVo queryPage(QueryCondition params);
}

