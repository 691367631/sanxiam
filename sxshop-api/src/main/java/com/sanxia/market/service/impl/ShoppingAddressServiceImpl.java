package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.enums.CodesEnum;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingAddressDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.user.AddAddressRequest;
import com.sanxia.market.dto.user.DeleteAddressRequest;
import com.sanxia.market.dto.user.QueryAddressRequest;
import com.sanxia.market.dto.user.QueryAddressResponse;
import com.sanxia.market.dto.user.UpdateAddressRequest;
import com.sanxia.market.entity.ShoppingAddress;
import com.sanxia.market.service.ShoppingAddressService;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingAddressService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-07 16:32:46
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingAddressServiceImpl")
public class ShoppingAddressServiceImpl extends BaseServiceImpl<ShoppingAddress>  implements ShoppingAddressService{

	@Autowired
	private ShoppingAddressDao dao;
	
	@Override
	public ApiResult<String> addAddress(AddAddressRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		pammermap.getUser_id();
		ShoppingAddress shoppingAddress=new ShoppingAddress();
		shoppingAddress.setAddTime(new Date());
		shoppingAddress.setAreaId(Long.parseLong(pammermap.getArea_id()));
		shoppingAddress.setAreaInfo(pammermap.getArea_info());
		shoppingAddress.setDeleteStatus(false);
		shoppingAddress.setMobile(pammermap.getMobile());
		shoppingAddress.setTelephone(pammermap.getTelephone());
		shoppingAddress.setTrueName(pammermap.getTrueName());
		shoppingAddress.setUserId(Long.parseLong(pammermap.getUser_id()));
		shoppingAddress.setZip(pammermap.getZip());
		dao.insertOne(shoppingAddress);
		return rest;
	}

	@Override
	public ApiResult<List<QueryAddressResponse>> queryAddress(QueryAddressRequest pammermap) {
		ApiResult<List<QueryAddressResponse>> rest=new ApiResult<List<QueryAddressResponse>>();
		String user_id=pammermap.getUser_id();
		if(StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0100.getCode());
			rest.setMessage("用户id不能为空");
			return rest;
		}
		List<QueryAddressResponse> list=dao.listByUserid(user_id);
		rest.setData(list);
		return rest;
	}

	@Override
	public ApiResult<String> deleteAddress(DeleteAddressRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		String  address_id=pammermap.getAddress_id();
		ShoppingAddress shoppingAddress=dao.getById(address_id);
		if(StringUtil.isEmpty(shoppingAddress)) {
			rest.setError_code("0003");
			rest.setMessage("address_id错误！");
			return rest;
		}
		shoppingAddress.setDeleteStatus(true);
		dao.updateOne(shoppingAddress);
		return rest;
	}

	@Override
	public ApiResult<String> updateAddress(UpdateAddressRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		String  address_id=pammermap.getAddress_id();
		ShoppingAddress shoppingAddress=dao.getById(address_id);
		if(StringUtil.isEmpty(shoppingAddress)) {
			rest.setError_code("0003");
			rest.setMessage("address_id错误！");
			return rest;
		}
		shoppingAddress.setAreaId(Long.parseLong(pammermap.getArea_id()));
		shoppingAddress.setAreaInfo(pammermap.getArea_info());
		shoppingAddress.setMobile(pammermap.getMobile());
		shoppingAddress.setTelephone(pammermap.getTelephone());
		shoppingAddress.setTrueName(pammermap.getTrueName());
		shoppingAddress.setUserId(Long.parseLong(pammermap.getUser_id()));
		shoppingAddress.setZip(pammermap.getZip());
		dao.updateOne(shoppingAddress);
		return rest;
	}


	}
