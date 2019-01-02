package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("首页滚动广告请求信息") 
public class WheelAdvRequest implements Serializable{

	@ApiModelProperty(value = "店铺id，平台传''" ,dataType = "String") 
	private String ad_store_id;
	
	@ApiModelProperty(value = "广告位置id,测试传32768" ,dataType = "String") 
	private String ad_ap_id;

	public String getAd_store_id() {
		return ad_store_id;
	}

	public void setAd_store_id(String ad_store_id) {
		this.ad_store_id = ad_store_id;
	}

	public String getAd_ap_id() {
		return ad_ap_id;
	}

	public void setAd_ap_id(String ad_ap_id) {
		this.ad_ap_id = ad_ap_id;
	}
	
	

	
	
	
}
