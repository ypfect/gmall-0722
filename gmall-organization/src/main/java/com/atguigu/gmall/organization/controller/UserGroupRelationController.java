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

import com.atguigu.gmall.organization.entity.UserGroupRelationEntity;
import com.atguigu.gmall.organization.service.UserGroupRelationService;




/**
 * 用户和组关系表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:30
 */
@Api(tags = "用户和组关系表 管理")
@RestController
@RequestMapping("organization/usergrouprelation")
public class UserGroupRelationController {
    @Autowired
    private UserGroupRelationService userGroupRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:usergrouprelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = userGroupRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:usergrouprelation:info')")
    public Resp<UserGroupRelationEntity> info(@PathVariable("id") String id){
		UserGroupRelationEntity userGroupRelation = userGroupRelationService.getById(id);

        return Resp.ok(userGroupRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:usergrouprelation:save')")
    public Resp<Object> save(@RequestBody UserGroupRelationEntity userGroupRelation){
		userGroupRelationService.save(userGroupRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:usergrouprelation:update')")
    public Resp<Object> update(@RequestBody UserGroupRelationEntity userGroupRelation){
		userGroupRelationService.updateById(userGroupRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:usergrouprelation:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		userGroupRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
