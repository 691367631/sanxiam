package com.sanxia.market.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询用户收货地址请求参数") 
public class QueryAddressRequest {

	
	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	

	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	
}
