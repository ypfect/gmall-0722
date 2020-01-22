package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.RoleResourceRelationDao;
import com.atguigu.gmall.organization.entity.RoleResourceRelationEntity;
import com.atguigu.gmall.organization.service.RoleResourceRelationService;


@Service("roleResourceRelationService")
public class RoleResourceRelationServiceImpl extends ServiceImpl<RoleResourceRelationDao, RoleResourceRelationEntity> implements RoleResourceRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<RoleResourceRelationEntity> page = this.page(
                new Query<RoleResourceRelationEntity>().getPage(params),
                new QueryWrapper<RoleResourceRelationEntity>()
        );

        return new PageVo(page);
    }

}