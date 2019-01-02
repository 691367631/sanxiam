package com.sanxia.market.dto.payment;

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询支付方式返回参数") 
public class QueryPayTypeResponse {

	@ApiModelProperty(value = "支付类型" ,dataType = "String") 
	private String mark;
	
	@ApiModelProperty(value = "支付类型名称" ,dataType = "String") 
	private String markName;
	
	@ApiModelProperty(value = "支付类型id" ,dataType = "String") 
	private String payTypeId;

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMarkName() {
		return markName;
	}

	public void setMarkName(String markName) {
		this.markName = markName;
	}

	public String getPayTypeId() {
		return payTypeId;
	}

	public void setPayTypeId(String payTypeId) {
		this.payTypeId = payTypeId;
	}

	
	
}
