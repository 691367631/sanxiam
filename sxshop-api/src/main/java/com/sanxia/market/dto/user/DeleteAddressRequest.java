package com.sanxia.market.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("删除用户收货地址请求参数") 
public class DeleteAddressRequest {

	
	@ApiModelProperty(value = "地址id" ,dataType = "String") 
	private String address_id;

	public String getAddress_id() {
		return address_id;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	

	

	
}
