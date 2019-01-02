package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_order_log 
* @Package: com.sanxia.market.entity
* @Title:ShoppingOrderLog.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-06 11:02:23
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingOrderLog extends BaseEntity implements Serializable {

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
	*@Fields logInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String logInfo;
	/**
	*@Fields stateInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String stateInfo;
	/**
	*@Fields logUserId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long logUserId;
	/**
	*@Fields ofId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ofId;
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
	public void setLogInfo(String logInfo){
		this.logInfo=logInfo;
	}

	public String getLogInfo(){
		return logInfo;
	}
	public void setStateInfo(String stateInfo){
		this.stateInfo=stateInfo;
	}

	public String getStateInfo(){
		return stateInfo;
	}
	public void setLogUserId(Long logUserId){
		this.logUserId=logUserId;
	}

	public Long getLogUserId(){
		return logUserId;
	}
	public void setOfId(Long ofId){
		this.ofId=ofId;
	}

	public Long getOfId(){
		return ofId;
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
	if(null != logInfo && !"".equals(logInfo) ){
		sb.append("  logInfo= "+logInfo+",");
	}
	if(null != stateInfo && !"".equals(stateInfo) ){
		sb.append("  stateInfo= "+stateInfo+",");
	}
	if(null != logUserId && !"".equals(logUserId) ){
		sb.append("  logUserId= "+logUserId+",");
	}
	if(null != ofId && !"".equals(ofId) ){
		sb.append("  ofId= "+ofId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
