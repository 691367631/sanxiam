package com.sanxia.market.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("删除用户收藏（商品、店铺）请求参数")
public class DeleteFavoriteRequest {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;

	@ApiModelProperty(value = "收藏记录id" ,dataType = "String") 
	private String id;
	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
}
