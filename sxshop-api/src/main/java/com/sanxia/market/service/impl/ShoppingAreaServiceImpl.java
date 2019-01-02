package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingAreaDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.util.QueryAreaRequest;
import com.sanxia.market.dto.util.QueryAreaResponse;
import com.sanxia.market.entity.ShoppingArea;
import com.sanxia.market.service.ShoppingAreaService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingAreaService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-07 16:32:30
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingAreaServiceImpl")
public class ShoppingAreaServiceImpl extends BaseServiceImpl<ShoppingArea>  implements ShoppingAreaService{

	@Autowired
	private ShoppingAreaDao dao; 
	@Override
	public ApiResult<List<QueryAreaResponse>> queryArea(QueryAreaRequest pammermap) {
		ApiResult<List<QueryAreaResponse>> rest=new ApiResult<List<QueryAreaResponse>>();
		String parent_id=pammermap.getArea_parent_id();
		Map<String,Object> map =new HashMap<String,Object>();
		if(StringUtil.isEmpty(parent_id)) {
			map.put("level", "0");
			List<QueryAreaResponse> list=dao.listByMap(map);
			rest.setData(list);
			return rest;
		}
		map.clear();
		map.put("parent_id", parent_id);
		List<QueryAreaResponse> list=dao.listByMap(map);
		rest.setData(list);
		return rest;
	}


	}
