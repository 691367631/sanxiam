package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_user 
* @Package: com.sanxia.market.entity
* @Title:ShoppingUser.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-22 13:35:57
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingUser extends BaseEntity implements Serializable {

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
	*@Fields mSN :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String mSN;
	/**
	*@Fields qQ :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String qQ;
	/**
	*@Fields wW :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String wW;
	/**
	*@Fields address :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String address;
	/**
	*@Fields availableBalance :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double availableBalance;
	/**
	*@Fields birthday :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date birthday;
	/**
	*@Fields email :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String email;
	/**
	*@Fields freezeBlance :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double freezeBlance;
	/**
	*@Fields gold :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long gold;
	/**
	*@Fields integral :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long integral;
	/**
	*@Fields lastLoginDate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date lastLoginDate;
	/**
	*@Fields lastLoginIp :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String lastLoginIp;
	/**
	*@Fields loginCount :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long loginCount;
	/**
	*@Fields loginDate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date loginDate;
	/**
	*@Fields loginIp :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String loginIp;
	/**
	*@Fields mobile :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String mobile;
	/**
	*@Fields password :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String password;
	/**
	*@Fields report :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long report;
	/**
	*@Fields sex :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long sex;
	/**
	*@Fields status :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long status;
	/**
	*@Fields telephone :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String telephone;
	/**
	*@Fields trueName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String trueName;
	/**
	*@Fields userName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String userName;
	/**
	*@Fields userRole :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String userRole;
	/**
	*@Fields userCredit :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long userCredit;
	/**
	*@Fields photoId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long photoId;
	/**
	*@Fields storeId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long storeId;
	/**
	*@Fields qqOpenid :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String qqOpenid;
	/**
	*@Fields sinaOpenid :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String sinaOpenid;
	/**
	*@Fields storeQuickMenu :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String storeQuickMenu;
	/**
	*@Fields parentId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long parentId;
	/**
	*@Fields years :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long years;
	/**
	*@Fields areaId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long areaId;
	
	private String token;
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
	public void setMSN(String mSN){
		this.mSN=mSN;
	}

	public String getMSN(){
		return mSN;
	}
	public void setQQ(String qQ){
		this.qQ=qQ;
	}

	public String getQQ(){
		return qQ;
	}
	public void setWW(String wW){
		this.wW=wW;
	}

	public String getWW(){
		return wW;
	}
	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return address;
	}
	public void setAvailableBalance(Double availableBalance){
		this.availableBalance=availableBalance;
	}

	public Double getAvailableBalance(){
		return availableBalance;
	}
	public void setBirthday(Date birthday){
		this.birthday=birthday;
	}

	public Date getBirthday(){
		return birthday;
	}
	public void setEmail(String email){
		this.email=email;
	}

	public String getEmail(){
		return email;
	}
	public void setFreezeBlance(Double freezeBlance){
		this.freezeBlance=freezeBlance;
	}

	public Double getFreezeBlance(){
		return freezeBlance;
	}
	public void setGold(Long gold){
		this.gold=gold;
	}

	public Long getGold(){
		return gold;
	}
	public void setIntegral(Long integral){
		this.integral=integral;
	}

	public Long getIntegral(){
		return integral;
	}
	public void setLastLoginDate(Date lastLoginDate){
		this.lastLoginDate=lastLoginDate;
	}

	public Date getLastLoginDate(){
		return lastLoginDate;
	}
	public void setLastLoginIp(String lastLoginIp){
		this.lastLoginIp=lastLoginIp;
	}

	public String getLastLoginIp(){
		return lastLoginIp;
	}
	public void setLoginCount(Long loginCount){
		this.loginCount=loginCount;
	}

	public Long getLoginCount(){
		return loginCount;
	}
	public void setLoginDate(Date loginDate){
		this.loginDate=loginDate;
	}

	public Date getLoginDate(){
		return loginDate;
	}
	public void setLoginIp(String loginIp){
		this.loginIp=loginIp;
	}

	public String getLoginIp(){
		return loginIp;
	}
	public void setMobile(String mobile){
		this.mobile=mobile;
	}

	public String getMobile(){
		return mobile;
	}
	public void setPassword(String password){
		this.password=password;
	}

	public String getPassword(){
		return password;
	}
	public void setReport(Long report){
		this.report=report;
	}

	public Long getReport(){
		return report;
	}
	public void setSex(Long sex){
		this.sex=sex;
	}

	public Long getSex(){
		return sex;
	}
	public void setStatus(Long status){
		this.status=status;
	}

	public Long getStatus(){
		return status;
	}
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}

	public String getTelephone(){
		return telephone;
	}
	public void setTrueName(String trueName){
		this.trueName=trueName;
	}

	public String getTrueName(){
		return trueName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getUserName(){
		return userName;
	}
	public void setUserRole(String userRole){
		this.userRole=userRole;
	}

	public String getUserRole(){
		return userRole;
	}
	public void setUserCredit(Long userCredit){
		this.userCredit=userCredit;
	}

	public Long getUserCredit(){
		return userCredit;
	}
	public void setPhotoId(Long photoId){
		this.photoId=photoId;
	}

	public Long getPhotoId(){
		return photoId;
	}
	public void setStoreId(Long storeId){
		this.storeId=storeId;
	}

	public Long getStoreId(){
		return storeId;
	}
	public void setQqOpenid(String qqOpenid){
		this.qqOpenid=qqOpenid;
	}

	public String getQqOpenid(){
		return qqOpenid;
	}
	public void setSinaOpenid(String sinaOpenid){
		this.sinaOpenid=sinaOpenid;
	}

	public String getSinaOpenid(){
		return sinaOpenid;
	}
	public void setStoreQuickMenu(String storeQuickMenu){
		this.storeQuickMenu=storeQuickMenu;
	}

	public String getStoreQuickMenu(){
		return storeQuickMenu;
	}
	public void setParentId(Long parentId){
		this.parentId=parentId;
	}

	public Long getParentId(){
		return parentId;
	}
	public void setYears(Long years){
		this.years=years;
	}

	public Long getYears(){
		return years;
	}
	public void setAreaId(Long areaId){
		this.areaId=areaId;
	}

	public Long getAreaId(){
		return areaId;
	}

	
	public String getmSN() {
		return mSN;
	}

	public void setmSN(String mSN) {
		this.mSN = mSN;
	}

	public String getqQ() {
		return qQ;
	}

	public void setqQ(String qQ) {
		this.qQ = qQ;
	}

	public String getwW() {
		return wW;
	}

	public void setwW(String wW) {
		this.wW = wW;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	if(null != mSN && !"".equals(mSN) ){
		sb.append("  mSN= "+mSN+",");
	}
	if(null != qQ && !"".equals(qQ) ){
		sb.append("  qQ= "+qQ+",");
	}
	if(null != wW && !"".equals(wW) ){
		sb.append("  wW= "+wW+",");
	}
	if(null != address && !"".equals(address) ){
		sb.append("  address= "+address+",");
	}
	if(null != availableBalance && !"".equals(availableBalance) ){
		sb.append("  availableBalance= "+availableBalance+",");
	}
	if(null != birthday && !"".equals(birthday) ){
		sb.append("  birthday= "+birthday+",");
	}
	if(null != email && !"".equals(email) ){
		sb.append("  email= "+email+",");
	}
	if(null != freezeBlance && !"".equals(freezeBlance) ){
		sb.append("  freezeBlance= "+freezeBlance+",");
	}
	if(null != gold && !"".equals(gold) ){
		sb.append("  gold= "+gold+",");
	}
	if(null != integral && !"".equals(integral) ){
		sb.append("  integral= "+integral+",");
	}
	if(null != lastLoginDate && !"".equals(lastLoginDate) ){
		sb.append("  lastLoginDate= "+lastLoginDate+",");
	}
	if(null != lastLoginIp && !"".equals(lastLoginIp) ){
		sb.append("  lastLoginIp= "+lastLoginIp+",");
	}
	if(null != loginCount && !"".equals(loginCount) ){
		sb.append("  loginCount= "+loginCount+",");
	}
	if(null != loginDate && !"".equals(loginDate) ){
		sb.append("  loginDate= "+loginDate+",");
	}
	if(null != loginIp && !"".equals(loginIp) ){
		sb.append("  loginIp= "+loginIp+",");
	}
	if(null != mobile && !"".equals(mobile) ){
		sb.append("  mobile= "+mobile+",");
	}
	if(null != password && !"".equals(password) ){
		sb.append("  password= "+password+",");
	}
	if(null != report && !"".equals(report) ){
		sb.append("  report= "+report+",");
	}
	if(null != sex && !"".equals(sex) ){
		sb.append("  sex= "+sex+",");
	}
	if(null != status && !"".equals(status) ){
		sb.append("  status= "+status+",");
	}
	if(null != telephone && !"".equals(telephone) ){
		sb.append("  telephone= "+telephone+",");
	}
	if(null != trueName && !"".equals(trueName) ){
		sb.append("  trueName= "+trueName+",");
	}
	if(null != userName && !"".equals(userName) ){
		sb.append("  userName= "+userName+",");
	}
	if(null != userRole && !"".equals(userRole) ){
		sb.append("  userRole= "+userRole+",");
	}
	if(null != userCredit && !"".equals(userCredit) ){
		sb.append("  userCredit= "+userCredit+",");
	}
	if(null != photoId && !"".equals(photoId) ){
		sb.append("  photoId= "+photoId+",");
	}
	if(null != storeId && !"".equals(storeId) ){
		sb.append("  storeId= "+storeId+",");
	}
	if(null != qqOpenid && !"".equals(qqOpenid) ){
		sb.append("  qqOpenid= "+qqOpenid+",");
	}
	if(null != sinaOpenid && !"".equals(sinaOpenid) ){
		sb.append("  sinaOpenid= "+sinaOpenid+",");
	}
	if(null != storeQuickMenu && !"".equals(storeQuickMenu) ){
		sb.append("  storeQuickMenu= "+storeQuickMenu+",");
	}
	if(null != parentId && !"".equals(parentId) ){
		sb.append("  parentId= "+parentId+",");
	}
	if(null != years && !"".equals(years) ){
		sb.append("  years= "+years+",");
	}
	if(null != areaId && !"".equals(areaId) ){
		sb.append("  areaId= "+areaId+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
