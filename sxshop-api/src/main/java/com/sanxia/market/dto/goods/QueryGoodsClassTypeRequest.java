package com.sanxia.market.dto.goods;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询商品分类筛选信息请求参数") 
public class QueryGoodsClassTypeRequest {

	
	@ApiModelProperty(value = "商品分类id" ,dataType = "String") 
	private String goodsClass_id;

	public String getGoodsClass_id() {
		return goodsClass_id;
	}

	public void setGoodsClass_id(String goodsClass_id) {
		this.goodsClass_id = goodsClass_id;
	}
	

	
	
}
