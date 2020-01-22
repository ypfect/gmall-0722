package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.RoleMenuRelationDao;
import com.atguigu.gmall.organization.entity.RoleMenuRelationEntity;
import com.atguigu.gmall.organization.service.RoleMenuRelationService;


@Service("roleMenuRelationService")
public class RoleMenuRelationServiceImpl extends ServiceImpl<RoleMenuRelationDao, RoleMenuRelationEntity> implements RoleMenuRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<RoleMenuRelationEntity> page = this.page(
                new Query<RoleMenuRelationEntity>().getPage(params),
                new QueryWrapper<RoleMenuRelationEntity>()
        );

        return new PageVo(page);
    }

}