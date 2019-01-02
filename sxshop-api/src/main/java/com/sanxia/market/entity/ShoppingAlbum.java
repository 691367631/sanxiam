package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_album 
* @Package: com.sanxia.market.entity
* @Title:ShoppingAlbum.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-22 16:50:23
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingAlbum extends BaseEntity implements Serializable {

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
	*@Fields alblumInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String alblumInfo;
	/**
	*@Fields albumDefault :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean albumDefault;
	/**
	*@Fields albumName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String albumName;
	/**
	*@Fields albumSequence :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long albumSequence;
	/**
	*@Fields albumCoverId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long albumCoverId;
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
	public void setAlblumInfo(String alblumInfo){
		this.alblumInfo=alblumInfo;
	}

	public String getAlblumInfo(){
		return alblumInfo;
	}
	public void setAlbumDefault(boolean albumDefault){
		this.albumDefault=albumDefault;
	}

	public boolean getAlbumDefault(){
		return albumDefault;
	}
	public void setAlbumName(String albumName){
		this.albumName=albumName;
	}

	public String getAlbumName(){
		return albumName;
	}
	public void setAlbumSequence(Long albumSequence){
		this.albumSequence=albumSequence;
	}

	public Long getAlbumSequence(){
		return albumSequence;
	}
	public void setAlbumCoverId(Long albumCoverId){
		this.albumCoverId=albumCoverId;
	}

	public Long getAlbumCoverId(){
		return albumCoverId;
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

	if(null != alblumInfo && !"".equals(alblumInfo) ){
		sb.append("  alblumInfo= "+alblumInfo+",");
	}

	if(null != albumName && !"".equals(albumName) ){
		sb.append("  albumName= "+albumName+",");
	}
	if(null != albumSequence && !"".equals(albumSequence) ){
		sb.append("  albumSequence= "+albumSequence+",");
	}
	if(null != albumCoverId && !"".equals(albumCoverId) ){
		sb.append("  albumCoverId= "+albumCoverId+",");
	}
	if(null != userId && !"".equals(userId) ){
		sb.append("  userId= "+userId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
