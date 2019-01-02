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
import com.sanxia.market.dto.payment.QueryPayTypeRequest;
import com.sanxia.market.dto.payment.QueryPayTypeResponse;
import com.sanxia.market.dto.util.QueryAreaRequest;
import com.sanxia.market.dto.util.QueryAreaResponse;
import com.sanxia.market.service.ShoppingAreaService;
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
@Api("基础数据相关api")
public class UtilController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(UtilController.class);
	
  
    
    @Autowired
    private ShoppingAreaService shoppingAreaService;
	
	@ApiOperation("查询省市联动api")
	@RequestMapping(value="/queryArea",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<QueryAreaResponse>>  queryArea(@RequestBody QueryAreaRequest pammermap
			) {
		logger.info("方法：queryArea（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<List<QueryAreaResponse>> rest=shoppingAreaService.queryArea(pammermap);
	return rest;
	}
	
}