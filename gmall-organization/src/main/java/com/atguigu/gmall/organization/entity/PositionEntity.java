package com.atguigu.gmall.organization.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 岗位表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:31
 */
@ApiModel
@Data
@TableName("position")
public class PositionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private String id;
	/**
	 * 岗位名称
	 */
	@ApiModelProperty(name = "name",value = "岗位名称")
	private String name;
	/**
	 * 描述
	 */
	@ApiModelProperty(name = "description",value = "描述")
	private String description;
	/**
	 * 是否已删除Y：已删除，N：未删除
	 */
	@ApiModelProperty(name = "deleted",value = "是否已删除Y：已删除，N：未删除")
	private String deleted;
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
