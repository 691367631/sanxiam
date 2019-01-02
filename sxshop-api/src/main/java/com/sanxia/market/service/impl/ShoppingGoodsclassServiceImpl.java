package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.market.dao.ShoppingGoodsclassDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.index.GoodsClassAllResponse;
import com.sanxia.market.dto.index.GoodsClassRequest;
import com.sanxia.market.dto.index.GoodsClassResponse;
import com.sanxia.market.entity.ShoppingGoodsclass;
import com.sanxia.market.service.ShoppingGoodsclassService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingGoodsclassService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-13 15:33:41
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingGoodsclassServiceImpl")
public class ShoppingGoodsclassServiceImpl extends BaseServiceImpl<ShoppingGoodsclass>  implements ShoppingGoodsclassService{

	@Autowired
	private ShoppingGoodsclassDao dao;
	@Override
	public ApiResult<List<GoodsClassResponse>> goodsclassList(GoodsClassRequest pammermap) {
		ApiResult<List<GoodsClassResponse>> rest=new ApiResult<List<GoodsClassResponse>>();
		 HashMap<String, Object> map = new HashMap<String, Object>();
		 String parent_id=pammermap.getParent_id();
		 if(parent_id==null||"".equals(parent_id)) {
			 map.put("level","0");
		 }else {
			 map.put("parent_id", parent_id);
		 }
		 List<GoodsClassResponse> list= dao.goodsclassList(map);
		 if(list==null||list.size()<1) {
				rest.setError_code("0001");
				rest.setMessage("没有数据");
				return rest;
			}
			rest.setData(list);
		return rest;
	}
	@Override
	public ApiResult<List<GoodsClassAllResponse>> goodsclassListAll(GoodsClassRequest pammermap) {
		ApiResult<List<GoodsClassAllResponse>> rest=new ApiResult<List<GoodsClassAllResponse>>();
		 HashMap<String, Object> map = new HashMap<String, Object>();
		 String parent_id=pammermap.getParent_id();
		 if(parent_id==null||"".equals(parent_id)) {
			    rest.setError_code("0002");
				rest.setMessage("parent_id不能为空值");
				return rest;
		 }else {
			 map.put("parent_id", parent_id);
		 }
		 List<GoodsClassResponse> list= dao.goodsclassList(map);
		 if(list==null||list.size()<1) {
				rest.setError_code("0001");
				rest.setMessage("没有数据");
				return rest;
			}
		
		 List<GoodsClassAllResponse> listrest=new ArrayList<GoodsClassAllResponse>();
		 for(GoodsClassResponse goodsClassResponse:list) {
			 GoodsClassAllResponse goodsClassAllResponse=new GoodsClassAllResponse();
			 goodsClassAllResponse.setClassName(goodsClassResponse.getClassName());
			 goodsClassAllResponse.setIcon_path(goodsClassResponse.getIcon_path());
			 goodsClassAllResponse.setIcon_sys(goodsClassResponse.getIcon_sys());
			 goodsClassAllResponse.setIcon_type(goodsClassResponse.getIcon_type());
			 goodsClassAllResponse.setId(goodsClassResponse.getId());
			 goodsClassAllResponse.setLevel(goodsClassResponse.getLevel());
			 goodsClassAllResponse.setParent_id(goodsClassResponse.getParent_id());
			 goodsClassAllResponse.setRecommend(goodsClassResponse.getRecommend());
			 goodsClassAllResponse.setSequence(goodsClassResponse.getSequence());
				HashMap<String,Object> hmap =new HashMap<String,Object>();
				hmap.put("parent_id", goodsClassResponse.getId());
				List<GoodsClassResponse> clist=dao.goodsclassList(hmap);
				goodsClassAllResponse.setChilds(clist);
			 listrest.add(goodsClassAllResponse);
		 }
			rest.setData(listrest);
		return rest;
	}
	@Override
	public String goodsclassParentId(String parent_id) {
		ShoppingGoodsclass	goodsclass=dao.getById(parent_id);
		
		if(null==goodsclass) {
		//	System.out.println(parent_id+"值为空");
			return "";
		}
		
		if(2==goodsclass.getLevel()/*||"2".equals(goodsclass.getLevel())*/) {
			return parent_id;
		}
		
		if(1==goodsclass.getLevel()/*||"1".equals(goodsclass.getLevel())*/) {
		List<ShoppingGoodsclass>	 list=dao.listBy((Map<String, Object>) new HashMap<String,Object>().put("parent_id", parent_id));
		if(list==null||list.size()<1) {
			return parent_id;
		}
		String res="";
		for (int i = 0; i < list.size(); i++) {
			res=res+list.get(i).getId()+",";
		}
		res=res.substring(0,res.length()-1);
		return res;
		}
		
		if(0==goodsclass.getLevel()/*||"0".equals(goodsclass.getLevel())*/) {
		List<Map<String,Object>> list2=dao.goodsclassParentId(parent_id);
		if(list2==null||list2.size()<1) {
			return parent_id;
		}
		String res="";
		for (int i = 0; i < list2.size(); i++) {
			res=res+list2.get(i).get("id")+",";
		}
		res=res.substring(0,res.length()-1);
		return res;
		
		}
		return parent_id;
	}


	
	}
