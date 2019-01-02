package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.enums.CodesEnum;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingGoodsDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goods.GoodsCalssTypeChildren;
import com.sanxia.market.dto.goods.QueryGoodsClassTypeResponse;
import com.sanxia.market.dto.goods.QueryGoodsListByAllRequest;
import com.sanxia.market.dto.goods.QueryGoodsListByAllResponse;
import com.sanxia.market.dto.index.GoodsClassResponse;
import com.sanxia.market.dto.index.GoodsDetailsRequest;
import com.sanxia.market.dto.index.GoodsDetailsResponse;
import com.sanxia.market.dto.index.GoodsPhotoResponse;
import com.sanxia.market.dto.index.GoodsRequest;
import com.sanxia.market.dto.index.GoodsResponse;
import com.sanxia.market.entity.ShoppingAccessory;
import com.sanxia.market.entity.ShoppingGoods;
import com.sanxia.market.entity.ShoppingStore;
import com.sanxia.market.service.ShoppingAccessoryService;
import com.sanxia.market.service.ShoppingGoodsService;
import com.sanxia.market.service.ShoppingGoodsclassService;
import com.sanxia.market.service.ShoppingStoreService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingGoodsService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-20 10:44:37
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingGoodsServiceImpl")
public class ShoppingGoodsServiceImpl extends BaseServiceImpl<ShoppingGoods>  implements ShoppingGoodsService{

	@Autowired
	private ShoppingGoodsDao dao;
	
	@Autowired
	private ShoppingGoodsclassService  shoppingGoodsclassService;
	
	@Autowired
	private ShoppingAccessoryService shoppingAccessoryService;
	
