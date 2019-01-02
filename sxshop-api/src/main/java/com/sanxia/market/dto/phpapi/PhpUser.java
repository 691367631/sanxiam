package com.sanxia.market.dto.phpapi;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户信息") 
public class PhpUser implements Serializable{

	@ApiModelProperty(value = "主键" ,dataType = "String") 
	private String id;
	
	@ApiModelProperty(value = "手机号" ,dataType = "String") 
	private String mobile;
	
	@ApiModelProperty(value = "邮箱" ,dataType = "String") 
	private String email;
	
	@ApiModelProperty(value = "创建时间(YYYY-MM-DD HH:mm:ss)" ,dataType = "String") 
	private String createdAt;
	
	@ApiModelProperty(value = "昵称" ,dataType = "String") 
	private String nickname;
	
	@ApiModelProperty(value = "更新时间" ,dataType = "String") 
	private String updatedAt;

	@ApiModelProperty(value = "最后一次登录版本号" ,dataType = "String") 
	private String version;
	
	
	
	
	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	
}
