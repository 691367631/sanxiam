package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("产品信息请求信息") 
public class GoodsDetailsRequest implements Serializable{

	
	

	@ApiModelProperty(value = "商品id" ,dataType = "String") 
	private String goods_id;
	
	
	

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	
    
	

	
	
	
}
