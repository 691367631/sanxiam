package com.sanxia.market.dto.goodscart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("购物车商品") 
public class QueryGoods {
	@ApiModelProperty(value = "商品数量" ,dataType = "String") 
	private String count;
	
	@ApiModelProperty(value = "商品规格信息" ,dataType = "String")
	private String spec_info;
	
	
	@ApiModelProperty(value = "商品id" ,dataType = "String")
	private String goods_id;
	
	@ApiModelProperty(value = "商品单价" ,dataType = "String")
	private String price;
	
	
	@ApiModelProperty(value = "商品名称" ,dataType = "String")
	private String goods_name;
	
	@ApiModelProperty(value = "商品图片" ,dataType = "String")
	private String goods_img;
	
	@ApiModelProperty(value = "是否选中" ,dataType = "String")
	private boolean is_select=false;

	@ApiModelProperty(value = "购物车商品快照id" ,dataType = "String")
	private String goodscart_id;
	
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getSpec_info() {
		return spec_info;
	}

	public void setSpec_info(String spec_info) {
		this.spec_info = spec_info;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_img() {
		return goods_img;
	}

	public void setGoods_img(String goods_img) {
		this.goods_img = goods_img;
	}

	public boolean isIs_select() {
		return is_select;
	}

	public void setIs_select(boolean is_select) {
		this.is_select = is_select;
	}

	public String getGoodscart_id() {
		return goodscart_id;
	}

	public void setGoodscart_id(String goodscart_id) {
		this.goodscart_id = goodscart_id;
	}
	
	
	
}
