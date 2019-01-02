package com.sanxia.common.model;

import java.io.Serializable;

import com.sanxia.common.enums.CodesEnum;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "公共返回model",value = "公共返回model") 
public class PubRespone implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "返回业务code码 （0000成功，其他失败）",dataType = "String") 
	private  String pubCode;
	@ApiModelProperty(value = "返回业务描述 ",dataType = "String") 
	private  String msg;
	@ApiModelProperty(value = "返回业务的具体数据 ",dataType = "String") 
	private  Object date;
	
	public PubRespone(){
		this.pubCode=CodesEnum.SUCCESS.getCode();
		this.msg=CodesEnum.SUCCESS.getMsg();
	}
	
	public String getPubCode() {
		return pubCode;
	}
	public void setPubCode(String pubCode) {
		this.pubCode = pubCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getDate() {
		return date;
	}
	public void setDate(Object date) {
		this.date = date;
	}
	
	
	
}
