package com.sanxia.market.dao;

import java.util.List;
import java.util.Map;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.user.QueryFavoriteResponse;
import com.sanxia.market.entity.ShoppingFavorite;



/**   
* @Title: ShoppingFavoriteDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-12-17 14:08:21
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingFavoriteDao extends BaseDao<ShoppingFavorite> {

	List<QueryFavoriteResponse> listByQueryFavorite(Map<String, Object> map);

	long listByQueryFavoriteCount(Map<String, Object> map);

}