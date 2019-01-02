package com.sanxia.market.dto.order;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询订单明细返回参数") 
public class QueryOrderDetailResponse {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "订单id" ,dataType = "String") 
	private String order_id;
	
	@ApiModelProperty(value = "订单状态(0已取消,10待付款,15线下支付待审核,16货到付款待发货,20已付款,30已发货,40已收货,50已完成/已评价,60已结束)" ,dataType = "String") 
	private String order_status;
	
	@ApiModelProperty(value = "订单编号" ,dataType = "String") 
	private String order_no;
	
	@ApiModelProperty(value = "下单时间" ,dataType = "String") 
	private String order_time;
	
	@ApiModelProperty(value = "配送方式" ,dataType = "String") 
	private String transport;
	
	@ApiModelProperty(value = "运费" ,dataType = "String") 
	private String ship_price;
	
	@ApiModelProperty(value = "订单总价" ,dataType = "String") 
	private String totalPrice;
	
	@ApiModelProperty(value = "支付方式" ,dataType = "String") 
	private String payment_type;
	
	@ApiModelProperty(value = "支付时间" ,dataType = "String") 
	private String payTime;
	
	@ApiModelProperty(value = "收货人姓名" ,dataType = "String") 
	private String a_true_name;
	
	@ApiModelProperty(value = "收货人地址" ,dataType = "String") 
	private String a_addr_address;
	
	@ApiModelProperty(value = "邮编" ,dataType = "String") 
	private String a_zip;
	
	@ApiModelProperty(value = "电话号码" ,dataType = "String") 
	private String a_telephone;
	
	@ApiModelProperty(value = "手机号码" ,dataType = "String") 
	private String a_mobile;
	
	@ApiModelProperty(value = "发票类型（0个人，1对公）" ,dataType = "String") 
	private String invoiceType;
	
	@ApiModelProperty(value = "发票抬头（对公时发票抬头）" ,dataType = "String") 
	private String  invoice;
	
	@ApiModelProperty(value = "物流公司" ,dataType = "String") 
	private String ec_name;
	
	@ApiModelProperty(value = "物流单号" ,dataType = "String") 
	private String shipCode;
	
	@ApiModelProperty(value = "订单商品" ,dataType = "String") 
	private List<OrderGoods> orderGoodsList;
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getShip_price() {
		return ship_price;
	}

	public void setShip_price(String ship_price) {
		this.ship_price = ship_price;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getA_true_name() {
		return a_true_name;
	}

	public void setA_true_name(String a_true_name) {
		this.a_true_name = a_true_name;
	}

	public String getA_addr_address() {
		return a_addr_address;
	}

	public void setA_addr_address(String a_addr_address) {
		this.a_addr_address = a_addr_address;
	}

	public String getA_zip() {
		return a_zip;
	}

	public void setA_zip(String a_zip) {
		this.a_zip = a_zip;
	}

	public String getA_telephone() {
		return a_telephone;
	}

	public void setA_telephone(String a_telephone) {
		this.a_telephone = a_telephone;
	}

	public String getA_mobile() {
		return a_mobile;
	}

	public void setA_mobile(String a_mobile) {
		this.a_mobile = a_mobile;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getEc_name() {
		return ec_name;
	}

	public void setEc_name(String ec_name) {
		this.ec_name = ec_name;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	public List<OrderGoods> getOrderGoodsList() {
		return orderGoodsList;
	}

	public void setOrderGoodsList(List<OrderGoods> orderGoodsList) {
		this.orderGoodsList = orderGoodsList;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	
	
}
