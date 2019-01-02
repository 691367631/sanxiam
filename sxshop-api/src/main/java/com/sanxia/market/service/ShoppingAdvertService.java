package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.index.WheelAdvRequest;
import com.sanxia.market.dto.index.WheelAdvResponse;
import com.sanxia.market.entity.ShoppingAdvert;

 /**   
* @Title: ShoppingAdvertService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-13 10:27:16
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingAdvertService extends BaseService<ShoppingAdvert>{

	ApiResult<List<WheelAdvResponse>> listwheelAdv(WheelAdvRequest pammermap);


	}
