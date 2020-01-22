package com.atguigu.gmall.organization.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 菜单表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:31
 */
@ApiModel
@Data
@TableName("menu")
public class MenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private String id;
	/**
	 * 父菜单id
	 */
	@ApiModelProperty(name = "parentId",value = "父菜单id")
	private String parentId;
	/**
	 * 菜单类型
	 */
	@ApiModelProperty(name = "type",value = "菜单类型")
	private String type;
	/**
	 * 菜单路径
	 */
	@ApiModelProperty(name = "href",value = "菜单路径")
	private String href;
	/**
	 * 菜单图标
	 */
	@ApiModelProperty(name = "icon",value = "菜单图标")
	private String icon;
	/**
	 * 菜单名称
	 */
	@ApiModelProperty(name = "name",value = "菜单名称")
	private String name;
	/**
	 * 描述
	 */
	@ApiModelProperty(name = "description",value = "描述")
	private String description;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "orderNum",value = "创建时间")
	private Integer orderNum;
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
