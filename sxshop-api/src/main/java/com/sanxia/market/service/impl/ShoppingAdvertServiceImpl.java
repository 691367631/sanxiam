package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.utils.JSONUtils;
import com.sanxia.common.utils.JsonUtil;
import com.sanxia.market.dao.ShoppingAdvertDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.index.WheelAdvRequest;
import com.sanxia.market.dto.index.WheelAdvResponse;
import com.sanxia.market.entity.ShoppingAdvert;
import com.sanxia.market.service.ShoppingAdvertService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingAdvertService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-13 10:27:16
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingAdvertServiceImpl")
public class ShoppingAdvertServiceImpl extends BaseServiceImpl<ShoppingAdvert>  implements ShoppingAdvertService{

	@Autowired
	private ShoppingAdvertDao dao;
	@Override
	public ApiResult<List<WheelAdvResponse>> listwheelAdv(WheelAdvRequest pammermap) {
		ApiResult<List<WheelAdvResponse>>  rest=new ApiResult<List<WheelAdvResponse>> ();
		   HashMap<String, Object> map = new HashMap<String, Object>();
		   String ad_ap_id=pammermap.getAd_ap_id();
		   String ad_store_id=pammermap.getAd_store_id();
		   if(ad_ap_id==null||"".equals(ad_ap_id)) {
				rest.setError_code("0002");
				rest.setMessage("ad_ap_id不能为空");
				return rest;
		   }
		   map.put("ad_ap_id", ad_ap_id);
		   if(ad_store_id!=null&&!"".equals(ad_store_id)) {
			   map.put("ad_store_id", ad_store_id);
		   }
		List<WheelAdvResponse> list=dao.listwheelAdv(map);
		if(list==null||list.size()<1) {
			rest.setError_code("0001");
			rest.setMessage("没有数据");
			return rest;
		}
		rest.setData(list);
		return rest;
	}


	}
