package com.sanxia.market.dao;

import java.util.List;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.index.GoodsSpecificationResponse;
import com.sanxia.market.dto.index.GoodsSpecpropertyResponse;
import com.sanxia.market.entity.ShoppingGoodsSpec;



/**   
* @Title: ShoppingGoodsSpecDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-11-21 15:21:57
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodsSpecDao extends BaseDao<ShoppingGoodsSpec> {

	List<GoodsSpecificationResponse> goodsspecificationList(String goods_id);

	List<GoodsSpecpropertyResponse> goodsspecpropertyList(String goods_id, String spec_id);

}