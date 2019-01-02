package com.sanxia.market.Controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.sanxia.common.utils.PropertiesConfigUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
/**
 * 
 * @author zgn 框架测试controller类
 *
 */

@Controller
@RequestMapping("/logout")
@ApiIgnore
@Api("登出")
public class LogoutController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(LogoutController.class);
	
	
	@ApiOperation("登出")
	@RequestMapping(value="",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object>  logout(@RequestBody Map<String,Object> pammermap
			) {
			Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
			try {
				//退出
				SecurityUtils.getSubject().logout();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			return resultMap;
		}
		
	
}