package com.sanxia.market.dto.goodscart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("添加商品到购物车返回信息") 
public class AddGoodsResponse {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "用户未登陆，传session_id" ,dataType = "String") 
	private String session_id;
	
	@ApiModelProperty(value = "商品购物车id/不同店铺以_切分、同店铺以,切分" ,dataType = "String") 
	private String goodscart_ids;
	
	@ApiModelProperty(value = "店铺购物车id/多个以,切分" ,dataType = "String") 
	private String storecart_ids;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getGoodscart_ids() {
		return goodscart_ids;
	}

	public void setGoodscart_ids(String goodscart_ids) {
		this.goodscart_ids = goodscart_ids;
	}

	public String getStorecart_ids() {
		return storecart_ids;
	}

	public void setStorecart_ids(String storecart_ids) {
		this.storecart_ids = storecart_ids;
	}



	

	
	
}
