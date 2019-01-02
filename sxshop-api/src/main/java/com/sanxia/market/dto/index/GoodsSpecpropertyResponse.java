package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品规格数据查询返回信息") 
public class GoodsSpecpropertyResponse implements Serializable{

	
	

	@ApiModelProperty(value = "规格类型名称" ,dataType = "String") 
	private String name;
	
	@ApiModelProperty(value = "规格类型id" ,dataType = "String") 
	private String spec_id;
	

	@ApiModelProperty(value = "排序" ,dataType = "String") 
	private String psequence;
	
	
	@ApiModelProperty(value = "值" ,dataType = "String") 
	private String value;

	@ApiModelProperty(value = "值id" ,dataType = "String") 
	private String property_id;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSpec_id() {
		return spec_id;
	}


	public void setSpec_id(String spec_id) {
		this.spec_id = spec_id;
	}


	public String getPsequence() {
		return psequence;
	}


	public void setPsequence(String psequence) {
		this.psequence = psequence;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getProperty_id() {
		return property_id;
	}


	public void setProperty_id(String property_id) {
		this.property_id = property_id;
	}
	
	
}
