package com.sanxia.market.dao;

import java.util.List;
import java.util.Map;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.order.OrderGoods;
import com.sanxia.market.entity.ShoppingGoodscart;



/**   
* @Title: ShoppingGoodscartDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-11-27 12:00:19
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodscartDao extends BaseDao<ShoppingGoodscart> {

	Map<String, Object> ckeckTotalPrice(Map<String, Object> map);

	List<OrderGoods> listByOrderGoods(Map<String, Object> map);

	void deleteByOrderId(String order_id);

}