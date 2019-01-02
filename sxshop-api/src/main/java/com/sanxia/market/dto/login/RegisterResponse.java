package com.sanxia.market.dto.login;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("注册返回信息") 
public class RegisterResponse implements Serializable{

	@ApiModelProperty(value = "用户名" ,dataType = "String") 
	private String user_name;
	
	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	
}
