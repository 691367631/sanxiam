package com.sanxia.market.dto.goodscart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("根据规格查看商品价格及库存返回参数") 
public class QueryGoodsPriceResponse {
	@ApiModelProperty(value = "价格" ,dataType = "String") 
	private String price;
	@ApiModelProperty(value = "库存数量" ,dataType = "String") 
	private String count;
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	
}
