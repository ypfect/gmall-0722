package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.RolesDao;
import com.atguigu.gmall.organization.entity.RolesEntity;
import com.atguigu.gmall.organization.service.RolesService;


@Service("rolesService")
public class RolesServiceImpl extends ServiceImpl<RolesDao, RolesEntity> implements RolesService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<RolesEntity> page = this.page(
                new Query<RolesEntity>().getPage(params),
                new QueryWrapper<RolesEntity>()
        );

        return new PageVo(page);
    }

}