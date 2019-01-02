package com.sanxia.market.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("订单商品购物车") 
public class GoodsCart {

	@ApiModelProperty(value = "商品购物车id" ,dataType = "String") 
	private String goodscart_id;

	public String getGoodscart_id() {
		return goodscart_id;
	}

	public void setGoodscart_id(String goodscart_id) {
		this.goodscart_id = goodscart_id;
	}
	
	
	
	
}
