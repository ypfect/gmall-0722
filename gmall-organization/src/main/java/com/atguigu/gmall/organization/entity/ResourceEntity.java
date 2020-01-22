package com.atguigu.gmall.organization.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 资源表
 * 
 * @author stanley.yu
 * @email 363825455@qq.com
 * @date 2020-01-22 21:56:28
 */
@ApiModel
@Data
@TableName("resource")
public class ResourceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 资源id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "资源id")
	private String id;
	/**
	 * 资源code
	 */
	@ApiModelProperty(name = "code",value = "资源code")
	private String code;
	/**
	 * 资源类型
	 */
	@ApiModelProperty(name = "type",value = "资源类型")
	private String type;
	/**
	 * 资源名称
	 */
	@ApiModelProperty(name = "name",value = "资源名称")
	private String name;
	/**
	 * 资源url
	 */
	@ApiModelProperty(name = "url",value = "资源url")
	private String url;
	/**
	 * 资源方法
	 */
	@ApiModelProperty(name = "method",value = "资源方法")
	private String method;
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
