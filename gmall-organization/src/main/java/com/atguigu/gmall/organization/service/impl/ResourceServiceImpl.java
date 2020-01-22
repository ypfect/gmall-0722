package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.ResourceDao;
import com.atguigu.gmall.organization.entity.ResourceEntity;
import com.atguigu.gmall.organization.service.ResourceService;


@Service("resourceService")
public class ResourceServiceImpl extends ServiceImpl<ResourceDao, ResourceEntity> implements ResourceService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ResourceEntity> page = this.page(
                new Query<ResourceEntity>().getPage(params),
                new QueryWrapper<ResourceEntity>()
        );

        return new PageVo(page);
    }

}