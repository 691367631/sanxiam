package com.sanxia.market.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.index.GoodsClassResponse;
import com.sanxia.market.entity.ShoppingGoodsclass;



/**   
* @Title: ShoppingGoodsclassDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-11-13 15:33:41
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodsclassDao extends BaseDao<ShoppingGoodsclass> {

	List<GoodsClassResponse> goodsclassList(HashMap<String, Object> map);
	
	List<Map<String,Object>> goodsclassParentId(String parent_id);

}