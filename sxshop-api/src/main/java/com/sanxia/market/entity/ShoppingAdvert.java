package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_advert 
* @Package: com.sanxia.market.entity
* @Title:ShoppingAdvert.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-13 10:27:16
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingAdvert extends BaseEntity implements Serializable {

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
	*@Fields adBeginTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date adBeginTime;
	/**
	*@Fields adClickNum :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long adClickNum;
	/**
	*@Fields adEndTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date adEndTime;
	/**
	*@Fields adGold :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long adGold;
	/**
	*@Fields adSlideSequence :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long adSlideSequence;
	/**
	*@Fields adStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long adStatus;
	/**
	*@Fields adText :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String adText;
	/**
	*@Fields adTitle :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String adTitle;
	/**
	*@Fields adUrl :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String adUrl;
	/**
	*@Fields adAccId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long adAccId;
	/**
	*@Fields adApId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long adApId;
	/**
	*@Fields adUserId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long adUserId;
	/**
	*@Fields adUrlType :跳转地址类型0商品活动页1店铺活动页2H5连接
	*/
	@ApiModelProperty(value = "跳转地址类型0商品活动页1店铺活动页2H5连接" ,dataType = "Long") 
	private Long adUrlType;
	/**
	*@Fields adStoreId :店铺id
	*/
	@ApiModelProperty(value = "店铺id" ,dataType = "Long") 
	private Long adStoreId;
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
	public void setAdBeginTime(Date adBeginTime){
		this.adBeginTime=adBeginTime;
	}

	public Date getAdBeginTime(){
		return adBeginTime;
	}
	public void setAdClickNum(Long adClickNum){
		this.adClickNum=adClickNum;
	}

	public Long getAdClickNum(){
		return adClickNum;
	}
	public void setAdEndTime(Date adEndTime){
		this.adEndTime=adEndTime;
	}

	public Date getAdEndTime(){
		return adEndTime;
	}
	public void setAdGold(Long adGold){
		this.adGold=adGold;
	}

	public Long getAdGold(){
		return adGold;
	}
	public void setAdSlideSequence(Long adSlideSequence){
		this.adSlideSequence=adSlideSequence;
	}

	public Long getAdSlideSequence(){
		return adSlideSequence;
	}
	public void setAdStatus(Long adStatus){
		this.adStatus=adStatus;
	}

	public Long getAdStatus(){
		return adStatus;
	}
	public void setAdText(String adText){
		this.adText=adText;
	}

	public String getAdText(){
		return adText;
	}
	public void setAdTitle(String adTitle){
		this.adTitle=adTitle;
	}

	public String getAdTitle(){
		return adTitle;
	}
	public void setAdUrl(String adUrl){
		this.adUrl=adUrl;
	}

	public String getAdUrl(){
		return adUrl;
	}
	public void setAdAccId(Long adAccId){
		this.adAccId=adAccId;
	}

	public Long getAdAccId(){
		return adAccId;
	}
	public void setAdApId(Long adApId){
		this.adApId=adApId;
	}

	public Long getAdApId(){
		return adApId;
	}
	public void setAdUserId(Long adUserId){
		this.adUserId=adUserId;
	}

	public Long getAdUserId(){
		return adUserId;
	}
	public void setAdUrlType(Long adUrlType){
		this.adUrlType=adUrlType;
	}

	public Long getAdUrlType(){
		return adUrlType;
	}
	public void setAdStoreId(Long adStoreId){
		this.adStoreId=adStoreId;
	}

	public Long getAdStoreId(){
		return adStoreId;
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
	
	if(null != adBeginTime && !"".equals(adBeginTime) ){
		sb.append("  adBeginTime= "+adBeginTime+",");
	}
	if(null != adClickNum && !"".equals(adClickNum) ){
		sb.append("  adClickNum= "+adClickNum+",");
	}
	if(null != adEndTime && !"".equals(adEndTime) ){
		sb.append("  adEndTime= "+adEndTime+",");
	}
	if(null != adGold && !"".equals(adGold) ){
		sb.append("  adGold= "+adGold+",");
	}
	if(null != adSlideSequence && !"".equals(adSlideSequence) ){
		sb.append("  adSlideSequence= "+adSlideSequence+",");
	}
	if(null != adStatus && !"".equals(adStatus) ){
		sb.append("  adStatus= "+adStatus+",");
	}
	if(null != adText && !"".equals(adText) ){
		sb.append("  adText= "+adText+",");
	}
	if(null != adTitle && !"".equals(adTitle) ){
		sb.append("  adTitle= "+adTitle+",");
	}
	if(null != adUrl && !"".equals(adUrl) ){
		sb.append("  adUrl= "+adUrl+",");
	}
	if(null != adAccId && !"".equals(adAccId) ){
		sb.append("  adAccId= "+adAccId+",");
	}
	if(null != adApId && !"".equals(adApId) ){
		sb.append("  adApId= "+adApId+",");
	}
	if(null != adUserId && !"".equals(adUserId) ){
		sb.append("  adUserId= "+adUserId+",");
	}
	if(null != adUrlType && !"".equals(adUrlType) ){
		sb.append("跳转地址类型0商品活动页1店铺活动页2H5连接  adUrlType= "+adUrlType+",");
	}
	if(null != adStoreId && !"".equals(adStoreId) ){
		sb.append("店铺id  adStoreId= "+adStoreId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
