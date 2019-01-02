package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_area 
* @Package: com.sanxia.market.entity
* @Title:ShoppingArea.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-07 16:32:29
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingArea extends BaseEntity implements Serializable {

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
	*@Fields areaName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String areaName;
	/**
	*@Fields level :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long level;
	/**
	*@Fields sequence :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long sequence;
	/**
	*@Fields parentId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long parentId;
	/**
	*@Fields common :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean common;
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
	public void setAreaName(String areaName){
		this.areaName=areaName;
	}

	public String getAreaName(){
		return areaName;
	}
	public void setLevel(Long level){
		this.level=level;
	}

	public Long getLevel(){
		return level;
	}
	public void setSequence(Long sequence){
		this.sequence=sequence;
	}

	public Long getSequence(){
		return sequence;
	}
	public void setParentId(Long parentId){
		this.parentId=parentId;
	}

	public Long getParentId(){
		return parentId;
	}
	public void setCommon(boolean common){
		this.common=common;
	}

	public boolean getCommon(){
		return common;
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
	if(null != areaName && !"".equals(areaName) ){
		sb.append("  areaName= "+areaName+",");
	}
	if(null != level && !"".equals(level) ){
		sb.append("  level= "+level+",");
	}
	if(null != sequence && !"".equals(sequence) ){
		sb.append("  sequence= "+sequence+",");
	}
	if(null != parentId && !"".equals(parentId) ){
		sb.append("  parentId= "+parentId+",");
	}
//	if(null != common && !"".equals(common) ){
//		sb.append("  common= "+common+",");
//	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
