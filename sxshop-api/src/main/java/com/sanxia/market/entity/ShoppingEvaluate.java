package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_evaluate 
* @Package: com.sanxia.market.entity
* @Title:ShoppingEvaluate.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-12-13 12:11:07
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingEvaluate extends BaseEntity implements Serializable {

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
	*@Fields evaluateAdminInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String evaluateAdminInfo;
	/**
	*@Fields evaluateBuyerVal :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long evaluateBuyerVal;
	/**
	*@Fields evaluateInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String evaluateInfo;
	/**
	*@Fields evaluateSellerInfo :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String evaluateSellerInfo;
	/**
	*@Fields evaluateSellerTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date evaluateSellerTime;
	/**
	*@Fields evaluateSellerVal :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long evaluateSellerVal;
	/**
	*@Fields evaluateStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long evaluateStatus;
	/**
	*@Fields evaluateType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String evaluateType;
	/**
	*@Fields goodsSpec :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String goodsSpec;
	/**
	*@Fields evaluateGoodsId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long evaluateGoodsId;
	/**
	*@Fields evaluateSellerUserId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long evaluateSellerUserId;
	/**
	*@Fields evaluateUserId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long evaluateUserId;
	/**
	*@Fields ofId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ofId;
	/**
	*@Fields descriptionEvaluate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double descriptionEvaluate;
	/**
	*@Fields serviceEvaluate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double serviceEvaluate;
	/**
	*@Fields shipEvaluate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double shipEvaluate;
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
	public void setEvaluateAdminInfo(String evaluateAdminInfo){
		this.evaluateAdminInfo=evaluateAdminInfo;
	}

	public String getEvaluateAdminInfo(){
		return evaluateAdminInfo;
	}
	public void setEvaluateBuyerVal(Long evaluateBuyerVal){
		this.evaluateBuyerVal=evaluateBuyerVal;
	}

	public Long getEvaluateBuyerVal(){
		return evaluateBuyerVal;
	}
	public void setEvaluateInfo(String evaluateInfo){
		this.evaluateInfo=evaluateInfo;
	}

	public String getEvaluateInfo(){
		return evaluateInfo;
	}
	public void setEvaluateSellerInfo(String evaluateSellerInfo){
		this.evaluateSellerInfo=evaluateSellerInfo;
	}

	public String getEvaluateSellerInfo(){
		return evaluateSellerInfo;
	}
	public void setEvaluateSellerTime(Date evaluateSellerTime){
		this.evaluateSellerTime=evaluateSellerTime;
	}

	public Date getEvaluateSellerTime(){
		return evaluateSellerTime;
	}
	public void setEvaluateSellerVal(Long evaluateSellerVal){
		this.evaluateSellerVal=evaluateSellerVal;
	}

	public Long getEvaluateSellerVal(){
		return evaluateSellerVal;
	}
	public void setEvaluateStatus(Long evaluateStatus){
		this.evaluateStatus=evaluateStatus;
	}

	public Long getEvaluateStatus(){
		return evaluateStatus;
	}
	public void setEvaluateType(String evaluateType){
		this.evaluateType=evaluateType;
	}

	public String getEvaluateType(){
		return evaluateType;
	}
	public void setGoodsSpec(String goodsSpec){
		this.goodsSpec=goodsSpec;
	}

	public String getGoodsSpec(){
		return goodsSpec;
	}
	public void setEvaluateGoodsId(Long evaluateGoodsId){
		this.evaluateGoodsId=evaluateGoodsId;
	}

	public Long getEvaluateGoodsId(){
		return evaluateGoodsId;
	}
	public void setEvaluateSellerUserId(Long evaluateSellerUserId){
		this.evaluateSellerUserId=evaluateSellerUserId;
	}

	public Long getEvaluateSellerUserId(){
		return evaluateSellerUserId;
	}
	public void setEvaluateUserId(Long evaluateUserId){
		this.evaluateUserId=evaluateUserId;
	}

	public Long getEvaluateUserId(){
		return evaluateUserId;
	}
	public void setOfId(Long ofId){
		this.ofId=ofId;
	}

	public Long getOfId(){
		return ofId;
	}
	public void setDescriptionEvaluate(Double descriptionEvaluate){
		this.descriptionEvaluate=descriptionEvaluate;
	}

	public Double getDescriptionEvaluate(){
		return descriptionEvaluate;
	}
	public void setServiceEvaluate(Double serviceEvaluate){
		this.serviceEvaluate=serviceEvaluate;
	}

	public Double getServiceEvaluate(){
		return serviceEvaluate;
	}
	public void setShipEvaluate(Double shipEvaluate){
		this.shipEvaluate=shipEvaluate;
	}

	public Double getShipEvaluate(){
		return shipEvaluate;
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
	if(null != evaluateAdminInfo && !"".equals(evaluateAdminInfo) ){
		sb.append("  evaluateAdminInfo= "+evaluateAdminInfo+",");
	}
	if(null != evaluateBuyerVal && !"".equals(evaluateBuyerVal) ){
		sb.append("  evaluateBuyerVal= "+evaluateBuyerVal+",");
	}
	if(null != evaluateInfo && !"".equals(evaluateInfo) ){
		sb.append("  evaluateInfo= "+evaluateInfo+",");
	}
	if(null != evaluateSellerInfo && !"".equals(evaluateSellerInfo) ){
		sb.append("  evaluateSellerInfo= "+evaluateSellerInfo+",");
	}
	if(null != evaluateSellerTime && !"".equals(evaluateSellerTime) ){
		sb.append("  evaluateSellerTime= "+evaluateSellerTime+",");
	}
	if(null != evaluateSellerVal && !"".equals(evaluateSellerVal) ){
		sb.append("  evaluateSellerVal= "+evaluateSellerVal+",");
	}
	if(null != evaluateStatus && !"".equals(evaluateStatus) ){
		sb.append("  evaluateStatus= "+evaluateStatus+",");
	}
	if(null != evaluateType && !"".equals(evaluateType) ){
		sb.append("  evaluateType= "+evaluateType+",");
	}
	if(null != goodsSpec && !"".equals(goodsSpec) ){
		sb.append("  goodsSpec= "+goodsSpec+",");
	}
	if(null != evaluateGoodsId && !"".equals(evaluateGoodsId) ){
		sb.append("  evaluateGoodsId= "+evaluateGoodsId+",");
	}
	if(null != evaluateSellerUserId && !"".equals(evaluateSellerUserId) ){
		sb.append("  evaluateSellerUserId= "+evaluateSellerUserId+",");
	}
	if(null != evaluateUserId && !"".equals(evaluateUserId) ){
		sb.append("  evaluateUserId= "+evaluateUserId+",");
	}
	if(null != ofId && !"".equals(ofId) ){
		sb.append("  ofId= "+ofId+",");
	}
	if(null != descriptionEvaluate && !"".equals(descriptionEvaluate) ){
		sb.append("  descriptionEvaluate= "+descriptionEvaluate+",");
	}
	if(null != serviceEvaluate && !"".equals(serviceEvaluate) ){
		sb.append("  serviceEvaluate= "+serviceEvaluate+",");
	}
	if(null != shipEvaluate && !"".equals(shipEvaluate) ){
		sb.append("  shipEvaluate= "+shipEvaluate+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
