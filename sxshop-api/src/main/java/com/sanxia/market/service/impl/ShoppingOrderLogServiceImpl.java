package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.market.dao.ShoppingOrderLogDao;
import com.sanxia.market.entity.ShoppingOrderLog;
import com.sanxia.market.service.ShoppingOrderLogService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingOrderLogService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-06 11:02:23
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingOrderLogServiceImpl")
public class ShoppingOrderLogServiceImpl extends BaseServiceImpl<ShoppingOrderLog>  implements ShoppingOrderLogService{

	@Autowired
	private ShoppingOrderLogDao dao; 
	
	@Override
	public void deleteAlllog(String order_id) {
		dao.deleteAlllog(order_id);
		
	}


	}
