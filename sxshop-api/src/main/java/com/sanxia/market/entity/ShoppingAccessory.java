package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_accessory 
* @Package: com.sanxia.market.entity
* @Title:ShoppingAccessory.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-28 10:50:04
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingAccessory extends BaseEntity implements Serializable {

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
	*@Fields ext :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ext;
	/**
	*@Fields height :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long height;
	/**
	*@Fields info :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String info;
	/**
	*@Fields name :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String name;
	/**
	*@Fields path :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String path;
	/**
	*@Fields size :
	*/
	@ApiModelProperty(value = "" ,dataType = "Float") 
	private Float size;
	/**
	*@Fields width :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long width;
	/**
	*@Fields albumId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long albumId;
	/**
	*@Fields userId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long userId;
	/**
	*@Fields configId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long configId;
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
	public void setExt(String ext){
		this.ext=ext;
	}

	public String getExt(){
		return ext;
	}
	public void setHeight(Long height){
		this.height=height;
	}

	public Long getHeight(){
		return height;
	}
	public void setInfo(String info){
		this.info=info;
	}

	public String getInfo(){
		return info;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}
	public void setPath(String path){
		this.path=path;
	}

	public String getPath(){
		return path;
	}
	public void setSize(Float size){
		this.size=size;
	}

	public Float getSize(){
		return size;
	}
	public void setWidth(Long width){
		this.width=width;
	}

	public Long getWidth(){
		return width;
	}
	public void setAlbumId(Long albumId){
		this.albumId=albumId;
	}

	public Long getAlbumId(){
		return albumId;
	}
	public void setUserId(Long userId){
		this.userId=userId;
	}

	public Long getUserId(){
		return userId;
	}
	public void setConfigId(Long configId){
		this.configId=configId;
	}

	public Long getConfigId(){
		return configId;
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
	if(null != ext && !"".equals(ext) ){
		sb.append("  ext= "+ext+",");
	}
	if(null != height && !"".equals(height) ){
		sb.append("  height= "+height+",");
	}
	if(null != info && !"".equals(info) ){
		sb.append("  info= "+info+",");
	}
	if(null != name && !"".equals(name) ){
		sb.append("  name= "+name+",");
	}
	if(null != path && !"".equals(path) ){
		sb.append("  path= "+path+",");
	}
	if(null != size && !"".equals(size) ){
		sb.append("  size= "+size+",");
	}
	if(null != width && !"".equals(width) ){
		sb.append("  width= "+width+",");
	}
	if(null != albumId && !"".equals(albumId) ){
		sb.append("  albumId= "+albumId+",");
	}
	if(null != userId && !"".equals(userId) ){
		sb.append("  userId= "+userId+",");
	}
	if(null != configId && !"".equals(configId) ){
		sb.append("  configId= "+configId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
