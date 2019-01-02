package com.sanxia.market.dto.order;

import java.util.List;
import com.sanxia.market.dto.order.GoodsCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel("订单商品") 
public class OrderGoods {

	@ApiModelProperty(value = "商品名称" ,dataType = "String") 
	private String goods_name;
	
	@ApiModelProperty(value = "商品id" ,dataType = "String") 
	private String goods_id;

	@ApiModelProperty(value = "商品图片" ,dataType = "String") 
	private String goods_main_photo;
	
	@ApiModelProperty(value = "商品数量" ,dataType = "String") 
	private String goods_count;
	
	@ApiModelProperty(value = "商品规格" ,dataType = "String") 
	private String spec_info;
	
	@ApiModelProperty(value = "商品单价" ,dataType = "String") 
	private String price;

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_count() {
		return goods_count;
	}

	public void setGoods_count(String goods_count) {
		this.goods_count = goods_count;
	}

	public String getSpec_info() {
		return spec_info;
	}

	public void setSpec_info(String spec_info) {
		this.spec_info = spec_info;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getGoods_main_photo() {
		return goods_main_photo;
	}

	public void setGoods_main_photo(String goods_main_photo) {
		this.goods_main_photo = goods_main_photo;
	}
	
	
	
	
}
