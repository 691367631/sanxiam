package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.market.dao.ShoppingGoodsDao;
import com.sanxia.market.dao.ShoppingGoodsPhotoDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.index.GoodsDetailsRequest;
import com.sanxia.market.dto.index.GoodsPhotoResponse;
import com.sanxia.market.entity.ShoppingGoodsPhoto;
import com.sanxia.market.service.ShoppingGoodsPhotoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingGoodsPhotoService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-21 14:06:09
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingGoodsPhotoServiceImpl")
public class ShoppingGoodsPhotoServiceImpl extends BaseServiceImpl<ShoppingGoodsPhoto>  implements ShoppingGoodsPhotoService{

	@Autowired
	private ShoppingGoodsPhotoDao dao;
	@Override
	public ApiResult<List<GoodsPhotoResponse>> goodsDetailsPhotos(GoodsDetailsRequest pammermap) {
		ApiResult<List<GoodsPhotoResponse>> rest=new ApiResult<List<GoodsPhotoResponse>>();
		String goods_id=pammermap.getGoods_id();
		if(null==goods_id||"".equals(goods_id)) {
			 rest.setError_code("0002");
				rest.setMessage("goods_id不能为空值");
				return rest;
		}
		List<GoodsPhotoResponse> list=dao.goodsDetailsPhotos(goods_id);
		 if(list==null||list.size()<1 || (list.size()==1&&null==(list.get(0)))) {
				rest.setError_code("0001");
				rest.setMessage("没有数据");
				return rest;
			}
		 rest.setData(list);
		return rest;
	}


	}
