package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_store 
* @Package: com.sanxia.market.entity
* @Title:ShoppingStore.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-03 16:04:36
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingStore extends BaseEntity implements Serializable {

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
	*@Fields cardApprove :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean cardApprove;
	/**
	*@Fields realstoreApprove :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean realstoreApprove;
	/**
	*@Fields storeAddress :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeAddress;
	/**
	*@Fields storeCredit :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeCredit;
	/**
	*@Fields storeInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeInfo;
	/**
	*@Fields storeMsn :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeMsn;
	/**
	*@Fields storeName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeName;
	/**
	*@Fields storeOwer :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeOwer;
	/**
	*@Fields storeOwerCard :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeOwerCard;
	/**
	*@Fields storeQq :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeQq;
	/**
	*@Fields storeRecommend :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean storeRecommend;
	/**
	*@Fields storeRecommendTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date storeRecommendTime;
	/**
	*@Fields storeSeoDescription :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeSeoDescription;
	/**
	*@Fields storeSeoKeywords :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeSeoKeywords;
	/**
	*@Fields storeStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeStatus;
	/**
	*@Fields storeTelephone :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeTelephone;
	/**
	*@Fields storeZip :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeZip;
	/**
	*@Fields template :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String template;
	/**
	*@Fields validity :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date validity;
	/**
	*@Fields violationReseaon :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String violationReseaon;
	/**
	*@Fields areaId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long areaId;
	/**
	*@Fields cardId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long cardId;
	/**
	*@Fields gradeId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long gradeId;
	/**
	*@Fields scId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long scId;
	/**
	*@Fields storeBannerId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeBannerId;
	/**
	*@Fields storeLicenseId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeLicenseId;
	/**
	*@Fields storeLogoId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeLogoId;
	/**
	*@Fields updateGradeId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long updateGradeId;
	/**
	*@Fields domainModifyCount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long domainModifyCount;
	/**
	*@Fields storeSecondDomain :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeSecondDomain;
	/**
	*@Fields favoriteCount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long favoriteCount;
	/**
	*@Fields storeLat :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double storeLat;
	/**
	*@Fields storeLng :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double storeLng;
	/**
	*@Fields storeWw :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeWw;
	/**
	*@Fields mapType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String mapType;
	/**
	*@Fields deliveryBeginTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date deliveryBeginTime;
	/**
	*@Fields deliveryEndTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date deliveryEndTime;
	/**
	*@Fields combinBeginTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date combinBeginTime;
	/**
	*@Fields combinEndTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date combinEndTime;
	/**
	*@Fields weixinBeginTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date weixinBeginTime;
	/**
	*@Fields weixinEndTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date weixinEndTime;
	/**
	*@Fields weixinStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long weixinStatus;
	/**
	*@Fields weixinAppId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinAppId;
	/**
	*@Fields weixinAppSecret :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinAppSecret;
	/**
	*@Fields weixinToken :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinToken;
	/**
	*@Fields weixinWelecomeContent :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinWelecomeContent;
	/**
	*@Fields weixinQrImgId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long weixinQrImgId;
	/**
	*@Fields weixinAccount :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinAccount;
	/**
	*@Fields storeWeixinLogoId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeWeixinLogoId;
	/**
	*@Fields weixinStoreName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinStoreName;
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
	public void setCardApprove(boolean cardApprove){
		this.cardApprove=cardApprove;
	}

	public boolean getCardApprove(){
		return cardApprove;
	}
	public void setRealstoreApprove(boolean realstoreApprove){
		this.realstoreApprove=realstoreApprove;
	}

	public boolean getRealstoreApprove(){
		return realstoreApprove;
	}
	public void setStoreAddress(String storeAddress){
		this.storeAddress=storeAddress;
	}

	public String getStoreAddress(){
		return storeAddress;
	}
	public void setStoreCredit(Long storeCredit){
		this.storeCredit=storeCredit;
	}

	public Long getStoreCredit(){
		return storeCredit;
	}
	public void setStoreInfo(String storeInfo){
		this.storeInfo=storeInfo;
	}

	public String getStoreInfo(){
		return storeInfo;
	}
	public void setStoreMsn(String storeMsn){
		this.storeMsn=storeMsn;
	}

	public String getStoreMsn(){
		return storeMsn;
	}
	public void setStoreName(String storeName){
		this.storeName=storeName;
	}

	public String getStoreName(){
		return storeName;
	}
	public void setStoreOwer(String storeOwer){
		this.storeOwer=storeOwer;
	}

	public String getStoreOwer(){
		return storeOwer;
	}
	public void setStoreOwerCard(String storeOwerCard){
		this.storeOwerCard=storeOwerCard;
	}

	public String getStoreOwerCard(){
		return storeOwerCard;
	}
	public void setStoreQq(String storeQq){
		this.storeQq=storeQq;
	}

	public String getStoreQq(){
		return storeQq;
	}
	public void setStoreRecommend(boolean storeRecommend){
		this.storeRecommend=storeRecommend;
	}

	public boolean getStoreRecommend(){
		return storeRecommend;
	}
	public void setStoreRecommendTime(Date storeRecommendTime){
		this.storeRecommendTime=storeRecommendTime;
	}

	public Date getStoreRecommendTime(){
		return storeRecommendTime;
	}
	public void setStoreSeoDescription(String storeSeoDescription){
		this.storeSeoDescription=storeSeoDescription;
	}

	public String getStoreSeoDescription(){
		return storeSeoDescription;
	}
	public void setStoreSeoKeywords(String storeSeoKeywords){
		this.storeSeoKeywords=storeSeoKeywords;
	}

	public String getStoreSeoKeywords(){
		return storeSeoKeywords;
	}
	public void setStoreStatus(Long storeStatus){
		this.storeStatus=storeStatus;
	}

	public Long getStoreStatus(){
		return storeStatus;
	}
	public void setStoreTelephone(String storeTelephone){
		this.storeTelephone=storeTelephone;
	}

	public String getStoreTelephone(){
		return storeTelephone;
	}
	public void setStoreZip(String storeZip){
		this.storeZip=storeZip;
	}

	public String getStoreZip(){
		return storeZip;
	}
	public void setTemplate(String template){
		this.template=template;
	}

	public String getTemplate(){
		return template;
	}
	public void setValidity(Date validity){
		this.validity=validity;
	}

	public Date getValidity(){
		return validity;
	}
	public void setViolationReseaon(String violationReseaon){
		this.violationReseaon=violationReseaon;
	}

	public String getViolationReseaon(){
		return violationReseaon;
	}
	public void setAreaId(Long areaId){
		this.areaId=areaId;
	}

	public Long getAreaId(){
		return areaId;
	}
	public void setCardId(Long cardId){
		this.cardId=cardId;
	}

	public Long getCardId(){
		return cardId;
	}
	public void setGradeId(Long gradeId){
		this.gradeId=gradeId;
	}

	public Long getGradeId(){
		return gradeId;
	}
	public void setScId(Long scId){
		this.scId=scId;
	}

	public Long getScId(){
		return scId;
	}
	public void setStoreBannerId(Long storeBannerId){
		this.storeBannerId=storeBannerId;
	}

	public Long getStoreBannerId(){
		return storeBannerId;
	}
	public void setStoreLicenseId(Long storeLicenseId){
		this.storeLicenseId=storeLicenseId;
	}

	public Long getStoreLicenseId(){
		return storeLicenseId;
	}
	public void setStoreLogoId(String storeLogoId){
		this.storeLogoId=storeLogoId;
	}

	public String getStoreLogoId(){
		return storeLogoId;
	}
	public void setUpdateGradeId(Long updateGradeId){
		this.updateGradeId=updateGradeId;
	}

	public Long getUpdateGradeId(){
		return updateGradeId;
	}
	public void setDomainModifyCount(Long domainModifyCount){
		this.domainModifyCount=domainModifyCount;
	}

	public Long getDomainModifyCount(){
		return domainModifyCount;
	}
	public void setStoreSecondDomain(String storeSecondDomain){
		this.storeSecondDomain=storeSecondDomain;
	}

	public String getStoreSecondDomain(){
		return storeSecondDomain;
	}
	public void setFavoriteCount(Long favoriteCount){
		this.favoriteCount=favoriteCount;
	}

	public Long getFavoriteCount(){
		return favoriteCount;
	}
	public void setStoreLat(Double storeLat){
		this.storeLat=storeLat;
	}

	public Double getStoreLat(){
		return storeLat;
	}
	public void setStoreLng(Double storeLng){
		this.storeLng=storeLng;
	}

	public Double getStoreLng(){
		return storeLng;
	}
	public void setStoreWw(String storeWw){
		this.storeWw=storeWw;
	}

	public String getStoreWw(){
		return storeWw;
	}
	public void setMapType(String mapType){
		this.mapType=mapType;
	}

	public String getMapType(){
		return mapType;
	}
	public void setDeliveryBeginTime(Date deliveryBeginTime){
		this.deliveryBeginTime=deliveryBeginTime;
	}

	public Date getDeliveryBeginTime(){
		return deliveryBeginTime;
	}
	public void setDeliveryEndTime(Date deliveryEndTime){
		this.deliveryEndTime=deliveryEndTime;
	}

	public Date getDeliveryEndTime(){
		return deliveryEndTime;
	}
	public void setCombinBeginTime(Date combinBeginTime){
		this.combinBeginTime=combinBeginTime;
	}

	public Date getCombinBeginTime(){
		return combinBeginTime;
	}
	public void setCombinEndTime(Date combinEndTime){
		this.combinEndTime=combinEndTime;
	}

	public Date getCombinEndTime(){
		return combinEndTime;
	}
	public void setWeixinBeginTime(Date weixinBeginTime){
		this.weixinBeginTime=weixinBeginTime;
	}

	public Date getWeixinBeginTime(){
		return weixinBeginTime;
	}
	public void setWeixinEndTime(Date weixinEndTime){
		this.weixinEndTime=weixinEndTime;
	}

	public Date getWeixinEndTime(){
		return weixinEndTime;
	}
	public void setWeixinStatus(Long weixinStatus){
		this.weixinStatus=weixinStatus;
	}

	public Long getWeixinStatus(){
		return weixinStatus;
	}
	public void setWeixinAppId(String weixinAppId){
		this.weixinAppId=weixinAppId;
	}

	public String getWeixinAppId(){
		return weixinAppId;
	}
	public void setWeixinAppSecret(String weixinAppSecret){
		this.weixinAppSecret=weixinAppSecret;
	}

	public String getWeixinAppSecret(){
		return weixinAppSecret;
	}
	public void setWeixinToken(String weixinToken){
		this.weixinToken=weixinToken;
	}

	public String getWeixinToken(){
		return weixinToken;
	}
	public void setWeixinWelecomeContent(String weixinWelecomeContent){
		this.weixinWelecomeContent=weixinWelecomeContent;
	}

	public String getWeixinWelecomeContent(){
		return weixinWelecomeContent;
	}
	public void setWeixinQrImgId(Long weixinQrImgId){
		this.weixinQrImgId=weixinQrImgId;
	}

	public Long getWeixinQrImgId(){
		return weixinQrImgId;
	}
	public void setWeixinAccount(String weixinAccount){
		this.weixinAccount=weixinAccount;
	}

	public String getWeixinAccount(){
		return weixinAccount;
	}
	public void setStoreWeixinLogoId(Long storeWeixinLogoId){
		this.storeWeixinLogoId=storeWeixinLogoId;
	}

	public Long getStoreWeixinLogoId(){
		return storeWeixinLogoId;
	}
	public void setWeixinStoreName(String weixinStoreName){
		this.weixinStoreName=weixinStoreName;
	}

	public String getWeixinStoreName(){
		return weixinStoreName;
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
//	if(null != cardApprove && !"".equals(cardApprove) ){
//		sb.append("  cardApprove= "+cardApprove+",");
//	}
//	if(null != realstoreApprove && !"".equals(realstoreApprove) ){
//		sb.append("  realstoreApprove= "+realstoreApprove+",");
//	}
	if(null != storeAddress && !"".equals(storeAddress) ){
		sb.append("  storeAddress= "+storeAddress+",");
	}
	if(null != storeCredit && !"".equals(storeCredit) ){
		sb.append("  storeCredit= "+storeCredit+",");
	}
	if(null != storeInfo && !"".equals(storeInfo) ){
		sb.append("  storeInfo= "+storeInfo+",");
	}
	if(null != storeMsn && !"".equals(storeMsn) ){
		sb.append("  storeMsn= "+storeMsn+",");
	}
	if(null != storeName && !"".equals(storeName) ){
		sb.append("  storeName= "+storeName+",");
	}
	if(null != storeOwer && !"".equals(storeOwer) ){
		sb.append("  storeOwer= "+storeOwer+",");
	}
	if(null != storeOwerCard && !"".equals(storeOwerCard) ){
		sb.append("  storeOwerCard= "+storeOwerCard+",");
	}
	if(null != storeQq && !"".equals(storeQq) ){
		sb.append("  storeQq= "+storeQq+",");
	}
//	if(null != storeRecommend && !"".equals(storeRecommend) ){
//		sb.append("  storeRecommend= "+storeRecommend+",");
//	}
	if(null != storeRecommendTime && !"".equals(storeRecommendTime) ){
		sb.append("  storeRecommendTime= "+storeRecommendTime+",");
	}
	if(null != storeSeoDescription && !"".equals(storeSeoDescription) ){
		sb.append("  storeSeoDescription= "+storeSeoDescription+",");
	}
	if(null != storeSeoKeywords && !"".equals(storeSeoKeywords) ){
		sb.append("  storeSeoKeywords= "+storeSeoKeywords+",");
	}
	if(null != storeStatus && !"".equals(storeStatus) ){
		sb.append("  storeStatus= "+storeStatus+",");
	}
	if(null != storeTelephone && !"".equals(storeTelephone) ){
		sb.append("  storeTelephone= "+storeTelephone+",");
	}
	if(null != storeZip && !"".equals(storeZip) ){
		sb.append("  storeZip= "+storeZip+",");
	}
	if(null != template && !"".equals(template) ){
		sb.append("  template= "+template+",");
	}
	if(null != validity && !"".equals(validity) ){
		sb.append("  validity= "+validity+",");
	}
	if(null != violationReseaon && !"".equals(violationReseaon) ){
		sb.append("  violationReseaon= "+violationReseaon+",");
	}
	if(null != areaId && !"".equals(areaId) ){
		sb.append("  areaId= "+areaId+",");
	}
	if(null != cardId && !"".equals(cardId) ){
		sb.append("  cardId= "+cardId+",");
	}
	if(null != gradeId && !"".equals(gradeId) ){
		sb.append("  gradeId= "+gradeId+",");
	}
	if(null != scId && !"".equals(scId) ){
		sb.append("  scId= "+scId+",");
	}
	if(null != storeBannerId && !"".equals(storeBannerId) ){
		sb.append("  storeBannerId= "+storeBannerId+",");
	}
	if(null != storeLicenseId && !"".equals(storeLicenseId) ){
		sb.append("  storeLicenseId= "+storeLicenseId+",");
	}
	if(null != storeLogoId && !"".equals(storeLogoId) ){
		sb.append("  storeLogoId= "+storeLogoId+",");
	}
	if(null != updateGradeId && !"".equals(updateGradeId) ){
		sb.append("  updateGradeId= "+updateGradeId+",");
	}
	if(null != domainModifyCount && !"".equals(domainModifyCount) ){
		sb.append("  domainModifyCount= "+domainModifyCount+",");
	}
	if(null != storeSecondDomain && !"".equals(storeSecondDomain) ){
		sb.append("  storeSecondDomain= "+storeSecondDomain+",");
	}
	if(null != favoriteCount && !"".equals(favoriteCount) ){
		sb.append("  favoriteCount= "+favoriteCount+",");
	}
	if(null != storeLat && !"".equals(storeLat) ){
		sb.append("  storeLat= "+storeLat+",");
	}
	if(null != storeLng && !"".equals(storeLng) ){
		sb.append("  storeLng= "+storeLng+",");
	}
	if(null != storeWw && !"".equals(storeWw) ){
		sb.append("  storeWw= "+storeWw+",");
	}
	if(null != mapType && !"".equals(mapType) ){
		sb.append("  mapType= "+mapType+",");
	}
	if(null != deliveryBeginTime && !"".equals(deliveryBeginTime) ){
		sb.append("  deliveryBeginTime= "+deliveryBeginTime+",");
	}
	if(null != deliveryEndTime && !"".equals(deliveryEndTime) ){
		sb.append("  deliveryEndTime= "+deliveryEndTime+",");
	}
	if(null != combinBeginTime && !"".equals(combinBeginTime) ){
		sb.append("  combinBeginTime= "+combinBeginTime+",");
	}
	if(null != combinEndTime && !"".equals(combinEndTime) ){
		sb.append("  combinEndTime= "+combinEndTime+",");
	}
	if(null != weixinBeginTime && !"".equals(weixinBeginTime) ){
		sb.append("  weixinBeginTime= "+weixinBeginTime+",");
	}
	if(null != weixinEndTime && !"".equals(weixinEndTime) ){
		sb.append("  weixinEndTime= "+weixinEndTime+",");
	}
	if(null != weixinStatus && !"".equals(weixinStatus) ){
		sb.append("  weixinStatus= "+weixinStatus+",");
	}
	if(null != weixinAppId && !"".equals(weixinAppId) ){
		sb.append("  weixinAppId= "+weixinAppId+",");
	}
	if(null != weixinAppSecret && !"".equals(weixinAppSecret) ){
		sb.append("  weixinAppSecret= "+weixinAppSecret+",");
	}
	if(null != weixinToken && !"".equals(weixinToken) ){
		sb.append("  weixinToken= "+weixinToken+",");
	}
	if(null != weixinWelecomeContent && !"".equals(weixinWelecomeContent) ){
		sb.append("  weixinWelecomeContent= "+weixinWelecomeContent+",");
	}
	if(null != weixinQrImgId && !"".equals(weixinQrImgId) ){
		sb.append("  weixinQrImgId= "+weixinQrImgId+",");
	}
	if(null != weixinAccount && !"".equals(weixinAccount) ){
		sb.append("  weixinAccount= "+weixinAccount+",");
	}
	if(null != storeWeixinLogoId && !"".equals(storeWeixinLogoId) ){
		sb.append("  storeWeixinLogoId= "+storeWeixinLogoId+",");
	}
	if(null != weixinStoreName && !"".equals(weixinStoreName) ){
		sb.append("  weixinStoreName= "+weixinStoreName+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
