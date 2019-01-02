package com.sanxia.market.dto.goodscart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("添加商品到购物车请求参数") 
public class AddGoodsRequest {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "用户未登陆，传session_id" ,dataType = "String") 
	private String session_id;
	
	@ApiModelProperty(value = "商品id" ,dataType = "String") 
	private String goods_id;
	
	@ApiModelProperty(value = "规格值id,多个规格以，分割" ,dataType = "String") 
	private String property_id;
	
	@ApiModelProperty(value = "商品数量（删减商品传负数，但是不能把商品数量减成0）" ,dataType = "String") 
	private String goods_sum;

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

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getProperty_id() {
		return property_id;
	}

	public void setProperty_id(String property_id) {
		this.property_id = property_id;
	}

	public String getGoods_sum() {
		return goods_sum;
	}

	public void setGoods_sum(String goods_sum) {
		this.goods_sum = goods_sum;
	}
	
	
	
}
