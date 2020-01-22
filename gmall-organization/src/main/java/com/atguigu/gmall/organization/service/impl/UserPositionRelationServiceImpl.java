package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.UserPositionRelationDao;
import com.atguigu.gmall.organization.entity.UserPositionRelationEntity;
import com.atguigu.gmall.organization.service.UserPositionRelationService;


@Service("userPositionRelationService")
public class UserPositionRelationServiceImpl extends ServiceImpl<UserPositionRelationDao, UserPositionRelationEntity> implements UserPositionRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<UserPositionRelationEntity> page = this.page(
                new Query<UserPositionRelationEntity>().getPage(params),
                new QueryWrapper<UserPositionRelationEntity>()
        );

        return new PageVo(page);
    }

}