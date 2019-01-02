package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_goodsspecification 
* @Package: com.sanxia.market.entity
* @Title:ShoppingGoodsspecification.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-21 15:21:24
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingGoodsspecification extends BaseEntity implements Serializable {

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
	*@Fields name :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String name;
	/**
	*@Fields sequence :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long sequence;
	/**
	*@Fields type :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String type;
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
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}
	public void setSequence(Long sequence){
		this.sequence=sequence;
	}

	public Long getSequence(){
		return sequence;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return type;
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

	if(null != name && !"".equals(name) ){
		sb.append("  name= "+name+",");
	}
	if(null != sequence && !"".equals(sequence) ){
		sb.append("  sequence= "+sequence+",");
	}
	if(null != type && !"".equals(type) ){
		sb.append("  type= "+type+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
