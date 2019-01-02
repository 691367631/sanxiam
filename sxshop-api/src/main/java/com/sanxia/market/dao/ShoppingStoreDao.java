package com.sanxia.market.dao;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.entity.ShoppingStore;



/**   
* @Title: ShoppingStoreDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-12-03 16:04:37
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingStoreDao extends BaseDao<ShoppingStore> {

	ShoppingStore getAllById(String storeid);

}