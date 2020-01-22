package com.atguigu.gmall.organization.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.organization.entity.MenuEntity;
import com.atguigu.gmall.organization.service.MenuService;




/**
 * 菜单表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:31
 */
@Api(tags = "菜单表 管理")
@RestController
@RequestMapping("organization/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:menu:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = menuService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:menu:info')")
    public Resp<MenuEntity> info(@PathVariable("id") String id){
		MenuEntity menu = menuService.getById(id);

        return Resp.ok(menu);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:menu:save')")
    public Resp<Object> save(@RequestBody MenuEntity menu){
		menuService.save(menu);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:menu:update')")
    public Resp<Object> update(@RequestBody MenuEntity menu){
		menuService.updateById(menu);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:menu:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		menuService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
