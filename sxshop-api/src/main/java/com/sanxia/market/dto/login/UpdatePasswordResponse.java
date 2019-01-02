package com.sanxia.market.dto.login;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("修改密码返回信息") 
public class UpdatePasswordResponse implements Serializable{

	@ApiModelProperty(value = "用户名" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "密码" ,dataType = "String") 
	private String user_password;


	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	
	
	
	
}
