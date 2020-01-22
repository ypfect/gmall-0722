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

import com.atguigu.gmall.organization.entity.RoleResourceRelationEntity;
import com.atguigu.gmall.organization.service.RoleResourceRelationService;




/**
 * 角色和资源关系表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:27
 */
@Api(tags = "角色和资源关系表 管理")
@RestController
@RequestMapping("organization/roleresourcerelation")
public class RoleResourceRelationController {
    @Autowired
    private RoleResourceRelationService roleResourceRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:roleresourcerelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = roleResourceRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:roleresourcerelation:info')")
    public Resp<RoleResourceRelationEntity> info(@PathVariable("id") String id){
		RoleResourceRelationEntity roleResourceRelation = roleResourceRelationService.getById(id);

        return Resp.ok(roleResourceRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:roleresourcerelation:save')")
    public Resp<Object> save(@RequestBody RoleResourceRelationEntity roleResourceRelation){
		roleResourceRelationService.save(roleResourceRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:roleresourcerelation:update')")
    public Resp<Object> update(@RequestBody RoleResourceRelationEntity roleResourceRelation){
		roleResourceRelationService.updateById(roleResourceRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:roleresourcerelation:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		roleResourceRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
