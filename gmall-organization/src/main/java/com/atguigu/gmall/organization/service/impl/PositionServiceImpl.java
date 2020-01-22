package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.PositionDao;
import com.atguigu.gmall.organization.entity.PositionEntity;
import com.atguigu.gmall.organization.service.PositionService;


@Service("positionService")
public class PositionServiceImpl extends ServiceImpl<PositionDao, PositionEntity> implements PositionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<PositionEntity> page = this.page(
                new Query<PositionEntity>().getPage(params),
                new QueryWrapper<PositionEntity>()
        );

        return new PageVo(page);
    }

}