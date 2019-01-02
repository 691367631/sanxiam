package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.entity.ShoppingStore;

 /**   
* @Title: ShoppingStoreService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-03 16:04:37
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingStoreService extends BaseService<ShoppingStore>{

	ShoppingStore getAllById(String storeid);


	}
