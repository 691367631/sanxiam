package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goods.QueryGoodsListByAllRequest;
import com.sanxia.market.dto.goods.QueryGoodsListByAllResponse;
import com.sanxia.market.dto.index.GoodsDetailsRequest;
import com.sanxia.market.dto.index.GoodsDetailsResponse;
import com.sanxia.market.dto.index.GoodsPhotoResponse;
import com.sanxia.market.dto.index.GoodsRequest;
import com.sanxia.market.dto.index.GoodsResponse;
import com.sanxia.market.entity.ShoppingGoods;

 /**   
* @Title: ShoppingGoodsService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-20 10:44:37
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodsService extends BaseService<ShoppingGoods>{

	ApiResult<List<GoodsResponse>> goodsListAll(GoodsRequest pammermap);

	ApiResult<GoodsDetailsResponse> goodsDetails(GoodsDetailsRequest pammermap);

	ShoppingGoods getAllById(String string);

	ApiResult<List<QueryGoodsListByAllResponse>> queryGoodsListByAll(QueryGoodsListByAllRequest pammermap);


	}
