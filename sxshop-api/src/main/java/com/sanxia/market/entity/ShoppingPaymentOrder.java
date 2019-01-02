package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_payment_order 
* @Package: com.sanxia.market.entity
* @Title:ShoppingPaymentOrder.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-20 14:59:34
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingPaymentOrder extends BaseEntity implements Serializable {

	  private static final long serialVersionUID = 1L;
	  
	/**
	*@Fields paymentOrderNo :支付单号
	*/
	@ApiModelProperty(value = "支付单号" ,dataType = "String") 
	private String paymentOrderNo;
	/**
	*@Fields orderIds :订单ids
	*/
	@ApiModelProperty(value = "订单ids" ,dataType = "String") 
	private String orderIds;
	/**
	*@Fields totalPrice :总金额
	*/
	@ApiModelProperty(value = "总金额" ,dataType = "Double") 
	private Double totalPrice;
	/**
	*@Fields payStatus :支付状态
	*/
	@ApiModelProperty(value = "支付状态" ,dataType = "Integer") 
	private Integer payStatus;
	/**
	*@Fields thirdPartyNo :第三方订单号
	*/
	@ApiModelProperty(value = "第三方订单号" ,dataType = "String") 
	private String thirdPartyNo;
	/**
	*@Fields userId :用户id
	*/
	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String userId;
	/**
	*@Fields mark :支付方式
	*/
	@ApiModelProperty(value = "支付方式" ,dataType = "String") 
	private String mark;
	/**
	*@Fields addTime :创建时间
	*/
	@ApiModelProperty(value = "创建时间" ,dataType = "Date") 
	private Date addTime;
	/**
	*@Fields payOrderDesc :支付订单描述
	*/
	@ApiModelProperty(value = "支付订单描述" ,dataType = "String") 
	private String payOrderDesc;
	/**
	*@Fields reserve1 :预留1
	*/
	@ApiModelProperty(value = "预留1" ,dataType = "String") 
	private String reserve1;
	/**
	*@Fields reserve2 :预留2
	*/
	@ApiModelProperty(value = "预留2" ,dataType = "String") 
	private String reserve2;
	/**
	*@Fields reserve3 :预留3
	*/
	@ApiModelProperty(value = "预留3" ,dataType = "String") 
	private String reserve3;
	/**
	*@Fields reserve4 :预留4
	*/
	@ApiModelProperty(value = "预留4" ,dataType = "String") 
	private String reserve4;
	/**
	*@Fields reserve5 :预留5
	*/
	@ApiModelProperty(value = "预留5" ,dataType = "String") 
	private String reserve5;
	public void setPaymentOrderNo(String paymentOrderNo){
		this.paymentOrderNo=paymentOrderNo;
	}

	public String getPaymentOrderNo(){
		return paymentOrderNo;
	}
	public void setOrderIds(String orderIds){
		this.orderIds=orderIds;
	}

	public String getOrderIds(){
		return orderIds;
	}
	public void setTotalPrice(Double totalPrice){
		this.totalPrice=totalPrice;
	}

	public Double getTotalPrice(){
		return totalPrice;
	}
	public void setPayStatus(Integer payStatus){
		this.payStatus=payStatus;
	}

	public Integer getPayStatus(){
		return payStatus;
	}
	public void setThirdPartyNo(String thirdPartyNo){
		this.thirdPartyNo=thirdPartyNo;
	}

	public String getThirdPartyNo(){
		return thirdPartyNo;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getUserId(){
		return userId;
	}
	public void setMark(String mark){
		this.mark=mark;
	}

	public String getMark(){
		return mark;
	}
	public void setAddTime(Date addTime){
		this.addTime=addTime;
	}

	public Date getAddTime(){
		return addTime;
	}
	public void setPayOrderDesc(String payOrderDesc){
		this.payOrderDesc=payOrderDesc;
	}

	public String getPayOrderDesc(){
		return payOrderDesc;
	}
	public void setReserve1(String reserve1){
		this.reserve1=reserve1;
	}

	public String getReserve1(){
		return reserve1;
	}
	public void setReserve2(String reserve2){
		this.reserve2=reserve2;
	}

	public String getReserve2(){
		return reserve2;
	}
	public void setReserve3(String reserve3){
		this.reserve3=reserve3;
	}

	public String getReserve3(){
		return reserve3;
	}
	public void setReserve4(String reserve4){
		this.reserve4=reserve4;
	}

	public String getReserve4(){
		return reserve4;
	}
	public void setReserve5(String reserve5){
		this.reserve5=reserve5;
	}

	public String getReserve5(){
		return reserve5;
	}

	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	if(null != paymentOrderNo && !"".equals(paymentOrderNo) ){
		sb.append("支付单号  paymentOrderNo= "+paymentOrderNo+",");
	}
	if(null != orderIds && !"".equals(orderIds) ){
		sb.append("订单ids  orderIds= "+orderIds+",");
	}
	if(null != totalPrice && !"".equals(totalPrice) ){
		sb.append("总金额  totalPrice= "+totalPrice+",");
	}
	if(null != payStatus && !"".equals(payStatus) ){
		sb.append("支付状态  payStatus= "+payStatus+",");
	}
	if(null != thirdPartyNo && !"".equals(thirdPartyNo) ){
		sb.append("第三方订单号  thirdPartyNo= "+thirdPartyNo+",");
	}
	if(null != userId && !"".equals(userId) ){
		sb.append("用户id  userId= "+userId+",");
	}
	if(null != mark && !"".equals(mark) ){
		sb.append("支付方式  mark= "+mark+",");
	}
	if(null != addTime && !"".equals(addTime) ){
		sb.append("创建时间  addTime= "+addTime+",");
	}
	if(null != payOrderDesc && !"".equals(payOrderDesc) ){
		sb.append("支付订单描述  payOrderDesc= "+payOrderDesc+",");
	}
	if(null != reserve1 && !"".equals(reserve1) ){
		sb.append("预留1  reserve1= "+reserve1+",");
	}
	if(null != reserve2 && !"".equals(reserve2) ){
		sb.append("预留2  reserve2= "+reserve2+",");
	}
	if(null != reserve3 && !"".equals(reserve3) ){
		sb.append("预留3  reserve3= "+reserve3+",");
	}
	if(null != reserve4 && !"".equals(reserve4) ){
		sb.append("预留4  reserve4= "+reserve4+",");
	}
	if(null != reserve5 && !"".equals(reserve5) ){
		sb.append("预留5  reserve5= "+reserve5+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
