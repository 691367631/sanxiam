package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.enums.CodesEnum;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingStorecartDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goodscart.AddGoodsRequest;
import com.sanxia.market.dto.goodscart.AddGoodsResponse;
import com.sanxia.market.dto.goodscart.DeleteGoodsCartRequest;
import com.sanxia.market.dto.goodscart.DeleteStoreCartRequest;
import com.sanxia.market.dto.goodscart.DeleteUserCartRequest;
import com.sanxia.market.dto.goodscart.ImmediatePurchaseRequest;
import com.sanxia.market.dto.goodscart.ImmediatePurchaseResponse;
import com.sanxia.market.dto.goodscart.QueryGoods;
import com.sanxia.market.dto.goodscart.QueryGoodsCart;
import com.sanxia.market.dto.goodscart.QueryGoodsCartRequest;
import com.sanxia.market.dto.goodscart.QueryGoodsCartResponse;
import com.sanxia.market.entity.ShoppingCartGsp;
import com.sanxia.market.entity.ShoppingGoods;
import com.sanxia.market.entity.ShoppingGoodscart;
import com.sanxia.market.entity.ShoppingGoodsspecification;
import com.sanxia.market.entity.ShoppingGoodsspecproperty;
import com.sanxia.market.entity.ShoppingStore;
import com.sanxia.market.entity.ShoppingStorecart;
import com.sanxia.market.entity.ShoppingUser;
import com.sanxia.market.service.ShoppingCartGspService;
import com.sanxia.market.service.ShoppingGoodsService;
import com.sanxia.market.service.ShoppingGoodscartService;
import com.sanxia.market.service.ShoppingGoodsspecificationService;
import com.sanxia.market.service.ShoppingGoodsspecpropertyService;
import com.sanxia.market.service.ShoppingStoreService;
import com.sanxia.market.service.ShoppingStorecartService;
import com.sanxia.market.service.ShoppingUserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


 

 /**   
* @Title: ShoppingStorecartService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-27 12:00:53
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingStorecartServiceImpl")
public class ShoppingStorecartServiceImpl extends BaseServiceImpl<ShoppingStorecart>  implements ShoppingStorecartService{

	@Autowired
	private  ShoppingStorecartDao dao;
	
	@Autowired
	private ShoppingGoodscartService shoppingGoodscartService;
	
	@Autowired
	private ShoppingCartGspService shoppingCartGspService;
	
	@Autowired
	private ShoppingGoodsService shoppingGoodsService;
	
	@Autowired
	private ShoppingUserService shoppingUserService;
	
	@Autowired
	private ShoppingGoodsspecpropertyService shoppingGoodsspecpropertyService;
	
	@Autowired
	private ShoppingGoodsspecificationService shoppingGoodsspecificationService;
	
	@Autowired
	private ShoppingStoreService shoppingStoreService;
	
	@Override
	@Transactional
	public ApiResult<AddGoodsResponse> addgoods(AddGoodsRequest pammermap) {
		ApiResult<AddGoodsResponse> rest=new ApiResult<AddGoodsResponse>();
		String user_id =pammermap.getUser_id();
		String session_id=pammermap.getSession_id();
		String goods_id=pammermap.getGoods_id();
		String property_id=pammermap.getProperty_id();
		String goods_sum=pammermap.getGoods_sum();
		if(StringUtil.isEmpty(user_id)&&StringUtil.isEmpty(session_id)) {
			rest.setError_code("0002");
			rest.setMessage("user_id,session_id不能全为空值");
			return rest;
		}
		if(StringUtil.isEmpty(goods_id)) {
			rest.setError_code("0002");
			rest.setMessage("goods_id不能为空值");
			return rest;
		}
		if(StringUtil.isEmpty(goods_sum)) {
			rest.setError_code("0002");
			rest.setMessage("goods_sum不能为空值");
			return rest;
		}
		
		ShoppingGoods shoppingGoods=shoppingGoodsService.getById(goods_id);
		if(StringUtil.isEmpty(shoppingGoods)) {
			rest.setError_code("0003");
			rest.setMessage("goods_id错误");
			return rest;
		}
		
		if(!StringUtil.isEmpty(user_id)&&StringUtil.isEmpty(session_id)) {
			rest=this.addgoodsByone(user_id,"user",shoppingGoods,pammermap);
			return rest;
		}
		if(!StringUtil.isEmpty(session_id)&&StringUtil.isEmpty(user_id)) {
			rest=this.addgoodsByone(user_id,"session",shoppingGoods,pammermap);
			return rest;
		}
		
		if(!StringUtil.isEmpty(session_id)&&!StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0200.getCode());
			rest.setMessage(CodesEnum.FAIL0200.getMsg());
			return rest;
		}
		
		
		
		return null;
	}

	/**
	 * 购物车添加商品时，传入参数user_id,或者session_id 有一个为空时 执行下面方法
	 */

	private ApiResult<AddGoodsResponse> addgoodsByone(String id,String type,ShoppingGoods shoppingGoods,AddGoodsRequest pammermap) {
		ApiResult<AddGoodsResponse> rest=new ApiResult<AddGoodsResponse>();
		AddGoodsResponse resp=new AddGoodsResponse();
		String property_id=pammermap.getProperty_id();
		Double GoodsCurrentPrice =shoppingGoods.getGoodsCurrentPrice(property_id);
		String storecart_ids="";
		String goodscart_ids="";
		if("user".equals(type)) {
            String user_id=id;
			ShoppingUser	shoppingUser=shoppingUserService.getById(user_id);
			if(StringUtil.isEmpty(shoppingUser)) {
				rest.setError_code("0002");
				rest.setMessage("user_id错误");
				return rest;
			}
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("storeId", shoppingGoods.getGoodsStoreId());
			map.put("userId", user_id);
			map.put("scStatus", "0");
			ShoppingStorecart shoppingStorecart =dao.getBy(map);
			if(StringUtil.isEmpty(shoppingStorecart)) {
				shoppingStorecart=new ShoppingStorecart();
				shoppingStorecart.setAddTime(new Date());
				shoppingStorecart.setDeleteStatus(false);
				shoppingStorecart.setScStatus(0L);
				shoppingStorecart.setStoreId(shoppingGoods.getGoodsStoreId());
				shoppingStorecart.setUserId(Long.valueOf(user_id));
				shoppingStorecart.setTotalPrice(Double.valueOf((BigDecimal.valueOf(GoodsCurrentPrice).multiply(new BigDecimal(pammermap.getGoods_sum()))).toString()));
				dao.insertOne(shoppingStorecart);
				//System.out.println(shoppingStorecart.getId());
				//保存商品规格快照
				String specInfo="";
				if(!StringUtil.isEmpty(pammermap.getProperty_id())) {
					String[] property_ids=pammermap.getProperty_id().split(",");
					for (int i = 0; i < property_ids.length; i++) {
						ShoppingGoodsspecproperty shoppingGoodsspecproperty	=shoppingGoodsspecpropertyService.getById(property_ids[i]);
						ShoppingGoodsspecification shoppingGoodsspecification=shoppingGoodsspecificationService.getById(shoppingGoodsspecproperty.getSpecId()+"");
						specInfo=shoppingGoodsspecification.getName()+":"+shoppingGoodsspecproperty.getValue()+" "+specInfo;
					}
					ShoppingGoodscart shoppingGoodscart=new ShoppingGoodscart();
					shoppingGoodscart.setAddTime(new Date());
					shoppingGoodscart.setCount(Long.valueOf(pammermap.getGoods_sum()));
					shoppingGoodscart.setDeleteStatus(false);
					shoppingGoodscart.setGoodsId(Long.valueOf(pammermap.getGoods_id()));
					shoppingGoodscart.setPrice(GoodsCurrentPrice);
					shoppingGoodscart.setScId(shoppingStorecart.getId());
					shoppingGoodscart.setSpecInfo(specInfo);
					shoppingGoodscartService.insertOne(shoppingGoodscart);
					for (int i = 0; i < property_ids.length; i++) {
						ShoppingCartGsp shoppingCartGsp=new ShoppingCartGsp();
						shoppingCartGsp.setCartId(shoppingGoodscart.getId());
					    shoppingCartGsp.setGspId(Long.parseLong(property_ids[i]));
					    shoppingCartGspService.insertOne(shoppingCartGsp);
					}
				}else {
				ShoppingGoodscart shoppingGoodscart=new ShoppingGoodscart();
				shoppingGoodscart.setAddTime(new Date());
				shoppingGoodscart.setCount(Long.valueOf(pammermap.getGoods_sum()));
				shoppingGoodscart.setDeleteStatus(false);
				shoppingGoodscart.setGoodsId(Long.valueOf(pammermap.getGoods_id()));
				shoppingGoodscart.setPrice(GoodsCurrentPrice);
				shoppingGoodscart.setSpecInfo(specInfo);
				shoppingGoodscart.setScId(shoppingStorecart.getId());
				shoppingGoodscartService.insertOne(shoppingGoodscart);
				}
			}
			else{
				shoppingStorecart.setTotalPrice(Double.valueOf(BigDecimal.valueOf(shoppingStorecart.getTotalPrice()).add(BigDecimal.valueOf(GoodsCurrentPrice).multiply(new BigDecimal(pammermap.getGoods_sum()))).toString()));
				dao.updateOne(shoppingStorecart);
				Map<String,Object> mapGoodscart =new HashMap<String,Object>();
				mapGoodscart.put("scId", shoppingStorecart.getId());
				mapGoodscart.put("goodsId", pammermap.getGoods_id());
				//查询购物车商品记录
				List<ShoppingGoodscart> list=shoppingGoodscartService.listBy(mapGoodscart);
				//如果有记录
				if(null!=list&&list.size()>0) {
					boolean flog=false;
					String[] prosnew=pammermap.getProperty_id().split(",");
					for (int i = 0; i <list.size(); i++) {
						ShoppingGoodscart goodscart	=list.get(i);
						mapGoodscart.clear();
						mapGoodscart.put("cartId", goodscart.getId());
						List<ShoppingCartGsp> shoppingCartGsplist=shoppingCartGspService.listBy(mapGoodscart);
						//如果数据库商品规格记录不为空
						if(null!=shoppingCartGsplist&&shoppingCartGsplist.size()>0) {
							String[] pros= new String[shoppingCartGsplist.size()];
							for (int j = 0; j < shoppingCartGsplist.size(); j++) {
								pros[j]=shoppingCartGsplist.get(j).getGspId()+"";
							}
							Arrays.sort(pros);
	                        Arrays.sort(prosnew);
	                        if(Arrays.equals(pros, prosnew)) {
	                        	flog=true;
	                        	goodscart.setCount(BigDecimal.valueOf(goodscart.getCount()).add(new BigDecimal(pammermap.getGoods_sum())).longValue());
	                        	shoppingGoodscartService.updateOne(goodscart);
	                        }
						}
						//如果传入属性为空，并且数据库中属性关系记录也为空，判断商品id是否相同
						else if(StringUtil.isEmpty(pammermap.getProperty_id())&&StringUtil.isEmpty(shoppingCartGsplist)) {
							  if((goodscart.getGoodsId()+"").equals(pammermap.getGoods_id()+"")) {
		                        	flog=true;
		                        	goodscart.setCount(BigDecimal.valueOf(goodscart.getCount()).add(new BigDecimal(pammermap.getGoods_sum())).longValue());
		                        	shoppingGoodscartService.updateOne(goodscart);
		                        }
						}
					}
					//flog为false ,证明没有相同商品记录
					if(!flog) {
						//保存商品规格快照
						String specInfo="";
						if(!StringUtil.isEmpty(pammermap.getProperty_id())) {
							String[] property_ids=pammermap.getProperty_id().split(",");
							for (int i = 0; i < property_ids.length; i++) {
								ShoppingGoodsspecproperty shoppingGoodsspecproperty	=shoppingGoodsspecpropertyService.getById(property_ids[i]);
								ShoppingGoodsspecification shoppingGoodsspecification=shoppingGoodsspecificationService.getById(shoppingGoodsspecproperty.getSpecId()+"");
								specInfo=shoppingGoodsspecification.getName()+":"+shoppingGoodsspecproperty.getValue()+" "+specInfo;
							}
							ShoppingGoodscart shoppingGoodscart=new ShoppingGoodscart();
							shoppingGoodscart.setAddTime(new Date());
							shoppingGoodscart.setCount(Long.valueOf(pammermap.getGoods_sum()));
							shoppingGoodscart.setDeleteStatus(false);
							shoppingGoodscart.setGoodsId(Long.valueOf(pammermap.getGoods_id()));
							shoppingGoodscart.setPrice(GoodsCurrentPrice);
							shoppingGoodscart.setScId(shoppingStorecart.getId());
							shoppingGoodscart.setSpecInfo(specInfo);
							shoppingGoodscartService.insertOne(shoppingGoodscart);
							for (int i = 0; i < property_ids.length; i++) {
								ShoppingCartGsp shoppingCartGsp=new ShoppingCartGsp();
								shoppingCartGsp.setCartId(shoppingGoodscart.getId());
							    shoppingCartGsp.setGspId(Long.parseLong(property_ids[i]));
							    shoppingCartGspService.insertOne(shoppingCartGsp);
							}
						}else {
						ShoppingGoodscart shoppingGoodscart=new ShoppingGoodscart();
						shoppingGoodscart.setAddTime(new Date());
						shoppingGoodscart.setCount(Long.valueOf(pammermap.getGoods_sum()));
						shoppingGoodscart.setDeleteStatus(false);
						shoppingGoodscart.setGoodsId(Long.valueOf(pammermap.getGoods_id()));
						shoppingGoodscart.setPrice(GoodsCurrentPrice);
						shoppingGoodscart.setSpecInfo(specInfo);
						shoppingGoodscart.setScId(shoppingStorecart.getId());
						shoppingGoodscartService.insertOne(shoppingGoodscart);
						}
					}
					}
			}
		
		}
		
		if("session".equals(type)) {
			rest.setError_code("1111");
			rest.setMessage("暂未实现");
			return rest;
		}
		
		return rest;
	}


	@Override
	public ApiResult<QueryGoodsCartResponse> querygoodscart(QueryGoodsCartRequest pammermap) {
		ApiResult<QueryGoodsCartResponse> rest=new ApiResult<QueryGoodsCartResponse>();
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("userId", pammermap.getUser_id());
		map.put("scStatus", "0");
		List<ShoppingStorecart> list=dao.listBy(map);
		QueryGoodsCartResponse res=new QueryGoodsCartResponse();
		if(null==list||list.size()<1) {
			res.setTotal_price("0");
			rest.setData(res);
			return rest;
		}
		String total_price="0";
		 List<QueryGoodsCart> cartlist =new ArrayList<QueryGoodsCart>();
		for (int i = 0; i < list.size(); i++) {
			QueryGoodsCart queryGoodsCart=new QueryGoodsCart();
			ShoppingStorecart cart=list.get(i);
			total_price=BigDecimal.valueOf(cart.getTotalPrice()).add(new BigDecimal(total_price)).toString();
			String storeid=cart.getStoreId()+"";
			ShoppingStore shoppingStore=shoppingStoreService.getAllById(storeid);
			queryGoodsCart.setCart_store_id(cart.getId()+"");
			queryGoodsCart.setStore_price(cart.getTotalPrice()+"");
			queryGoodsCart.setStore_name(shoppingStore.getStoreName());
			queryGoodsCart.setStore_id(storeid);
			queryGoodsCart.setUser_id(cart.getUserId()+"");
			queryGoodsCart.setStore_logo(shoppingStore.getStoreLogoId());
			map.clear();
			map.put("scId", cart.getId()+"");
			List<ShoppingGoodscart> shoppingGoodscartlist=shoppingGoodscartService.listBy(map);
			if(null==shoppingGoodscartlist||shoppingGoodscartlist.size()<1){
				queryGoodsCart.setGoods_list(null);
			}else {
				List<QueryGoods> goods_list =new ArrayList<QueryGoods>();
				for (int j = 0; j < shoppingGoodscartlist.size(); j++) {
					ShoppingGoodscart shoppingGoodscart=shoppingGoodscartlist.get(j);
					QueryGoods query=new QueryGoods();
					query.setCount(shoppingGoodscart.getCount()+"");
					query.setGoods_id(shoppingGoodscart.getGoodsId()+"");
					ShoppingGoods shoppingGoods=shoppingGoodsService.getAllById(shoppingGoodscart.getGoodsId()+"");
					query.setGoods_img(shoppingGoods.getGoodsMainPhotoId());
					query.setGoods_name(shoppingGoods.getGoodsName());
					query.setPrice(shoppingGoodscart.getPrice()+"");
					query.setSpec_info(shoppingGoodscart.getSpecInfo());
					query.setGoodscart_id(shoppingGoodscart.getId()+"");
					goods_list.add(query);
				}
				queryGoodsCart.setGoods_list(goods_list);	
			}
			
			cartlist.add(queryGoodsCart);
		}
		res.setTotal_price(total_price);
		res.setCartlist(cartlist);
		rest.setData(res);
		return rest;
	}

	@Override
	@Transactional
	public ApiResult<String> deletestorecart(DeleteStoreCartRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		ShoppingStorecart shoppingStorecart	=dao.getById(pammermap.getCart_store_id());
		if(null==shoppingStorecart) {
			rest.setError_code("0001");
			rest.setMessage("goodscart_id 参数错误");
			return rest;
		}
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("scId", pammermap.getCart_store_id());
		List<ShoppingGoodscart> shoppingGoodscartlist=shoppingGoodscartService.listBy(map);
		if(null!=shoppingGoodscartlist&&shoppingGoodscartlist.size()>0) {
			for (int i = 0; i < shoppingGoodscartlist.size(); i++) {
				DeleteGoodsCartRequest pammer=new DeleteGoodsCartRequest();
				pammer.setGoodscart_id(shoppingGoodscartlist.get(i).getId()+"");
				shoppingGoodscartService.deletegoodscart(pammer);
			}
		}
		dao.delete(pammermap.getCart_store_id());
		return rest;
	}

	@Override
	public ApiResult<String> deleteusercart(DeleteUserCartRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("userId", pammermap.getUser_id());
		map.put("scStatus", "0");
		List<ShoppingStorecart> list=dao.listBy(map);
		if(null!=list&&list.size()>0) {
			for (int i = 0; i < list.size(); i++) {
				DeleteStoreCartRequest pammer =new DeleteStoreCartRequest();
				pammer.setCart_store_id(list.get(i).getId()+"");
				this.deletestorecart(pammer);
			}
		}
		return rest;
	}

	@Override
	public ApiResult<ImmediatePurchaseResponse> immediatePurchase(ImmediatePurchaseRequest pammermap) {
		ApiResult<ImmediatePurchaseResponse> rest=new ApiResult<ImmediatePurchaseResponse>();
		String user_id =pammermap.getUser_id();
		String goods_id=pammermap.getGoods_id();
		String property_id=pammermap.getProperty_id();
		String goods_sum=pammermap.getGoods_sum();
		if(StringUtil.isEmpty(user_id)) {
			rest.setError_code("0002");
			rest.setMessage("user_id不能为空值");
			return rest;
		}
		if(StringUtil.isEmpty(goods_id)) {
			rest.setError_code("0002");
			rest.setMessage("goods_id不能为空值");
			return rest;
		}
		if(StringUtil.isEmpty(goods_sum)) {
			rest.setError_code("0002");
			rest.setMessage("goods_sum不能为空值");
			return rest;
		}
		
		ShoppingGoods shoppingGoods=shoppingGoodsService.getById(goods_id);
		if(StringUtil.isEmpty(shoppingGoods)) {
			rest.setError_code("0003");
			rest.setMessage("goods_id错误");
			return rest;
		}
		
		if(!StringUtil.isEmpty(user_id)) {
			rest=this.immediatePurchaseAddgoodsByone(user_id,"user",shoppingGoods,pammermap);
			return rest;
		}else {
			rest.setError_code(CodesEnum.FAIL0200.getCode());
			rest.setMessage(CodesEnum.FAIL0200.getMsg());
			return rest;
		}
	}

	private ApiResult<ImmediatePurchaseResponse> immediatePurchaseAddgoodsByone(String user_id, String string,
			ShoppingGoods shoppingGoods, ImmediatePurchaseRequest pammermap) {
		ApiResult<ImmediatePurchaseResponse> rest=new ApiResult<ImmediatePurchaseResponse>();
		ImmediatePurchaseResponse resp=new ImmediatePurchaseResponse();
		String property_id=pammermap.getProperty_id();
		Double GoodsCurrentPrice =shoppingGoods.getGoodsCurrentPrice(property_id);
		String storecart_ids="";
		String goodscart_ids="";
		ShoppingStorecart shoppingStorecart=new ShoppingStorecart();
		shoppingStorecart.setAddTime(new Date());
		shoppingStorecart.setDeleteStatus(false);
		shoppingStorecart.setScStatus(0L);
		shoppingStorecart.setStoreId(shoppingGoods.getGoodsStoreId());
		shoppingStorecart.setUserId(Long.valueOf(user_id));
		shoppingStorecart.setScStatus(1L);
		shoppingStorecart.setTotalPrice(Double.valueOf((BigDecimal.valueOf(GoodsCurrentPrice).multiply(new BigDecimal(pammermap.getGoods_sum()))).toString()));
		dao.insertOne(shoppingStorecart);
		//System.out.println(shoppingStorecart.getId());
		storecart_ids=shoppingStorecart.getId()+"";
		//保存商品规格快照
		String specInfo="";
		if(!StringUtil.isEmpty(pammermap.getProperty_id())) {
			String[] property_ids=pammermap.getProperty_id().split(",");
			for (int i = 0; i < property_ids.length; i++) {
				ShoppingGoodsspecproperty shoppingGoodsspecproperty	=shoppingGoodsspecpropertyService.getById(property_ids[i]);
				ShoppingGoodsspecification shoppingGoodsspecification=shoppingGoodsspecificationService.getById(shoppingGoodsspecproperty.getSpecId()+"");
				specInfo=shoppingGoodsspecification.getName()+":"+shoppingGoodsspecproperty.getValue()+" "+specInfo;
			}
			ShoppingGoodscart shoppingGoodscart=new ShoppingGoodscart();
			shoppingGoodscart.setAddTime(new Date());
			shoppingGoodscart.setCount(Long.valueOf(pammermap.getGoods_sum()));
			shoppingGoodscart.setDeleteStatus(false);
			shoppingGoodscart.setGoodsId(Long.valueOf(pammermap.getGoods_id()));
			shoppingGoodscart.setPrice(GoodsCurrentPrice);
			shoppingGoodscart.setScId(shoppingStorecart.getId());
			shoppingGoodscart.setSpecInfo(specInfo);
			shoppingGoodscartService.insertOne(shoppingGoodscart);
			goodscart_ids=shoppingGoodscart.getId()+"";
			for (int i = 0; i < property_ids.length; i++) {
				ShoppingCartGsp shoppingCartGsp=new ShoppingCartGsp();
				shoppingCartGsp.setCartId(shoppingGoodscart.getId());
			    shoppingCartGsp.setGspId(Long.parseLong(property_ids[i]));
			    shoppingCartGspService.insertOne(shoppingCartGsp);
			}
		}else {
		ShoppingGoodscart shoppingGoodscart=new ShoppingGoodscart();
		shoppingGoodscart.setAddTime(new Date());
		shoppingGoodscart.setCount(Long.valueOf(pammermap.getGoods_sum()));
		shoppingGoodscart.setDeleteStatus(false);
		shoppingGoodscart.setGoodsId(Long.valueOf(pammermap.getGoods_id()));
		shoppingGoodscart.setPrice(GoodsCurrentPrice);
		shoppingGoodscart.setSpecInfo(specInfo);
		shoppingGoodscart.setScId(shoppingStorecart.getId());
		shoppingGoodscartService.insertOne(shoppingGoodscart);
		goodscart_ids=shoppingGoodscart.getId()+"";
		}
	
		//拼装返回
		resp.setGoodscart_id(goodscart_ids);
		resp.setUser_id(user_id);
		resp.setStorecart_id(storecart_ids);
		rest.setData(resp);
		return rest;
	}
	}
