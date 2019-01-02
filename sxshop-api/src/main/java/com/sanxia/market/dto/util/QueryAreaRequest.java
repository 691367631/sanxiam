package com.sanxia.market.dto.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询省市联动请求参数") 
public class QueryAreaRequest {

	@ApiModelProperty(value = "省市区域id(查询省级数据时，传‘’)" ,dataType = "String") 
	private String area_parent_id;

	public String getArea_parent_id() {
		return area_parent_id;
	}

	public void setArea_parent_id(String area_parent_id) {
		this.area_parent_id = area_parent_id;
	}
	
	

	
}
