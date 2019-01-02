package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.user.AddFavoriteRequest;
import com.sanxia.market.dto.user.DeleteFavoriteRequest;
import com.sanxia.market.dto.user.QueryFavoriteRequest;
import com.sanxia.market.dto.user.QueryFavoriteResponse;
import com.sanxia.market.entity.ShoppingFavorite;

 /**   
* @Title: ShoppingFavoriteService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-17 14:08:21
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingFavoriteService extends BaseService<ShoppingFavorite>{

	ApiResult<String> addfavorite(AddFavoriteRequest pammermap);

	ApiResult<List<QueryFavoriteResponse>> queryfavorite(QueryFavoriteRequest pammermap);

	ApiResult<String> deletefavorite(DeleteFavoriteRequest pammermap);


	}
