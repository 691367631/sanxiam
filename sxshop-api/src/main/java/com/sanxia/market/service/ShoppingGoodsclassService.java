package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.index.GoodsClassAllResponse;
import com.sanxia.market.dto.index.GoodsClassRequest;
import com.sanxia.market.dto.index.GoodsClassResponse;
import com.sanxia.market.entity.ShoppingGoodsclass;

 /**   
* @Title: ShoppingGoodsclassService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-13 15:33:41
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodsclassService extends BaseService<ShoppingGoodsclass>{

	ApiResult<List<GoodsClassResponse>> goodsclassList(GoodsClassRequest pammermap);

	ApiResult<List<GoodsClassAllResponse>> goodsclassListAll(GoodsClassRequest pammermap);
    String goodsclassParentId(String parent_id);
 
	}
