package com.sanxia.market.dto.payment.paytype;

public class PayAfter {

	private String code;//(0未支付1已支付，2支付失败，3处理中）
	private String msg;
	private String thirdPartyNo;
	private String paymentOrderNo;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getThirdPartyNo() {
		return thirdPartyNo;
	}
	public void setThirdPartyNo(String thirdPartyNo) {
		this.thirdPartyNo = thirdPartyNo;
	}
	public String getPaymentOrderNo() {
		return paymentOrderNo;
	}
	public void setPaymentOrderNo(String paymentOrderNo) {
		this.paymentOrderNo = paymentOrderNo;
	}
	
	
	
}
