package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.sanxia.market.dto.ApiResult;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("规格类型返回信息") 
public class GoodsSpecificationResponse  implements Serializable{

	@ApiModelProperty(value = "规格id" ,dataType = "String") 
	private String spec_id;
	
	@ApiModelProperty(value = "规格名称" ,dataType = "String") 
	private String name;

	@ApiModelProperty(value = "排序" ,dataType = "String") 
	private String ssquence;
	
	@ApiModelProperty(value = "规格属性列表" ,dataType = "Object[]") 
	private List<GoodsSpecpropertyResponse> list;
	

	public String getSpec_id() {
		return spec_id;
	}

	public void setSpec_id(String spec_id) {
		this.spec_id = spec_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsquence() {
		return ssquence;
	}

	public void setSsquence(String ssquence) {
		this.ssquence = ssquence;
	}

	public List<GoodsSpecpropertyResponse> getList() {
		return list;
	}

	public void setList(List<GoodsSpecpropertyResponse> list) {
		this.list = list;
	}
	

	
	
}
