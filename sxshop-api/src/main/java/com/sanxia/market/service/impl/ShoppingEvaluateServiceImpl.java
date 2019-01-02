package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.enums.CodesEnum;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingEvaluateDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goods.QueryGoodsEvaluateRequest;
import com.sanxia.market.dto.goods.QueryGoodsEvaluateResponse;
import com.sanxia.market.entity.ShoppingEvaluate;
import com.sanxia.market.service.ShoppingEvaluateService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingEvaluateService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-13 12:11:08
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingEvaluateServiceImpl")
public class ShoppingEvaluateServiceImpl extends BaseServiceImpl<ShoppingEvaluate>  implements ShoppingEvaluateService{

	@Autowired
	private ShoppingEvaluateDao dao; 
	@Override
	public ApiResult<List<QueryGoodsEvaluateResponse>> queryGoodsEvaluate(QueryGoodsEvaluateRequest pammermap) {
		ApiResult<List<QueryGoodsEvaluateResponse>> rest=new ApiResult<List<QueryGoodsEvaluateResponse>>();
		String goods_id= pammermap.getGoods_id();
		String page=pammermap.getPage();
		String rows=pammermap.getRows();
		if(StringUtil.isEmpty(goods_id)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("goods_id不能为空");
			return rest;
		}
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("goods_id", goods_id);
		map.put("pageFirst", Integer.parseInt(page)*Integer.parseInt(rows)-Integer.parseInt(rows));
		map.put("pageSize", Integer.parseInt(rows));
		List<QueryGoodsEvaluateResponse> list=dao.queryGoodsEvaluate(map);
		if(StringUtil.isEmpty(list)) {
			rest.setError_code(CodesEnum.FAIL0001.getCode());
			rest.setMessage(CodesEnum.FAIL0001.getMsg());
			return rest;
		}
		long total=dao.listPageCountQueryGoodsEvaluate(map);
		for (int i = 0; i < list.size(); i++) {
			QueryGoodsEvaluateResponse queryGoodsEvaluateResponse=list.get(i);
			queryGoodsEvaluateResponse.setEvaluate_total(total+"");
		}
		rest.setData(list);
		return rest;
	}


	}
