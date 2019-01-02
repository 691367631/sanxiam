package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @TableName: shopping_user_token 
* @Package: com.sanxia.market.entity
* @Title:ShoppingUserToken.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-18 15:43:26
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingUserToken extends BaseEntity implements Serializable {

	  private static final long serialVersionUID = 1L;
	  
	/**
	*@Fields id :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long id;
	/**
	*@Fields token :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String token;
	/**
	*@Fields userId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String userId;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return id;
	}
	public void setToken(String token){
		this.token=token;
	}

	public String getToken(){
		return token;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}

	public String getUserId(){
		return userId;
	}

	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	if(null != id && !"".equals(id) ){
		sb.append("  id= "+id+",");
	}
	if(null != token && !"".equals(token) ){
		sb.append("  token= "+token+",");
	}
	if(null != userId && !"".equals(userId) ){
		sb.append("  userId= "+userId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
