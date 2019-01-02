package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_sysconfig 
* @Package: com.sanxia.market.entity
* @Title:ShoppingSysconfig.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-22 16:50:38
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingSysconfig extends BaseEntity implements Serializable {

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
	*@Fields address :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String address;
	/**
	*@Fields bigHeight :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long bigHeight;
	/**
	*@Fields bigWidth :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long bigWidth;
	/**
	*@Fields closeReason :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String closeReason;
	/**
	*@Fields codeStat :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String codeStat;
	/**
	*@Fields complaintTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long complaintTime;
	/**
	*@Fields consumptionRatio :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long consumptionRatio;
	/**
	*@Fields copyRight :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String copyRight;
	/**
	*@Fields creditrule :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String creditrule;
	/**
	*@Fields deposit :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean deposit;
	/**
	*@Fields description :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String description;
	/**
	*@Fields emailEnable :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean emailEnable;
	/**
	*@Fields emailHost :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String emailHost;
	/**
	*@Fields emailPort :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long emailPort;
	/**
	*@Fields emailPws :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String emailPws;
	/**
	*@Fields emailTest :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String emailTest;
	/**
	*@Fields emailUser :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String emailUser;
	/**
	*@Fields emailUserName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String emailUserName;
	/**
	*@Fields everyIndentLimit :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long everyIndentLimit;
	/**
	*@Fields gold :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean gold;
	/**
	*@Fields goldMarketValue :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goldMarketValue;
	/**
	*@Fields groupBuy :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean groupBuy;
	/**
	*@Fields hotSearch :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String hotSearch;
	/**
	*@Fields imageFilesize :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long imageFilesize;
	/**
	*@Fields imageSaveType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String imageSaveType;
	/**
	*@Fields imageSuffix :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String imageSuffix;
	/**
	*@Fields indentComment :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long indentComment;
	/**
	*@Fields integral :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean integral;
	/**
	*@Fields integralRate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long integralRate;
	/**
	*@Fields integralStore :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean integralStore;
	/**
	*@Fields keywords :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String keywords;
	/**
	*@Fields memberDayLogin :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long memberDayLogin;
	/**
	*@Fields memberRegister :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long memberRegister;
	/**
	*@Fields middleHeight :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long middleHeight;
	/**
	*@Fields middleWidth :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long middleWidth;
	/**
	*@Fields securityCodeConsult :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean securityCodeConsult;
	/**
	*@Fields securityCodeLogin :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean securityCodeLogin;
	/**
	*@Fields securityCodeRegister :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean securityCodeRegister;
	/**
	*@Fields securityCodeType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String securityCodeType;
	/**
	*@Fields shareCode :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String shareCode;
	/**
	*@Fields smallHeight :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long smallHeight;
	/**
	*@Fields smallWidth :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long smallWidth;
	/**
	*@Fields smsEnbale :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean smsEnbale;
	/**
	*@Fields smsPassword :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String smsPassword;
	/**
	*@Fields smsTest :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String smsTest;
	/**
	*@Fields smsURL :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String smsURL;
	/**
	*@Fields smsUserName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String smsUserName;
	/**
	*@Fields storeAllow :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean storeAllow;
	/**
	*@Fields storePayment :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storePayment;
	/**
	*@Fields sysLanguage :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String sysLanguage;
	/**
	*@Fields templates :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String templates;
	/**
	*@Fields title :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String title;
	/**
	*@Fields uploadFilePath :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String uploadFilePath;
	/**
	*@Fields userCreditrule :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String userCreditrule;
	/**
	*@Fields visitorConsult :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean visitorConsult;
	/**
	*@Fields voucher :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean voucher;
	/**
	*@Fields websiteName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String websiteName;
	/**
	*@Fields websiteState :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean websiteState;
	/**
	*@Fields ztcPrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ztcPrice;
	/**
	*@Fields ztcStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean ztcStatus;
	/**
	*@Fields goodsImageId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsImageId;
	/**
	*@Fields memberIconId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long memberIconId;
	/**
	*@Fields storeImageId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeImageId;
	/**
	*@Fields websiteLogoId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long websiteLogoId;
	/**
	*@Fields domainAllowCount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long domainAllowCount;
	/**
	*@Fields secondDomainOpen :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean secondDomainOpen;
	/**
	*@Fields sysDomain :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String sysDomain;
	/**
	*@Fields qqLogin :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean qqLogin;
	/**
	*@Fields qqLoginId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String qqLoginId;
	/**
	*@Fields qqLoginKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String qqLoginKey;
	/**
	*@Fields qqDomainCode :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String qqDomainCode;
	/**
	*@Fields sinaDomainCode :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String sinaDomainCode;
	/**
	*@Fields sinaLogin :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean sinaLogin;
	/**
	*@Fields sinaLoginId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String sinaLoginId;
	/**
	*@Fields sinaLoginKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String sinaLoginKey;
	/**
	*@Fields imageWebServer :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String imageWebServer;
	/**
	*@Fields luceneUpdate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date luceneUpdate;
	/**
	*@Fields alipayFenrun :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long alipayFenrun;
	/**
	*@Fields balanceFenrun :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long balanceFenrun;
	/**
	*@Fields autoOrderConfirm :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long autoOrderConfirm;
	/**
	*@Fields autoOrderNotice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long autoOrderNotice;
	/**
	*@Fields bargainMaximum :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long bargainMaximum;
	/**
	*@Fields bargainRebate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double bargainRebate;
	/**
	*@Fields bargainState :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String bargainState;
	/**
	*@Fields bargainStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long bargainStatus;
	/**
	*@Fields bargainTitle :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String bargainTitle;
	/**
	*@Fields serviceQqList :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String serviceQqList;
	/**
	*@Fields serviceTelphoneList :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String serviceTelphoneList;
	/**
	*@Fields sysDeliveryMaximum :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long sysDeliveryMaximum;
	/**
	*@Fields ucBbs :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean ucBbs;
	/**
	*@Fields kuaidiId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String kuaidiId;
	/**
	*@Fields ucApi :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucApi;
	/**
	*@Fields ucAppid :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucAppid;
	/**
	*@Fields ucDatabase :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucDatabase;
	/**
	*@Fields ucDatabasePort :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucDatabasePort;
	/**
	*@Fields ucDatabasePws :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucDatabasePws;
	/**
	*@Fields ucDatabaseUrl :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucDatabaseUrl;
	/**
	*@Fields ucDatabaseUsername :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucDatabaseUsername;
	/**
	*@Fields ucIp :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucIp;
	/**
	*@Fields ucKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucKey;
	/**
	*@Fields ucTablePreffix :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ucTablePreffix;
	/**
	*@Fields currencyCode :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String currencyCode;
	/**
	*@Fields bargainValidity :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long bargainValidity;
	/**
	*@Fields deliveryAmount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long deliveryAmount;
	/**
	*@Fields deliveryStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long deliveryStatus;
	/**
	*@Fields deliveryTitle :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String deliveryTitle;
	/**
	*@Fields websiteCss :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String websiteCss;
	/**
	*@Fields combinAmount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long combinAmount;
	/**
	*@Fields combinCount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long combinCount;
	/**
	*@Fields ztcGoodsView :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ztcGoodsView;
	/**
	*@Fields autoOrderEvaluate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long autoOrderEvaluate;
	/**
	*@Fields autoOrderReturn :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long autoOrderReturn;
	/**
	*@Fields weixinStore :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean weixinStore;
	/**
	*@Fields weixinAmount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long weixinAmount;
	/**
	*@Fields configPaymentType :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long configPaymentType;
	/**
	*@Fields weixinAccount :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinAccount;
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
	*@Fields storeWeixinLogoId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeWeixinLogoId;
	/**
	*@Fields weixinQrImgId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long weixinQrImgId;
	/**
	*@Fields siteUrl :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String siteUrl;
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
	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return address;
	}
	public void setBigHeight(Long bigHeight){
		this.bigHeight=bigHeight;
	}

	public Long getBigHeight(){
		return bigHeight;
	}
	public void setBigWidth(Long bigWidth){
		this.bigWidth=bigWidth;
	}

	public Long getBigWidth(){
		return bigWidth;
	}
	public void setCloseReason(String closeReason){
		this.closeReason=closeReason;
	}

	public String getCloseReason(){
		return closeReason;
	}
	public void setCodeStat(String codeStat){
		this.codeStat=codeStat;
	}

	public String getCodeStat(){
		return codeStat;
	}
	public void setComplaintTime(Long complaintTime){
		this.complaintTime=complaintTime;
	}

	public Long getComplaintTime(){
		return complaintTime;
	}
	public void setConsumptionRatio(Long consumptionRatio){
		this.consumptionRatio=consumptionRatio;
	}

	public Long getConsumptionRatio(){
		return consumptionRatio;
	}
	public void setCopyRight(String copyRight){
		this.copyRight=copyRight;
	}

	public String getCopyRight(){
		return copyRight;
	}
	public void setCreditrule(String creditrule){
		this.creditrule=creditrule;
	}

	public String getCreditrule(){
		return creditrule;
	}
	public void setDeposit(boolean deposit){
		this.deposit=deposit;
	}

	public boolean getDeposit(){
		return deposit;
	}
	public void setDescription(String description){
		this.description=description;
	}

	public String getDescription(){
		return description;
	}
	public void setEmailEnable(boolean emailEnable){
		this.emailEnable=emailEnable;
	}

	public boolean getEmailEnable(){
		return emailEnable;
	}
	public void setEmailHost(String emailHost){
		this.emailHost=emailHost;
	}

	public String getEmailHost(){
		return emailHost;
	}
	public void setEmailPort(Long emailPort){
		this.emailPort=emailPort;
	}

	public Long getEmailPort(){
		return emailPort;
	}
	public void setEmailPws(String emailPws){
		this.emailPws=emailPws;
	}

	public String getEmailPws(){
		return emailPws;
	}
	public void setEmailTest(String emailTest){
		this.emailTest=emailTest;
	}

	public String getEmailTest(){
		return emailTest;
	}
	public void setEmailUser(String emailUser){
		this.emailUser=emailUser;
	}

	public String getEmailUser(){
		return emailUser;
	}
	public void setEmailUserName(String emailUserName){
		this.emailUserName=emailUserName;
	}

	public String getEmailUserName(){
		return emailUserName;
	}
	public void setEveryIndentLimit(Long everyIndentLimit){
		this.everyIndentLimit=everyIndentLimit;
	}

	public Long getEveryIndentLimit(){
		return everyIndentLimit;
	}
	public void setGold(boolean gold){
		this.gold=gold;
	}

	public boolean getGold(){
		return gold;
	}
	public void setGoldMarketValue(Long goldMarketValue){
		this.goldMarketValue=goldMarketValue;
	}

	public Long getGoldMarketValue(){
		return goldMarketValue;
	}
	public void setGroupBuy(boolean groupBuy){
		this.groupBuy=groupBuy;
	}

	public boolean getGroupBuy(){
		return groupBuy;
	}
	public void setHotSearch(String hotSearch){
		this.hotSearch=hotSearch;
	}

	public String getHotSearch(){
		return hotSearch;
	}
	public void setImageFilesize(Long imageFilesize){
		this.imageFilesize=imageFilesize;
	}

	public Long getImageFilesize(){
		return imageFilesize;
	}
	public void setImageSaveType(String imageSaveType){
		this.imageSaveType=imageSaveType;
	}

	public String getImageSaveType(){
		return imageSaveType;
	}
	public void setImageSuffix(String imageSuffix){
		this.imageSuffix=imageSuffix;
	}

	public String getImageSuffix(){
		return imageSuffix;
	}
	public void setIndentComment(Long indentComment){
		this.indentComment=indentComment;
	}

	public Long getIndentComment(){
		return indentComment;
	}
	public void setIntegral(boolean integral){
		this.integral=integral;
	}

	public boolean getIntegral(){
		return integral;
	}
	public void setIntegralRate(Long integralRate){
		this.integralRate=integralRate;
	}

	public Long getIntegralRate(){
		return integralRate;
	}
	public void setIntegralStore(boolean integralStore){
		this.integralStore=integralStore;
	}

	public boolean getIntegralStore(){
		return integralStore;
	}
	public void setKeywords(String keywords){
		this.keywords=keywords;
	}

	public String getKeywords(){
		return keywords;
	}
	public void setMemberDayLogin(Long memberDayLogin){
		this.memberDayLogin=memberDayLogin;
	}

	public Long getMemberDayLogin(){
		return memberDayLogin;
	}
	public void setMemberRegister(Long memberRegister){
		this.memberRegister=memberRegister;
	}

	public Long getMemberRegister(){
		return memberRegister;
	}
	public void setMiddleHeight(Long middleHeight){
		this.middleHeight=middleHeight;
	}

	public Long getMiddleHeight(){
		return middleHeight;
	}
	public void setMiddleWidth(Long middleWidth){
		this.middleWidth=middleWidth;
	}

	public Long getMiddleWidth(){
		return middleWidth;
	}
	public void setSecurityCodeConsult(boolean securityCodeConsult){
		this.securityCodeConsult=securityCodeConsult;
	}

	public boolean getSecurityCodeConsult(){
		return securityCodeConsult;
	}
	public void setSecurityCodeLogin(boolean securityCodeLogin){
		this.securityCodeLogin=securityCodeLogin;
	}

	public boolean getSecurityCodeLogin(){
		return securityCodeLogin;
	}
	public void setSecurityCodeRegister(boolean securityCodeRegister){
		this.securityCodeRegister=securityCodeRegister;
	}

	public boolean getSecurityCodeRegister(){
		return securityCodeRegister;
	}
	public void setSecurityCodeType(String securityCodeType){
		this.securityCodeType=securityCodeType;
	}

	public String getSecurityCodeType(){
		return securityCodeType;
	}
	public void setShareCode(String shareCode){
		this.shareCode=shareCode;
	}

	public String getShareCode(){
		return shareCode;
	}
	public void setSmallHeight(Long smallHeight){
		this.smallHeight=smallHeight;
	}

	public Long getSmallHeight(){
		return smallHeight;
	}
	public void setSmallWidth(Long smallWidth){
		this.smallWidth=smallWidth;
	}

	public Long getSmallWidth(){
		return smallWidth;
	}
	public void setSmsEnbale(boolean smsEnbale){
		this.smsEnbale=smsEnbale;
	}

	public boolean getSmsEnbale(){
		return smsEnbale;
	}
	public void setSmsPassword(String smsPassword){
		this.smsPassword=smsPassword;
	}

	public String getSmsPassword(){
		return smsPassword;
	}
	public void setSmsTest(String smsTest){
		this.smsTest=smsTest;
	}

	public String getSmsTest(){
		return smsTest;
	}
	public void setSmsURL(String smsURL){
		this.smsURL=smsURL;
	}

	public String getSmsURL(){
		return smsURL;
	}
	public void setSmsUserName(String smsUserName){
		this.smsUserName=smsUserName;
	}

	public String getSmsUserName(){
		return smsUserName;
	}
	public void setStoreAllow(boolean storeAllow){
		this.storeAllow=storeAllow;
	}

	public boolean getStoreAllow(){
		return storeAllow;
	}
	public void setStorePayment(String storePayment){
		this.storePayment=storePayment;
	}

	public String getStorePayment(){
		return storePayment;
	}
	public void setSysLanguage(String sysLanguage){
		this.sysLanguage=sysLanguage;
	}

	public String getSysLanguage(){
		return sysLanguage;
	}
	public void setTemplates(String templates){
		this.templates=templates;
	}

	public String getTemplates(){
		return templates;
	}
	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return title;
	}
	public void setUploadFilePath(String uploadFilePath){
		this.uploadFilePath=uploadFilePath;
	}

	public String getUploadFilePath(){
		return uploadFilePath;
	}
	public void setUserCreditrule(String userCreditrule){
		this.userCreditrule=userCreditrule;
	}

	public String getUserCreditrule(){
		return userCreditrule;
	}
	public void setVisitorConsult(boolean visitorConsult){
		this.visitorConsult=visitorConsult;
	}

	public boolean getVisitorConsult(){
		return visitorConsult;
	}
	public void setVoucher(boolean voucher){
		this.voucher=voucher;
	}

	public boolean getVoucher(){
		return voucher;
	}
	public void setWebsiteName(String websiteName){
		this.websiteName=websiteName;
	}

	public String getWebsiteName(){
		return websiteName;
	}
	public void setWebsiteState(boolean websiteState){
		this.websiteState=websiteState;
	}

	public boolean getWebsiteState(){
		return websiteState;
	}
	public void setZtcPrice(Long ztcPrice){
		this.ztcPrice=ztcPrice;
	}

	public Long getZtcPrice(){
		return ztcPrice;
	}
	public void setZtcStatus(boolean ztcStatus){
		this.ztcStatus=ztcStatus;
	}

	public boolean getZtcStatus(){
		return ztcStatus;
	}
	public void setGoodsImageId(Long goodsImageId){
		this.goodsImageId=goodsImageId;
	}

	public Long getGoodsImageId(){
		return goodsImageId;
	}
	public void setMemberIconId(Long memberIconId){
		this.memberIconId=memberIconId;
	}

	public Long getMemberIconId(){
		return memberIconId;
	}
	public void setStoreImageId(Long storeImageId){
		this.storeImageId=storeImageId;
	}

	public Long getStoreImageId(){
		return storeImageId;
	}
	public void setWebsiteLogoId(Long websiteLogoId){
		this.websiteLogoId=websiteLogoId;
	}

	public Long getWebsiteLogoId(){
		return websiteLogoId;
	}
	public void setDomainAllowCount(Long domainAllowCount){
		this.domainAllowCount=domainAllowCount;
	}

	public Long getDomainAllowCount(){
		return domainAllowCount;
	}
	public void setSecondDomainOpen(boolean secondDomainOpen){
		this.secondDomainOpen=secondDomainOpen;
	}

	public boolean getSecondDomainOpen(){
		return secondDomainOpen;
	}
	public void setSysDomain(String sysDomain){
		this.sysDomain=sysDomain;
	}

	public String getSysDomain(){
		return sysDomain;
	}
	public void setQqLogin(boolean qqLogin){
		this.qqLogin=qqLogin;
	}

	public boolean getQqLogin(){
		return qqLogin;
	}
	public void setQqLoginId(String qqLoginId){
		this.qqLoginId=qqLoginId;
	}

	public String getQqLoginId(){
		return qqLoginId;
	}
	public void setQqLoginKey(String qqLoginKey){
		this.qqLoginKey=qqLoginKey;
	}

	public String getQqLoginKey(){
		return qqLoginKey;
	}
	public void setQqDomainCode(String qqDomainCode){
		this.qqDomainCode=qqDomainCode;
	}

	public String getQqDomainCode(){
		return qqDomainCode;
	}
	public void setSinaDomainCode(String sinaDomainCode){
		this.sinaDomainCode=sinaDomainCode;
	}

	public String getSinaDomainCode(){
		return sinaDomainCode;
	}
	public void setSinaLogin(boolean sinaLogin){
		this.sinaLogin=sinaLogin;
	}

	public boolean getSinaLogin(){
		return sinaLogin;
	}
	public void setSinaLoginId(String sinaLoginId){
		this.sinaLoginId=sinaLoginId;
	}

	public String getSinaLoginId(){
		return sinaLoginId;
	}
	public void setSinaLoginKey(String sinaLoginKey){
		this.sinaLoginKey=sinaLoginKey;
	}

	public String getSinaLoginKey(){
		return sinaLoginKey;
	}
	public void setImageWebServer(String imageWebServer){
		this.imageWebServer=imageWebServer;
	}

	public String getImageWebServer(){
		return imageWebServer;
	}
	public void setLuceneUpdate(Date luceneUpdate){
		this.luceneUpdate=luceneUpdate;
	}

	public Date getLuceneUpdate(){
		return luceneUpdate;
	}
	public void setAlipayFenrun(Long alipayFenrun){
		this.alipayFenrun=alipayFenrun;
	}

	public Long getAlipayFenrun(){
		return alipayFenrun;
	}
	public void setBalanceFenrun(Long balanceFenrun){
		this.balanceFenrun=balanceFenrun;
	}

	public Long getBalanceFenrun(){
		return balanceFenrun;
	}
	public void setAutoOrderConfirm(Long autoOrderConfirm){
		this.autoOrderConfirm=autoOrderConfirm;
	}

	public Long getAutoOrderConfirm(){
		return autoOrderConfirm;
	}
	public void setAutoOrderNotice(Long autoOrderNotice){
		this.autoOrderNotice=autoOrderNotice;
	}

	public Long getAutoOrderNotice(){
		return autoOrderNotice;
	}
	public void setBargainMaximum(Long bargainMaximum){
		this.bargainMaximum=bargainMaximum;
	}

	public Long getBargainMaximum(){
		return bargainMaximum;
	}
	public void setBargainRebate(Double bargainRebate){
		this.bargainRebate=bargainRebate;
	}

	public Double getBargainRebate(){
		return bargainRebate;
	}
	public void setBargainState(String bargainState){
		this.bargainState=bargainState;
	}

	public String getBargainState(){
		return bargainState;
	}
	public void setBargainStatus(Long bargainStatus){
		this.bargainStatus=bargainStatus;
	}

	public Long getBargainStatus(){
		return bargainStatus;
	}
	public void setBargainTitle(String bargainTitle){
		this.bargainTitle=bargainTitle;
	}

	public String getBargainTitle(){
		return bargainTitle;
	}
	public void setServiceQqList(String serviceQqList){
		this.serviceQqList=serviceQqList;
	}

	public String getServiceQqList(){
		return serviceQqList;
	}
	public void setServiceTelphoneList(String serviceTelphoneList){
		this.serviceTelphoneList=serviceTelphoneList;
	}

	public String getServiceTelphoneList(){
		return serviceTelphoneList;
	}
	public void setSysDeliveryMaximum(Long sysDeliveryMaximum){
		this.sysDeliveryMaximum=sysDeliveryMaximum;
	}

	public Long getSysDeliveryMaximum(){
		return sysDeliveryMaximum;
	}
	public void setUcBbs(boolean ucBbs){
		this.ucBbs=ucBbs;
	}

	public boolean getUcBbs(){
		return ucBbs;
	}
	public void setKuaidiId(String kuaidiId){
		this.kuaidiId=kuaidiId;
	}

	public String getKuaidiId(){
		return kuaidiId;
	}
	public void setUcApi(String ucApi){
		this.ucApi=ucApi;
	}

	public String getUcApi(){
		return ucApi;
	}
	public void setUcAppid(String ucAppid){
		this.ucAppid=ucAppid;
	}

	public String getUcAppid(){
		return ucAppid;
	}
	public void setUcDatabase(String ucDatabase){
		this.ucDatabase=ucDatabase;
	}

	public String getUcDatabase(){
		return ucDatabase;
	}
	public void setUcDatabasePort(String ucDatabasePort){
		this.ucDatabasePort=ucDatabasePort;
	}

	public String getUcDatabasePort(){
		return ucDatabasePort;
	}
	public void setUcDatabasePws(String ucDatabasePws){
		this.ucDatabasePws=ucDatabasePws;
	}

	public String getUcDatabasePws(){
		return ucDatabasePws;
	}
	public void setUcDatabaseUrl(String ucDatabaseUrl){
		this.ucDatabaseUrl=ucDatabaseUrl;
	}

	public String getUcDatabaseUrl(){
		return ucDatabaseUrl;
	}
	public void setUcDatabaseUsername(String ucDatabaseUsername){
		this.ucDatabaseUsername=ucDatabaseUsername;
	}

	public String getUcDatabaseUsername(){
		return ucDatabaseUsername;
	}
	public void setUcIp(String ucIp){
		this.ucIp=ucIp;
	}

	public String getUcIp(){
		return ucIp;
	}
	public void setUcKey(String ucKey){
		this.ucKey=ucKey;
	}

	public String getUcKey(){
		return ucKey;
	}
	public void setUcTablePreffix(String ucTablePreffix){
		this.ucTablePreffix=ucTablePreffix;
	}

	public String getUcTablePreffix(){
		return ucTablePreffix;
	}
	public void setCurrencyCode(String currencyCode){
		this.currencyCode=currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}
	public void setBargainValidity(Long bargainValidity){
		this.bargainValidity=bargainValidity;
	}

	public Long getBargainValidity(){
		return bargainValidity;
	}
	public void setDeliveryAmount(Long deliveryAmount){
		this.deliveryAmount=deliveryAmount;
	}

	public Long getDeliveryAmount(){
		return deliveryAmount;
	}
	public void setDeliveryStatus(Long deliveryStatus){
		this.deliveryStatus=deliveryStatus;
	}

	public Long getDeliveryStatus(){
		return deliveryStatus;
	}
	public void setDeliveryTitle(String deliveryTitle){
		this.deliveryTitle=deliveryTitle;
	}

	public String getDeliveryTitle(){
		return deliveryTitle;
	}
	public void setWebsiteCss(String websiteCss){
		this.websiteCss=websiteCss;
	}

	public String getWebsiteCss(){
		return websiteCss;
	}
	public void setCombinAmount(Long combinAmount){
		this.combinAmount=combinAmount;
	}

	public Long getCombinAmount(){
		return combinAmount;
	}
	public void setCombinCount(Long combinCount){
		this.combinCount=combinCount;
	}

	public Long getCombinCount(){
		return combinCount;
	}
	public void setZtcGoodsView(Long ztcGoodsView){
		this.ztcGoodsView=ztcGoodsView;
	}

	public Long getZtcGoodsView(){
		return ztcGoodsView;
	}
	public void setAutoOrderEvaluate(Long autoOrderEvaluate){
		this.autoOrderEvaluate=autoOrderEvaluate;
	}

	public Long getAutoOrderEvaluate(){
		return autoOrderEvaluate;
	}
	public void setAutoOrderReturn(Long autoOrderReturn){
		this.autoOrderReturn=autoOrderReturn;
	}

	public Long getAutoOrderReturn(){
		return autoOrderReturn;
	}
	public void setWeixinStore(boolean weixinStore){
		this.weixinStore=weixinStore;
	}

	public boolean getWeixinStore(){
		return weixinStore;
	}
	public void setWeixinAmount(Long weixinAmount){
		this.weixinAmount=weixinAmount;
	}

	public Long getWeixinAmount(){
		return weixinAmount;
	}
	public void setConfigPaymentType(Long configPaymentType){
		this.configPaymentType=configPaymentType;
	}

	public Long getConfigPaymentType(){
		return configPaymentType;
	}
	public void setWeixinAccount(String weixinAccount){
		this.weixinAccount=weixinAccount;
	}

	public String getWeixinAccount(){
		return weixinAccount;
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
	public void setStoreWeixinLogoId(Long storeWeixinLogoId){
		this.storeWeixinLogoId=storeWeixinLogoId;
	}

	public Long getStoreWeixinLogoId(){
		return storeWeixinLogoId;
	}
	public void setWeixinQrImgId(Long weixinQrImgId){
		this.weixinQrImgId=weixinQrImgId;
	}

	public Long getWeixinQrImgId(){
		return weixinQrImgId;
	}
	public void setSiteUrl(String siteUrl){
		this.siteUrl=siteUrl;
	}

	public String getSiteUrl(){
		return siteUrl;
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

	if(null != address && !"".equals(address) ){
		sb.append("  address= "+address+",");
	}
	if(null != bigHeight && !"".equals(bigHeight) ){
		sb.append("  bigHeight= "+bigHeight+",");
	}
	if(null != bigWidth && !"".equals(bigWidth) ){
		sb.append("  bigWidth= "+bigWidth+",");
	}
	if(null != closeReason && !"".equals(closeReason) ){
		sb.append("  closeReason= "+closeReason+",");
	}
	if(null != codeStat && !"".equals(codeStat) ){
		sb.append("  codeStat= "+codeStat+",");
	}
	if(null != complaintTime && !"".equals(complaintTime) ){
		sb.append("  complaintTime= "+complaintTime+",");
	}
	if(null != consumptionRatio && !"".equals(consumptionRatio) ){
		sb.append("  consumptionRatio= "+consumptionRatio+",");
	}
	if(null != copyRight && !"".equals(copyRight) ){
		sb.append("  copyRight= "+copyRight+",");
	}
	if(null != creditrule && !"".equals(creditrule) ){
		sb.append("  creditrule= "+creditrule+",");
	}
//	if(null != deposit && !"".equals(deposit) ){
//		sb.append("  deposit= "+deposit+",");
//	}
	if(null != description && !"".equals(description) ){
		sb.append("  description= "+description+",");
	}
//	if(null != emailEnable && !"".equals(emailEnable) ){
//		sb.append("  emailEnable= "+emailEnable+",");
//	}
	if(null != emailHost && !"".equals(emailHost) ){
		sb.append("  emailHost= "+emailHost+",");
	}
	if(null != emailPort && !"".equals(emailPort) ){
		sb.append("  emailPort= "+emailPort+",");
	}
	if(null != emailPws && !"".equals(emailPws) ){
		sb.append("  emailPws= "+emailPws+",");
	}
	if(null != emailTest && !"".equals(emailTest) ){
		sb.append("  emailTest= "+emailTest+",");
	}
	if(null != emailUser && !"".equals(emailUser) ){
		sb.append("  emailUser= "+emailUser+",");
	}
	if(null != emailUserName && !"".equals(emailUserName) ){
		sb.append("  emailUserName= "+emailUserName+",");
	}
	if(null != everyIndentLimit && !"".equals(everyIndentLimit) ){
		sb.append("  everyIndentLimit= "+everyIndentLimit+",");
	}
//	if(null != gold && !"".equals(gold) ){
//		sb.append("  gold= "+gold+",");
//	}
	if(null != goldMarketValue && !"".equals(goldMarketValue) ){
		sb.append("  goldMarketValue= "+goldMarketValue+",");
	}
//	if(null != groupBuy && !"".equals(groupBuy) ){
//		sb.append("  groupBuy= "+groupBuy+",");
//	}
	if(null != hotSearch && !"".equals(hotSearch) ){
		sb.append("  hotSearch= "+hotSearch+",");
	}
	if(null != imageFilesize && !"".equals(imageFilesize) ){
		sb.append("  imageFilesize= "+imageFilesize+",");
	}
	if(null != imageSaveType && !"".equals(imageSaveType) ){
		sb.append("  imageSaveType= "+imageSaveType+",");
	}
	if(null != imageSuffix && !"".equals(imageSuffix) ){
		sb.append("  imageSuffix= "+imageSuffix+",");
	}
	if(null != indentComment && !"".equals(indentComment) ){
		sb.append("  indentComment= "+indentComment+",");
	}
//	if(null != integral && !"".equals(integral) ){
//		sb.append("  integral= "+integral+",");
//	}
	if(null != integralRate && !"".equals(integralRate) ){
		sb.append("  integralRate= "+integralRate+",");
	}
//	if(null != integralStore && !"".equals(integralStore) ){
//		sb.append("  integralStore= "+integralStore+",");
//	}
	if(null != keywords && !"".equals(keywords) ){
		sb.append("  keywords= "+keywords+",");
	}
	if(null != memberDayLogin && !"".equals(memberDayLogin) ){
		sb.append("  memberDayLogin= "+memberDayLogin+",");
	}
	if(null != memberRegister && !"".equals(memberRegister) ){
		sb.append("  memberRegister= "+memberRegister+",");
	}
	if(null != middleHeight && !"".equals(middleHeight) ){
		sb.append("  middleHeight= "+middleHeight+",");
	}
	if(null != middleWidth && !"".equals(middleWidth) ){
		sb.append("  middleWidth= "+middleWidth+",");
	}
//	if(null != securityCodeConsult && !"".equals(securityCodeConsult) ){
//		sb.append("  securityCodeConsult= "+securityCodeConsult+",");
//	}
//	if(null != securityCodeLogin && !"".equals(securityCodeLogin) ){
//		sb.append("  securityCodeLogin= "+securityCodeLogin+",");
//	}
//	if(null != securityCodeRegister && !"".equals(securityCodeRegister) ){
//		sb.append("  securityCodeRegister= "+securityCodeRegister+",");
//	}
	if(null != securityCodeType && !"".equals(securityCodeType) ){
		sb.append("  securityCodeType= "+securityCodeType+",");
	}
	if(null != shareCode && !"".equals(shareCode) ){
		sb.append("  shareCode= "+shareCode+",");
	}
	if(null != smallHeight && !"".equals(smallHeight) ){
		sb.append("  smallHeight= "+smallHeight+",");
	}
	if(null != smallWidth && !"".equals(smallWidth) ){
		sb.append("  smallWidth= "+smallWidth+",");
	}
//	if(null != smsEnbale && !"".equals(smsEnbale) ){
//		sb.append("  smsEnbale= "+smsEnbale+",");
//	}
	if(null != smsPassword && !"".equals(smsPassword) ){
		sb.append("  smsPassword= "+smsPassword+",");
	}
	if(null != smsTest && !"".equals(smsTest) ){
		sb.append("  smsTest= "+smsTest+",");
	}
	if(null != smsURL && !"".equals(smsURL) ){
		sb.append("  smsURL= "+smsURL+",");
	}
	if(null != smsUserName && !"".equals(smsUserName) ){
		sb.append("  smsUserName= "+smsUserName+",");
	}
//	if(null != storeAllow && !"".equals(storeAllow) ){
//		sb.append("  storeAllow= "+storeAllow+",");
//	}
	if(null != storePayment && !"".equals(storePayment) ){
		sb.append("  storePayment= "+storePayment+",");
	}
	if(null != sysLanguage && !"".equals(sysLanguage) ){
		sb.append("  sysLanguage= "+sysLanguage+",");
	}
	if(null != templates && !"".equals(templates) ){
		sb.append("  templates= "+templates+",");
	}
	if(null != title && !"".equals(title) ){
		sb.append("  title= "+title+",");
	}
	if(null != uploadFilePath && !"".equals(uploadFilePath) ){
		sb.append("  uploadFilePath= "+uploadFilePath+",");
	}
	if(null != userCreditrule && !"".equals(userCreditrule) ){
		sb.append("  userCreditrule= "+userCreditrule+",");
	}
//	if(null != visitorConsult && !"".equals(visitorConsult) ){
//		sb.append("  visitorConsult= "+visitorConsult+",");
//	}
//	if(null != voucher && !"".equals(voucher) ){
//		sb.append("  voucher= "+voucher+",");
//	}
	if(null != websiteName && !"".equals(websiteName) ){
		sb.append("  websiteName= "+websiteName+",");
	}
//	if(null != websiteState && !"".equals(websiteState) ){
//		sb.append("  websiteState= "+websiteState+",");
//	}
	if(null != ztcPrice && !"".equals(ztcPrice) ){
		sb.append("  ztcPrice= "+ztcPrice+",");
	}
//	if(null != ztcStatus && !"".equals(ztcStatus) ){
//		sb.append("  ztcStatus= "+ztcStatus+",");
//	}
	if(null != goodsImageId && !"".equals(goodsImageId) ){
		sb.append("  goodsImageId= "+goodsImageId+",");
	}
	if(null != memberIconId && !"".equals(memberIconId) ){
		sb.append("  memberIconId= "+memberIconId+",");
	}
	if(null != storeImageId && !"".equals(storeImageId) ){
		sb.append("  storeImageId= "+storeImageId+",");
	}
	if(null != websiteLogoId && !"".equals(websiteLogoId) ){
		sb.append("  websiteLogoId= "+websiteLogoId+",");
	}
	if(null != domainAllowCount && !"".equals(domainAllowCount) ){
		sb.append("  domainAllowCount= "+domainAllowCount+",");
	}
//	if(null != secondDomainOpen && !"".equals(secondDomainOpen) ){
//		sb.append("  secondDomainOpen= "+secondDomainOpen+",");
//	}
	if(null != sysDomain && !"".equals(sysDomain) ){
		sb.append("  sysDomain= "+sysDomain+",");
	}
//	if(null != qqLogin && !"".equals(qqLogin) ){
//		sb.append("  qqLogin= "+qqLogin+",");
//	}
	if(null != qqLoginId && !"".equals(qqLoginId) ){
		sb.append("  qqLoginId= "+qqLoginId+",");
	}
	if(null != qqLoginKey && !"".equals(qqLoginKey) ){
		sb.append("  qqLoginKey= "+qqLoginKey+",");
	}
	if(null != qqDomainCode && !"".equals(qqDomainCode) ){
		sb.append("  qqDomainCode= "+qqDomainCode+",");
	}
	if(null != sinaDomainCode && !"".equals(sinaDomainCode) ){
		sb.append("  sinaDomainCode= "+sinaDomainCode+",");
	}
//	if(null != sinaLogin && !"".equals(sinaLogin) ){
//		sb.append("  sinaLogin= "+sinaLogin+",");
//	}
	if(null != sinaLoginId && !"".equals(sinaLoginId) ){
		sb.append("  sinaLoginId= "+sinaLoginId+",");
	}
	if(null != sinaLoginKey && !"".equals(sinaLoginKey) ){
		sb.append("  sinaLoginKey= "+sinaLoginKey+",");
	}
	if(null != imageWebServer && !"".equals(imageWebServer) ){
		sb.append("  imageWebServer= "+imageWebServer+",");
	}
	if(null != luceneUpdate && !"".equals(luceneUpdate) ){
		sb.append("  luceneUpdate= "+luceneUpdate+",");
	}
	if(null != alipayFenrun && !"".equals(alipayFenrun) ){
		sb.append("  alipayFenrun= "+alipayFenrun+",");
	}
	if(null != balanceFenrun && !"".equals(balanceFenrun) ){
		sb.append("  balanceFenrun= "+balanceFenrun+",");
	}
	if(null != autoOrderConfirm && !"".equals(autoOrderConfirm) ){
		sb.append("  autoOrderConfirm= "+autoOrderConfirm+",");
	}
	if(null != autoOrderNotice && !"".equals(autoOrderNotice) ){
		sb.append("  autoOrderNotice= "+autoOrderNotice+",");
	}
	if(null != bargainMaximum && !"".equals(bargainMaximum) ){
		sb.append("  bargainMaximum= "+bargainMaximum+",");
	}
	if(null != bargainRebate && !"".equals(bargainRebate) ){
		sb.append("  bargainRebate= "+bargainRebate+",");
	}
	if(null != bargainState && !"".equals(bargainState) ){
		sb.append("  bargainState= "+bargainState+",");
	}
	if(null != bargainStatus && !"".equals(bargainStatus) ){
		sb.append("  bargainStatus= "+bargainStatus+",");
	}
	if(null != bargainTitle && !"".equals(bargainTitle) ){
		sb.append("  bargainTitle= "+bargainTitle+",");
	}
	if(null != serviceQqList && !"".equals(serviceQqList) ){
		sb.append("  serviceQqList= "+serviceQqList+",");
	}
	if(null != serviceTelphoneList && !"".equals(serviceTelphoneList) ){
		sb.append("  serviceTelphoneList= "+serviceTelphoneList+",");
	}
	if(null != sysDeliveryMaximum && !"".equals(sysDeliveryMaximum) ){
		sb.append("  sysDeliveryMaximum= "+sysDeliveryMaximum+",");
	}
//	if(null != ucBbs && !"".equals(ucBbs) ){
//		sb.append("  ucBbs= "+ucBbs+",");
//	}
	if(null != kuaidiId && !"".equals(kuaidiId) ){
		sb.append("  kuaidiId= "+kuaidiId+",");
	}
	if(null != ucApi && !"".equals(ucApi) ){
		sb.append("  ucApi= "+ucApi+",");
	}
	if(null != ucAppid && !"".equals(ucAppid) ){
		sb.append("  ucAppid= "+ucAppid+",");
	}
	if(null != ucDatabase && !"".equals(ucDatabase) ){
		sb.append("  ucDatabase= "+ucDatabase+",");
	}
	if(null != ucDatabasePort && !"".equals(ucDatabasePort) ){
		sb.append("  ucDatabasePort= "+ucDatabasePort+",");
	}
	if(null != ucDatabasePws && !"".equals(ucDatabasePws) ){
		sb.append("  ucDatabasePws= "+ucDatabasePws+",");
	}
	if(null != ucDatabaseUrl && !"".equals(ucDatabaseUrl) ){
		sb.append("  ucDatabaseUrl= "+ucDatabaseUrl+",");
	}
	if(null != ucDatabaseUsername && !"".equals(ucDatabaseUsername) ){
		sb.append("  ucDatabaseUsername= "+ucDatabaseUsername+",");
	}
	if(null != ucIp && !"".equals(ucIp) ){
		sb.append("  ucIp= "+ucIp+",");
	}
	if(null != ucKey && !"".equals(ucKey) ){
		sb.append("  ucKey= "+ucKey+",");
	}
	if(null != ucTablePreffix && !"".equals(ucTablePreffix) ){
		sb.append("  ucTablePreffix= "+ucTablePreffix+",");
	}
	if(null != currencyCode && !"".equals(currencyCode) ){
		sb.append("  currencyCode= "+currencyCode+",");
	}
	if(null != bargainValidity && !"".equals(bargainValidity) ){
		sb.append("  bargainValidity= "+bargainValidity+",");
	}
	if(null != deliveryAmount && !"".equals(deliveryAmount) ){
		sb.append("  deliveryAmount= "+deliveryAmount+",");
	}
	if(null != deliveryStatus && !"".equals(deliveryStatus) ){
		sb.append("  deliveryStatus= "+deliveryStatus+",");
	}
	if(null != deliveryTitle && !"".equals(deliveryTitle) ){
		sb.append("  deliveryTitle= "+deliveryTitle+",");
	}
	if(null != websiteCss && !"".equals(websiteCss) ){
		sb.append("  websiteCss= "+websiteCss+",");
	}
	if(null != combinAmount && !"".equals(combinAmount) ){
		sb.append("  combinAmount= "+combinAmount+",");
	}
	if(null != combinCount && !"".equals(combinCount) ){
		sb.append("  combinCount= "+combinCount+",");
	}
	if(null != ztcGoodsView && !"".equals(ztcGoodsView) ){
		sb.append("  ztcGoodsView= "+ztcGoodsView+",");
	}
	if(null != autoOrderEvaluate && !"".equals(autoOrderEvaluate) ){
		sb.append("  autoOrderEvaluate= "+autoOrderEvaluate+",");
	}
	if(null != autoOrderReturn && !"".equals(autoOrderReturn) ){
		sb.append("  autoOrderReturn= "+autoOrderReturn+",");
	}
//	if(null != weixinStore && !"".equals(weixinStore) ){
//		sb.append("  weixinStore= "+weixinStore+",");
//	}
	if(null != weixinAmount && !"".equals(weixinAmount) ){
		sb.append("  weixinAmount= "+weixinAmount+",");
	}
	if(null != configPaymentType && !"".equals(configPaymentType) ){
		sb.append("  configPaymentType= "+configPaymentType+",");
	}
	if(null != weixinAccount && !"".equals(weixinAccount) ){
		sb.append("  weixinAccount= "+weixinAccount+",");
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
	if(null != storeWeixinLogoId && !"".equals(storeWeixinLogoId) ){
		sb.append("  storeWeixinLogoId= "+storeWeixinLogoId+",");
	}
	if(null != weixinQrImgId && !"".equals(weixinQrImgId) ){
		sb.append("  weixinQrImgId= "+weixinQrImgId+",");
	}
	if(null != siteUrl && !"".equals(siteUrl) ){
		sb.append("  siteUrl= "+siteUrl+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
