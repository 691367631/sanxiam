package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* @TableName: shopping_goods_photo 
* @Package: com.sanxia.market.entity
* @Title:ShoppingGoodsPhoto.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-21 14:06:08
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingGoodsPhoto extends BaseEntity implements Serializable {

	  private static final long serialVersionUID = 1L;
	  
	/**
	*@Fields goodsId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsId;
	/**
	*@Fields photoId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long photoId;
	public void setGoodsId(Long goodsId){
		this.goodsId=goodsId;
	}

	public Long getGoodsId(){
		return goodsId;
	}
	public void setPhotoId(Long photoId){
		this.photoId=photoId;
	}

	public Long getPhotoId(){
		return photoId;
	}

	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	if(null != goodsId && !"".equals(goodsId) ){
		sb.append("  goodsId= "+goodsId+",");
	}
	if(null != photoId && !"".equals(photoId) ){
		sb.append("  photoId= "+photoId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
