package com.sanxia.market.service.payservice;

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
import com.sanxia.market.entity.ShoppingPredepositLog;
import com.sanxia.market.entity.ShoppingUser;
import com.sanxia.market.entity.ShoppingUserToken;
import com.sanxia.market.service.ShoppingOrderformService;
import com.sanxia.market.service.ShoppingPaymentOrderService;
import com.sanxia.market.service.ShoppingPaymentService;
import com.sanxia.market.service.ShoppingPredepositLogService;
import com.sanxia.market.service.ShoppingUserService;
import com.sanxia.market.service.ShoppingUserTokenService;

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


 

 /**   
* @Title: ShoppingPaymentService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-07 13:37:21
* @version V1.0   
* create by codeFactory
*/
@Service("BalancePaymentServiceImpl")
public class BalancePaymentServiceImpl  {

	@Autowired
	private ShoppingUserService shoppingUserService;
	
	@Autowired
	private ShoppingPaymentOrderService shoppingPaymentOrderService;
	
	@Autowired
	private ShoppingOrderformService shoppingOrderformService;
	
	@Autowired
	private ShoppingPredepositLogService shoppingPredepositLogService;
	
	@Autowired
	private ShoppingUserTokenService shoppingUserTokenService;
	

	public SortedMap<String, Object> payParameters (PayParameter parameter){
		SortedMap<String, Object> parameters = new TreeMap<String, Object>();
		parameters.put("mark", parameter.getMark());
		parameters.put("paymentOrderNo", parameter.getPaymentOrderNo());
		parameters.put("totalPrice", parameter.getTotalPrice());
		parameters.put("user_id", parameter.getUser_id());
		System.out.println(parameter.getUser_id());
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("userId", parameter.getUser_id());
		ShoppingUserToken shoppingUserToken=shoppingUserTokenService.getBy(map);
		if(StringUtil.isEmpty(shoppingUserToken)) {
			System.out.println("shoppingUserToken is null");
		}
		String sign=CreateSignUtil.createSignBalance("UTF-8", parameters, shoppingUserToken.getToken());
		parameters.put("sign", sign);
		return parameters;
	}


	public Map<String, Object> pay(PayRequest pammermap) {
		
		//验证签名
		Map<String,Object> map =this.payCheck(pammermap);
		if(!CodesEnum.SUCCESS.getCode().equals(map.get("code"))) {
			return map;
		}
		
		//进行支付扣款
		ShoppingUser shoppingUser=shoppingUserService.getById(pammermap.getUser_id());
		double availableBalance=0.0;
		if(null==shoppingUser.getAvailableBalance()||0.0>=shoppingUser.getAvailableBalance()) {
				map.put("code", CodesEnum.FAIL0102.getCode());
				map.put("msg", CodesEnum.FAIL0102.getMsg());
				return map;
		}else {
			availableBalance=shoppingUser.getAvailableBalance();
		}
		ShoppingPaymentOrder shoppingPaymentOrder=shoppingPaymentOrderService.getById(pammermap.getPaymentOrderNo());
		double balance=BigDecimal.valueOf(availableBalance).subtract(BigDecimal.valueOf(shoppingPaymentOrder.getTotalPrice())).doubleValue();
		if(balance<0) {
			map.put("code", CodesEnum.FAIL0102.getCode());
			map.put("msg", CodesEnum.FAIL0102.getMsg());
			return map;
		}
		
		shoppingUser.setAvailableBalance(balance);
		shoppingUserService.updateOne(shoppingUser);
		//保存日志
		ShoppingPredepositLog shoppingPredepositLog=new ShoppingPredepositLog();
		shoppingPredepositLog.setAddTime(new Date());
		shoppingPredepositLog.setDeleteStatus(false);
		shoppingPredepositLog.setPdLogAmount(shoppingPaymentOrder.getTotalPrice());
		shoppingPredepositLog.setPdLogInfo("订单"+shoppingPaymentOrder.getOrderIds()+"购物减少可用预存款");
		shoppingPredepositLog.setPdLogUserId(shoppingUser.getId());
		shoppingPredepositLog.setPdOpType("消费");
		shoppingPredepositLog.setPdType("可用预存款");
		shoppingPredepositLogService.insertOne(shoppingPredepositLog);
		
		//本平台内部支付进行支付成功后的处理（第三方支付等待回调处理）
		String code=map.get("code").toString();
		String thirdPartyNo =pammermap.getPaymentOrderNo();
		PayAfter payAfter=new PayAfter();
		payAfter.setCode("1");
		payAfter.setMsg("预付款支付成功");
		payAfter.setPaymentOrderNo(pammermap.getPaymentOrderNo());
		payAfter.setThirdPartyNo(thirdPartyNo);
		map=shoppingPaymentOrderService.payAfter(payAfter);
		
		return map;
	}
	
	private Map<String,Object> payCheck(PayRequest pammermap){
		Map<String,Object> map=new HashMap<String,Object>();
		String mark=pammermap.getMark();
		String paymentOrderNo=pammermap.getPaymentOrderNo();
		String payTypeid=pammermap.getPayTypeId();
		String sign=pammermap.getSign();
		String user_id=pammermap.getUser_id();
		String validate_code=pammermap.getValidate_code();
		
		SortedMap<String, Object> parameters = new TreeMap<String, Object>();
		parameters.put("mark", mark);
		parameters.put("paymentOrderNo", paymentOrderNo);
		parameters.put("payTypeId", payTypeid);
		parameters.put("user_id", user_id);
		parameters.put("validate_code", validate_code);
		Map<String,Object> maptoken=new HashMap<String,Object>();
		maptoken.put("userId", user_id);
		ShoppingUserToken shoppingUserToken=shoppingUserTokenService.getBy(maptoken);
		String signmi=CreateSignUtil.createSignBalance("UTF-8", parameters, shoppingUserToken.getToken());
		/*if(!signmi.equals(sign)) {
			map.put("code", CodesEnum.FAIL0008.getCode());
			map.put("msg", CodesEnum.FAIL0008.getMsg());
			return map;
		}*/
		
		map.put("code", CodesEnum.SUCCESS.getCode());
		map.put("msg", CodesEnum.SUCCESS.getMsg());
		return map;
		
	}
	
	}
