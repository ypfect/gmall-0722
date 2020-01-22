package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.UserGroupRelationDao;
import com.atguigu.gmall.organization.entity.UserGroupRelationEntity;
import com.atguigu.gmall.organization.service.UserGroupRelationService;


@Service("userGroupRelationService")
public class UserGroupRelationServiceImpl extends ServiceImpl<UserGroupRelationDao, UserGroupRelationEntity> implements UserGroupRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<UserGroupRelationEntity> page = this.page(
                new Query<UserGroupRelationEntity>().getPage(params),
                new QueryWrapper<UserGroupRelationEntity>()
        );

        return new PageVo(page);
    }

}