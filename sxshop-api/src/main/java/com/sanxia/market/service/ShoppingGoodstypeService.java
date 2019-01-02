package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goods.QueryGoodsClassTypeRequest;
import com.sanxia.market.dto.goods.QueryGoodsClassTypeResponse;
import com.sanxia.market.entity.ShoppingGoodstype;

 /**   
* @Title: ShoppingGoodstypeService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-13 17:03:44
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodstypeService extends BaseService<ShoppingGoodstype>{

	ApiResult<List<QueryGoodsClassTypeResponse>> queryGoodsClassType(QueryGoodsClassTypeRequest pammermap);


	}
