package com.sanxia.market.dto.goodscart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("删除店铺购物车请求参数") 
public class DeleteStoreCartRequest {
	@ApiModelProperty(value = "店铺购物车id" ,dataType = "String") 
	private String cart_store_id;

	public String getCart_store_id() {
		return cart_store_id;
	}

	public void setCart_store_id(String cart_store_id) {
		this.cart_store_id = cart_store_id;
	}

	
	
	
	
}
