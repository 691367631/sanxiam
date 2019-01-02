package com.sanxia.market.dto.goodscart;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("店铺购物车") 
public class QueryGoodsCart {
	@ApiModelProperty(value = "店铺购物车id" ,dataType = "String") 
	private String cart_store_id;
	
	@ApiModelProperty(value = "用户id" ,dataType = "String")
	private String user_id;
	
	@ApiModelProperty(value = "店铺id" ,dataType = "String")
	private String store_id;
	
	@ApiModelProperty(value = "店铺名称" ,dataType = "String")
	private String store_name;
	
	@ApiModelProperty(value = "店铺logo" ,dataType = "String")
	private String store_logo;
	
	@ApiModelProperty(value = "店铺购物车金额" ,dataType = "String")
	private String store_price;
	
	@ApiModelProperty(value = "是否选中" ,dataType = "String")
	private boolean is_select=false;
	
	@ApiModelProperty(value = "店铺购物车商品" ,dataType = "String")
	private List<QueryGoods> goods_list;

	public String getCart_store_id() {
		return cart_store_id;
	}

	public void setCart_store_id(String cart_store_id) {
		this.cart_store_id = cart_store_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getStore_price() {
		return store_price;
	}

	public void setStore_price(String store_price) {
		this.store_price = store_price;
	}

	public List<QueryGoods> getGoods_list() {
		return goods_list;
	}

	public void setGoods_list(List<QueryGoods> goods_list) {
		this.goods_list = goods_list;
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getStore_logo() {
		return store_logo;
	}

	public void setStore_logo(String store_logo) {
		this.store_logo = store_logo;
	}

	public boolean isIs_select() {
		return is_select;
	}

	public void setIs_select(boolean is_select) {
		this.is_select = is_select;
	}
	
	
	
}