	@Autowired
	private ShoppingStoreService shoppingStoreService;
	@Override
	public ApiResult<List<GoodsResponse>> goodsListAll(GoodsRequest pammermap) {
		ApiResult<List<GoodsResponse>> rest=new ApiResult<List<GoodsResponse>>();
		String page=pammermap.getPage();
		String rows=pammermap.getRows();
		String gc_id=pammermap.getGc_id();
		String keywords=pammermap.getKeywords();
		String isrecommend=pammermap.getIsrecommend();
		String goods_id=pammermap.getGoods_id();
		Map<String, Object> map=new HashMap<String, Object>();
		if(null!=gc_id&&!"".equals(gc_id)) {
			String gc_ids=shoppingGoodsclassService.goodsclassParentId(gc_id);
		//	System.out.println("取出的分类ids"+gc_ids);
			map.put("gc_id", gc_ids.split(","));
		}
		if(null!=keywords&&!"".equals(keywords)) {
			map.put("keywords", "%"+keywords+"%");
		}
		if(null!=isrecommend&&!"".equals(isrecommend)) {
			map.put("isrecommend", isrecommend);
		}
		if(null!=goods_id&&!"".equals(goods_id)) {
			map.put("goods_id", goods_id);
		}
		map.put("pageFirst", Integer.parseInt(page)*Integer.parseInt(rows)-Integer.parseInt(rows));
		map.put("pageSize", Integer.parseInt(rows));
		List<GoodsResponse> list=dao.goodsListAll(map);
		long total=dao.goodsListAlllistPageCount(map);
		if(list==null||list.size()<1) {
			rest.setError_code(CodesEnum.FAIL0001.getCode());
			rest.setMessage(CodesEnum.FAIL0001.getMsg());
			return rest;
		}
		for(GoodsResponse goodsResponse:list) {
			goodsResponse.setTotal(total+"");
		}
		rest.setData(list);
		return rest;
	}
	@Override
	public ApiResult<GoodsDetailsResponse> goodsDetails(GoodsDetailsRequest pammermap) {
		ApiResult<GoodsDetailsResponse> rest=new ApiResult<GoodsDetailsResponse>();
		String goods_id=pammermap.getGoods_id();
		if(null==goods_id||"".equals(goods_id)) {
			 rest.setError_code(CodesEnum.FAIL0002.getCode());
			 rest.setMessage("goods_id不能为空值");
			 return rest;
		}
		ShoppingGoods goods=dao.getById(goods_id);
		if(null==goods) {
			rest.setError_code(CodesEnum.FAIL0003.getCode());
			rest.setMessage("goods_id错误");
			return rest;
		}
		
		GoodsDetailsResponse response=new GoodsDetailsResponse();
		response.setDescription_evaluate(goods.getDescriptionEvaluate()+"");
		response.setGc_id(goods.getGcId()+"");
		response.setGoods_brand_id(goods.getGoodsBrandId()+"");
		response.setGoods_click(goods.getGoodsClick()+"");
		response.setGoods_collect(goods.getGoodsCollect()+"");
		response.setGoods_current_price(goods.getGoodsCurrentPrice()+"");
		response.setGoods_details(goods.getGoodsDetails());
		response.setGoods_inventory(goods.getGoodsInventory()+"");
		ShoppingAccessory shoppingAccessory=shoppingAccessoryService.getById(goods.getGoodsMainPhotoId());
		if(!StringUtil.isEmpty(shoppingAccessory)) {
			response.setGoods_main_photo_id(shoppingAccessory.getPath()+"/"+shoppingAccessory.getName());
		}
		response.setGoods_name(goods.getGoodsName());
		response.setGoods_price(goods.getGoodsPrice()+"");
		response.setGoods_property(goods.getGoodsProperty());
		response.setGoods_recommend(goods.getGoodsRecommend()+"");
		response.setGoods_salenum(goods.getGoodsSalenum()+"");
		response.setGoods_serial(goods.getGoodsSerial());
		ShoppingStore shoppingStore=shoppingStoreService.getAllById(goods.getGoodsStoreId()+"");
		response.setGoods_store_name(shoppingStore.getStoreName());
		response.setGoods_store_id(goods.getGoodsStoreId()+"");
		response.setGoods_transfee(goods.getGoodsTransfee()+"");
		response.setGoods_weight(goods.getGoodsWeight()+"");
		response.setId(goods.getId()+"");
		response.setInventory_type(goods.getInventoryType());
		response.setEms_trans_fee(goods.getEmsTransFee()+"");
		response.setExpress_trans_fee(goods.getExpressTransFee()+"");
		response.setMail_trans_fee(goods.getMailTransFee()+"");
		response.setStore_recommend(goods.getStoreRecommend()+"");
		rest.setData(response);
		return rest;
	}
	@Override
	public ShoppingGoods getAllById(String string) {
		return dao.getAllById(string);
	}
	@Override
	public ApiResult<List<QueryGoodsListByAllResponse>> queryGoodsListByAll(QueryGoodsListByAllRequest pammermap) {
		ApiResult<List<QueryGoodsListByAllResponse>> rest=new ApiResult<List<QueryGoodsListByAllResponse>>();
		String class_id=pammermap.getGoodsClass_id();
		String keywords=pammermap.getKeyword();
		String sequence_type =pammermap.getSequence_type();
    	String sequence_rule =pammermap.getSequence_rule();
    	String page=pammermap.getPage();
		String rows=pammermap.getRows();
    	List<QueryGoodsClassTypeResponse> goodsTypeList=pammermap.getQueryGoodsClassTypeList();
    	String sql="SELECT a.`id` AS id,a.goods_name,a.goods_current_price,CONCAT(e.path,'/',e.name)  AS goods_main_photo_id FROM `shopping_goods` a LEFT JOIN `shopping_goods_spec` b ON a.`id`=b.goods_id LEFT JOIN `shopping_goodsspecproperty` c ON b.spec_id=c.id  LEFT JOIN  `shopping_goodsbrand` d ON a.goods_brand_id=d.id  LEFT JOIN shopping_accessory e ON a.goods_main_photo_id=e.id ";
    	String where="";
    	String orderBy="";
    	String limit="";
		if(null!=class_id&&!"".equals(class_id)) {
			String gc_ids=shoppingGoodsclassService.goodsclassParentId(class_id);
		//	System.out.println("取出的分类ids"+gc_ids);
			where=where+" a.gc_id in ("+gc_ids+")";
		}
		if(null!=keywords&&!"".equals(keywords)) {
			if(StringUtil.isEmpty(where)) {
			where=where+"a.goods_name like"+ "'%"+keywords+"%'";
			}else {
				where=where+" and a.goods_name like"+ "'%"+keywords+"%'";
			}
		}
    	
		if(!StringUtil.isEmpty(sequence_type)) {
			if("price".equals(sequence_type)) {
				orderBy=" order by a.goods_current_price";
			}else if("salenum".equals(sequence_type)) {
				orderBy=" order by a.goods_salenum";
			}else if("evaluate".equals(sequence_type)) {
				orderBy=" order by a.description_evaluate";
			}else {
				orderBy=" order by a.addTime";
			}
		}else {
			orderBy=" order by a.addTime";
		}
		
    	if(!StringUtil.isEmpty(sequence_rule)) {
    		orderBy= orderBy +" " +sequence_rule;
    	}else {
    		orderBy= orderBy +" desc";
    	}
    	if(!StringUtil.isEmpty(goodsTypeList)) {
    		int size=goodsTypeList.size();
    		
    		for (int i = 0; i < size; i++) {
    			QueryGoodsClassTypeResponse queryGoodsClassTypeResponse	=goodsTypeList.get(i);
    			String goodsClassType=queryGoodsClassTypeResponse.getGoodsCalssType();
    			List<GoodsCalssTypeChildren> childList=queryGoodsClassTypeResponse.getGoodsCalssTypechildList();
    			String brand="";
        		String specproperty="";
    			if("brand".equals(goodsClassType)) {
    				for (int j = 0; j < childList.size(); j++) {
    					GoodsCalssTypeChildren child=childList.get(j);
    					brand=brand+child.getChild_id()+",";
					}
    				if(!StringUtil.isEmpty(brand)) {
    						if(StringUtil.isEmpty(where)) {
    							where=where+"  a.goods_brand_id in ("+brand+")";
    						}else {
    							where = where +" and  a.goods_brand_id in ("+brand+")";
    						}
    		    		}
    				
    			}
    			if("specproperty".equals(goodsClassType)) {
    				for (int j = 0; j < childList.size(); j++) {
    					GoodsCalssTypeChildren child=childList.get(j);
    					specproperty=specproperty+child.getChild_id()+",";
					}
    				if(!StringUtil.isEmpty(specproperty)) {
						if(StringUtil.isEmpty(where)) {
							where=where+"    b.spec_id in ("+specproperty+")";
						}else {
							where = where +" and  b.spec_id in ("+specproperty+")";
						}
		    		}
    			}
    			if("typeproperty".equals(goodsClassType)) {
    				for (int j = 0; j < childList.size(); j++) {
    					GoodsCalssTypeChildren child=childList.get(j);
    					if(1==childList.size()) {
    						if(StringUtil.isEmpty(where)) {
    							where=where+"   ( a.goods_property like "+"'%"+child.getChild_name()+"%' ) ";
    						}else {
    							where = where +" and  "+"( a.goods_property like "+"'%"+child.getChild_name()+"%' ) ";
    						}
    					}else {
	    					if(j==0) {
		    						if(StringUtil.isEmpty(where)) {
		    							where=where+"   ( a.goods_property like "+"'%"+child.getChild_name()+"%' ";
		    						}else {
		    							where = where +" and  "+"( a.goods_property like "+"'%"+child.getChild_name()+"%' ";
		    						}
	    					}else if(j==(childList.size()-1)){
		    							where = where +" or a.goods_property like "+"'%"+child.getChild_name()+"%' ) ";
	    					}else {
	    						where = where +" or a.goods_property like "+"'%"+child.getChild_name()+"%'  ";
	    					}
    					}
					}
    				
    			}
			}
    	}
    	int pageint=Integer.parseInt(page)*Integer.parseInt(rows)-Integer.parseInt(rows);
		limit=" limit "+pageint+"," +rows;
		String querysql="";
		String countsql="";
		if(StringUtil.isEmpty(where)) {
			querysql=sql+" where  a.deleteStatus=0 and a.goods_status=0  " +where+" GROUP BY a.id " +orderBy+limit;
			countsql="select count(1) from ("+sql+" where  a.deleteStatus=0 and a.goods_status=0 GROUP BY a.id " +") m";
		}else {
			querysql=sql+" where " +where+" and  a.deleteStatus=0 and a.goods_status=0 GROUP BY a.id " +orderBy+limit;
			countsql="select count(1) from ("+sql+" where " +where+" and  a.deleteStatus=0 and a.goods_status=0 GROUP BY a.id " +") m";
		}
		List<QueryGoodsListByAllResponse> list=dao.queryGoodsListBySql(querysql);
		
		long total=dao.queryGoodsListBySqlCount(countsql);
		for (int i = 0; i < list.size(); i++) {
			QueryGoodsListByAllResponse queryGoodsListByAllResponse	=list.get(i);
			queryGoodsListByAllResponse.setTotal(total+"");
		}
		rest.setData(list);
		return rest;
	}



	}
