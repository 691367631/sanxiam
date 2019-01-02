package com.sanxia.market.dto.order;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询订单列表请求参数") 
public class QueryOrderRequest {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "订单编号" ,dataType = "String") 
	private String order_no;
	
	@ApiModelProperty(value = "订单状态" ,dataType = "String") 
	private String order_status;
	
	@ApiModelProperty(value = "页码" ,dataType = "String") 
	private String page;
	
	@ApiModelProperty(value = "每页显示数据条数" ,dataType = "String") 
	private String rows;

	@ApiModelProperty(value = "订单开始时间 yyyy-mm-dd" ,dataType = "String") 
	private String begin_time;
	
	@ApiModelProperty(value = "订单结束时间yyyy-mm-dd" ,dataType = "String") 
	private String end_time;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
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

	public String getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(String begin_time) {
		this.begin_time = begin_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	
	
	
	
}
