package com.sanxia.market.dto.payment;

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("获取支付参数请求参数") 
public class OrderPayRequest {

	@ApiModelProperty(value = "订单ids" ,dataType = "String") 
	private String order_ids;
	
	@ApiModelProperty(value = "支付类型id" ,dataType = "String") 
	private String payTypeId;
	
	@ApiModelProperty(value = "支付类型" ,dataType = "String") 
	private String mark;
	
	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	public String getOrder_ids() {
		return order_ids;
	}

	public void setOrder_ids(String order_ids) {
		this.order_ids = order_ids;
	}

	public String getPayTypeId() {
		return payTypeId;
	}

	public void setPayTypeId(String payTypeId) {
		this.payTypeId = payTypeId;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	
}
