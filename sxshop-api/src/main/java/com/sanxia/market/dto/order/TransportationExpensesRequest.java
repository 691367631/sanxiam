package com.sanxia.market.dto.order;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("计算配送费请求参数") 
public class TransportationExpensesRequest {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "goods_cart_ids多个商品以逗号拼接" ,dataType = "String") 
	private String goodscart_ids;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getGoodscart_ids() {
		return goodscart_ids;
	}

	public void setGoodscart_ids(String goodscart_ids) {
		this.goodscart_ids = goodscart_ids;
	}
	
	
	
}
