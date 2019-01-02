package com.sanxia.market.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询用户收藏（商品、店铺）请求参数")
public class QueryFavoriteRequest {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;

	@ApiModelProperty(value = "收藏类型（0商品，1店铺）" ,dataType = "String") 
	private String type;
	
	@ApiModelProperty(value = "页码" ,dataType = "String") 
	private String page;
	
	@ApiModelProperty(value = "每页显示数据条数" ,dataType = "String") 
	private String rows;

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

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	
}
