package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.market.dao.ShoppingStoreDao;
import com.sanxia.market.entity.ShoppingStore;
import com.sanxia.market.service.ShoppingStoreService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingStoreService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-03 16:04:37
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingStoreServiceImpl")
public class ShoppingStoreServiceImpl extends BaseServiceImpl<ShoppingStore>  implements ShoppingStoreService{

	@Autowired
	private ShoppingStoreDao dao;
	@Override
	public ShoppingStore getAllById(String storeid) {
		return dao.getAllById(storeid);
	}


	}
