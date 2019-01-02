package com.sanxia.market.dto.goodscart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("删除购物车中商品请求参数") 
public class DeleteGoodsCartRequest {
	@ApiModelProperty(value = "购物车商品快照id" ,dataType = "String")
	private String goodscart_id;

	public String getGoodscart_id() {
		return goodscart_id;
	}

	public void setGoodscart_id(String goodscart_id) {
		this.goodscart_id = goodscart_id;
	}

	
	
	
}
