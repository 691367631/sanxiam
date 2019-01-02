package com.sanxia.market.service;
import java.util.List;
import java.util.Map;

import com.sanxia.common.core.service.BaseService;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goodscart.DeleteGoodsCartRequest;
import com.sanxia.market.dto.order.OrderGoods;
import com.sanxia.market.entity.ShoppingGoodscart;

 /**   
* @Title: ShoppingGoodscartService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-27 12:00:19
* @version V1.0   
* create by codeFactory
*/
public interface ShoppingGoodscartService extends BaseService<ShoppingGoodscart>{

	ApiResult<String> deletegoodscart(DeleteGoodsCartRequest pammermap);

	Map<String,Object> ckeckTotalPrice(Map<String, Object> map);

	List<OrderGoods> listByOrderGoods(Map<String, Object> map);

	void deleteByOrderId(String order_id);


	}
