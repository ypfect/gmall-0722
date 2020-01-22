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

import com.atguigu.gmall.organization.entity.ResourceEntity;
import com.atguigu.gmall.organization.service.ResourceService;




/**
 * 资源表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:28
 */
@Api(tags = "资源表 管理")
@RestController
@RequestMapping("organization/resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:resource:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = resourceService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:resource:info')")
    public Resp<ResourceEntity> info(@PathVariable("id") String id){
		ResourceEntity resource = resourceService.getById(id);

        return Resp.ok(resource);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('organization:resource:save')")
    public Resp<Object> save(@RequestBody ResourceEntity resource){
		resourceService.save(resource);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:resource:update')")
    public Resp<Object> update(@RequestBody ResourceEntity resource){
		resourceService.updateById(resource);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:resource:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		resourceService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
