package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.enums.CodesEnum;
import com.sanxia.common.utils.NoCreate;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingOrderformDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.order.CancelOrderRequest;
import com.sanxia.market.dto.order.CreateOrderRequest;
import com.sanxia.market.dto.order.CreateOrderResponse;
import com.sanxia.market.dto.order.DeleteOrderRequest;
import com.sanxia.market.dto.order.GoodsCart;
import com.sanxia.market.dto.order.OrderGoods;
import com.sanxia.market.dto.order.QueryOrderDetailRequest;
import com.sanxia.market.dto.order.QueryOrderDetailResponse;
import com.sanxia.market.dto.order.QueryOrderRequest;
import com.sanxia.market.dto.order.QueryOrderResponse;
import com.sanxia.market.dto.order.StoreCart;
import com.sanxia.market.dto.order.TransportationExpensesRequest;
import com.sanxia.market.dto.order.TransportationExpensesResponse;
import com.sanxia.market.entity.ShoppingCartGsp;
import com.sanxia.market.entity.ShoppingGoods;
import com.sanxia.market.entity.ShoppingGoodscart;
import com.sanxia.market.entity.ShoppingOrderLog;
import com.sanxia.market.entity.ShoppingOrderform;
import com.sanxia.market.entity.ShoppingStorecart;
import com.sanxia.market.service.ShoppingCartGspService;
import com.sanxia.market.service.ShoppingGoodsService;
import com.sanxia.market.service.ShoppingGoodscartService;
import com.sanxia.market.service.ShoppingOrderLogService;
import com.sanxia.market.service.ShoppingOrderformService;
import com.sanxia.market.service.ShoppingStorecartService;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


 

 /**   
* @Title: ShoppingOrderformService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-06 11:02:39
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingOrderformServiceImpl")
public class ShoppingOrderformServiceImpl extends BaseServiceImpl<ShoppingOrderform>  implements ShoppingOrderformService{

	@Autowired
	private ShoppingOrderformDao dao;
	
	@Autowired
	private ShoppingOrderLogService shoppingOrderLogService;
	
    @Autowired
    private ShoppingStorecartService shoppingStorecartService;
    
    @Autowired
    private ShoppingGoodscartService shoppingGoodscartService;
    
    @Autowired
    private ShoppingCartGspService shoppingCartGspService;
    
    @Autowired
    private ShoppingGoodsService shoppingGoodsService;
	
	@Override
	@Transactional
	public ApiResult<CreateOrderResponse> createOrder(CreateOrderRequest pammermap) {
		ApiResult<CreateOrderResponse> rest=new ApiResult<CreateOrderResponse>();
		//校验数据
		String check=this.check(pammermap);
		if(!"success".equals(check)) {
			rest.setError_code(CodesEnum.FAIL0009.getCode());
			rest.setMessage(check);
			return rest;
		}
		
		//创建订单
		Map<String,String> map= this.createOrderList(pammermap);
		check=map.get("check");
		if(!"success".equals(check)) {
			rest.setError_code(CodesEnum.FAIL0009.getCode());
			rest.setMessage(map.get("check"));
			return rest;
		}
		String orderids =map.get("orderids");
		String allprice =map.get("allprice");
		String allShipPrice =map.get("allShipPrice");
		CreateOrderResponse resp=new CreateOrderResponse();
		resp.setOrder_ids(orderids);
		resp.setOrders_total(allprice);
		resp.setAllShipPrice(allShipPrice);
		rest.setData(resp);
		
		return rest;
	}
	/**
	 * 创建订单之前数据校验
	 */
	private String check(CreateOrderRequest pammermap) {
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("goodscart_ids", pammermap.getGoodscart_ids().split(","));
		Map<String,Object> priceMap=shoppingGoodscartService.ckeckTotalPrice(map);
		//System.out.println(priceMap.get("total_price"));
		if(!(Double.parseDouble(pammermap.getTotal_price())==Double.parseDouble(priceMap.get("total_price")+""))) {
			return "下单总价不正确";
		}
		return "success";
	}

	/**
	 * 创建订单
	 */
	private Map<String,String> createOrderList(CreateOrderRequest pammermap) {
		Map<String,String> map=new HashMap<String,String>();
		String user_id=pammermap.getUser_id();
		Long userId=Long.valueOf(user_id);
		List<StoreCart> storeCartlist=pammermap.getStoreCartList();
		String orderids="";
		String allprice="0";
		String allShipPrice="0";
		for (int i = 0; i < storeCartlist.size(); i++) {
			StoreCart storeCart=storeCartlist.get(i);
			ShoppingStorecart	shoppingStorecartold=shoppingStorecartService.getById(storeCart.getStorecart_id());
			ShoppingOrderform shoppingOrderform=new ShoppingOrderform();
			shoppingOrderform.setUserId(userId);
			shoppingOrderform.setAddTime(new Date());
			shoppingOrderform.setOrderStatus(10L);
			shoppingOrderform.setOrderType(pammermap.getOrder_type());
			shoppingOrderform.setAddrId(Long.parseLong(pammermap.getAddr_id()));
			shoppingOrderform.setMsg(pammermap.getMsg());
			shoppingOrderform.setInvoice(pammermap.getInvoice());
			shoppingOrderform.setInvoiceType(Long.parseLong(pammermap.getInvoiceType()));
			shoppingOrderform.setOrderId(NoCreate.createNoByUserId(user_id));
			shoppingOrderform.setStoreId(shoppingStorecartold.getStoreId());
			shoppingOrderform.setInvoiceType(0L);
			dao.insertOne(shoppingOrderform);
		//	System.out.println("shoppingOrderform.getId()="+shoppingOrderform.getId());
			ShoppingStorecart shoppingStorecart =new ShoppingStorecart();
			shoppingStorecart.setScStatus(1L);
			shoppingStorecart.setUserId(userId);
			shoppingStorecart.setStoreId(shoppingStorecartold.getStoreId());
			shoppingStorecart.setAddTime(new Date());
			shoppingStorecart.setTotalPrice(0.0);
			shoppingStorecartService.insertOne(shoppingStorecart);
			double goodsPrice=0.0;
			String goodsCartIds="";
			List<GoodsCart> goodscartlist=storeCart.getGoodscartList();
			for (int j = 0; j < goodscartlist.size(); j++) {
				GoodsCart	goodsCart=goodscartlist.get(j);
				goodsCartIds=goodsCartIds+goodsCart.getGoodscart_id()+",";
				ShoppingGoodscart shoppingGoodscart=shoppingGoodscartService.getById(goodsCart.getGoodscart_id());
				shoppingGoodscart.setScId(shoppingStorecart.getId());
				shoppingGoodscart.setOfId(shoppingOrderform.getId());
				shoppingGoodscartService.updateOne(shoppingGoodscart);
				goodsPrice=BigDecimal.valueOf(goodsPrice).add(BigDecimal.valueOf(shoppingGoodscart.getCount()).multiply(BigDecimal.valueOf(shoppingGoodscart.getPrice()))).doubleValue();
			}
			//获取运费
			BigDecimal shipPrice=null;
			if(StringUtil.isEmpty(goodsCartIds)) {
				shipPrice=new BigDecimal(0);
			}else {
				goodsCartIds= goodsCartIds.substring(0, goodsCartIds.length()-1);
				shipPrice=this.transportationExpenses(goodsCartIds);
			}
			shoppingStorecart.setTotalPrice(goodsPrice);
			shoppingStorecartService.updateOne(shoppingStorecart);
			//更新订单内容
			shoppingOrderform.setShipPrice(shipPrice.doubleValue());
			shoppingOrderform.setGoodsAmount(goodsPrice);
			shoppingOrderform.setTotalPrice(new BigDecimal(goodsPrice).add(shipPrice).doubleValue());
			dao.updateOne(shoppingOrderform);
			
			//删除对应的购物车中数据
			double oldprice=shoppingStorecartold.getTotalPrice();
			if(goodsPrice==oldprice) {
				shoppingStorecartService.delete(storeCart.getStorecart_id());
			}else {
				shoppingStorecartold.setTotalPrice(BigDecimal.valueOf(oldprice).subtract(BigDecimal.valueOf(goodsPrice)).doubleValue());
				shoppingStorecartService.updateOne(shoppingStorecartold);
			}
			orderids=orderids+shoppingOrderform.getId()+",";
			allprice=new BigDecimal(allprice).add(BigDecimal.valueOf(goodsPrice)).toString();
			allShipPrice=new BigDecimal(allShipPrice).add(shipPrice).toString();
			//添加订单操作日志
			ShoppingOrderLog shoppingOrderLog=new ShoppingOrderLog();
			shoppingOrderLog.setAddTime(new Date());
			shoppingOrderLog.setDeleteStatus(false);
			shoppingOrderLog.setLogInfo("用户下单");
			shoppingOrderLog.setLogUserId(userId);
			shoppingOrderLog.setOfId(shoppingOrderform.getId());
			shoppingOrderLogService.insertOne(shoppingOrderLog);
		}
		map.put("check", "success");
		map.put("orderids", orderids);
		map.put("allprice", allprice);
		map.put("allShipPrice", allShipPrice);
		return map;
	}
	
	/**
	 * 根据参数计算运费 goodscartids 多个参数以逗号切分(value = "运费类型（0买家承担1卖家承担）" ,dataType = "String") 
	private String goods_transfee;
	 */
	public BigDecimal transportationExpenses(String goodsCartIds) {
		if(StringUtil.isEmpty(goodsCartIds)) {
			return new BigDecimal(0);
		}
		String[] goods_ids=goodsCartIds.split(",");
		BigDecimal goods_transfee=new  BigDecimal(0);
		for (int i = 0; i < goods_ids.length; i++) {
			ShoppingGoodscart shoppingGoodscart=shoppingGoodscartService.getById(goods_ids[i]);
			ShoppingGoods shoppingGoods=shoppingGoodsService.getById(shoppingGoodscart.getGoodsId()+"");
			long goodsTransfee=shoppingGoods.getGoodsTransfee();
			if(0==goodsTransfee) {
				goods_transfee= goods_transfee.add(new  BigDecimal(0)) ;
			}else {
				goods_transfee= goods_transfee.add(new  BigDecimal(shoppingGoods.getExpressTransFee()).multiply(new BigDecimal(shoppingGoodscart.getCount())));
			}
		}
		return  goods_transfee;
	}
	
	@Override
	public ApiResult<List<QueryOrderResponse>> queryOrder(QueryOrderRequest pammermap) {
		ApiResult<List<QueryOrderResponse>> rest=new ApiResult<List<QueryOrderResponse>>();
		String begin_time= pammermap.getBegin_time();
		String end_time=pammermap.getEnd_time();
		String order_no=pammermap.getOrder_no();
		String order_status=pammermap.getOrder_status();
		String page=pammermap.getPage();
		String rows=pammermap.getRows();
		String user_id=pammermap.getUser_id();
		if(StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0100.getCode());
			rest.setMessage(CodesEnum.FAIL0100.getMsg());
			return rest;
		}
		Map<String, Object> map=new HashMap<String, Object>();
		if(null!=begin_time&&!"".equals(begin_time)) {
			map.put("begin_time", begin_time+" 00:00:00");
		}
		if(null!=end_time&&!"".equals(end_time)) {
			map.put("end_time", " 23:59:59");
		}
		if(null!=order_no&&!"".equals(order_no)) {
			map.put("order_no", order_no);
		}
		if(null!=order_status&&!"".equals(order_status)) {
			map.put("order_status", order_status);
		}
		map.put("user_id", user_id);
		map.put("pageFirst", Integer.parseInt(page)*Integer.parseInt(rows)-Integer.parseInt(rows));
		map.put("pageSize", Integer.parseInt(rows));
		List<QueryOrderResponse> list=dao.queryOrder(map);
		long total =dao.queryOrderlistPageCount(map);
		if(StringUtil.isEmpty(list)) {
			rest.setError_code(CodesEnum.FAIL0001.getCode());
			rest.setMessage(CodesEnum.FAIL0001.getMsg());
			return rest;
		}
		for (int i = 0; i < list.size(); i++) {
			map.clear();
			QueryOrderResponse res	=list.get(i);
			map.put("ofId", res.getId());
			List<OrderGoods> goodslist=shoppingGoodscartService.listByOrderGoods(map);
			res.setOrderGoodslist(goodslist);
			res.setOrders_total(total+"");
		}
		rest.setData(list);
		return rest;
	}
	@Override
	public ApiResult<String> cancelOrder(CancelOrderRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		 String user_id=pammermap.getUser_id();
		 String order_id=pammermap.getOrder_id();
		if(StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0100.getCode());
			rest.setMessage(CodesEnum.FAIL0100.getMsg());
			return rest;
		}
		
		if(StringUtil.isEmpty(order_id)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("order_id不能为空");
			return rest;
		}
		ShoppingOrderform shoppingOrderform=dao.getById(order_id);
		shoppingOrderform.setOrderStatus(0L);
		dao.updateOne(shoppingOrderform);
		return rest;
	}
	@Override
	public ApiResult<String> deleteOrder(DeleteOrderRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		 String user_id=pammermap.getUser_id();
		 String order_id=pammermap.getOrder_id();
		if(StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0100.getCode());
			rest.setMessage(CodesEnum.FAIL0100.getMsg());
			return rest;
		}
		
		if(StringUtil.isEmpty(order_id)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("order_id不能为空");
			return rest;
		}
		ShoppingOrderform shoppingOrderform=dao.getById(order_id);
		if(StringUtil.isEmpty(shoppingOrderform)) {
			rest.setError_code(CodesEnum.FAIL0006.getCode());
			rest.setMessage("order_id错误，查询数据异常");
			return rest;
		}
		//删除关联数据
		shoppingOrderLogService.deleteAlllog(order_id);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("ofId", order_id);
		List<ShoppingGoodscart> listgoodscart=shoppingGoodscartService.listBy(map);
		if(!StringUtil.isEmpty(listgoodscart)) {
		for (int i = 0; i < listgoodscart.size(); i++) {
			ShoppingGoodscart shoppingGoodscart=listgoodscart.get(i);
			shoppingCartGspService.delete(shoppingGoodscart.getId()+"");
			shoppingGoodscartService.delete(shoppingGoodscart.getId()+"");
		}
		}
		dao.delete(order_id);
		
		return rest;
	}
	@Override
	public ApiResult<QueryOrderDetailResponse> queryOrderDetail(QueryOrderDetailRequest pammermap) {
		ApiResult<QueryOrderDetailResponse> rest=new ApiResult<QueryOrderDetailResponse>();
		 String user_id=pammermap.getUser_id();
		 String order_id=pammermap.getOrder_id();
		if(StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0100.getCode());
			rest.setMessage(CodesEnum.FAIL0100.getMsg());
			return rest;
		}
		
		if(StringUtil.isEmpty(order_id)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage("order_id不能为空");
			return rest;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("order_id", order_id);
		QueryOrderDetailResponse queryOrderDetailResponse=dao.queryOrderDetail(map);
		map.clear();
		map.put("ofId", order_id);
		List<OrderGoods> goodslist=shoppingGoodscartService.listByOrderGoods(map);
		queryOrderDetailResponse.setOrderGoodsList(goodslist);
		rest.setData(queryOrderDetailResponse);
		return rest;
	}
	@Override
	public ApiResult<TransportationExpensesResponse> transportExpenses(TransportationExpensesRequest pammermap) {
		ApiResult<TransportationExpensesResponse> rest=new ApiResult<TransportationExpensesResponse>();
		String goodscart_ids=pammermap.getGoodscart_ids();
		String user_id=pammermap.getUser_id();
		BigDecimal shipprice=this.transportationExpenses(goodscart_ids);
		TransportationExpensesResponse resp=new TransportationExpensesResponse();
		resp.setGoodscart_ids(goodscart_ids);
		resp.setUser_id(user_id);
		resp.setShipPrice(shipprice.toString());
		return rest;
	}
	
	}
