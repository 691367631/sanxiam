package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.enums.CodesEnum;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingFavoriteDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.user.AddFavoriteRequest;
import com.sanxia.market.dto.user.DeleteFavoriteRequest;
import com.sanxia.market.dto.user.QueryFavoriteRequest;
import com.sanxia.market.dto.user.QueryFavoriteResponse;
import com.sanxia.market.entity.ShoppingFavorite;
import com.sanxia.market.service.ShoppingFavoriteService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingFavoriteService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-17 14:08:21
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingFavoriteServiceImpl")
public class ShoppingFavoriteServiceImpl extends BaseServiceImpl<ShoppingFavorite>  implements ShoppingFavoriteService{

	@Autowired
	private ShoppingFavoriteDao dao; 
	
	@Override
	public ApiResult<String> addfavorite(AddFavoriteRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		String gs_id=pammermap.getGs_id();
		String type=pammermap.getType();
		String user_id=pammermap.getUser_id();
		if(StringUtil.isEmpty(gs_id)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("gs_id不能为空");
			return rest;
		}
		if(StringUtil.isEmpty(type)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("type不能为空");
			return rest;
		}
		if(StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("user_id不能为空");
			return rest;
		}
		
		ShoppingFavorite shoppingFavorite=new ShoppingFavorite();
		if("0".equals(type)) {
			shoppingFavorite.setGoodsId(Long.valueOf(gs_id));
		}else if("1".equals(type)) {
			shoppingFavorite.setStoreId(Long.valueOf(gs_id));
		}else {
			rest.setError_code(CodesEnum.FAIL0003.getCode());
			rest.setMessage("type类型错误");
			return rest;
		}
		shoppingFavorite.setType(Long.valueOf(type));
		shoppingFavorite.setAddTime(new Date());
		shoppingFavorite.setDeleteStatus(false);
		shoppingFavorite.setUserId(Long.valueOf(user_id));
		dao.insertOne(shoppingFavorite);
		
		return rest;
	}

	@Override
	public ApiResult<List<QueryFavoriteResponse>> queryfavorite(QueryFavoriteRequest pammermap) {
		ApiResult<List<QueryFavoriteResponse>> rest=new ApiResult<List<QueryFavoriteResponse>>();
		String type=pammermap.getType();
		String user_id=pammermap.getUser_id();
		String page=pammermap.getPage();
		String rows=pammermap.getRows();
		if(StringUtil.isEmpty(type)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("type不能为空");
			return rest;
		}
		if(StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0100.getCode());
			rest.setMessage("user_id不能为空");
			return rest;
		}
		Map<String,Object>map=new HashMap<String,Object>();
		map.put("type", type+"");
		map.put("userId", user_id);
		map.put("pageFirst", Integer.parseInt(page)*Integer.parseInt(rows)-Integer.parseInt(rows));
		map.put("pageSize", Integer.parseInt(rows));
		List<QueryFavoriteResponse> list=dao.listByQueryFavorite(map);
		if(StringUtil.isEmpty(list)) {
			rest.setError_code(CodesEnum.FAIL0001.getCode());
			rest.setMessage(CodesEnum.FAIL0001.getMsg());
			return rest;
		}
		long total=dao.listByQueryFavoriteCount(map);
		for (int i = 0; i < list.size(); i++) {
			QueryFavoriteResponse favorite	=list.get(i);
			favorite.setTotal(total+"");
		}
		
		rest.setData(list);
		return rest;
	}

	@Override
	public ApiResult<String> deletefavorite(DeleteFavoriteRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		String id=pammermap.getId();
		String user_id=pammermap.getUser_id();
		if(StringUtil.isEmpty(id)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("id不能为空");
			return rest;
		}
		if(StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0100.getCode());
			rest.setMessage(CodesEnum.FAIL0100.getMsg());
			return rest;
		}
		dao.delete(id);
		return rest;
	}


	}
