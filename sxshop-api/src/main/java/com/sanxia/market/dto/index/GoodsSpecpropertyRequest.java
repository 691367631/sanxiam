package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品规格数据查询请求信息") 
public class GoodsSpecpropertyRequest implements Serializable{

	
	

	@ApiModelProperty(value = "商品id" ,dataType = "String") 
	private String goods_id;
	
	@ApiModelProperty(value = "规格类型id" ,dataType = "String") 
	private String spec_id;
	

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getSpec_id() {
		return spec_id;
	}

	public void setSpec_id(String spec_id) {
		this.spec_id = spec_id;
	}

	
    
	

	
	
	
}
