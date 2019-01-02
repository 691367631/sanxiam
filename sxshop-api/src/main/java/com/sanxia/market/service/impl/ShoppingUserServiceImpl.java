package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.utils.Md5Encrypt;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingUserDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.login.LoginRequest;
import com.sanxia.market.dto.login.LoginResponse;
import com.sanxia.market.dto.login.RegisterRequest;
import com.sanxia.market.dto.login.RegisterResponse;
import com.sanxia.market.dto.login.UpdatePasswordRequest;
import com.sanxia.market.dto.login.UpdatePasswordResponse;
import com.sanxia.market.entity.ShoppingAlbum;
import com.sanxia.market.entity.ShoppingIntegrallog;
import com.sanxia.market.entity.ShoppingRole;
import com.sanxia.market.entity.ShoppingSysconfig;
import com.sanxia.market.entity.ShoppingUser;
import com.sanxia.market.entity.ShoppingUserRole;
import com.sanxia.market.entity.ShoppingUserToken;
import com.sanxia.market.service.ShoppingAlbumService;
import com.sanxia.market.service.ShoppingIntegrallogService;
import com.sanxia.market.service.ShoppingRoleService;
import com.sanxia.market.service.ShoppingSysconfigService;
import com.sanxia.market.service.ShoppingUserRoleService;
import com.sanxia.market.service.ShoppingUserService;
import com.sanxia.market.service.ShoppingUserTokenService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingUserService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-22 13:35:58
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingUserServiceImpl")
public class ShoppingUserServiceImpl extends BaseServiceImpl<ShoppingUser>  implements ShoppingUserService{

	@Autowired
	private  ShoppingUserDao dao;
	
	@Autowired
	private  ShoppingRoleService shoppingRoleService;
	
	@Autowired
	private  ShoppingUserRoleService shoppingUserRoleService;
	
	@Autowired
	private  ShoppingAlbumService shoppingAlbumService;
	
	@Autowired
	private  ShoppingSysconfigService shoppingSysconfigService;
	
	@Autowired
	private  ShoppingIntegrallogService shoppingIntegrallogService;
	
	@Autowired
	private ShoppingUserTokenService shoppingUserTokenService;
	
