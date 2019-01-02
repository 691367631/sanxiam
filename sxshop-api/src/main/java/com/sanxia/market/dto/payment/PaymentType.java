package com.sanxia.market.dto.payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentType {

	private List<String> marklist; 
	
	private String platform;

	public List<String> getMarklist() {
		if("h5".equals(platform)) {
			List<String> list=new ArrayList<String>();
			list.add("outline");
			list.add("weixin_wap");
			list.add("balance");
			list.add("tenpay");
			list.add("bill");
			list.add("chinabank");
			list.add("paypal");
			return list;
		}
		if("app".equals(platform)) {
			List<String> list=new ArrayList<String>();
			list.add("outline");
			list.add("weixin_wap");
			list.add("alipay");
			list.add("balance");
			list.add("tenpay");
			list.add("bill");
			list.add("chinabank");
			list.add("paypal");
			return list;
		}
		if("web".equals(platform)) {
			List<String> list=new ArrayList<String>();
			list.add("outline");
			list.add("wxcodepay");
			list.add("alipay_wap");
			list.add("balance");
			list.add("tenpay");
			list.add("bill");
			list.add("chinabank");
			list.add("paypal");
			return list;
		}
		return marklist;
	}

	public void setMarklist(List<String> marklist) {
		this.marklist = marklist;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	
}
