package com.sanxia.market.dao;

import java.util.List;
import java.util.Map;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.goods.GoodsCalssTypeChildren;
import com.sanxia.market.entity.ShoppingGoodstype;



/**   
* @Title: ShoppingGoodstypeDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-12-13 17:03:44
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodstypeDao extends BaseDao<ShoppingGoodstype> {

	List<GoodsCalssTypeChildren> queryGoodsClassTypeBrand(Map<String, Object> map);

	List<GoodsCalssTypeChildren> queryGoodsClassTypetypeProperty(Map<String, Object> map);

	List<GoodsCalssTypeChildren> queryGoodsClassTypetySpecproperty(Map<String, Object> map);

	List<GoodsCalssTypeChildren> queryGoodsClassTypetySpecpropertyChild(Map<String, Object> map);

}