package com.sanxia.market.dto.order;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询订单明细请求参数") 
public class QueryOrderDetailRequest {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "订单id" ,dataType = "String") 
	private String order_id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	
	
}
