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

import com.atguigu.gmall.organization.entity.RolesEntity;
import com.atguigu.gmall.organization.service.RolesService;




/**
 * 角色表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:28
 */
@Api(tags = "角色表 管理")
@RestController
@RequestMapping("organization/roles")
public class RolesController {
    @Autowired
    private RolesService rolesService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:roles:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = rolesService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:roles:info')")
    public Resp<RolesEntity> info(@PathVariable("id") String id){
		RolesEntity roles = rolesService.getById(id);

        return Resp.ok(roles);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:roles:save')")
    public Resp<Object> save(@RequestBody RolesEntity roles){
		rolesService.save(roles);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:roles:update')")
    public Resp<Object> update(@RequestBody RolesEntity roles){
		rolesService.updateById(roles);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:roles:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		rolesService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
