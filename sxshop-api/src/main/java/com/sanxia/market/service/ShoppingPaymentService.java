package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.payment.OrderPayRequest;
import com.sanxia.market.dto.payment.OrderPayResponse;
import com.sanxia.market.dto.payment.PayRequest;
import com.sanxia.market.dto.payment.QueryPayTypeRequest;
import com.sanxia.market.dto.payment.QueryPayTypeResponse;
import com.sanxia.market.entity.ShoppingPayment;

 /**   
* @Title: ShoppingPaymentService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-07 13:37:21
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingPaymentService extends BaseService<ShoppingPayment>{

	ApiResult<List<QueryPayTypeResponse>> queryPayType(QueryPayTypeRequest pammermap);

	ApiResult<OrderPayResponse> orderPay(OrderPayRequest pammermap);

	ApiResult<String> pay(PayRequest pammermap);


	}
