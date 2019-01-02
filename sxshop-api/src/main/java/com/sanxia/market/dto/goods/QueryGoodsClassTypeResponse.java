package com.sanxia.market.dto.goods;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询商品分类筛选信息返回参数") 
public class QueryGoodsClassTypeResponse {

	
	@ApiModelProperty(value = "商品分类筛选类型名称" ,dataType = "String") 
	private String goodsCalssType_Name;
	
	@ApiModelProperty(value = "商品分类筛选类型（specproperty,typeproperty,brand）" ,dataType = "String") 
	private String goodsCalssType;
	
	@ApiModelProperty(value = "商品分类筛选id" ,dataType = "String") 
	private String goodsCalssType_id;

	@ApiModelProperty(value = "商品分类筛选id" ,dataType = "String") 
	private List<GoodsCalssTypeChildren> goodsCalssTypechildList;

	public String getGoodsCalssType_Name() {
		return goodsCalssType_Name;
	}

	public void setGoodsCalssType_Name(String goodsCalssType_Name) {
		this.goodsCalssType_Name = goodsCalssType_Name;
	}

	public String getGoodsCalssType() {
		return goodsCalssType;
	}

	public void setGoodsCalssType(String goodsCalssType) {
		this.goodsCalssType = goodsCalssType;
	}

	public String getGoodsCalssType_id() {
		return goodsCalssType_id;
	}

	public void setGoodsCalssType_id(String goodsCalssType_id) {
		this.goodsCalssType_id = goodsCalssType_id;
	}

	public List<GoodsCalssTypeChildren> getGoodsCalssTypechildList() {
		return goodsCalssTypechildList;
	}

	public void setGoodsCalssTypechildList(List<GoodsCalssTypeChildren> goodsCalssTypechildList) {
		this.goodsCalssTypechildList = goodsCalssTypechildList;
	}
	
	
	
}
