package com.sanxia.market.Controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.sanxia.common.utils.JsonUtil;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.order.CreateOrderRequest;
import com.sanxia.market.dto.payment.OrderPayRequest;
import com.sanxia.market.dto.payment.OrderPayResponse;
import com.sanxia.market.dto.payment.PayRequest;
import com.sanxia.market.dto.payment.QueryPayTypeRequest;
import com.sanxia.market.dto.payment.QueryPayTypeResponse;
import com.sanxia.market.service.ShoppingOrderformService;
import com.sanxia.market.service.ShoppingPaymentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * 
 * @author zgn 框架测试controller类
 *
 */

@Controller
@RequestMapping("/payment")
@Api("支付相关api")
public class PaymentController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(PaymentController.class);
	
  
    
    @Autowired
    private ShoppingPaymentService shoppingPaymentService;
	
	@ApiOperation("查询支付方式api")
	@RequestMapping(value="/queryPayType",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<QueryPayTypeResponse>>  queryPayType(@RequestBody QueryPayTypeRequest pammermap
			) {
		logger.info("方法：queryPayType（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<List<QueryPayTypeResponse>> rest=shoppingPaymentService.queryPayType(pammermap);
	return rest;
	}
	
	
	@ApiOperation("获取支付参数api")
	@RequestMapping(value="/orderPay",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<OrderPayResponse>  orderPay(@RequestBody OrderPayRequest pammermap
			) {
		logger.info("方法：orderPay（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<OrderPayResponse> rest=shoppingPaymentService.orderPay(pammermap);
	return rest;
	}
	
	
	@ApiOperation("支付api")
	@RequestMapping(value="/pay",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  pay(@RequestBody PayRequest pammermap
			) {
		logger.info("方法：pay（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<String> rest=shoppingPaymentService.pay(pammermap);
	return rest;
	}
}