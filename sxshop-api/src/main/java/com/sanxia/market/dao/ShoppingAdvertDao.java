package com.sanxia.market.dao;

import java.util.List;
import java.util.Map;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.index.WheelAdvResponse;
import com.sanxia.market.entity.ShoppingAdvert;



/**   
* @Title: ShoppingAdvertDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-11-13 10:27:16
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingAdvertDao extends BaseDao<ShoppingAdvert> {

	List<WheelAdvResponse> listwheelAdv(Map<String, Object> map);

}