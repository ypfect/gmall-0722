package com.atguigu.gmall.organization.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:29
 */
@ApiModel
@Data
@TableName("users")
public class UsersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "用户id")
	private String id;
	/**
	 * 用户名
	 */
	@ApiModelProperty(name = "username",value = "用户名")
	private String username;
	/**
	 * 用户密码密文
	 */
	@ApiModelProperty(name = "password",value = "用户密码密文")
	private String password;
	/**
	 * 用户姓名
	 */
	@ApiModelProperty(name = "name",value = "用户姓名")
	private String name;
	/**
	 * 用户手机
	 */
	@ApiModelProperty(name = "mobile",value = "用户手机")
	private String mobile;
	/**
	 * 简介
	 */
	@ApiModelProperty(name = "description",value = "简介")
	private String description;
	/**
	 * 是否已删除Y：已删除，N：未删除
	 */
	@ApiModelProperty(name = "deleted",value = "是否已删除Y：已删除，N：未删除")
	private String deleted;
	/**
	 * 是否有效用户
	 */
	@ApiModelProperty(name = "enabled",value = "是否有效用户")
	private Integer enabled;
	/**
	 * 账号是否未过期
	 */
	@ApiModelProperty(name = "accountNonExpired",value = "账号是否未过期")
	private Integer accountNonExpired;
	/**
	 * 密码是否未过期
	 */
	@ApiModelProperty(name = "credentialsNonExpired",value = "密码是否未过期")
	private Integer credentialsNonExpired;
	/**
	 * 是否未锁定
	 */
	@ApiModelProperty(name = "accountNonLocked",value = "是否未锁定")
	private Integer accountNonLocked;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createdTime",value = "创建时间")
	private Date createdTime;
	/**
	 * 更新时间
	 */
	@ApiModelProperty(name = "updatedTime",value = "更新时间")
	private Date updatedTime;
	/**
	 * 创建人
	 */
	@ApiModelProperty(name = "createdBy",value = "创建人")
	private String createdBy;
	/**
	 * 更新人
	 */
	@ApiModelProperty(name = "updatedBy",value = "更新人")
	private String updatedBy;

}
