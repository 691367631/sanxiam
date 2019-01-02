package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @TableName: shopping_cart_gsp 
* @Package: com.sanxia.market.entity
* @Title:ShoppingCartGsp.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-27 12:00:36
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingCartGsp extends BaseEntity implements Serializable {

	  private static final long serialVersionUID = 1L;
	  
	/**
	*@Fields cartId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long cartId;
	/**
	*@Fields gspId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long gspId;
	public void setCartId(Long cartId){
		this.cartId=cartId;
	}

	public Long getCartId(){
		return cartId;
	}
	public void setGspId(Long gspId){
		this.gspId=gspId;
	}

	public Long getGspId(){
		return gspId;
	}

	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	if(null != cartId && !"".equals(cartId) ){
		sb.append("  cartId= "+cartId+",");
	}
	if(null != gspId && !"".equals(gspId) ){
		sb.append("  gspId= "+gspId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
