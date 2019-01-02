package com.sanxia.market.dao;

import java.util.List;
import java.util.Map;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.util.QueryAreaResponse;
import com.sanxia.market.entity.ShoppingArea;



/**   
* @Title: ShoppingAreaDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-12-07 16:32:30
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingAreaDao extends BaseDao<ShoppingArea> {

	List<QueryAreaResponse> listByMap(Map<String, Object> map);

}