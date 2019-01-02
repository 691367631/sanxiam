package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("产品请求信息") 
public class GoodsRequest implements Serializable{

	@ApiModelProperty(value = "产品分类id,全部分类商品传''" ,dataType = "String") 
	private String gc_id;
	
	@ApiModelProperty(value = "页码" ,dataType = "String") 
	private String page;
	
	@ApiModelProperty(value = "每页显示数据条数" ,dataType = "String") 
	private String rows;

	@ApiModelProperty(value = "关键字" ,dataType = "String") 
	private String keywords;

	@ApiModelProperty(value = "查询推荐商品传1，不是推荐商品传''" ,dataType = "String") 
	private String isrecommend;
	
	@ApiModelProperty(value = "商品id，查询多个商品时传''" ,dataType = "String") 
	private String goods_id;
	public String getGc_id() {
		return gc_id;
	}

	public void setGc_id(String gc_id) {
		this.gc_id = gc_id;
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

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getIsrecommend() {
		return isrecommend;
	}

	public void setIsrecommend(String isrecommend) {
		this.isrecommend = isrecommend;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	
    
	

	
	
	
}
