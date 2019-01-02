package com.sanxia.market.service;
import java.util.List;
import java.util.Map;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.payment.paytype.PayAfter;
import com.sanxia.market.entity.ShoppingPaymentOrder;

 /**   
* @Title: ShoppingPaymentOrderService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-20 14:59:35
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingPaymentOrderService extends BaseService<ShoppingPaymentOrder>{

	Map<String, Object> payAfter(PayAfter payAfter);


	}
