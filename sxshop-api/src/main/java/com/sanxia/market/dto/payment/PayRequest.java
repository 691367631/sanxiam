package com.sanxia.market.dto.payment;

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("支付请求参数") 
public class PayRequest {

	@ApiModelProperty(value = "支付流水号" ,dataType = "String") 
	private String paymentOrderNo;
	
	@ApiModelProperty(value = "支付类型id" ,dataType = "String") 
	private String payTypeId;
	
	@ApiModelProperty(value = "支付类型" ,dataType = "String") 
	private String mark;
	
	@ApiModelProperty(value = "签名" ,dataType = "String") 
	private String sign;
	
	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "验证码" ,dataType = "String") 
	private String validate_code;

	public String getPaymentOrderNo() {
		return paymentOrderNo;
	}

	public void setPaymentOrderNo(String paymentOrderNo) {
		this.paymentOrderNo = paymentOrderNo;
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

	public String getValidate_code() {
		return validate_code;
	}

	public void setValidate_code(String validate_code) {
		this.validate_code = validate_code;
	}
	
	
}
