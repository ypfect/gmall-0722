package com.atguigu.gmall.organization.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;


import com.alibaba.fastjson.JSON;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.organization.entity.UsersEntity;
import com.atguigu.gmall.organization.service.UsersService;




/**
 * 用户表
 *
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:29
 */
@Api(tags = "用户表 管理")
@RestController
@RequestMapping("organization/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('organization:users:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = usersService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('organization:users:info')")
    public Resp<UsersEntity> info(@PathVariable("id") String id){
		UsersEntity users = usersService.getById(id);

        return Resp.ok(users);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
//    @PreAuthorize("hasAuthority('organization:users:save')")
    public Resp<Object> save(@RequestBody UsersEntity users){
		usersService.save(users);

        return Resp.ok(null);
    }

    public static void main(String[] args) {
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setAccountNonExpired(1);
        usersEntity.setAccountNonLocked(1);
        usersEntity.setCreatedBy("system");
        usersEntity.setDeleted("Y");
        usersEntity.setUsername("ypf");
        usersEntity.setEnabled(1);
        usersEntity.setMobile("13881750148");
        usersEntity.setDescription("性感描述");
        usersEntity.setPassword("133251252");
        usersEntity.setCreatedTime(new Date());
        usersEntity.setUpdatedTime(new Date());
        usersEntity.setAccountNonLocked(1);
        usersEntity.setUpdatedBy("余鹏飞");
        usersEntity.setId("1285210");
        System.out.println(JSON.toJSONString(usersEntity));
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('organization:users:update')")
    public Resp<Object> update(@RequestBody UsersEntity users){
		usersService.updateById(users);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('organization:users:delete')")
    public Resp<Object> delete(@RequestBody String[] ids){
		usersService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
