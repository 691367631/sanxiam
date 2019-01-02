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
import com.sanxia.common.utils.JSONUtils;
import com.sanxia.common.utils.JsonUtil;
import com.sanxia.common.utils.PropertiesConfigUtil;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.login.LoginRequest;
import com.sanxia.market.dto.login.LoginResponse;
import com.sanxia.market.dto.login.RegisterRequest;
import com.sanxia.market.dto.login.RegisterResponse;
import com.sanxia.market.dto.login.UpdatePasswordRequest;
import com.sanxia.market.dto.login.UpdatePasswordResponse;
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
@RequestMapping("/login")
@Api("登录注册相关api")
public class LoginController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(LoginController.class);
	
    @Autowired
    private ShoppingUserService shoppingUserService;
	
	@ApiOperation("登录api")
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<LoginResponse>  login(@RequestBody LoginRequest pammermap
			) {
		logger.info("方法：login（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<LoginResponse> rest=shoppingUserService.login(pammermap);
	return rest;
	}
	
	
	@ApiOperation("注册api")
	@RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<RegisterResponse>  register(@RequestBody RegisterRequest pammermap
			) {
		logger.info("方法：register（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<RegisterResponse> rest=shoppingUserService.register(pammermap);
	return rest;
	}
	
	@ApiOperation("修改密码api")
	@RequestMapping(value="/updatePassword",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult<UpdatePasswordResponse>  updatePassword(@RequestBody UpdatePasswordRequest pammermap
			) {
		logger.info("方法：updatePassword（）入参:"+JsonUtil.bean2JsonStr(pammermap) );
		
		ApiResult<UpdatePasswordResponse> rest=shoppingUserService.updatePassword(pammermap);
	return rest;
	}
}