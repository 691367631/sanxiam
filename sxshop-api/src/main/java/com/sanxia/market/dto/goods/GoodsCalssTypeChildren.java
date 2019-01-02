package com.sanxia.market.dto.goods;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品分类筛选子集") 
public class GoodsCalssTypeChildren {

	@ApiModelProperty(value = "分类筛选子集名称" ,dataType = "String")
	private String child_name;
	
	@ApiModelProperty(value = "分类筛选子集id" ,dataType = "String")
	private String child_id;

	public String getChild_name() {
		return child_name;
	}

	public void setChild_name(String child_name) {
		this.child_name = child_name;
	}

	public String getChild_id() {
		return child_id;
	}

	public void setChild_id(String child_id) {
		this.child_id = child_id;
	}
	
	
}
