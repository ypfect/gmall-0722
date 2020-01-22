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

import com.atguigu.gmall.organization.entity.GroupsEntity;
import com.atguigu.gmall.organization.service.GroupsService;




/**
 * 用户组表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:32
 */
@Api(tags = "用户组表 管理")
@RestController
@RequestMapping("organization/groups")
public class GroupsController {
    @Autowired
    private GroupsService groupsService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:groups:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = groupsService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:groups:info')")
    public Resp<GroupsEntity> info(@PathVariable("id") String id){
		GroupsEntity groups = groupsService.getById(id);

        return Resp.ok(groups);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:groups:save')")
    public Resp<Object> save(@RequestBody GroupsEntity groups){
		groupsService.save(groups);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:groups:update')")
    public Resp<Object> update(@RequestBody GroupsEntity groups){
		groupsService.updateById(groups);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:groups:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		groupsService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
