package com.sanxia.common.enums;

public enum OrderStatusEnum {
	cancel("0","已取消"),
	wait_pay("10","待付款"),
	outline_wait_pay("15","线下支付待审核"),
	huodaofukuan("16","货到付款待发货"),
	payed("20","已付款"),
	delivered("30","已发货"),
	received("40","已收货"),
	evaluated("50","已完成,已评价"),
	finished("60","已结束");

    private String code;
    public String msg;

    OrderStatusEnum(String code, String msg) {
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