package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goodscart.AddGoodsRequest;
import com.sanxia.market.dto.goodscart.AddGoodsResponse;
import com.sanxia.market.dto.goodscart.DeleteStoreCartRequest;
import com.sanxia.market.dto.goodscart.DeleteUserCartRequest;
import com.sanxia.market.dto.goodscart.ImmediatePurchaseRequest;
import com.sanxia.market.dto.goodscart.ImmediatePurchaseResponse;
import com.sanxia.market.dto.goodscart.QueryGoodsCartRequest;
import com.sanxia.market.dto.goodscart.QueryGoodsCartResponse;
import com.sanxia.market.entity.ShoppingStorecart;

 /**   
* @Title: ShoppingStorecartService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-27 12:00:53
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingStorecartService extends BaseService<ShoppingStorecart>{

	ApiResult<AddGoodsResponse> addgoods(AddGoodsRequest pammermap);

	ApiResult<QueryGoodsCartResponse> querygoodscart(QueryGoodsCartRequest pammermap);

	ApiResult<String> deletestorecart(DeleteStoreCartRequest pammermap);

	ApiResult<String> deleteusercart(DeleteUserCartRequest pammermap);

	ApiResult<ImmediatePurchaseResponse> immediatePurchase(ImmediatePurchaseRequest pammermap);


	}
