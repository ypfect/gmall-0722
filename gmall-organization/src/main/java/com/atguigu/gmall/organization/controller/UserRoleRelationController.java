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

import com.atguigu.gmall.organization.entity.UserRoleRelationEntity;
import com.atguigu.gmall.organization.service.UserRoleRelationService;




/**
 * 用户和角色关系表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:28
 */
@Api(tags = "用户和角色关系表 管理")
@RestController
@RequestMapping("organization/userrolerelation")
public class UserRoleRelationController {
    @Autowired
    private UserRoleRelationService userRoleRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:userrolerelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = userRoleRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:userrolerelation:info')")
    public Resp<UserRoleRelationEntity> info(@PathVariable("id") String id){
		UserRoleRelationEntity userRoleRelation = userRoleRelationService.getById(id);

        return Resp.ok(userRoleRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:userrolerelation:save')")
    public Resp<Object> save(@RequestBody UserRoleRelationEntity userRoleRelation){
		userRoleRelationService.save(userRoleRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:userrolerelation:update')")
    public Resp<Object> update(@RequestBody UserRoleRelationEntity userRoleRelation){
		userRoleRelationService.updateById(userRoleRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:userrolerelation:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		userRoleRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
