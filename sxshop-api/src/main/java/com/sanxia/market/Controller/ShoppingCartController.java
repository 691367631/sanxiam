package com.sanxia.market.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

import com.sanxia.common.core.page.PageBean;
import com.sanxia.common.core.page.PageParam;
import com.sanxia.common.model.PubRespone;
import com.sanxia.common.utils.HttpClientUtil;
import com.sanxia.common.utils.JSONUtils;
import com.sanxia.common.utils.JsonUtil;
import com.sanxia.common.utils.PropertiesConfigUtil;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goodscart.AddGoodsRequest;
import com.sanxia.market.dto.goodscart.AddGoodsResponse;
import com.sanxia.market.dto.goodscart.DeleteGoodsCartRequest;
import com.sanxia.market.dto.goodscart.DeleteStoreCartRequest;
import com.sanxia.market.dto.goodscart.DeleteUserCartRequest;
import com.sanxia.market.dto.goodscart.ImmediatePurchaseRequest;
import com.sanxia.market.dto.goodscart.ImmediatePurchaseResponse;
import com.sanxia.market.dto.goodscart.QueryGoodsCartRequest;
import com.sanxia.market.dto.goodscart.QueryGoodsCartResponse;
import com.sanxia.market.dto.goodscart.QueryGoodsPriceRequest;
import com.sanxia.market.dto.goodscart.QueryGoodsPriceResponse;
import com.sanxia.market.dto.login.LoginRequest;
import com.sanxia.market.dto.login.LoginResponse;
import com.sanxia.market.dto.login.RegisterRequest;
import com.sanxia.market.dto.login.RegisterResponse;
import com.sanxia.market.dto.login.UpdatePasswordRequest;
import com.sanxia.market.dto.login.UpdatePasswordResponse;
import com.sanxia.market.service.ShoppingGoodscartService;
import com.sanxia.market.service.ShoppingStorecartService;
import com.sanxia.market.service.ShoppingUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
/**
 * 
 * @author zgn 框架测试controller类
 *
 */

@Controller
@RequestMapping("/cart")
@Api("购物车相关api")
public class ShoppingCartController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(ShoppingCartController.class);
	
    @Autowired
    private ShoppingStorecartService shoppingStorecartService;
    
    @Autowired
    private ShoppingGoodscartService shoppingGoodscartService;
	
	@ApiOperation("购物车添加商品api")
	@RequestMapping(value="/addgoods",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<AddGoodsResponse>  addgoods(@RequestBody AddGoodsRequest pammermap
			) {
		logger.info("方法：addgoods（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<AddGoodsResponse> rest=shoppingStorecartService.addgoods(pammermap);
	return rest;
	}
	
	@ApiOperation("根据规格查看商品价格及库存api")
	@RequestMapping(value="/querygoodsPrice",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<QueryGoodsPriceResponse>  querygoodsPrice(@RequestBody QueryGoodsPriceRequest pammermap
			) {
		ApiResult<QueryGoodsPriceResponse> rest=new ApiResult<QueryGoodsPriceResponse>();
		logger.info("方法：addgoods（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		String url=PropertiesConfigUtil.readConfig("web_url")+"/load_goods_gsp.htm";
		String httprest=HttpClientUtil.doPost(url, JsonUtil.jsonStr2Map(JsonUtil.bean2JsonStr(pammermap)));
		Map<String,Object> map=JsonUtil.jsonStr2Map(httprest);
		QueryGoodsPriceResponse resp=new QueryGoodsPriceResponse();
		resp.setCount( map.get("count")+"");
		resp.setPrice( map.get("price")+"");
		rest.setData(resp);
	return rest;
	}
	
	@ApiOperation("查看购物车api")
	@RequestMapping(value="/queryusercart",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<QueryGoodsCartResponse>  querygoodscart(@RequestBody QueryGoodsCartRequest pammermap
			) {
		logger.info("方法：queryusercart（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<QueryGoodsCartResponse> rest=shoppingStorecartService.querygoodscart(pammermap);
	return rest;
	}

	@ApiOperation("删除购物车中商品api")
	@RequestMapping(value="/deletegoodscart",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  deletegoodscart(@RequestBody DeleteGoodsCartRequest pammermap
			) {
		logger.info("方法：deletegoodscart（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<String> rest=shoppingGoodscartService.deletegoodscart(pammermap);
	return rest;
	}
	
	@ApiOperation("删除店铺购物车api")
	@RequestMapping(value="/deletestorecart",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  deletestorecart(@RequestBody DeleteStoreCartRequest pammermap
			) {
		logger.info("方法：deletestorecart（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<String> rest=shoppingStorecartService.deletestorecart(pammermap);
	return rest;
	}
	
	
	@ApiOperation("清空用户购物车api")
	@RequestMapping(value="/deleteusercart",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<String>  deleteusercart(@RequestBody DeleteUserCartRequest pammermap
			) {
		logger.info("方法：deleteusercart（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<String> rest=shoppingStorecartService.deleteusercart(pammermap);
	return rest;
	}
	
	/*立即购买
	 * */
	@ApiOperation("立即购买api")
	@RequestMapping(value="/immediatePurchase",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<ImmediatePurchaseResponse>  immediatePurchase(@RequestBody ImmediatePurchaseRequest pammermap
			) {
		logger.info("方法：immediatePurchase（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<ImmediatePurchaseResponse> rest=shoppingStorecartService.immediatePurchase(pammermap);
	return rest;
	}
}