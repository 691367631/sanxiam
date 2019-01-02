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
import com.sanxia.market.dto.user.AddAddressRequest;
import com.sanxia.market.dto.user.AddFavoriteRequest;
import com.sanxia.market.dto.user.DeleteAddressRequest;
import com.sanxia.market.dto.user.DeleteFavoriteRequest;
import com.sanxia.market.dto.user.QueryAddressRequest;
import com.sanxia.market.dto.user.QueryAddressResponse;
import com.sanxia.market.dto.user.QueryFavoriteRequest;
import com.sanxia.market.dto.user.QueryFavoriteResponse;
import com.sanxia.market.dto.user.UpdateAddressRequest;
import com.sanxia.market.service.ShoppingAddressService;
import com.sanxia.market.service.ShoppingFavoriteService;
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
@RequestMapping("/user")
@Api("用户相关api")
public class UserController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);
	
  
    
    @Autowired
    private ShoppingAddressService shoppingAddressService;
    
    @Autowired
    private ShoppingFavoriteService shoppingFavoriteService;
	
	@ApiOperation("添加用户收货地址api")
	@RequestMapping(value="/addAddress",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  addAddress(@RequestBody AddAddressRequest pammermap
			) {
		logger.info("方法：addAddress（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<String> rest=shoppingAddressService.addAddress(pammermap);
	return rest;
	}
	
	@ApiOperation("查询用户收货地址api")
	@RequestMapping(value="/queryAddress",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<QueryAddressResponse>>  queryAddress(@RequestBody QueryAddressRequest pammermap
			) {
		logger.info("方法：queryAddress（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<List<QueryAddressResponse>> rest=shoppingAddressService.queryAddress(pammermap);
	return rest;
	}
	
	@ApiOperation("修改用户收货地址api")
	@RequestMapping(value="/updateAddress",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  updateAddress(@RequestBody UpdateAddressRequest pammermap
			) {
		logger.info("方法：updateAddress（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<String> rest=shoppingAddressService.updateAddress(pammermap);
	return rest;
	}
	
	@ApiOperation("删除用户收货地址api")
	@RequestMapping(value="/deleteAddress",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  deleteAddress(@RequestBody DeleteAddressRequest pammermap
			) {
		logger.info("方法：deleteAddress（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<String> rest=shoppingAddressService.deleteAddress(pammermap);
	return rest;
	}
	
	@ApiOperation("用户收藏（商品、店铺）api")
	@RequestMapping(value="/addfavorite",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  addfavorite(@RequestBody AddFavoriteRequest pammermap
			) {
		logger.info("方法：addfavorite（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<String> rest=shoppingFavoriteService.addfavorite(pammermap);
	return rest;
	}
	
	@ApiOperation("查询用户收藏（商品、店铺）api")
	@RequestMapping(value="/queryfavorite",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<QueryFavoriteResponse>>  queryfavorite(@RequestBody QueryFavoriteRequest pammermap
			) {
		logger.info("方法：queryfavorite（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<List<QueryFavoriteResponse>> rest=shoppingFavoriteService.queryfavorite(pammermap);
	return rest;
	}
	
	@ApiOperation("删除用户收藏（商品、店铺）api")
	@RequestMapping(value="/deletefavorite",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  deletefavorite(@RequestBody DeleteFavoriteRequest pammermap
			) {
		logger.info("方法：deletefavorite（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		ApiResult<String> rest=shoppingFavoriteService.deletefavorite(pammermap);
	return rest;
	}
}