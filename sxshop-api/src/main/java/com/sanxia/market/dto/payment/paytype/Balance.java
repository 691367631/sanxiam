package com.sanxia.market.dto.payment.paytype;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("预存款支付")
public class Balance {

	@ApiModelProperty(value = "支付流水号" ,dataType = "String") 
	private String paymentOrderNo;
	
	@ApiModelProperty(value = "总金额" ,dataType = "String") 
	private String totalPrice;
	
	@ApiModelProperty(value = "签名" ,dataType = "String") 
	private String sign;
	
	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "支付方式" ,dataType = "String") 
	private String mark;

	public String getPaymentOrderNo() {
		return paymentOrderNo;
	}

	public void setPaymentOrderNo(String paymentOrderNo) {
		this.paymentOrderNo = paymentOrderNo;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	
	
	
}
