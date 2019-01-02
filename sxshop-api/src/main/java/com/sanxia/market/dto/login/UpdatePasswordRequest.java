package com.sanxia.market.dto.login;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("修改密码请求信息") 
public class UpdatePasswordRequest implements Serializable{

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "旧密码" ,dataType = "String") 
	private String old_password;

	@ApiModelProperty(value = "新密码" ,dataType = "String") 
	private String new_password;


	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOld_password() {
		return old_password;
	}

	public void setOld_password(String old_password) {
		this.old_password = old_password;
	}

	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}
	
	
	
}
