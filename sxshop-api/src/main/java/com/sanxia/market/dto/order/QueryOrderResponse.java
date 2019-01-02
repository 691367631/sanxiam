package com.sanxia.market.dto.order;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询订单列表返回参数") 
public class QueryOrderResponse {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "订单总条数" ,dataType = "String") 
	private String orders_total;
	
	@ApiModelProperty(value = "订单编号" ,dataType = "String") 
	private String order_no;
	
	@ApiModelProperty(value = "订单id" ,dataType = "String") 
	private String id;
	
	@ApiModelProperty(value = "下单时间" ,dataType = "String") 
	private String order_time;
	
	@ApiModelProperty(value = "订单状态(0已取消,10待付款,15线下支付待审核,16货到付款待发货,20已付款,30已发货,40已收货,50已完成/已评价,60已结束)" ,dataType = "String") 
	private String order_status;
	
	@ApiModelProperty(value = "支付方式" ,dataType = "String") 
	private String payment_type;

	@ApiModelProperty(value = "下单平台类型(web,h5,weixin,android,ios)" ,dataType = "String") 
	private String order_type;
	
	@ApiModelProperty(value = "商家名称" ,dataType = "String") 
	private String store_name;
	
	@ApiModelProperty(value = "订单总金额" ,dataType = "String") 
	private String totalPrice;
	
	@ApiModelProperty(value = "订单运费" ,dataType = "String") 
	private String ship_price;
	
	@ApiModelProperty(value = "订单中商品" ,dataType = "数组") 
	private List<OrderGoods> orderGoodslist;

	
	public String getOrders_total() {
		return orders_total;
	}

	public void setOrders_total(String orders_total) {
		this.orders_total = orders_total;
	}

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}



	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getShip_price() {
		return ship_price;
	}

	public void setShip_price(String ship_price) {
		this.ship_price = ship_price;
	}

	public List<OrderGoods> getOrderGoodslist() {
		return orderGoodslist;
	}

	public void setOrderGoodslist(List<OrderGoods> orderGoodslist) {
		this.orderGoodslist = orderGoodslist;
	}
	
	
	
}
