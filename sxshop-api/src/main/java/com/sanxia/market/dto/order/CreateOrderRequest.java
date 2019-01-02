package com.sanxia.market.dto.order;

import java.util.List;
import com.sanxia.market.dto.order.StoreCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("创建订单请求参数") 
public class CreateOrderRequest {

	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "goods_cart_ids多个商品以逗号拼接" ,dataType = "String") 
	private String goodscart_ids;
	
	@ApiModelProperty(value = "勾选的商品总价" ,dataType = "String") 
	private String total_price;
	
	@ApiModelProperty(value = "下单平台类型(web,h5,weixin,android,ios)" ,dataType = "String") 
	private String order_type;
	
	@ApiModelProperty(value = "店铺购物车数组" ,dataType = "数组") 
	private List<StoreCart> storeCartList;

	@ApiModelProperty(value = "发票类型（0个人，1对公）" ,dataType = "String") 
	private String invoiceType;
	
	@ApiModelProperty(value = "发票（对公时发票抬头）" ,dataType = "String") 
	private String invoice;
	
	@ApiModelProperty(value = "买家附言" ,dataType = "String") 
	private String msg;
	
	@ApiModelProperty(value = "地址id" ,dataType = "String") 
	private String addr_id;
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getGoodscart_ids() {
		return goodscart_ids;
	}

	public void setGoodscart_ids(String goodscart_ids) {
		this.goodscart_ids = goodscart_ids;
	}

	public List<StoreCart> getStoreCartList() {
		return storeCartList;
	}

	public void setStoreCartList(List<StoreCart> storeCartList) {
		this.storeCartList = storeCartList;
	}

	public String getTotal_price() {
		return total_price;
	}

	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(String addr_id) {
		this.addr_id = addr_id;
	}

	
	
}
