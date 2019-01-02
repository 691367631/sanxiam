package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_integrallog 
* @Package: com.sanxia.market.entity
* @Title:ShoppingIntegrallog.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-22 17:06:00
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingIntegrallog extends BaseEntity implements Serializable {

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
	*@Fields content :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String content;
	/**
	*@Fields integral :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long integral;
	/**
	*@Fields type :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String type;
	/**
	*@Fields integralUserId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long integralUserId;
	/**
	*@Fields operateUserId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long operateUserId;
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
	public void setContent(String content){
		this.content=content;
	}

	public String getContent(){
		return content;
	}
	public void setIntegral(Long integral){
		this.integral=integral;
	}

	public Long getIntegral(){
		return integral;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return type;
	}
	public void setIntegralUserId(Long integralUserId){
		this.integralUserId=integralUserId;
	}

	public Long getIntegralUserId(){
		return integralUserId;
	}
	public void setOperateUserId(Long operateUserId){
		this.operateUserId=operateUserId;
	}

	public Long getOperateUserId(){
		return operateUserId;
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
	if(null != content && !"".equals(content) ){
		sb.append("  content= "+content+",");
	}
	if(null != integral && !"".equals(integral) ){
		sb.append("  integral= "+integral+",");
	}
	if(null != type && !"".equals(type) ){
		sb.append("  type= "+type+",");
	}
	if(null != integralUserId && !"".equals(integralUserId) ){
		sb.append("  integralUserId= "+integralUserId+",");
	}
	if(null != operateUserId && !"".equals(operateUserId) ){
		sb.append("  operateUserId= "+operateUserId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
