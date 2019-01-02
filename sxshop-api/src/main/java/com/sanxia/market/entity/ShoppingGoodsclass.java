package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_goodsclass 
* @Package: com.sanxia.market.entity
* @Title:ShoppingGoodsclass.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-13 15:33:40
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingGoodsclass extends BaseEntity implements Serializable {

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
	*@Fields className :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String className;
	/**
	*@Fields display :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean display;
	/**
	*@Fields level :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long level;
	/**
	*@Fields recommend :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean recommend;
	/**
	*@Fields sequence :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long sequence;
	/**
	*@Fields goodsTypeId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsTypeId;
	/**
	*@Fields parentId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long parentId;
	/**
	*@Fields seoDescription :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String seoDescription;
	/**
	*@Fields seoKeywords :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String seoKeywords;
	/**
	*@Fields iconSys :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String iconSys;
	/**
	*@Fields iconType :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long iconType;
	/**
	*@Fields iconAccId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long iconAccId;
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
	public void setClassName(String className){
		this.className=className;
	}

	public String getClassName(){
		return className;
	}
	public void setDisplay(boolean display){
		this.display=display;
	}

	public boolean getDisplay(){
		return display;
	}
	public void setLevel(Long level){
		this.level=level;
	}

	public Long getLevel(){
		return level;
	}
	public void setRecommend(boolean recommend){
		this.recommend=recommend;
	}

	public boolean getRecommend(){
		return recommend;
	}
	public void setSequence(Long sequence){
		this.sequence=sequence;
	}

	public Long getSequence(){
		return sequence;
	}
	public void setGoodsTypeId(Long goodsTypeId){
		this.goodsTypeId=goodsTypeId;
	}

	public Long getGoodsTypeId(){
		return goodsTypeId;
	}
	public void setParentId(Long parentId){
		this.parentId=parentId;
	}

	public Long getParentId(){
		return parentId;
	}
	public void setSeoDescription(String seoDescription){
		this.seoDescription=seoDescription;
	}

	public String getSeoDescription(){
		return seoDescription;
	}
	public void setSeoKeywords(String seoKeywords){
		this.seoKeywords=seoKeywords;
	}

	public String getSeoKeywords(){
		return seoKeywords;
	}
	public void setIconSys(String iconSys){
		this.iconSys=iconSys;
	}

	public String getIconSys(){
		return iconSys;
	}
	public void setIconType(Long iconType){
		this.iconType=iconType;
	}

	public Long getIconType(){
		return iconType;
	}
	public void setIconAccId(Long iconAccId){
		this.iconAccId=iconAccId;
	}

	public Long getIconAccId(){
		return iconAccId;
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

	if(null != className && !"".equals(className) ){
		sb.append("  className= "+className+",");
	}

	if(null != level && !"".equals(level) ){
		sb.append("  level= "+level+",");
	}

	if(null != sequence && !"".equals(sequence) ){
		sb.append("  sequence= "+sequence+",");
	}
	if(null != goodsTypeId && !"".equals(goodsTypeId) ){
		sb.append("  goodsTypeId= "+goodsTypeId+",");
	}
	if(null != parentId && !"".equals(parentId) ){
		sb.append("  parentId= "+parentId+",");
	}
	if(null != seoDescription && !"".equals(seoDescription) ){
		sb.append("  seoDescription= "+seoDescription+",");
	}
	if(null != seoKeywords && !"".equals(seoKeywords) ){
		sb.append("  seoKeywords= "+seoKeywords+",");
	}
	if(null != iconSys && !"".equals(iconSys) ){
		sb.append("  iconSys= "+iconSys+",");
	}
	if(null != iconType && !"".equals(iconType) ){
		sb.append("  iconType= "+iconType+",");
	}
	if(null != iconAccId && !"".equals(iconAccId) ){
		sb.append("  iconAccId= "+iconAccId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
