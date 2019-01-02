package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @TableName: shopping_goods_spec 
* @Package: com.sanxia.market.entity
* @Title:ShoppingGoodsSpec.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-21 15:21:57
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingGoodsSpec extends BaseEntity implements Serializable {

	  private static final long serialVersionUID = 1L;
	  
	/**
	*@Fields goodsId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsId;
	/**
	*@Fields specId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long specId;
	public void setGoodsId(Long goodsId){
		this.goodsId=goodsId;
	}

	public Long getGoodsId(){
		return goodsId;
	}
	public void setSpecId(Long specId){
		this.specId=specId;
	}

	public Long getSpecId(){
		return specId;
	}

	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	if(null != goodsId && !"".equals(goodsId) ){
		sb.append("  goodsId= "+goodsId+",");
	}
	if(null != specId && !"".equals(specId) ){
		sb.append("  specId= "+specId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
