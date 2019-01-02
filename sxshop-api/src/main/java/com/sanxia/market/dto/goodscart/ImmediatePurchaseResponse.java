package com.sanxia.market.dto.goodscart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("立即购买返回参数") 
public class ImmediatePurchaseResponse {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "商品购物车id" ,dataType = "String") 
	private String goodscart_id;
	
	@ApiModelProperty(value = "店铺购物车id" ,dataType = "String") 
	private String storecart_id;
	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}



	public String getGoodscart_id() {
		return goodscart_id;
	}

	public void setGoodscart_id(String goodscart_id) {
		this.goodscart_id = goodscart_id;
	}

	public String getStorecart_id() {
		return storecart_id;
	}

	public void setStorecart_id(String storecart_id) {
		this.storecart_id = storecart_id;
	}


	
}
