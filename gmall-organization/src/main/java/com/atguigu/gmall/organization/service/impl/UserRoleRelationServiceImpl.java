package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.UserRoleRelationDao;
import com.atguigu.gmall.organization.entity.UserRoleRelationEntity;
import com.atguigu.gmall.organization.service.UserRoleRelationService;


@Service("userRoleRelationService")
public class UserRoleRelationServiceImpl extends ServiceImpl<UserRoleRelationDao, UserRoleRelationEntity> implements UserRoleRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<UserRoleRelationEntity> page = this.page(
                new Query<UserRoleRelationEntity>().getPage(params),
                new QueryWrapper<UserRoleRelationEntity>()
        );

        return new PageVo(page);
    }

}