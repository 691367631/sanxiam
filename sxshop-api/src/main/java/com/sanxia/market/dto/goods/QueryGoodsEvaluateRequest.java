package com.sanxia.market.dto.goods;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询商品评论请求参数") 
public class QueryGoodsEvaluateRequest {

	
	@ApiModelProperty(value = "商品id" ,dataType = "String") 
	private String goods_id;
	
	@ApiModelProperty(value = "页码" ,dataType = "String") 
	private String page;
	
	@ApiModelProperty(value = "每页显示数据条数" ,dataType = "String") 
	private String rows;

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
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
