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

import com.atguigu.gmall.organization.entity.PositionEntity;
import com.atguigu.gmall.organization.service.PositionService;




/**
 * 岗位表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:31
 */
@Api(tags = "岗位表 管理")
@RestController
@RequestMapping("organization/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:position:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = positionService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:position:info')")
    public Resp<PositionEntity> info(@PathVariable("id") String id){
		PositionEntity position = positionService.getById(id);

        return Resp.ok(position);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:position:save')")
    public Resp<Object> save(@RequestBody PositionEntity position){
		positionService.save(position);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:position:update')")
    public Resp<Object> update(@RequestBody PositionEntity position){
		positionService.updateById(position);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:position:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		positionService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
