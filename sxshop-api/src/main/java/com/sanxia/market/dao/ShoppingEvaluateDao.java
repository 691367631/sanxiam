package com.sanxia.market.dao;

import java.util.List;
import java.util.Map;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.goods.QueryGoodsEvaluateResponse;
import com.sanxia.market.entity.ShoppingEvaluate;



/**   
* @Title: ShoppingEvaluateDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-12-13 12:11:08
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingEvaluateDao extends BaseDao<ShoppingEvaluate> {

	List<QueryGoodsEvaluateResponse> queryGoodsEvaluate(Map<String, Object> map);

	long listPageCountQueryGoodsEvaluate(Map<String, Object> map);

}