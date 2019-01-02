package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_payment 
* @Package: com.sanxia.market.entity
* @Title:ShoppingPayment.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-07 13:37:21
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingPayment extends BaseEntity implements Serializable {

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
	*@Fields chinabankAccount :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String chinabankAccount;
	/**
	*@Fields chinabankKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String chinabankKey;
	/**
	*@Fields content :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String content;
	/**
	*@Fields install :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean install;
	/**
	*@Fields interfaceType :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long interfaceType;
	/**
	*@Fields mark :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String mark;
	/**
	*@Fields merchantAcctId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String merchantAcctId;
	/**
	*@Fields name :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String name;
	/**
	*@Fields partner :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String partner;
	/**
	*@Fields pid :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String pid;
	/**
	*@Fields rmbKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String rmbKey;
	/**
	*@Fields safeKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String safeKey;
	/**
	*@Fields sellerEmail :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String sellerEmail;
	/**
	*@Fields spname :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String spname;
	/**
	*@Fields tenpayKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String tenpayKey;
	/**
	*@Fields tenpayPartner :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String tenpayPartner;
	/**
	*@Fields tradeMode :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long tradeMode;
	/**
	*@Fields type :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String type;
	/**
	*@Fields storeId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeId;
	/**
	*@Fields alipayDivideRate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double alipayDivideRate;
	/**
	*@Fields alipayRate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double alipayRate;
	/**
	*@Fields balanceDivideRate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double balanceDivideRate;
	/**
	*@Fields currencyCode :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String currencyCode;
	/**
	*@Fields paypalUserId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String paypalUserId;
	/**
	*@Fields poundage :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double poundage;
	/**
	*@Fields lzbankKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String lzbankKey;
	/**
	*@Fields lzbankPartner :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String lzbankPartner;
	/**
	*@Fields lzbankTradeMode :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String lzbankTradeMode;
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
	*@Fields weixinPartnerId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinPartnerId;
	/**
	*@Fields weixinPartnerKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinPartnerKey;
	/**
	*@Fields weixinPaySignKey :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String weixinPaySignKey;
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
	public void setChinabankAccount(String chinabankAccount){
		this.chinabankAccount=chinabankAccount;
	}

	public String getChinabankAccount(){
		return chinabankAccount;
	}
	public void setChinabankKey(String chinabankKey){
		this.chinabankKey=chinabankKey;
	}

	public String getChinabankKey(){
		return chinabankKey;
	}
	public void setContent(String content){
		this.content=content;
	}

	public String getContent(){
		return content;
	}
	public void setInstall(boolean install){
		this.install=install;
	}

	public boolean getInstall(){
		return install;
	}
	public void setInterfaceType(Long interfaceType){
		this.interfaceType=interfaceType;
	}

	public Long getInterfaceType(){
		return interfaceType;
	}
	public void setMark(String mark){
		this.mark=mark;
	}

	public String getMark(){
		return mark;
	}
	public void setMerchantAcctId(String merchantAcctId){
		this.merchantAcctId=merchantAcctId;
	}

	public String getMerchantAcctId(){
		return merchantAcctId;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}
	public void setPartner(String partner){
		this.partner=partner;
	}

	public String getPartner(){
		return partner;
	}
	public void setPid(String pid){
		this.pid=pid;
	}

	public String getPid(){
		return pid;
	}
	public void setRmbKey(String rmbKey){
		this.rmbKey=rmbKey;
	}

	public String getRmbKey(){
		return rmbKey;
	}
	public void setSafeKey(String safeKey){
		this.safeKey=safeKey;
	}

	public String getSafeKey(){
		return safeKey;
	}
	public void setSellerEmail(String sellerEmail){
		this.sellerEmail=sellerEmail;
	}

	public String getSellerEmail(){
		return sellerEmail;
	}
	public void setSpname(String spname){
		this.spname=spname;
	}

	public String getSpname(){
		return spname;
	}
	public void setTenpayKey(String tenpayKey){
		this.tenpayKey=tenpayKey;
	}

	public String getTenpayKey(){
		return tenpayKey;
	}
	public void setTenpayPartner(String tenpayPartner){
		this.tenpayPartner=tenpayPartner;
	}

	public String getTenpayPartner(){
		return tenpayPartner;
	}
	public void setTradeMode(Long tradeMode){
		this.tradeMode=tradeMode;
	}

	public Long getTradeMode(){
		return tradeMode;
	}
	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return type;
	}
	public void setStoreId(Long storeId){
		this.storeId=storeId;
	}

	public Long getStoreId(){
		return storeId;
	}
	public void setAlipayDivideRate(Double alipayDivideRate){
		this.alipayDivideRate=alipayDivideRate;
	}

	public Double getAlipayDivideRate(){
		return alipayDivideRate;
	}
	public void setAlipayRate(Double alipayRate){
		this.alipayRate=alipayRate;
	}

	public Double getAlipayRate(){
		return alipayRate;
	}
	public void setBalanceDivideRate(Double balanceDivideRate){
		this.balanceDivideRate=balanceDivideRate;
	}

	public Double getBalanceDivideRate(){
		return balanceDivideRate;
	}
	public void setCurrencyCode(String currencyCode){
		this.currencyCode=currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}
	public void setPaypalUserId(String paypalUserId){
		this.paypalUserId=paypalUserId;
	}

	public String getPaypalUserId(){
		return paypalUserId;
	}
	public void setPoundage(Double poundage){
		this.poundage=poundage;
	}

	public Double getPoundage(){
		return poundage;
	}
	public void setLzbankKey(String lzbankKey){
		this.lzbankKey=lzbankKey;
	}

	public String getLzbankKey(){
		return lzbankKey;
	}
	public void setLzbankPartner(String lzbankPartner){
		this.lzbankPartner=lzbankPartner;
	}

	public String getLzbankPartner(){
		return lzbankPartner;
	}
	public void setLzbankTradeMode(String lzbankTradeMode){
		this.lzbankTradeMode=lzbankTradeMode;
	}

	public String getLzbankTradeMode(){
		return lzbankTradeMode;
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
	public void setWeixinPartnerId(String weixinPartnerId){
		this.weixinPartnerId=weixinPartnerId;
	}

	public String getWeixinPartnerId(){
		return weixinPartnerId;
	}
	public void setWeixinPartnerKey(String weixinPartnerKey){
		this.weixinPartnerKey=weixinPartnerKey;
	}

	public String getWeixinPartnerKey(){
		return weixinPartnerKey;
	}
	public void setWeixinPaySignKey(String weixinPaySignKey){
		this.weixinPaySignKey=weixinPaySignKey;
	}

	public String getWeixinPaySignKey(){
		return weixinPaySignKey;
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
	if(null != chinabankAccount && !"".equals(chinabankAccount) ){
		sb.append("  chinabankAccount= "+chinabankAccount+",");
	}
	if(null != chinabankKey && !"".equals(chinabankKey) ){
		sb.append("  chinabankKey= "+chinabankKey+",");
	}
	if(null != content && !"".equals(content) ){
		sb.append("  content= "+content+",");
	}
//	if(null != install && !"".equals(install) ){
//		sb.append("  install= "+install+",");
//	}
	if(null != interfaceType && !"".equals(interfaceType) ){
		sb.append("  interfaceType= "+interfaceType+",");
	}
	if(null != mark && !"".equals(mark) ){
		sb.append("  mark= "+mark+",");
	}
	if(null != merchantAcctId && !"".equals(merchantAcctId) ){
		sb.append("  merchantAcctId= "+merchantAcctId+",");
	}
	if(null != name && !"".equals(name) ){
		sb.append("  name= "+name+",");
	}
	if(null != partner && !"".equals(partner) ){
		sb.append("  partner= "+partner+",");
	}
	if(null != pid && !"".equals(pid) ){
		sb.append("  pid= "+pid+",");
	}
	if(null != rmbKey && !"".equals(rmbKey) ){
		sb.append("  rmbKey= "+rmbKey+",");
	}
	if(null != safeKey && !"".equals(safeKey) ){
		sb.append("  safeKey= "+safeKey+",");
	}
	if(null != sellerEmail && !"".equals(sellerEmail) ){
		sb.append("  sellerEmail= "+sellerEmail+",");
	}
	if(null != spname && !"".equals(spname) ){
		sb.append("  spname= "+spname+",");
	}
	if(null != tenpayKey && !"".equals(tenpayKey) ){
		sb.append("  tenpayKey= "+tenpayKey+",");
	}
	if(null != tenpayPartner && !"".equals(tenpayPartner) ){
		sb.append("  tenpayPartner= "+tenpayPartner+",");
	}
	if(null != tradeMode && !"".equals(tradeMode) ){
		sb.append("  tradeMode= "+tradeMode+",");
	}
	if(null != type && !"".equals(type) ){
		sb.append("  type= "+type+",");
	}
	if(null != storeId && !"".equals(storeId) ){
		sb.append("  storeId= "+storeId+",");
	}
	if(null != alipayDivideRate && !"".equals(alipayDivideRate) ){
		sb.append("  alipayDivideRate= "+alipayDivideRate+",");
	}
	if(null != alipayRate && !"".equals(alipayRate) ){
		sb.append("  alipayRate= "+alipayRate+",");
	}
	if(null != balanceDivideRate && !"".equals(balanceDivideRate) ){
		sb.append("  balanceDivideRate= "+balanceDivideRate+",");
	}
	if(null != currencyCode && !"".equals(currencyCode) ){
		sb.append("  currencyCode= "+currencyCode+",");
	}
	if(null != paypalUserId && !"".equals(paypalUserId) ){
		sb.append("  paypalUserId= "+paypalUserId+",");
	}
	if(null != poundage && !"".equals(poundage) ){
		sb.append("  poundage= "+poundage+",");
	}
	if(null != lzbankKey && !"".equals(lzbankKey) ){
		sb.append("  lzbankKey= "+lzbankKey+",");
	}
	if(null != lzbankPartner && !"".equals(lzbankPartner) ){
		sb.append("  lzbankPartner= "+lzbankPartner+",");
	}
	if(null != lzbankTradeMode && !"".equals(lzbankTradeMode) ){
		sb.append("  lzbankTradeMode= "+lzbankTradeMode+",");
	}
	if(null != weixinAppId && !"".equals(weixinAppId) ){
		sb.append("  weixinAppId= "+weixinAppId+",");
	}
	if(null != weixinAppSecret && !"".equals(weixinAppSecret) ){
		sb.append("  weixinAppSecret= "+weixinAppSecret+",");
	}
	if(null != weixinPartnerId && !"".equals(weixinPartnerId) ){
		sb.append("  weixinPartnerId= "+weixinPartnerId+",");
	}
	if(null != weixinPartnerKey && !"".equals(weixinPartnerKey) ){
		sb.append("  weixinPartnerKey= "+weixinPartnerKey+",");
	}
	if(null != weixinPaySignKey && !"".equals(weixinPaySignKey) ){
		sb.append("  weixinPaySignKey= "+weixinPaySignKey+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
