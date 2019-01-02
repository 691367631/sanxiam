package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_predeposit_log 
* @Package: com.sanxia.market.entity
* @Title:ShoppingPredepositLog.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-21 13:39:40
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingPredepositLog extends BaseEntity implements Serializable {

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
	*@Fields pdLogAmount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double pdLogAmount;
	/**
	*@Fields pdLogInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String pdLogInfo;
	/**
	*@Fields pdOpType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String pdOpType;
	/**
	*@Fields pdType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String pdType;
	/**
	*@Fields pdLogAdminId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long pdLogAdminId;
	/**
	*@Fields pdLogUserId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long pdLogUserId;
	/**
	*@Fields predepositId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long predepositId;
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
	public void setPdLogAmount(Double pdLogAmount){
		this.pdLogAmount=pdLogAmount;
	}

	public Double getPdLogAmount(){
		return pdLogAmount;
	}
	public void setPdLogInfo(String pdLogInfo){
		this.pdLogInfo=pdLogInfo;
	}

	public String getPdLogInfo(){
		return pdLogInfo;
	}
	public void setPdOpType(String pdOpType){
		this.pdOpType=pdOpType;
	}

	public String getPdOpType(){
		return pdOpType;
	}
	public void setPdType(String pdType){
		this.pdType=pdType;
	}

	public String getPdType(){
		return pdType;
	}
	public void setPdLogAdminId(Long pdLogAdminId){
		this.pdLogAdminId=pdLogAdminId;
	}

	public Long getPdLogAdminId(){
		return pdLogAdminId;
	}
	public void setPdLogUserId(Long pdLogUserId){
		this.pdLogUserId=pdLogUserId;
	}

	public Long getPdLogUserId(){
		return pdLogUserId;
	}
	public void setPredepositId(Long predepositId){
		this.predepositId=predepositId;
	}

	public Long getPredepositId(){
		return predepositId;
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
	if(null != pdLogAmount && !"".equals(pdLogAmount) ){
		sb.append("  pdLogAmount= "+pdLogAmount+",");
	}
	if(null != pdLogInfo && !"".equals(pdLogInfo) ){
		sb.append("  pdLogInfo= "+pdLogInfo+",");
	}
	if(null != pdOpType && !"".equals(pdOpType) ){
		sb.append("  pdOpType= "+pdOpType+",");
	}
	if(null != pdType && !"".equals(pdType) ){
		sb.append("  pdType= "+pdType+",");
	}
	if(null != pdLogAdminId && !"".equals(pdLogAdminId) ){
		sb.append("  pdLogAdminId= "+pdLogAdminId+",");
	}
	if(null != pdLogUserId && !"".equals(pdLogUserId) ){
		sb.append("  pdLogUserId= "+pdLogUserId+",");
	}
	if(null != predepositId && !"".equals(predepositId) ){
		sb.append("  predepositId= "+predepositId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
