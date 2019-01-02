package com.sanxia.market.dto.login;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("登录请求信息") 
public class LoginRequest implements Serializable{

	@ApiModelProperty(value = "用户名" ,dataType = "String") 
	private String user_name;
	
	@ApiModelProperty(value = "密码" ,dataType = "String") 
	private String user_password;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	
	
	
}
