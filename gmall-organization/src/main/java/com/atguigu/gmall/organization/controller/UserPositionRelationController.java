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

import com.atguigu.gmall.organization.entity.UserPositionRelationEntity;
import com.atguigu.gmall.organization.service.UserPositionRelationService;




/**
 * 用户和岗位关系表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:30
 */
@Api(tags = "用户和岗位关系表 管理")
@RestController
@RequestMapping("organization/userpositionrelation")
public class UserPositionRelationController {
    @Autowired
    private UserPositionRelationService userPositionRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:userpositionrelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = userPositionRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:userpositionrelation:info')")
    public Resp<UserPositionRelationEntity> info(@PathVariable("id") String id){
		UserPositionRelationEntity userPositionRelation = userPositionRelationService.getById(id);

        return Resp.ok(userPositionRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:userpositionrelation:save')")
    public Resp<Object> save(@RequestBody UserPositionRelationEntity userPositionRelation){
		userPositionRelationService.save(userPositionRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:userpositionrelation:update')")
    public Resp<Object> update(@RequestBody UserPositionRelationEntity userPositionRelation){
		userPositionRelationService.updateById(userPositionRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:userpositionrelation:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		userPositionRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
