package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_goodscart 
* @Package: com.sanxia.market.entity
* @Title:ShoppingGoodscart.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-27 12:00:19
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingGoodscart extends BaseEntity implements Serializable {

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
	*@Fields count :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long count;
	/**
	*@Fields price :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double price;
	/**
	*@Fields specInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String specInfo;
	/**
	*@Fields goodsId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsId;
	/**
	*@Fields ofId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ofId;
	/**
	*@Fields cartType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String cartType;
	/**
	*@Fields scId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long scId;
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
	public void setCount(Long count){
		this.count=count;
	}

	public Long getCount(){
		return count;
	}
	public void setPrice(Double price){
		this.price=price;
	}

	public Double getPrice(){
		return price;
	}
	public void setSpecInfo(String specInfo){
		this.specInfo=specInfo;
	}

	public String getSpecInfo(){
		return specInfo;
	}
	public void setGoodsId(Long goodsId){
		this.goodsId=goodsId;
	}

	public Long getGoodsId(){
		return goodsId;
	}
	public void setOfId(Long ofId){
		this.ofId=ofId;
	}

	public Long getOfId(){
		return ofId;
	}
	public void setCartType(String cartType){
		this.cartType=cartType;
	}

	public String getCartType(){
		return cartType;
	}
	public void setScId(Long scId){
		this.scId=scId;
	}

	public Long getScId(){
		return scId;
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
	if(null != count && !"".equals(count) ){
		sb.append("  count= "+count+",");
	}
	if(null != price && !"".equals(price) ){
		sb.append("  price= "+price+",");
	}
	if(null != specInfo && !"".equals(specInfo) ){
		sb.append("  specInfo= "+specInfo+",");
	}
	if(null != goodsId && !"".equals(goodsId) ){
		sb.append("  goodsId= "+goodsId+",");
	}
	if(null != ofId && !"".equals(ofId) ){
		sb.append("  ofId= "+ofId+",");
	}
	if(null != cartType && !"".equals(cartType) ){
		sb.append("  cartType= "+cartType+",");
	}
	if(null != scId && !"".equals(scId) ){
		sb.append("  scId= "+scId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
