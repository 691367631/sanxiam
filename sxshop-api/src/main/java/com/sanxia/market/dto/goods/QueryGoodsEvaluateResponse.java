package com.sanxia.market.dto.goods;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询商品评论返回参数") 
public class QueryGoodsEvaluateResponse {

	@ApiModelProperty(value = "评价记录id" ,dataType = "String") 
	private String evaluate_id;
	
	@ApiModelProperty(value = "买家评价评分" ,dataType = "String") 
	private String description_evaluate;

	@ApiModelProperty(value = "买家评价信息" ,dataType = "String") 
	private String evaluate_info;
	
	@ApiModelProperty(value = "评价日期" ,dataType = "String") 
	private String addTime;
	
	@ApiModelProperty(value = "评价用户" ,dataType = "String") 
	private String evaluate_user;
	
	@ApiModelProperty(value = "评论总条数" ,dataType = "String") 
	private String evaluate_total;


	public String getDescription_evaluate() {
		return description_evaluate;
	}

	public void setDescription_evaluate(String description_evaluate) {
		this.description_evaluate = description_evaluate;
	}

	public String getEvaluate_info() {
		return evaluate_info;
	}

	public void setEvaluate_info(String evaluate_info) {
		this.evaluate_info = evaluate_info;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public String getEvaluate_user() {
		return evaluate_user;
	}

	public void setEvaluate_user(String evaluate_user) {
		this.evaluate_user = evaluate_user;
	}

	public String getEvaluate_total() {
		return evaluate_total;
	}

	public void setEvaluate_total(String evaluate_total) {
		this.evaluate_total = evaluate_total;
	}

	public String getEvaluate_id() {
		return evaluate_id;
	}

	public void setEvaluate_id(String evaluate_id) {
		this.evaluate_id = evaluate_id;
	}
	
	
	
}
