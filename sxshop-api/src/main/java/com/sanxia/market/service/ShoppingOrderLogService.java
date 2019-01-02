package com.sanxia.market.service;
import java.util.List;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.entity.ShoppingOrderLog;

 /**   
* @Title: ShoppingOrderLogService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-06 11:02:23
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingOrderLogService extends BaseService<ShoppingOrderLog>{

	void deleteAlllog(String order_id);


	}
