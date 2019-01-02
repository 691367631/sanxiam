package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.index.GoodsDetailsRequest;
import com.sanxia.market.dto.index.GoodsPhotoResponse;
import com.sanxia.market.entity.ShoppingGoodsPhoto;

 /**   
* @Title: ShoppingGoodsPhotoService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-21 14:06:09
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodsPhotoService extends BaseService<ShoppingGoodsPhoto>{

	ApiResult<List<GoodsPhotoResponse>> goodsDetailsPhotos(GoodsDetailsRequest pammermap);


	}
