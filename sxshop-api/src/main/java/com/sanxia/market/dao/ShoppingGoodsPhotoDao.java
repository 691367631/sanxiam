package com.sanxia.market.dao;

import java.util.List;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.market.dto.index.GoodsPhotoResponse;
import com.sanxia.market.entity.ShoppingGoodsPhoto;



/**   
* @Title: ShoppingGoodsPhotoDao.java 
* @Package com.sanxia.market.dao
* @Description: 
* @author 赵贯男
* @date 2018-11-21 14:06:09
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodsPhotoDao extends BaseDao<ShoppingGoodsPhoto> {

	List<GoodsPhotoResponse> goodsDetailsPhotos(String goods_id);

}