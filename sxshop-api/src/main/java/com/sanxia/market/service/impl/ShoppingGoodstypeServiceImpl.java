package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.enums.CodesEnum;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingGoodstypeDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goods.GoodsCalssTypeChildren;
import com.sanxia.market.dto.goods.QueryGoodsClassTypeRequest;
import com.sanxia.market.dto.goods.QueryGoodsClassTypeResponse;
import com.sanxia.market.entity.ShoppingGoodsclass;
import com.sanxia.market.entity.ShoppingGoodstype;
import com.sanxia.market.service.ShoppingGoodsService;
import com.sanxia.market.service.ShoppingGoodsclassService;
import com.sanxia.market.service.ShoppingGoodstypeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingGoodstypeService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-13 17:03:44
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingGoodstypeServiceImpl")
public class ShoppingGoodstypeServiceImpl extends BaseServiceImpl<ShoppingGoodstype>  implements ShoppingGoodstypeService{

	@Autowired
	private ShoppingGoodstypeDao dao; 
	
	@Autowired
	private ShoppingGoodsclassService shoppingGoodsclassService;
	@Override
	public ApiResult<List<QueryGoodsClassTypeResponse>> queryGoodsClassType(QueryGoodsClassTypeRequest pammermap) {
		ApiResult<List<QueryGoodsClassTypeResponse>>  rest=new ApiResult<List<QueryGoodsClassTypeResponse>> ();
		String goodsCalssId=pammermap.getGoodsClass_id();
		if(StringUtil.isEmpty(goodsCalssId)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("goodsClass_id不能为空");
			return rest;
		}
		ShoppingGoodsclass	shoppingGoodsclass=shoppingGoodsclassService.getById(goodsCalssId);
		String  goodsTypeId=shoppingGoodsclass.getGoodsTypeId()+"";
		if(StringUtil.isEmpty(goodsTypeId)) {
			rest.setError_code(CodesEnum.FAIL0001.getCode());
			rest.setMessage(CodesEnum.FAIL0001.getMsg());
			return rest;
		}
		List<QueryGoodsClassTypeResponse> list=new ArrayList<QueryGoodsClassTypeResponse>();
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("goodsTypeId", goodsTypeId);
		//查询品牌
		List<GoodsCalssTypeChildren> brandChildList=dao.queryGoodsClassTypeBrand(map);
		if(!StringUtil.isEmpty(brandChildList)) {
			QueryGoodsClassTypeResponse goodsClassTypeBrand=new QueryGoodsClassTypeResponse();
			goodsClassTypeBrand.setGoodsCalssType("brand");
			goodsClassTypeBrand.setGoodsCalssType_id("brand");
			goodsClassTypeBrand.setGoodsCalssType_Name("品牌");
			goodsClassTypeBrand.setGoodsCalssTypechildList(brandChildList);
			list.add(goodsClassTypeBrand);
		}
		//查询参数
		List<GoodsCalssTypeChildren> typepropertyChildList=dao.queryGoodsClassTypetypeProperty(map);
		if(!StringUtil.isEmpty(typepropertyChildList)) {
			for (int i=0 ;i < typepropertyChildList.size();i++) {
				QueryGoodsClassTypeResponse goodsClassTypeproperty=new QueryGoodsClassTypeResponse();
				GoodsCalssTypeChildren childpeproperty=typepropertyChildList.get(i);
				goodsClassTypeproperty.setGoodsCalssType("typeproperty");
				goodsClassTypeproperty.setGoodsCalssType_id("typeproperty"+i);
				goodsClassTypeproperty.setGoodsCalssType_Name(childpeproperty.getChild_id());
				String values=childpeproperty.getChild_name();
				String[] valuelist=values.split(",");
				List<GoodsCalssTypeChildren> childList=new ArrayList<GoodsCalssTypeChildren>();
				for (int j = 0; j < valuelist.length; j++) {
					GoodsCalssTypeChildren child=new GoodsCalssTypeChildren();
					child.setChild_id(j+"");
					child.setChild_name(valuelist[j]);
					childList.add(child);
				}
				goodsClassTypeproperty.setGoodsCalssTypechildList(childList);
				list.add(goodsClassTypeproperty);
			}
		}
		
		//查询规格
		List<GoodsCalssTypeChildren> specpropertyChildList=dao.queryGoodsClassTypetySpecproperty(map);
		if(!StringUtil.isEmpty(specpropertyChildList)) {
			int size =specpropertyChildList.size();
			for (int i = 0; i < size; i++) {
				QueryGoodsClassTypeResponse goodsClassTyspecproperty=new QueryGoodsClassTypeResponse();
				GoodsCalssTypeChildren childspecproperty=specpropertyChildList.get(i);
				goodsClassTyspecproperty.setGoodsCalssType("specproperty");
				goodsClassTyspecproperty.setGoodsCalssType_id(childspecproperty.getChild_id());
				goodsClassTyspecproperty.setGoodsCalssType_Name(childspecproperty.getChild_name());
				//查询子集的子集
				map.put("spec_id", childspecproperty.getChild_id());
				List<GoodsCalssTypeChildren> childList =dao.queryGoodsClassTypetySpecpropertyChild(map);
				goodsClassTyspecproperty.setGoodsCalssTypechildList(childList);
				list.add(goodsClassTyspecproperty);
			}
		}
		
		
		rest.setData(list);
		return rest;
	}


	}
