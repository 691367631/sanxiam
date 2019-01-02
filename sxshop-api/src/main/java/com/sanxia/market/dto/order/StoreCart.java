package com.sanxia.market.dto.order;

import java.util.List;
import com.sanxia.market.dto.order.GoodsCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel("订单店铺购物车") 
public class StoreCart {

	@ApiModelProperty(value = "店铺购物车id" ,dataType = "String") 
	private String storecart_id;
	
	@ApiModelProperty(value = "商品购物车id数组" ,dataType = "数组") 
	private List<GoodsCart> goodscartList;

	public String getStorecart_id() {
		return storecart_id;
	}

	public void setStorecart_id(String storecart_id) {
		this.storecart_id = storecart_id;
	}

	public List<GoodsCart> getGoodscartList() {
		return goodscartList;
	}

	public void setGoodscartList(List<GoodsCart> goodscartList) {
		this.goodscartList = goodscartList;
	}


	
	
}
