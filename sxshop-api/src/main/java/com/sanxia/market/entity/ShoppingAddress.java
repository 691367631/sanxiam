package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_address 
* @Package: com.sanxia.market.entity
* @Title:ShoppingAddress.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-07 16:32:46
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingAddress extends BaseEntity implements Serializable {

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
	*@Fields areaInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String areaInfo;
	/**
	*@Fields mobile :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String mobile;
	/**
	*@Fields telephone :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String telephone;
	/**
	*@Fields trueName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String trueName;
	/**
	*@Fields zip :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String zip;
	/**
	*@Fields areaId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long areaId;
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
	public void setAreaInfo(String areaInfo){
		this.areaInfo=areaInfo;
	}

	public String getAreaInfo(){
		return areaInfo;
	}
	public void setMobile(String mobile){
		this.mobile=mobile;
	}

	public String getMobile(){
		return mobile;
	}
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}

	public String getTelephone(){
		return telephone;
	}
	public void setTrueName(String trueName){
		this.trueName=trueName;
	}

	public String getTrueName(){
		return trueName;
	}
	public void setZip(String zip){
		this.zip=zip;
	}

	public String getZip(){
		return zip;
	}
	public void setAreaId(Long areaId){
		this.areaId=areaId;
	}

	public Long getAreaId(){
		return areaId;
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
	if(null != areaInfo && !"".equals(areaInfo) ){
		sb.append("  areaInfo= "+areaInfo+",");
	}
	if(null != mobile && !"".equals(mobile) ){
		sb.append("  mobile= "+mobile+",");
	}
	if(null != telephone && !"".equals(telephone) ){
		sb.append("  telephone= "+telephone+",");
	}
	if(null != trueName && !"".equals(trueName) ){
		sb.append("  trueName= "+trueName+",");
	}
	if(null != zip && !"".equals(zip) ){
		sb.append("  zip= "+zip+",");
	}
	if(null != areaId && !"".equals(areaId) ){
		sb.append("  areaId= "+areaId+",");
	}
	if(null != userId && !"".equals(userId) ){
		sb.append("  userId= "+userId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
