package com.sanxia.market.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询用户收藏（商品、店铺）返回参数")
public class QueryFavoriteResponse {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;

	@ApiModelProperty(value = "收藏类型（0商品，1店铺）" ,dataType = "String") 
	private String type;
	
	@ApiModelProperty(value = "商品名称" ,dataType = "String") 
	private String goods_name;

	@ApiModelProperty(value = "店铺名称" ,dataType = "String") 
	private String store_name;
	
	@ApiModelProperty(value = "收藏记录id" ,dataType = "String") 
	private String id;
	
	@ApiModelProperty(value = "收藏时间" ,dataType = "String") 
	private String addTime;
	
	@ApiModelProperty(value = "总条数" ,dataType = "String") 
	private String total;
	
	@ApiModelProperty(value = "商品图片" ,dataType = "String") 
	private String goods_main_photo_path;
	
	@ApiModelProperty(value = "店铺logo" ,dataType = "String") 
	private String store_logo_path;
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getGoods_main_photo_path() {
		return goods_main_photo_path;
	}

	public void setGoods_main_photo_path(String goods_main_photo_path) {
		this.goods_main_photo_path = goods_main_photo_path;
	}

	public String getStore_logo_path() {
		return store_logo_path;
	}

	public void setStore_logo_path(String store_logo_path) {
		this.store_logo_path = store_logo_path;
	}

	
}
