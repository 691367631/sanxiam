package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("产品返回信息") 
public class GoodsResponse implements Serializable{


	@ApiModelProperty(value = "产品id" ,dataType = "String") 
	private String id;
	
	@ApiModelProperty(value = "产品名称" ,dataType = "String") 
	private String goods_name;

	@ApiModelProperty(value = "商品主图图片" ,dataType = "String") 
	private String goods_main_photo_id;
	
	@ApiModelProperty(value = "商品当前价格" ,dataType = "String") 
	private String goods_current_price;

	@ApiModelProperty(value = "产品总条数" ,dataType = "String") 
	private String total;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_main_photo_id() {
		return goods_main_photo_id;
	}

	public void setGoods_main_photo_id(String goods_main_photo_id) {
		this.goods_main_photo_id = goods_main_photo_id;
	}

	public String getGoods_current_price() {
		return goods_current_price;
	}

	public void setGoods_current_price(String goods_current_price) {
		this.goods_current_price = goods_current_price;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
	
	
	
}
