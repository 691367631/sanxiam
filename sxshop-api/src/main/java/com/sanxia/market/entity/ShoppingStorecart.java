package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_storecart 
* @Package: com.sanxia.market.entity
* @Title:ShoppingStorecart.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-27 12:00:53
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingStorecart extends BaseEntity implements Serializable {

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
	*@Fields cartSessionId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String cartSessionId;
	/**
	*@Fields totalPrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double totalPrice;
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
	*@Fields scStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long scStatus;
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
	public void setCartSessionId(String cartSessionId){
		this.cartSessionId=cartSessionId;
	}

	public String getCartSessionId(){
		return cartSessionId;
	}
	public void setTotalPrice(Double totalPrice){
		this.totalPrice=totalPrice;
	}

	public Double getTotalPrice(){
		return totalPrice;
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
	public void setScStatus(Long scStatus){
		this.scStatus=scStatus;
	}

	public Long getScStatus(){
		return scStatus;
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
	if(null != cartSessionId && !"".equals(cartSessionId) ){
		sb.append("  cartSessionId= "+cartSessionId+",");
	}
	if(null != totalPrice && !"".equals(totalPrice) ){
		sb.append("  totalPrice= "+totalPrice+",");
	}
	if(null != storeId && !"".equals(storeId) ){
		sb.append("  storeId= "+storeId+",");
	}
	if(null != userId && !"".equals(userId) ){
		sb.append("  userId= "+userId+",");
	}
	if(null != scStatus && !"".equals(scStatus) ){
		sb.append("  scStatus= "+scStatus+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