	@Override
	public ApiResult<LoginResponse> login(LoginRequest pammermap) {
		ApiResult<LoginResponse> rest=new ApiResult<LoginResponse>();
		String  user_name=pammermap.getUser_name();
		String  user_password=pammermap.getUser_password();
		if(null==user_name||"".equals(user_name)) {
		    rest.setError_code("0002");
			rest.setMessage("用户名不能为空！");
			return rest;
	    }
		if(null==user_password||"".equals(user_password)) {
		    rest.setError_code("0002");
			rest.setMessage("密码不能为空！");
			return rest;
	    }
		String key=Md5Encrypt.md5(user_password).toLowerCase();
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("userName", user_name);
		map.put("deleteStatus", 0);
		ShoppingUser user=dao.getBy(map);
		     if(user==null) {
			    rest.setError_code("0003");
				rest.setMessage("用户名密码错误！");
				return rest;
		    }
		String password= user.getPassword();
		    if(!key.equals(password)) {
			   rest.setError_code("0003");
			   rest.setMessage("用户名密码错误！");
			   return rest;
		    }
		    String token=UUID.randomUUID().toString();
		    map.clear();
		    map.put("userId", user.getId()+"");
		    ShoppingUserToken shoppingUserToken= shoppingUserTokenService.getBy(map);
		    if(StringUtil.isEmpty(shoppingUserToken)) {
		    	shoppingUserToken=new ShoppingUserToken();
		    	shoppingUserToken.setToken(token);
		    	shoppingUserToken.setUserId(user.getId()+"");
		    	shoppingUserTokenService.insertOne(shoppingUserToken);
		    }else {
		    	shoppingUserToken.setToken(token);
		    	shoppingUserTokenService.updateOne(shoppingUserToken);
		    }
		    LoginResponse loginResponse =new LoginResponse();
		    loginResponse.setUser_id(user.getId()+"");
		    loginResponse.setUser_name(user.getUserName());
		    loginResponse.setToken(token);
		    rest.setData(loginResponse);
		    
		return rest;
	}
	@Override
	public ApiResult<RegisterResponse> register(RegisterRequest pammermap) {
		ApiResult<RegisterResponse> rest=new ApiResult<RegisterResponse>();
		String  user_name=pammermap.getUser_name();
		String  user_password=pammermap.getUser_password();
		String  user_phone=pammermap.getUser_phone();
		if(null==user_name||"".equals(user_name)) {
		    rest.setError_code("0002");
			rest.setMessage("用户名不能为空！");
			return rest;
	    }
		if(null==user_password||"".equals(user_password)) {
		    rest.setError_code("0002");
			rest.setMessage("密码不能为空！");
			return rest;
	    }
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("userName", user_name);
		map.put("deleteStatus", 0);
		ShoppingUser user=dao.getBy(map);
		 if(user!=null) {
			    rest.setError_code("0003");
				rest.setMessage("用户名已被注册！");
				return rest;
		    }
		 user=new ShoppingUser();
		 map.clear();
		 map.put("deleteStatus", 0);
		 List<ShoppingSysconfig> listSysconfig= shoppingSysconfigService.listBy(map);
		 if((listSysconfig != null) && (listSysconfig.size() > 0)) {
			 user.setIntegral( listSysconfig.get(0).getMemberRegister());
		 }else {
			 user.setIntegral(0L);
		 }
		 String key=Md5Encrypt.md5(user_password).toLowerCase();
		 user.setUserName(user_name);
		 user.setPassword(key);
		 user.setTelephone(user_phone);
		 user.setUserRole("BUYER");
		 user.setGold(0L);
		 user.setLoginCount(1L);
         user.setAddTime(new Date());
         user.setReport(0L);
         user.setSex(0L);
         user.setStatus(0L);
         user.setUserCredit(0L);
         user.setYears(0L);
		 dao.insertOne(user);
		 map.clear();
		 map.put("userName", user_name);
		 map.put("deleteStatus", 0);
		 user=dao.getBy(map);
		 //给新用户授权
		 map.clear();
		 map.put("type", "BUYER");
		 List<ShoppingRole> list=shoppingRoleService.listBy(map);
		 for (int i = 0; i < list.size(); i++) {
			 ShoppingUserRole shoppingUserRole=new ShoppingUserRole();
			 shoppingUserRole.setRoleId(list.get(i).getId());
			 shoppingUserRole.setUserId(user.getId());
			 shoppingUserRoleService.insertOne(shoppingUserRole);
		}
		 //记录积分变化日志
		 ShoppingIntegrallog log=new ShoppingIntegrallog();
		 log.setAddTime(new Date());
         log.setContent("用户注册增加" + 
        		 user.getIntegral() + "分");
         log.setIntegral(user.getIntegral());
         log.setIntegralUserId(user.getId());
         log.setType("reg");
         this.shoppingIntegrallogService.insertOne(log);
		 //添加相册
         ShoppingAlbum album = new ShoppingAlbum();
         album.setAddTime(new Date());
         album.setAlbumDefault(true);
         album.setAlbumName("默认相册");
         album.setAlbumSequence(-10000L);
         album.setUserId(user.getId());
         this.shoppingAlbumService.insertOne(album);
		 //拼接最终返回
		 RegisterResponse registerResponse=new RegisterResponse();
		 registerResponse.setUser_id(user.getId()+"");
		 registerResponse.setUser_name(user.getUserName());
		 rest.setData(registerResponse);
		return rest;
	}
	@Override
	public ApiResult<UpdatePasswordResponse> updatePassword(UpdatePasswordRequest pammermap) {
		ApiResult<UpdatePasswordResponse> rest=new ApiResult<UpdatePasswordResponse>();
		String  user_id=pammermap.getUser_id();
		String  new_password=pammermap.getNew_password();
		String  old_password=pammermap.getOld_password();
		if(null==user_id||"".equals(user_id)) {
		    rest.setError_code("0002");
			rest.setMessage("user_id不能为空！");
			return rest;
	    }
		if(null==new_password||"".equals(new_password)) {
		    rest.setError_code("0002");
			rest.setMessage("new_password不能为空！");
			return rest;
	    }
		if(null==old_password||"".equals(old_password)) {
		    rest.setError_code("0002");
			rest.setMessage("old_password不能为空！");
			return rest;
	    }
		ShoppingUser user=dao.getById(user_id);
		 if(user==null) {
			    rest.setError_code("0003");
				rest.setMessage("user_id错误！");
				return rest;
		    }
		 String key=Md5Encrypt.md5(old_password).toLowerCase();
		 if(!key.equals(user.getPassword())) {
			   rest.setError_code("0003");
			   rest.setMessage("旧密码错误！");
			   return rest;
		    }
		 String newkey=Md5Encrypt.md5(new_password).toLowerCase();
		 user.setPassword(newkey);
		 dao.updateOne(user);
		 rest.setMessage("修改成功！");
		return rest;
	}

	

	}
