package com.sanxia.market.dto.phpapi;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户信息") 
public class PhpOrder implements Serializable{

	@ApiModelProperty(value = "用户主键" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "用户昵称" ,dataType = "String") 
	private String user_name;
	
	@ApiModelProperty(value = "用户电话" ,dataType = "String") 
	private String user_phone;
	
	@ApiModelProperty(value = "地址" ,dataType = "String") 
	private String user_address;
	
	@ApiModelProperty(value = "客服确认下单时间(YYYY-MM-DD HH:mm:ss)" ,dataType = "String") 
	private String order_confirmed_at;
	
	@ApiModelProperty(value = "餐厅id" ,dataType = "String") 
	private String restaurant_id;
	
	@ApiModelProperty(value = "餐厅名称（中文）" ,dataType = "String") 
	private String restaurant_name;

	@ApiModelProperty(value = "订单来源（ios,web,android）" ,dataType = "String") 
	private String platform;
	
	@ApiModelProperty(value = "订单地址快照" ,dataType = "String") 
	private String address_cache;
	
	@ApiModelProperty(value = "应用 语言" ,dataType = "String") 
	private String user_locale;

	
	
	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}



	public String getOrder_confirmed_at() {
		return order_confirmed_at;
	}

	public void setOrder_confirmed_at(String order_confirmed_at) {
		this.order_confirmed_at = order_confirmed_at;
	}

	public String getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(String restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}

	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getAddress_cache() {
		return address_cache;
	}

	public void setAddress_cache(String address_cache) {
		this.address_cache = address_cache;
	}

	public String getUser_locale() {
		return user_locale;
	}

	public void setUser_locale(String user_locale) {
		this.user_locale = user_locale;
	}
	
	
	
}
