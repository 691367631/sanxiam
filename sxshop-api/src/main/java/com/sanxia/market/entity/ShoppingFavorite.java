package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_favorite 
* @Package: com.sanxia.market.entity
* @Title:ShoppingFavorite.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-17 14:08:21
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingFavorite extends BaseEntity implements Serializable {

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
	*@Fields type :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long type;
	/**
	*@Fields goodsId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsId;
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
	public void setType(Long type){
		this.type=type;
	}

	public Long getType(){
		return type;
	}
	public void setGoodsId(Long goodsId){
		this.goodsId=goodsId;
	}

	public Long getGoodsId(){
		return goodsId;
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
	if(null != type && !"".equals(type) ){
		sb.append("  type= "+type+",");
	}
	if(null != goodsId && !"".equals(goodsId) ){
		sb.append("  goodsId= "+goodsId+",");
	}
	if(null != storeId && !"".equals(storeId) ){
		sb.append("  storeId= "+storeId+",");
	}
	if(null != userId && !"".equals(userId) ){
		sb.append("  userId= "+userId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
