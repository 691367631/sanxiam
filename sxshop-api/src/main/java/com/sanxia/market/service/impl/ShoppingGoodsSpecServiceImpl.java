package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.market.dao.ShoppingGoodsPhotoDao;
import com.sanxia.market.dao.ShoppingGoodsSpecDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.index.GoodsDetailsRequest;
import com.sanxia.market.dto.index.GoodsPhotoResponse;
import com.sanxia.market.dto.index.GoodsSpecificationResponse;
import com.sanxia.market.dto.index.GoodsSpecpropertyRequest;
import com.sanxia.market.dto.index.GoodsSpecpropertyResponse;
import com.sanxia.market.entity.ShoppingGoodsSpec;
import com.sanxia.market.service.ShoppingGoodsSpecService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingGoodsSpecService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-21 15:21:57
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingGoodsSpecServiceImpl")
public class ShoppingGoodsSpecServiceImpl extends BaseServiceImpl<ShoppingGoodsSpec>  implements ShoppingGoodsSpecService{

	
	@Autowired
	private ShoppingGoodsSpecDao dao;
	
	@Override
	public ApiResult<List<GoodsSpecificationResponse>> goodsspecificationList(GoodsDetailsRequest pammermap) {
		ApiResult<List<GoodsSpecificationResponse>> rest=new ApiResult<List<GoodsSpecificationResponse>>();
		String goods_id=pammermap.getGoods_id();
		if(null==goods_id||"".equals(goods_id)) {
			 rest.setError_code("0002");
				rest.setMessage("goods_id不能为空值");
				return rest;
		}
		List<GoodsSpecificationResponse> list=dao.goodsspecificationList(goods_id);
		 if(list==null||list.size()<1 || (list.size()==1&&null==(list.get(0)))) {
				rest.setError_code("0001");
				rest.setMessage("没有数据");
				return rest;
			}
		 for (int i = 0; i < list.size(); i++) {
			 GoodsSpecificationResponse goodsSpecificationResponse= list.get(i);
			 GoodsSpecpropertyRequest resquest=new GoodsSpecpropertyRequest();
			 resquest.setGoods_id(goods_id);
			 resquest.setSpec_id(goodsSpecificationResponse.getSpec_id());
			 ApiResult<List<GoodsSpecpropertyResponse>> property =this.goodsspecpropertyList(resquest);
			 goodsSpecificationResponse.setList(property.getData());
		}
		 
		 rest.setData(list);
		return rest;
	}

	@Override
	public ApiResult<List<GoodsSpecpropertyResponse>> goodsspecpropertyList(GoodsSpecpropertyRequest pammermap) {
		ApiResult<List<GoodsSpecpropertyResponse>> rest=new ApiResult<List<GoodsSpecpropertyResponse>>();
		String goods_id=pammermap.getGoods_id();
		String spec_id=pammermap.getSpec_id();
		if(null==goods_id||"".equals(goods_id)) {
			 rest.setError_code("0002");
				rest.setMessage("goods_id不能为空值");
				return rest;
		}
		if(null==spec_id||"".equals(spec_id)) {
			rest.setError_code("0002");
			rest.setMessage("spec_id不能为空值");
			return rest;
		}
		List<GoodsSpecpropertyResponse> list=dao.goodsspecpropertyList(goods_id,spec_id);
		 if(list==null||list.size()<1 || (list.size()==1&&null==(list.get(0)))) {
				rest.setError_code("0001");
				rest.setMessage("没有数据");
				return rest;
			}
		 rest.setData(list);
		return rest;
	}


	}
