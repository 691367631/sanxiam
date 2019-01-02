package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @TableName: shopping_user_role 
* @Package: com.sanxia.market.entity
* @Title:ShoppingUserRole.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-22 16:05:36
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingUserRole extends BaseEntity implements Serializable {

	  private static final long serialVersionUID = 1L;
	  
	/**
	*@Fields userId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long userId;
	/**
	*@Fields roleId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long roleId;
	public void setUserId(Long userId){
		this.userId=userId;
	}

	public Long getUserId(){
		return userId;
	}
	public void setRoleId(Long roleId){
		this.roleId=roleId;
	}

	public Long getRoleId(){
		return roleId;
	}

	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	if(null != userId && !"".equals(userId) ){
		sb.append("  userId= "+userId+",");
	}
	if(null != roleId && !"".equals(roleId) ){
		sb.append("  roleId= "+roleId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
