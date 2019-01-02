package com.sanxia.market.dto.payment;

import java.util.List;

import com.sanxia.market.dto.payment.paytype.Balance;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("获取支付参数返回参数") 
public class OrderPayResponse {

	@ApiModelProperty(value = "预存款支付参数" ,dataType = "Object") 
	private Balance balance;

	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	
	

	
}
