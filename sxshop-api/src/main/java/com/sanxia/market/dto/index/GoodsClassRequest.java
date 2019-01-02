package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("产品分类请求信息") 
public class GoodsClassRequest implements Serializable{

	@ApiModelProperty(value = "产品分类父id,一级分类传''" ,dataType = "String") 
	private String parent_id;

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	

	

	
	
	
}
