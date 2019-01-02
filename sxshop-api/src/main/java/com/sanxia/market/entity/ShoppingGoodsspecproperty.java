package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_goodsspecproperty 
* @Package: com.sanxia.market.entity
* @Title:ShoppingGoodsspecproperty.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-21 15:22:26
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingGoodsspecproperty extends BaseEntity implements Serializable {

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
	*@Fields sequence :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long sequence;
	/**
	*@Fields value :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String value;
	/**
	*@Fields specId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long specId;
	/**
	*@Fields specImageId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long specImageId;
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
	public void setSequence(Long sequence){
		this.sequence=sequence;
	}

	public Long getSequence(){
		return sequence;
	}
	public void setValue(String value){
		this.value=value;
	}

	public String getValue(){
		return value;
	}
	public void setSpecId(Long specId){
		this.specId=specId;
	}

	public Long getSpecId(){
		return specId;
	}
	public void setSpecImageId(Long specImageId){
		this.specImageId=specImageId;
	}

	public Long getSpecImageId(){
		return specImageId;
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

	if(null != sequence && !"".equals(sequence) ){
		sb.append("  sequence= "+sequence+",");
	}
	if(null != value && !"".equals(value) ){
		sb.append("  value= "+value+",");
	}
	if(null != specId && !"".equals(specId) ){
		sb.append("  specId= "+specId+",");
	}
	if(null != specImageId && !"".equals(specImageId) ){
		sb.append("  specImageId= "+specImageId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
