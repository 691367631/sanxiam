package com.sanxia.common.enums;

public enum PayTypeEnum {
	outline("outline","线下支付"),
	weixin_wap("weixin_wap","微信公众号支付"),
	balance("balance","预存款支付"),
	tenpay("tenpay","财付通"),
	bill("bill","快钱支付"),
	chinabank("chinabank","网银在线"),
	paypal("paypal","paypal");

    private String code;
    public String msg;

    PayTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

   
    
}