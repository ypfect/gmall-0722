package com.atguigu.gmall.organization.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户和岗位关系表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:30
 */
@ApiModel
@Data
@TableName("user_position_relation")
public class UserPositionRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private String id;
	/**
	 * 用户id
	 */
	@ApiModelProperty(name = "userId",value = "用户id")
	private String userId;
	/**
	 * 角色id
	 */
	@ApiModelProperty(name = "positionId",value = "角色id")
	private String positionId;
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
