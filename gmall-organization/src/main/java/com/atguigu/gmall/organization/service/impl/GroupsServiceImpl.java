package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.GroupsDao;
import com.atguigu.gmall.organization.entity.GroupsEntity;
import com.atguigu.gmall.organization.service.GroupsService;


@Service("groupsService")
public class GroupsServiceImpl extends ServiceImpl<GroupsDao, GroupsEntity> implements GroupsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<GroupsEntity> page = this.page(
                new Query<GroupsEntity>().getPage(params),
                new QueryWrapper<GroupsEntity>()
        );

        return new PageVo(page);
    }

}