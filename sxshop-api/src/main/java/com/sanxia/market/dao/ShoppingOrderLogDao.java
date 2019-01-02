package com.sanxia.market.dao;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.entity.ShoppingOrderLog;



/**   
* @Title: ShoppingOrderLogDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-12-06 11:02:23
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingOrderLogDao extends BaseDao<ShoppingOrderLog> {

	void deleteAlllog(String order_id);

}