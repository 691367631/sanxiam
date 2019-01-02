package com.sanxia.market.dto.login;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("登录返回信息") 
public class LoginResponse implements Serializable{

	@ApiModelProperty(value = "用户名" ,dataType = "String") 
	private String user_name;
	
	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;

	@ApiModelProperty(value = "token" ,dataType = "String") 
	private String token;
	
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	
}
