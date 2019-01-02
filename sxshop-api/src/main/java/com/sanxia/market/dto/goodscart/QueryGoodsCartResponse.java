package com.sanxia.market.dto.goodscart;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查看购物车返回参数") 
public class QueryGoodsCartResponse {

	
	@ApiModelProperty(value = "购物车总金额" ,dataType = "String")
	private String total_price;
	
	@ApiModelProperty(value = "购物车总金额" ,dataType = "String")
	private List<QueryGoodsCart>cartlist;

	public String getTotal_price() {
		return total_price;
	}

	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}

	public List<QueryGoodsCart> getCartlist() {
		return cartlist;
	}

	public void setCartlist(List<QueryGoodsCart> cartlist) {
		this.cartlist = cartlist;
	}
	
}
