package com.sanxia.market.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户收藏（商品、店铺）请求参数")
public class AddFavoriteRequest {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;

	@ApiModelProperty(value = "收藏类型（0商品，1店铺）" ,dataType = "String") 
	private String type;
	
	@ApiModelProperty(value = "gs_id(收藏商品传商品id,收藏店铺传店铺id)" ,dataType = "String") 
	private String gs_id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGs_id() {
		return gs_id;
	}

	public void setGs_id(String gs_id) {
		this.gs_id = gs_id;
	}
	
	
}
