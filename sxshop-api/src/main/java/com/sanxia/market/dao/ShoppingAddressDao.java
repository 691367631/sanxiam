package com.sanxia.market.dao;

import java.util.List;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.user.QueryAddressResponse;
import com.sanxia.market.entity.ShoppingAddress;



/**   
* @Title: ShoppingAddressDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-12-07 16:32:46
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingAddressDao extends BaseDao<ShoppingAddress> {

	List<QueryAddressResponse> listByUserid(String user_id);

}