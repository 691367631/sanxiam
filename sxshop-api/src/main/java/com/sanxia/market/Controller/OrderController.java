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
import com.sanxia.market.service.ShoppingOrderformService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * 
 * @author zgn 框架测试controller类
 *
 */

@Controller
@RequestMapping("/order")
@Api("订单相关api")
public class OrderController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(OrderController.class);
	
  
    
    @Autowired
    private ShoppingOrderformService shoppingOrderformService;
	
	@ApiOperation("提交订单api")
	@RequestMapping(value="/createOrder",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<CreateOrderResponse>  createOrder(@RequestBody CreateOrderRequest pammermap
			) {
		logger.info("方法：createOrder（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<CreateOrderResponse> rest=shoppingOrderformService.createOrder(pammermap);
	return rest;
	}
	
	@ApiOperation("查询订单列表api")
	@RequestMapping(value="/queryOrder",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<QueryOrderResponse>>  queryOrder(@RequestBody QueryOrderRequest pammermap
			) {
		logger.info("方法：queryOrder（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<List<QueryOrderResponse>> rest=shoppingOrderformService.queryOrder(pammermap);
	return rest;
	}
	
	@ApiOperation("取消订单api")
	@RequestMapping(value="/cancelOrder",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  cancelOrder(@RequestBody CancelOrderRequest pammermap
			) {
		logger.info("方法：cancelOrder（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<String> rest=shoppingOrderformService.cancelOrder(pammermap);
	return rest;
	}
	
	@ApiOperation("删除订单api")
	@RequestMapping(value="/deleteOrder",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  deleteOrder(@RequestBody DeleteOrderRequest pammermap
			) {
		logger.info("方法：deleteOrder（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<String> rest=shoppingOrderformService.deleteOrder(pammermap);
	return rest;
	}
	
	@ApiOperation("查询订单明细订单api")
	@RequestMapping(value="/queryOrderDetail",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<QueryOrderDetailResponse>  queryOrderDetail(@RequestBody QueryOrderDetailRequest pammermap
			) {
		logger.info("方法：queryOrderDetail（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<QueryOrderDetailResponse> rest=shoppingOrderformService.queryOrderDetail(pammermap);
	return rest;
	}
	
	@ApiOperation("计算配送费api")
	@RequestMapping(value="/transportationExpenses",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<TransportationExpensesResponse>  transportationExpenses(@RequestBody TransportationExpensesRequest pammermap
			) {
		logger.info("方法：transportationExpenses（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<TransportationExpensesResponse> rest=shoppingOrderformService.transportExpenses(pammermap);
	return rest;
	}
	
}