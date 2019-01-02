package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.index.GoodsDetailsRequest;
import com.sanxia.market.dto.index.GoodsSpecificationResponse;
import com.sanxia.market.dto.index.GoodsSpecpropertyRequest;
import com.sanxia.market.dto.index.GoodsSpecpropertyResponse;
import com.sanxia.market.entity.ShoppingGoodsSpec;

 /**   
* @Title: ShoppingGoodsSpecService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-21 15:21:57
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodsSpecService extends BaseService<ShoppingGoodsSpec>{

	ApiResult<List<GoodsSpecificationResponse>> goodsspecificationList(GoodsDetailsRequest pammermap);

	ApiResult<List<GoodsSpecpropertyResponse>> goodsspecpropertyList(GoodsSpecpropertyRequest pammermap);


	}
