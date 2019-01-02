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
import com.sanxia.market.dto.goods.QueryGoodsClassTypeRequest;
import com.sanxia.market.dto.goods.QueryGoodsClassTypeResponse;
import com.sanxia.market.dto.goods.QueryGoodsEvaluateRequest;
import com.sanxia.market.dto.goods.QueryGoodsEvaluateResponse;
import com.sanxia.market.dto.goods.QueryGoodsListByAllRequest;
import com.sanxia.market.dto.goods.QueryGoodsListByAllResponse;
import com.sanxia.market.dto.order.CreateOrderRequest;
import com.sanxia.market.dto.payment.QueryPayTypeRequest;
import com.sanxia.market.dto.payment.QueryPayTypeResponse;
import com.sanxia.market.dto.util.QueryAreaRequest;
import com.sanxia.market.dto.util.QueryAreaResponse;
import com.sanxia.market.service.ShoppingAreaService;
import com.sanxia.market.service.ShoppingEvaluateService;
import com.sanxia.market.service.ShoppingGoodsService;
import com.sanxia.market.service.ShoppingGoodstypeService;
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
@RequestMapping("/util")
@Api("商品相关api")
public class GoodsController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(GoodsController.class);
	
  
    
    @Autowired
    private ShoppingEvaluateService shoppingEvaluateService;
    
    @Autowired
    private ShoppingGoodstypeService shoppingGoodstypeService;
    
    @Autowired
    private ShoppingGoodsService shoppingGoodsService;
	
	@ApiOperation("查询商品评价api")
	@RequestMapping(value="/queryGoodsEvaluate",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<QueryGoodsEvaluateResponse>>  queryArea(@RequestBody QueryGoodsEvaluateRequest pammermap
			) {
		logger.info("方法：queryGoodsEvaluate（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<List<QueryGoodsEvaluateResponse>> rest=shoppingEvaluateService.queryGoodsEvaluate(pammermap);
	return rest;
	}
	
	
	
	@ApiOperation("查询商品分类筛选信息api")
	@RequestMapping(value="/queryGoodsClassType",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<QueryGoodsClassTypeResponse>>  queryGoodsClassType(@RequestBody QueryGoodsClassTypeRequest pammermap
			) {
		logger.info("方法：queryGoodsClassType（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<List<QueryGoodsClassTypeResponse>> rest=shoppingGoodstypeService.queryGoodsClassType(pammermap);
	return rest;
	}
	
	
	@ApiOperation("查询商品列表（多参数查询，肩带各种排序）api")
	@RequestMapping(value="/queryGoodsListByAll",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<QueryGoodsListByAllResponse>>  queryGoodsListByAll(@RequestBody QueryGoodsListByAllRequest pammermap
			) {
		logger.info("方法：queryGoodsListByAll（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<List<QueryGoodsListByAllResponse>> rest=shoppingGoodsService.queryGoodsListByAll(pammermap);
	return rest;
	}
}