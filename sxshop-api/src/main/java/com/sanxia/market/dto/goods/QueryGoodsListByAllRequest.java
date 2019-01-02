package com.sanxia.market.dto.goods;

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询商品列表（多参数查询，肩带各种排序）请求参数") 
public class QueryGoodsListByAllRequest {


	@ApiModelProperty(value = "商品分类id" ,dataType = "String") 
	private String goodsClass_id;

	@ApiModelProperty(value = "关键字" ,dataType = "String") 
	private String keyword;
	
	@ApiModelProperty(value = "排序类型（price金额,salenum销量，evaluate评分）" ,dataType = "String") 
	private String sequence_type;
	
	@ApiModelProperty(value = "排序规则（asc升序，desc降序）" ,dataType = "String") 
	private String sequence_rule;
	
	@ApiModelProperty(value = "筛选信息" ,dataType = "Object[]") 
	private List<QueryGoodsClassTypeResponse> queryGoodsClassTypeList;
	
	
	@ApiModelProperty(value = "页码" ,dataType = "String") 
	private String page;
	
	@ApiModelProperty(value = "每页显示数据条数" ,dataType = "String") 
	private String rows;

	public String getGoodsClass_id() {
		return goodsClass_id;
	}

	public void setGoodsClass_id(String goodsClass_id) {
		this.goodsClass_id = goodsClass_id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSequence_type() {
		return sequence_type;
	}

	public void setSequence_type(String sequence_type) {
		this.sequence_type = sequence_type;
	}

	public String getSequence_rule() {
		return sequence_rule;
	}

	public void setSequence_rule(String sequence_rule) {
		this.sequence_rule = sequence_rule;
	}

	public List<QueryGoodsClassTypeResponse> getQueryGoodsClassTypeList() {
		return queryGoodsClassTypeList;
	}

	public void setQueryGoodsClassTypeList(List<QueryGoodsClassTypeResponse> queryGoodsClassTypeList) {
		this.queryGoodsClassTypeList = queryGoodsClassTypeList;
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
