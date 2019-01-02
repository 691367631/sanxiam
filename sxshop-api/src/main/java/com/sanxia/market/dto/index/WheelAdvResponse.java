package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;

import com.sanxia.market.dto.ApiResult;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("首页滚动广告返回信息") 
public class WheelAdvResponse  implements Serializable{

	@ApiModelProperty(value = "店铺id" ,dataType = "String") 
	private String ad_store_id;
	
	@ApiModelProperty(value = "跳转地址类型0商品活动页1店铺活动页2H5连接" ,dataType = "String") 
	private String ad_url_type;

	@ApiModelProperty(value = "跳转地址" ,dataType = "String") 
	private String ad_url;
	
	@ApiModelProperty(value = "图片地址" ,dataType = "String") 
	private String ad_img_path;
	
	public String getAd_store_id() {
		return ad_store_id;
	}

	public void setAd_store_id(String ad_store_id) {
		this.ad_store_id = ad_store_id;
	}

	public String getAd_url_type() {
		return ad_url_type;
	}

	public void setAd_url_type(String ad_url_type) {
		this.ad_url_type = ad_url_type;
	}

	public String getAd_url() {
		return ad_url;
	}

	public void setAd_url(String ad_url) {
		this.ad_url = ad_url;
	}

	public String getAd_img_path() {
		return ad_img_path;
	}

	public void setAd_img_path(String ad_img_path) {
		this.ad_img_path = ad_img_path;
	}

	
	

	
	
	
}
