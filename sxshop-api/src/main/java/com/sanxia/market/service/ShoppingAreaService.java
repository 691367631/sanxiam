package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.util.QueryAreaRequest;
import com.sanxia.market.dto.util.QueryAreaResponse;
import com.sanxia.market.entity.ShoppingArea;

 /**   
* @Title: ShoppingAreaService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-07 16:32:30
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingAreaService extends BaseService<ShoppingArea>{

	ApiResult<List<QueryAreaResponse>> queryArea(QueryAreaRequest pammermap);


	}
