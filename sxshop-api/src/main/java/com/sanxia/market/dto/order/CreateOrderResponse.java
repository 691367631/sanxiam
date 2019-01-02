package com.sanxia.market.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("创建订单返回参数") 
public class CreateOrderResponse {

	@ApiModelProperty(value = "订单ids,多个订单id以逗号切分" ,dataType = "String") 
	private String order_ids;
	
	@ApiModelProperty(value = "商品总价" ,dataType = "String") 
	private String orders_total;

	@ApiModelProperty(value = "运费" ,dataType = "String") 
	private String allShipPrice;
	
	public String getOrder_ids() {
		return order_ids;
	}

	public void setOrder_ids(String order_ids) {
		this.order_ids = order_ids;
	}

	public String getOrders_total() {
		return orders_total;
	}

	public void setOrders_total(String orders_total) {
		this.orders_total = orders_total;
	}

	public String getAllShipPrice() {
		return allShipPrice;
	}

	public void setAllShipPrice(String allShipPrice) {
		this.allShipPrice = allShipPrice;
	}
	
	

	
	
}
