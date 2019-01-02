package com.sanxia.market.dto.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询省市联动返回参数") 
public class QueryAreaResponse {

	@ApiModelProperty(value = "省市区域id" ,dataType = "String") 
	private String area_id;
	
	@ApiModelProperty(value = "省市区域名称" ,dataType = "String") 
	private String areaName;
	
	@ApiModelProperty(value = "排序" ,dataType = "String") 
	private String sequence;

	public String getArea_id() {
		return area_id;
	}

	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}


	
}
