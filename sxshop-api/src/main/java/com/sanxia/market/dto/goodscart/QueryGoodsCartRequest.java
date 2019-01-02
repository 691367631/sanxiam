package com.sanxia.market.dto.goodscart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查看购物车请求参数") 
public class QueryGoodsCartRequest {
	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	
}
