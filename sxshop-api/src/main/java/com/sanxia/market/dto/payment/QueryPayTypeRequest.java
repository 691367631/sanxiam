package com.sanxia.market.dto.payment;

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询支付方式请求参数") 
public class QueryPayTypeRequest {

	@ApiModelProperty(value = "店铺id,预留字段暂时传“”" ,dataType = "String") 
	private String store_id;
	
	@ApiModelProperty(value = "查询类型（user--店铺,admin--平台）,暂时传admin" ,dataType = "String") 
	private String type;
	
	@ApiModelProperty(value = "平台,(app/web/h5),暂时传h5" ,dataType = "String") 
	private String platform;


	public String getStore_id() {
		return store_id;
	}


	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	
	
}
