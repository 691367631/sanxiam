package com.sanxia.market.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.sanxia.common.utils.JSONUtils;
import com.sanxia.common.utils.JsonUtil;
import com.sanxia.common.utils.PropertiesConfigUtil;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.index.GoodsClassAllResponse;
import com.sanxia.market.dto.index.GoodsClassRequest;
import com.sanxia.market.dto.index.GoodsClassResponse;
import com.sanxia.market.dto.index.GoodsDetailsRequest;
import com.sanxia.market.dto.index.GoodsDetailsResponse;
import com.sanxia.market.dto.index.GoodsPhotoResponse;
import com.sanxia.market.dto.index.GoodsRequest;
import com.sanxia.market.dto.index.GoodsResponse;
import com.sanxia.market.dto.index.GoodsSpecificationResponse;
import com.sanxia.market.dto.index.GoodsSpecpropertyRequest;
import com.sanxia.market.dto.index.GoodsSpecpropertyResponse;
import com.sanxia.market.dto.index.WheelAdvRequest;
import com.sanxia.market.dto.index.WheelAdvResponse;
import com.sanxia.market.service.ShoppingAdvertService;
import com.sanxia.market.service.ShoppingGoodsPhotoService;
import com.sanxia.market.service.ShoppingGoodsService;
import com.sanxia.market.service.ShoppingGoodsSpecService;
import com.sanxia.market.service.ShoppingGoodsclassService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
/**
 * 
 * @author zgn 框架测试controller类
 *
 */

@Controller
@RequestMapping("/index")
@Api("平台首页接口")
public class IndexApiController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(IndexApiController.class);
	
	@Autowired
	private ShoppingAdvertService shoppingAdvertService;
	
	@Autowired
	private ShoppingGoodsclassService shoppingGoodsclassService;
	
	@Autowired
	private  ShoppingGoodsService   shoppingGoodsService;
	
	@Autowired
	private  ShoppingGoodsPhotoService   shoppingGoodsPhotoService;
	
	@Autowired
	private  ShoppingGoodsSpecService   shoppingGoodsSpecService;
	
	@ApiOperation("首页滚动广告api")
	@RequestMapping(value="/wheel_adv",method=RequestMethod.POST)
	@ResponseBody
	public  ApiResult<List<WheelAdvResponse>> loginui(@RequestBody WheelAdvRequest pammermap) {
		logger.info("方法：wheel_adv() 入参"+JsonUtil.bean2JsonStr(pammermap));
		ApiResult<List<WheelAdvResponse>> rest =shoppingAdvertService.listwheelAdv(pammermap);
		return rest;
	}	
	
	//PropertiesConfigUtil
	
	@ApiOperation("平台产品分类api(查询子一级)")
	@RequestMapping(value="/goodsclass",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<GoodsClassResponse>>  goodsclassList(@RequestBody GoodsClassRequest pammermap
			) {
		
		logger.info("入参：parent_id="+pammermap.getParent_id());
		ApiResult<List<GoodsClassResponse>> rest=shoppingGoodsclassService.goodsclassList(pammermap);
		
		return rest;
	}

	@ApiOperation("平台产品分类api(查询子多级)")
	@RequestMapping(value="/goodsclassAll",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<GoodsClassAllResponse>>  goodsclassListAll(@RequestBody GoodsClassRequest pammermap
			) {
		
		logger.info("入参：parent_id="+pammermap.getParent_id());
		ApiResult<List<GoodsClassAllResponse>> rest=shoppingGoodsclassService.goodsclassListAll(pammermap);
		
		return rest;
	}
	
	
	@ApiOperation("平台商品查询列表api")
	@RequestMapping(value="/goodsListAll",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<List<GoodsResponse>>  goodsListAll(@RequestBody GoodsRequest pammermap
			) {
		
		logger.info("入参："+JsonUtil.bean2JsonStr(pammermap));
		ApiResult<List<GoodsResponse>> rest=shoppingGoodsService.goodsListAll(pammermap);
		
		return rest;
	}
	
	
	
	@ApiOperation("平台商品明细查询api")
	@RequestMapping(value="goodsDetails",method=RequestMethod.POST)
	@ResponseBody
	public  ApiResult<GoodsDetailsResponse>  goodsDetails(
			@RequestBody GoodsDetailsRequest pammermap,
			HttpServletRequest request
			) {
		logger.info("goodsDetails() 入参："+JsonUtil.bean2JsonStr(pammermap));
		ApiResult<GoodsDetailsResponse> rest=shoppingGoodsService.goodsDetails(pammermap);
		return rest;
	}
	
	@ApiOperation("平台商品明细图片查询api")
	@RequestMapping(value="goodsDetailsPhotos",method=RequestMethod.POST)
	@ResponseBody
	public  ApiResult<List<GoodsPhotoResponse>>  goodsDetailsPhotos(
			@RequestBody GoodsDetailsRequest pammermap,
			HttpServletRequest request
			) {
		logger.info("goodsDetailsPhotos() 入参："+JsonUtil.bean2JsonStr(pammermap));
		ApiResult<List<GoodsPhotoResponse>> rest=shoppingGoodsPhotoService.goodsDetailsPhotos(pammermap);
		return rest;
	}
	
	
	@ApiOperation("平台商品规格类型查询api")
	@RequestMapping(value="goodsspecificationList",method=RequestMethod.POST)
	@ResponseBody
	public  ApiResult<List<GoodsSpecificationResponse>>  goodsspecificationList(
			@RequestBody GoodsDetailsRequest pammermap,
			HttpServletRequest request
			) {
		logger.info("goodsspecificationList() 入参："+JsonUtil.bean2JsonStr(pammermap));
		ApiResult<List<GoodsSpecificationResponse>> rest=shoppingGoodsSpecService.goodsspecificationList(pammermap);
		return rest;
	}
	
	
	@ApiOperation("平台商品规格数据查询api")
	@ApiIgnore
	@RequestMapping(value="goodsspecpropertyList",method=RequestMethod.POST)
	@ResponseBody
	public  ApiResult<List<GoodsSpecpropertyResponse>>  goodsspecpropertyList(
			@RequestBody GoodsSpecpropertyRequest pammermap,
			HttpServletRequest request
			) {
		logger.info("goodsspecpropertyList() 入参："+JsonUtil.bean2JsonStr(pammermap));
		ApiResult<List<GoodsSpecpropertyResponse>> rest=shoppingGoodsSpecService.goodsspecpropertyList(pammermap);
		return rest;
	}
}