package com.sanxia.market.dto.goodscart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("根据规格查看商品价格及库存请求参数") 
public class QueryGoodsPriceRequest {
	@ApiModelProperty(value = "规格ids,多个规格用逗号拆分" ,dataType = "String") 
	private String gsp;
	@ApiModelProperty(value = "商品id" ,dataType = "String") 
	private String id;
	public String getGsp() {
		return gsp;
	}
	public void setGsp(String gsp) {
		this.gsp = gsp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	
	
}
