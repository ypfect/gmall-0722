package com.atguigu.gmall.organization.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.organization.dao.MenuDao;
import com.atguigu.gmall.organization.entity.MenuEntity;
import com.atguigu.gmall.organization.service.MenuService;


@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuDao, MenuEntity> implements MenuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MenuEntity> page = this.page(
                new Query<MenuEntity>().getPage(params),
                new QueryWrapper<MenuEntity>()
        );

        return new PageVo(page);
    }

}