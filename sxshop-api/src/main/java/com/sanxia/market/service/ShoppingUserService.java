package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.login.LoginRequest;
import com.sanxia.market.dto.login.LoginResponse;
import com.sanxia.market.dto.login.RegisterRequest;
import com.sanxia.market.dto.login.RegisterResponse;
import com.sanxia.market.dto.login.UpdatePasswordRequest;
import com.sanxia.market.dto.login.UpdatePasswordResponse;
import com.sanxia.market.entity.ShoppingUser;

 /**   
* @Title: ShoppingUserService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-22 13:35:58
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingUserService extends BaseService<ShoppingUser>{

	ApiResult<LoginResponse> login(LoginRequest pammermap);

	ApiResult<RegisterResponse> register(RegisterRequest pammermap);

	ApiResult<UpdatePasswordResponse> updatePassword(UpdatePasswordRequest pammermap);


	}
