package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_orderform 
* @Package: com.sanxia.market.entity
* @Title:ShoppingOrderform.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-06 11:02:39
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingOrderform extends BaseEntity implements Serializable {

	  private static final long serialVersionUID = 1L;
	  
	/**
	*@Fields id :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long id;
	/**
	*@Fields addTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date addTime;
	/**
	*@Fields deleteStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean deleteStatus;
	/**
	*@Fields finishTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date finishTime;
	/**
	*@Fields goodsAmount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double goodsAmount;
	/**
	*@Fields invoice :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String invoice;
	/**
	*@Fields invoiceType :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long invoiceType;
	/**
	*@Fields msg :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String msg;
	/**
	*@Fields orderId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String orderId;
	/**
	*@Fields orderStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long orderStatus;
	/**
	*@Fields payTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date payTime;
	/**
	*@Fields payMsg :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String payMsg;
	/**
	*@Fields refund :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double refund;
	/**
	*@Fields refundType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String refundType;
	/**
	*@Fields shipCode :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String shipCode;
	/**
	*@Fields shipTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date shipTime;
	/**
	*@Fields shipPrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double shipPrice;
	/**
	*@Fields totalPrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double totalPrice;
	/**
	*@Fields addrId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long addrId;
	/**
	*@Fields paymentId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long paymentId;
	/**
	*@Fields storeId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeId;
	/**
	*@Fields userId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long userId;
	/**
	*@Fields autoConfirmEmail :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean autoConfirmEmail;
	/**
	*@Fields autoConfirmSms :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean autoConfirmSms;
	/**
	*@Fields transport :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String transport;
	/**
	*@Fields outOrderId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String outOrderId;
	/**
	*@Fields ecId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ecId;
	/**
	*@Fields ciId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ciId;
	/**
	*@Fields orderSellerIntro :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String orderSellerIntro;
	/**
	*@Fields returnShipCode :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String returnShipCode;
	/**
	*@Fields returnEcId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long returnEcId;
	/**
	*@Fields returnContent :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String returnContent;
	/**
	*@Fields returnShipTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date returnShipTime;
	/**
	*@Fields orderType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String orderType;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return id;
	}
	public void setAddTime(Date addTime){
		this.addTime=addTime;
	}

	public Date getAddTime(){
		return addTime;
	}
	public void setDeleteStatus(boolean deleteStatus){
		this.deleteStatus=deleteStatus;
	}

	public boolean getDeleteStatus(){
		return deleteStatus;
	}
	public void setFinishTime(Date finishTime){
		this.finishTime=finishTime;
	}

	public Date getFinishTime(){
		return finishTime;
	}
	public void setGoodsAmount(Double goodsAmount){
		this.goodsAmount=goodsAmount;
	}

	public Double getGoodsAmount(){
		return goodsAmount;
	}
	public void setInvoice(String invoice){
		this.invoice=invoice;
	}

	public String getInvoice(){
		return invoice;
	}
	public void setInvoiceType(Long invoiceType){
		this.invoiceType=invoiceType;
	}

	public Long getInvoiceType(){
		return invoiceType;
	}
	public void setMsg(String msg){
		this.msg=msg;
	}

	public String getMsg(){
		return msg;
	}
	public void setOrderId(String orderId){
		this.orderId=orderId;
	}

	public String getOrderId(){
		return orderId;
	}
	public void setOrderStatus(Long orderStatus){
		this.orderStatus=orderStatus;
	}

	public Long getOrderStatus(){
		return orderStatus;
	}
	public void setPayTime(Date payTime){
		this.payTime=payTime;
	}

	public Date getPayTime(){
		return payTime;
	}
	public void setPayMsg(String payMsg){
		this.payMsg=payMsg;
	}

	public String getPayMsg(){
		return payMsg;
	}
	public void setRefund(Double refund){
		this.refund=refund;
	}

	public Double getRefund(){
		return refund;
	}
	public void setRefundType(String refundType){
		this.refundType=refundType;
	}

	public String getRefundType(){
		return refundType;
	}
	public void setShipCode(String shipCode){
		this.shipCode=shipCode;
	}

	public String getShipCode(){
		return shipCode;
	}
	public void setShipTime(Date shipTime){
		this.shipTime=shipTime;
	}

	public Date getShipTime(){
		return shipTime;
	}
	public void setShipPrice(Double shipPrice){
		this.shipPrice=shipPrice;
	}

	public Double getShipPrice(){
		return shipPrice;
	}
	public void setTotalPrice(Double totalPrice){
		this.totalPrice=totalPrice;
	}

	public Double getTotalPrice(){
		return totalPrice;
	}
	public void setAddrId(Long addrId){
		this.addrId=addrId;
	}

	public Long getAddrId(){
		return addrId;
	}
	public void setPaymentId(Long paymentId){
		this.paymentId=paymentId;
	}

	public Long getPaymentId(){
		return paymentId;
	}
	public void setStoreId(Long storeId){
		this.storeId=storeId;
	}

	public Long getStoreId(){
		return storeId;
	}
	public void setUserId(Long userId){
		this.userId=userId;
	}

	public Long getUserId(){
		return userId;
	}
	public void setAutoConfirmEmail(boolean autoConfirmEmail){
		this.autoConfirmEmail=autoConfirmEmail;
	}

	public boolean getAutoConfirmEmail(){
		return autoConfirmEmail;
	}
	public void setAutoConfirmSms(boolean autoConfirmSms){
		this.autoConfirmSms=autoConfirmSms;
	}

	public boolean getAutoConfirmSms(){
		return autoConfirmSms;
	}
	public void setTransport(String transport){
		this.transport=transport;
	}

	public String getTransport(){
		return transport;
	}
	public void setOutOrderId(String outOrderId){
		this.outOrderId=outOrderId;
	}

	public String getOutOrderId(){
		return outOrderId;
	}
	public void setEcId(Long ecId){
		this.ecId=ecId;
	}

	public Long getEcId(){
		return ecId;
	}
	public void setCiId(Long ciId){
		this.ciId=ciId;
	}

	public Long getCiId(){
		return ciId;
	}
	public void setOrderSellerIntro(String orderSellerIntro){
		this.orderSellerIntro=orderSellerIntro;
	}

	public String getOrderSellerIntro(){
		return orderSellerIntro;
	}
	public void setReturnShipCode(String returnShipCode){
		this.returnShipCode=returnShipCode;
	}

	public String getReturnShipCode(){
		return returnShipCode;
	}
	public void setReturnEcId(Long returnEcId){
		this.returnEcId=returnEcId;
	}

	public Long getReturnEcId(){
		return returnEcId;
	}
	public void setReturnContent(String returnContent){
		this.returnContent=returnContent;
	}

	public String getReturnContent(){
		return returnContent;
	}
	public void setReturnShipTime(Date returnShipTime){
		this.returnShipTime=returnShipTime;
	}

	public Date getReturnShipTime(){
		return returnShipTime;
	}
	public void setOrderType(String orderType){
		this.orderType=orderType;
	}

	public String getOrderType(){
		return orderType;
	}

	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	if(null != id && !"".equals(id) ){
		sb.append("  id= "+id+",");
	}
	if(null != addTime && !"".equals(addTime) ){
		sb.append("  addTime= "+addTime+",");
	}
//	if(null != deleteStatus && !"".equals(deleteStatus) ){
//		sb.append("  deleteStatus= "+deleteStatus+",");
//	}
	if(null != finishTime && !"".equals(finishTime) ){
		sb.append("  finishTime= "+finishTime+",");
	}
	if(null != goodsAmount && !"".equals(goodsAmount) ){
		sb.append("  goodsAmount= "+goodsAmount+",");
	}
	if(null != invoice && !"".equals(invoice) ){
		sb.append("  invoice= "+invoice+",");
	}
	if(null != invoiceType && !"".equals(invoiceType) ){
		sb.append("  invoiceType= "+invoiceType+",");
	}
	if(null != msg && !"".equals(msg) ){
		sb.append("  msg= "+msg+",");
	}
	if(null != orderId && !"".equals(orderId) ){
		sb.append("  orderId= "+orderId+",");
	}
	if(null != orderStatus && !"".equals(orderStatus) ){
		sb.append("  orderStatus= "+orderStatus+",");
	}
	if(null != payTime && !"".equals(payTime) ){
		sb.append("  payTime= "+payTime+",");
	}
	if(null != payMsg && !"".equals(payMsg) ){
		sb.append("  payMsg= "+payMsg+",");
	}
	if(null != refund && !"".equals(refund) ){
		sb.append("  refund= "+refund+",");
	}
	if(null != refundType && !"".equals(refundType) ){
		sb.append("  refundType= "+refundType+",");
	}
	if(null != shipCode && !"".equals(shipCode) ){
		sb.append("  shipCode= "+shipCode+",");
	}
	if(null != shipTime && !"".equals(shipTime) ){
		sb.append("  shipTime= "+shipTime+",");
	}
	if(null != shipPrice && !"".equals(shipPrice) ){
		sb.append("  shipPrice= "+shipPrice+",");
	}
	if(null != totalPrice && !"".equals(totalPrice) ){
		sb.append("  totalPrice= "+totalPrice+",");
	}
	if(null != addrId && !"".equals(addrId) ){
		sb.append("  addrId= "+addrId+",");
	}
	if(null != paymentId && !"".equals(paymentId) ){
		sb.append("  paymentId= "+paymentId+",");
	}
	if(null != storeId && !"".equals(storeId) ){
		sb.append("  storeId= "+storeId+",");
	}
	if(null != userId && !"".equals(userId) ){
		sb.append("  userId= "+userId+",");
	}
//	if(null != autoConfirmEmail && !"".equals(autoConfirmEmail) ){
//		sb.append("  autoConfirmEmail= "+autoConfirmEmail+",");
//	}
//	if(null != autoConfirmSms && !"".equals(autoConfirmSms) ){
//		sb.append("  autoConfirmSms= "+autoConfirmSms+",");
//	}
	if(null != transport && !"".equals(transport) ){
		sb.append("  transport= "+transport+",");
	}
	if(null != outOrderId && !"".equals(outOrderId) ){
		sb.append("  outOrderId= "+outOrderId+",");
	}
	if(null != ecId && !"".equals(ecId) ){
		sb.append("  ecId= "+ecId+",");
	}
	if(null != ciId && !"".equals(ciId) ){
		sb.append("  ciId= "+ciId+",");
	}
	if(null != orderSellerIntro && !"".equals(orderSellerIntro) ){
		sb.append("  orderSellerIntro= "+orderSellerIntro+",");
	}
	if(null != returnShipCode && !"".equals(returnShipCode) ){
		sb.append("  returnShipCode= "+returnShipCode+",");
	}
	if(null != returnEcId && !"".equals(returnEcId) ){
		sb.append("  returnEcId= "+returnEcId+",");
	}
	if(null != returnContent && !"".equals(returnContent) ){
		sb.append("  returnContent= "+returnContent+",");
	}
	if(null != returnShipTime && !"".equals(returnShipTime) ){
		sb.append("  returnShipTime= "+returnShipTime+",");
	}
	if(null != orderType && !"".equals(orderType) ){
		sb.append("  orderType= "+orderType+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
