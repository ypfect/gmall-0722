package com.atguigu.gmall.organization.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:28
 */
@ApiModel
@Data
@TableName("roles")
public class RolesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "角色id")
	private String id;
	/**
	 * 角色code
	 */
	@ApiModelProperty(name = "code",value = "角色code")
	private String code;
	/**
	 * 角色名称
	 */
	@ApiModelProperty(name = "name",value = "角色名称")
	private String name;
	/**
	 * 简介
	 */
	@ApiModelProperty(name = "description",value = "简介")
	private String description;
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
