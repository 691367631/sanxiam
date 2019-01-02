package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.order.CancelOrderRequest;
import com.sanxia.market.dto.order.CreateOrderRequest;
import com.sanxia.market.dto.order.CreateOrderResponse;
import com.sanxia.market.dto.order.DeleteOrderRequest;
import com.sanxia.market.dto.order.QueryOrderDetailRequest;
import com.sanxia.market.dto.order.QueryOrderDetailResponse;
import com.sanxia.market.dto.order.QueryOrderRequest;
import com.sanxia.market.dto.order.QueryOrderResponse;
import com.sanxia.market.dto.order.TransportationExpensesRequest;
import com.sanxia.market.dto.order.TransportationExpensesResponse;
import com.sanxia.market.entity.ShoppingOrderform;

 /**   
* @Title: ShoppingOrderformService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-06 11:02:39
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingOrderformService extends BaseService<ShoppingOrderform>{

	ApiResult<CreateOrderResponse> createOrder(CreateOrderRequest pammermap);

	ApiResult<List<QueryOrderResponse>> queryOrder(QueryOrderRequest pammermap);

	ApiResult<String> cancelOrder(CancelOrderRequest pammermap);

	ApiResult<String> deleteOrder(DeleteOrderRequest pammermap);

	ApiResult<QueryOrderDetailResponse> queryOrderDetail(QueryOrderDetailRequest pammermap);

	ApiResult<TransportationExpensesResponse> transportExpenses(TransportationExpensesRequest pammermap);

	

	}
