package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("产品图片返回信息") 
public class GoodsPhotoResponse implements Serializable{

	
	
	@ApiModelProperty(value = "商品图片地址''" ,dataType = "String") 
	private String photo_path;

	public String getPhoto_path() {
		return photo_path;
	}

	public void setPhoto_path(String photo_path) {
		this.photo_path = photo_path;
	}
	

	

	
    
	

	
	
	
}
