package com.sanxia.market.dto.login;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("注册请求信息") 
public class RegisterRequest implements Serializable{

	@ApiModelProperty(value = "用户名" ,dataType = "String") 
	private String user_name;
	
	@ApiModelProperty(value = "密码" ,dataType = "String") 
	private String user_password;

	@ApiModelProperty(value = "手机号" ,dataType = "String") 
	private String user_phone;
	
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

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	
	
	
}
