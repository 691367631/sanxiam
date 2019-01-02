package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goods.QueryGoodsClassTypeRequest;
import com.sanxia.market.dto.goods.QueryGoodsClassTypeResponse;
import com.sanxia.market.dto.goods.QueryGoodsEvaluateRequest;
import com.sanxia.market.dto.goods.QueryGoodsEvaluateResponse;
import com.sanxia.market.entity.ShoppingEvaluate;

 /**   
* @Title: ShoppingEvaluateService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-13 12:11:08
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingEvaluateService extends BaseService<ShoppingEvaluate>{

	ApiResult<List<QueryGoodsEvaluateResponse>> queryGoodsEvaluate(QueryGoodsEvaluateRequest pammermap);



	}
