package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.user.AddAddressRequest;
import com.sanxia.market.dto.user.DeleteAddressRequest;
import com.sanxia.market.dto.user.QueryAddressRequest;
import com.sanxia.market.dto.user.QueryAddressResponse;
import com.sanxia.market.dto.user.UpdateAddressRequest;
import com.sanxia.market.entity.ShoppingAddress;

 /**   
* @Title: ShoppingAddressService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-07 16:32:46
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingAddressService extends BaseService<ShoppingAddress>{

	ApiResult<String> addAddress(AddAddressRequest pammermap);

	ApiResult<List<QueryAddressResponse>> queryAddress(QueryAddressRequest pammermap);

	ApiResult<String> deleteAddress(DeleteAddressRequest pammermap);

	ApiResult<String> updateAddress(UpdateAddressRequest pammermap);


	}
