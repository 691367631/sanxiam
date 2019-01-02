package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_role 
* @Package: com.sanxia.market.entity
* @Title:ShoppingRole.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-22 15:53:44
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingRole extends BaseEntity implements Serializable {

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
	*@Fields display :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean display;
	/**
	*@Fields info :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String info;
	/**
	*@Fields roleCode :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String roleCode;
	/**
	*@Fields roleName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String roleName;
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
	/**
	*@Fields rgId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long rgId;
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
	public void setDisplay(boolean display){
		this.display=display;
	}

	public boolean getDisplay(){
		return display;
	}
	public void setInfo(String info){
		this.info=info;
	}

	public String getInfo(){
		return info;
	}
	public void setRoleCode(String roleCode){
		this.roleCode=roleCode;
	}

	public String getRoleCode(){
		return roleCode;
	}
	public void setRoleName(String roleName){
		this.roleName=roleName;
	}

	public String getRoleName(){
		return roleName;
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
	public void setRgId(Long rgId){
		this.rgId=rgId;
	}

	public Long getRgId(){
		return rgId;
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

	if(null != info && !"".equals(info) ){
		sb.append("  info= "+info+",");
	}
	if(null != roleCode && !"".equals(roleCode) ){
		sb.append("  roleCode= "+roleCode+",");
	}
	if(null != roleName && !"".equals(roleName) ){
		sb.append("  roleName= "+roleName+",");
	}
	if(null != sequence && !"".equals(sequence) ){
		sb.append("  sequence= "+sequence+",");
	}
	if(null != type && !"".equals(type) ){
		sb.append("  type= "+type+",");
	}
	if(null != rgId && !"".equals(rgId) ){
		sb.append("  rgId= "+rgId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
