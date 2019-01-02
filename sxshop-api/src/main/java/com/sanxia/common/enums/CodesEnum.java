package com.sanxia.common.enums;

public enum CodesEnum {
    SUCCESS("0000","成功"),
    FAIL0001("0001","未查询到数据！"),
	FAIL0002("0002","请求数据不完整！"),
	FAIL0003("0003","请求参数错误！"),
	FAIL0004("0004","请求其他三方服务失败"),
	FAIL0005("0005","请求.net服务失败"),
	FAIL0006("0006","查询出的数据异常！"),
	FAIL0007("0007","请求参数已存在！"),
	FAIL0008("0008","签名失败"),
	FAIL0009("0009","数据校验未通过"),
	FAIL0100("0100","用户id不能为空"),
	FAIL0101("0101","创建失败"),
	FAIL0102("0102","余额不足"),
	FAIL0200("0200","暂未实现");

    private String code;
    public String msg;

    CodesEnum(String code, String msg) {
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