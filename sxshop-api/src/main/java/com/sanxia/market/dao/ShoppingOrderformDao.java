package com.sanxia.market.dao;

import java.util.List;
import java.util.Map;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.order.QueryOrderDetailResponse;
import com.sanxia.market.dto.order.QueryOrderResponse;
import com.sanxia.market.entity.ShoppingOrderform;



/**   
* @Title: ShoppingOrderformDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-12-06 11:02:39
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingOrderformDao extends BaseDao<ShoppingOrderform> {

	List<QueryOrderResponse> queryOrder(Map<String, Object> map);

	long queryOrderlistPageCount(Map<String, Object> map);

	QueryOrderDetailResponse queryOrderDetail(Map<String, Object> map);

}