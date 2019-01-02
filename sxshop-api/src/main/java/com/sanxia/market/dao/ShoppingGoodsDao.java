package com.sanxia.market.dao;

import java.util.List;
import java.util.Map;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.goods.QueryGoodsListByAllResponse;
import com.sanxia.market.dto.index.GoodsResponse;
import com.sanxia.market.entity.ShoppingGoods;



/**   
* @Title: ShoppingGoodsDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-11-20 10:44:37
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodsDao extends BaseDao<ShoppingGoods> {

	List<GoodsResponse> goodsListAll(Map<String, Object> map);

	ShoppingGoods getAllById(String string);

	long goodsListAlllistPageCount(Map<String, Object> map);

	List<QueryGoodsListByAllResponse> queryGoodsListByAll(Map<String, Object> map);

	List<QueryGoodsListByAllResponse> queryGoodsListBySql(String sql);

	long queryGoodsListBySqlCount(String countsql);

}