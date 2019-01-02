package com.sanxia.market.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("查询用户收货地址返回参数") 
public class QueryAddressResponse {

	
	@ApiModelProperty(value = "地址id" ,dataType = "String") 
	private String address_id;
	
	@ApiModelProperty(value = "省市区域" ,dataType = "String") 
	private String area_name;

	@ApiModelProperty(value = "收件人姓名" ,dataType = "String") 
	private String trueName;
	
	@ApiModelProperty(value = "收件人手机号" ,dataType = "String") 
	private String mobile;
	
	@ApiModelProperty(value = "收件人联系电话" ,dataType = "String") 
	private String telephone;
	
	@ApiModelProperty(value = "邮政编码" ,dataType = "String") 
	private String zip;
	
	@ApiModelProperty(value = "用户id" ,dataType = "String") 
	private String user_id;
	
	@ApiModelProperty(value = "详细地址信息" ,dataType = "String") 
	private String area_info;

	private boolean is_selected =false;

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getArea_info() {
		return area_info;
	}

	public void setArea_info(String area_info) {
		this.area_info = area_info;
	}

	public String getAddress_id() {
		return address_id;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}

	public boolean isIs_selected() {
		return is_selected;
	}

	public void setIs_selected(boolean is_selected) {
		this.is_selected = is_selected;
	}
	
	
}
