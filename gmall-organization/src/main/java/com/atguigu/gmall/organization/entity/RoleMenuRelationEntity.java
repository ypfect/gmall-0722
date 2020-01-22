package com.atguigu.gmall.organization.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色和菜单关系表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:29
 */
@ApiModel
@Data
@TableName("role_menu_relation")
public class RoleMenuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private String id;
	/**
	 * 菜单id
	 */
	@ApiModelProperty(name = "menuId",value = "菜单id")
	private String menuId;
	/**
	 * 角色id
	 */
	@ApiModelProperty(name = "roleId",value = "角色id")
	private String roleId;
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
