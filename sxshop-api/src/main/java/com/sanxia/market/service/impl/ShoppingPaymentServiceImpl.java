package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.enums.CodesEnum;
import com.sanxia.common.enums.PayTypeEnum;
import com.sanxia.common.utils.CreateSignUtil;
import com.sanxia.common.utils.MD5Util;
import com.sanxia.common.utils.NoCreate;
import com.sanxia.common.utils.StringUtil;
import com.sanxia.market.dao.ShoppingPaymentDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.payment.OrderPayRequest;
import com.sanxia.market.dto.payment.OrderPayResponse;
import com.sanxia.market.dto.payment.PayRequest;
import com.sanxia.market.dto.payment.PaymentType;
import com.sanxia.market.dto.payment.QueryPayTypeRequest;
import com.sanxia.market.dto.payment.QueryPayTypeResponse;
import com.sanxia.market.dto.payment.paytype.Balance;
import com.sanxia.market.dto.payment.paytype.PayAfter;
import com.sanxia.market.dto.payment.paytype.PayParameter;
import com.sanxia.market.entity.ShoppingOrderform;
import com.sanxia.market.entity.ShoppingPayment;
import com.sanxia.market.entity.ShoppingPaymentOrder;
import com.sanxia.market.entity.ShoppingUserToken;
import com.sanxia.market.service.ShoppingOrderformService;
import com.sanxia.market.service.ShoppingPaymentOrderService;
import com.sanxia.market.service.ShoppingPaymentService;
import com.sanxia.market.service.ShoppingUserTokenService;
import com.sanxia.market.service.payservice.BalancePaymentServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


 

 /**   
* @Title: ShoppingPaymentService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-07 13:37:21
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingPaymentServiceImpl")
public class ShoppingPaymentServiceImpl extends BaseServiceImpl<ShoppingPayment>  implements ShoppingPaymentService{

	@Autowired
	private ShoppingPaymentDao dao;
	
	@Autowired
	private ShoppingPaymentOrderService shoppingPaymentOrderService;
	
	@Autowired
	private ShoppingOrderformService shoppingOrderformService;
	
	@Autowired
	private ShoppingUserTokenService shoppingUserTokenService;
	
	@Autowired
	private BalancePaymentServiceImpl balancePaymentServiceImpl;
	
	@Override
	public ApiResult<List<QueryPayTypeResponse>> queryPayType(QueryPayTypeRequest pammermap) {
		ApiResult<List<QueryPayTypeResponse>>  rest =new ApiResult<List<QueryPayTypeResponse>>();
		String platform =pammermap.getPlatform();
		String type=pammermap.getType();
		String store_id=pammermap.getStore_id();
		PaymentType paymentType=new PaymentType();
		paymentType.setPlatform(platform);
		List<String> marklist=paymentType.getMarklist();
		if(StringUtil.isEmpty(marklist)) {
			rest.setError_code("0001");
			rest.setMessage("platform 传入值错误");
			return rest;
		}
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("install", "1");
		map.put("type", type);
		map.put("storeId", store_id);
		List<ShoppingPayment> list=dao.listBy(map);
		List<QueryPayTypeResponse> listrest =new  ArrayList<QueryPayTypeResponse>();
		loop1:for (int i = 0; i < marklist.size(); i++) {
			String mark=marklist.get(i);
		 	for (int j = 0; j < list.size(); j++) {
				System.out.println("j="+j);
				ShoppingPayment shoppingPayment=list.get(j);
				if(mark.equals(shoppingPayment.getMark())) {
					QueryPayTypeResponse queryPayTypeResponse =new QueryPayTypeResponse();
					queryPayTypeResponse.setMark(shoppingPayment.getMark());
					queryPayTypeResponse.setMarkName(shoppingPayment.getName());
					queryPayTypeResponse.setPayTypeId(shoppingPayment.getId()+"");
					listrest.add(queryPayTypeResponse);
					continue loop1;
				}
				
			}
			
		}
		
		rest.setData(listrest);
		return rest;
	}
	@Override
	public ApiResult<OrderPayResponse> orderPay(OrderPayRequest pammermap) {
		ApiResult<OrderPayResponse>  rest=new ApiResult<OrderPayResponse> ();
		String mark=pammermap.getMark();
		String order_ids=pammermap.getOrder_ids();
		String payTypeId=pammermap.getPayTypeId();
		String user_id=pammermap.getUser_id();
		
		//支付前校验
		rest=this.payCheck(pammermap);
		if(!CodesEnum.SUCCESS.getCode().equals(rest.getError_code())) {
			return rest;
		}
		//创建支付流水
		Map<String,String> map=this.createPayment(pammermap);
		if(!"0000".equals(map.get("code"))) {
			rest.setError_code(CodesEnum.FAIL0101.getCode());
			rest.setError_code(CodesEnum.FAIL0101.getMsg());
			return rest;
		}

		//根据不同的支付类型拼接返回
		rest=this.apiResulBypayType(pammermap, map);
				
		return rest;
	}

	/**
	 * 创建支付流水
	 */
	private Map<String,String> createPayment(OrderPayRequest pammermap) {
		Map<String,String> map =new HashMap<String,String>();
		String mark=pammermap.getMark();
		String order_ids=pammermap.getOrder_ids();
		String payTypeId=pammermap.getPayTypeId();
		String user_id=pammermap.getUser_id();
		String[] orderIds=order_ids.split(",");
		double totalPrice=0.0;
		for (int i = 0; i < orderIds.length; i++) {
			ShoppingOrderform shoppingOrderform=shoppingOrderformService.getById(orderIds[i]);
			totalPrice=	BigDecimal.valueOf(totalPrice).add(BigDecimal.valueOf(shoppingOrderform.getTotalPrice())).doubleValue();
		}
		String paymentOrderNo=NoCreate.createNoByUserId(user_id);
		ShoppingPaymentOrder shoppingPaymentOrder=new ShoppingPaymentOrder();
		shoppingPaymentOrder.setOrderIds(order_ids);
		shoppingPaymentOrder.setMark(mark);
		shoppingPaymentOrder.setAddTime(new Date());
		shoppingPaymentOrder.setPaymentOrderNo(paymentOrderNo);
		shoppingPaymentOrder.setPayStatus(0);
		shoppingPaymentOrder.setUserId(user_id);
		shoppingPaymentOrder.setTotalPrice(totalPrice);
		shoppingPaymentOrder.setReserve1(payTypeId);
		shoppingPaymentOrderService.insertOne(shoppingPaymentOrder);
		map.put("code", "0000");
		map.put("msg", "创建成功");
		map.put("paymentOrderNo", paymentOrderNo);
		map.put("totalPrice", totalPrice+"");
		return map;
	}

	
	
	/**
	 * 支付前校验
	 */
	private ApiResult<OrderPayResponse> payCheck(OrderPayRequest pammermap){
		ApiResult<OrderPayResponse> rest=new ApiResult<OrderPayResponse>();
		String mark=pammermap.getMark();
		String order_ids=pammermap.getOrder_ids();
		String payTypeId=pammermap.getPayTypeId();
		String user_id=pammermap.getUser_id();
		if(StringUtil.isEmpty(mark)||StringUtil.isEmpty(order_ids)||StringUtil.isEmpty(payTypeId)||StringUtil.isEmpty(user_id)) {
			rest.setError_code(CodesEnum.FAIL0002.getCode());
			rest.setMessage(CodesEnum.FAIL0002.getMsg());
			return rest;
		}
		
		
		
		return rest;
	}
	
	/**
	 * 根据不同的支付类型拼接返回
	 */
	private ApiResult<OrderPayResponse> apiResulBypayType(OrderPayRequest pammermap,Map<String,String> map){
		ApiResult<OrderPayResponse>  rest=new ApiResult<OrderPayResponse> ();
		OrderPayResponse orderPayResponse=new OrderPayResponse();
		String paymentOrderNo=map.get("paymentOrderNo");
		String totalPrice=map.get("totalPrice");
		String mark=pammermap.getMark();
		String order_ids=pammermap.getOrder_ids();
		String payTypeId=pammermap.getPayTypeId();
		String user_id=pammermap.getUser_id();
		PayParameter parameter =new PayParameter();
		parameter.setMark(mark);
		parameter.setPaymentOrderNo(paymentOrderNo);
		parameter.setTotalPrice(totalPrice);//此处金额以元为单位
		parameter.setUser_id(user_id);
		if(PayTypeEnum.balance.getCode().equals(mark)) {
			//下面这段应该放到一个类里
			SortedMap<String, Object> sortmap=balancePaymentServiceImpl.payParameters(parameter);
			Balance balance=new Balance();
			balance.setMark(mark);
			balance.setPaymentOrderNo(paymentOrderNo);
			balance.setTotalPrice(totalPrice);
			balance.setUser_id(user_id);
			balance.setSign(sortmap.get("sign")+"");
			orderPayResponse.setBalance(balance);
			rest.setData(orderPayResponse);
			return rest;
		}else {
			
			rest.setError_code( CodesEnum.FAIL0200.getCode());
			rest.setMessage(CodesEnum.FAIL0200.getMsg());
			return rest;
		}
	}
	@Override
	@Transactional
	public ApiResult<String> pay(PayRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		String mark=pammermap.getMark();
		String paymentOrderNo=pammermap.getPaymentOrderNo();
		String payTypeid=pammermap.getPayTypeId();
		String sign=pammermap.getSign();
		String user_id=pammermap.getUser_id();
		String validate_code=pammermap.getValidate_code();
		Map<String,Object> map=null;
		if(PayTypeEnum.balance.getCode().equals(mark)) {
			 map=balancePaymentServiceImpl.pay(pammermap);
		}else {
			rest.setError_code(CodesEnum.FAIL0200.getCode());
			rest.setMessage(CodesEnum.FAIL0200.getMsg());
			return rest;
		}
		if(StringUtil.isEmpty(map)||!CodesEnum.SUCCESS.getCode().equals(map.get("code"))) {
			rest.setError_code(CodesEnum.FAIL0004.getCode());
			rest.setMessage("支付失败");
			//此处增加支付失败处理
			
			return rest;
		}
		
		
		return rest;
	}
	}
