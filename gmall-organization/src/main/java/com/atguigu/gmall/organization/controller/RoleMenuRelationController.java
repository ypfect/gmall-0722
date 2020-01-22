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

import com.atguigu.gmall.organization.entity.RoleMenuRelationEntity;
import com.atguigu.gmall.organization.service.RoleMenuRelationService;




/**
 * 角色和菜单关系表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:29
 */
@Api(tags = "角色和菜单关系表 管理")
@RestController
@RequestMapping("organization/rolemenurelation")
public class RoleMenuRelationController {
    @Autowired
    private RoleMenuRelationService roleMenuRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:rolemenurelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = roleMenuRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:rolemenurelation:info')")
    public Resp<RoleMenuRelationEntity> info(@PathVariable("id") String id){
		RoleMenuRelationEntity roleMenuRelation = roleMenuRelationService.getById(id);

        return Resp.ok(roleMenuRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:rolemenurelation:save')")
    public Resp<Object> save(@RequestBody RoleMenuRelationEntity roleMenuRelation){
		roleMenuRelationService.save(roleMenuRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:rolemenurelation:update')")
    public Resp<Object> update(@RequestBody RoleMenuRelationEntity roleMenuRelation){
		roleMenuRelationService.updateById(roleMenuRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:rolemenurelation:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		roleMenuRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
