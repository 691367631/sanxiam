package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.market.dao.ShoppingGoodscartDao;
import com.sanxia.market.dto.ApiResult;
import com.sanxia.market.dto.goodscart.DeleteGoodsCartRequest;
import com.sanxia.market.dto.order.OrderGoods;
import com.sanxia.market.entity.ShoppingCartGsp;
import com.sanxia.market.entity.ShoppingGoodscart;
import com.sanxia.market.entity.ShoppingStorecart;
import com.sanxia.market.service.ShoppingCartGspService;
import com.sanxia.market.service.ShoppingGoodscartService;
import com.sanxia.market.service.ShoppingStorecartService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


 

 /**   
* @Title: ShoppingGoodscartService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-11-27 12:00:19
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingGoodscartServiceImpl")
public class ShoppingGoodscartServiceImpl extends BaseServiceImpl<ShoppingGoodscart>  implements ShoppingGoodscartService{

	@Autowired
	private ShoppingGoodscartDao dao;
	
	@Autowired
	private ShoppingCartGspService shoppingCartGspService;
	
	@Autowired
	private ShoppingStorecartService shoppingStorecartService;
	
	@Override
	@Transactional
	public ApiResult<String> deletegoodscart(DeleteGoodsCartRequest pammermap) {
		ApiResult<String> rest=new ApiResult<String>();
		ShoppingGoodscart shoppingGoodscart=dao.getById(pammermap.getGoodscart_id());
		if(null==shoppingGoodscart) {
			rest.setError_code("0001");
			rest.setMessage("goodscart_id 参数错误");
			return rest;
		}
		//涉及到的要删除的总金额
		BigDecimal money=BigDecimal.valueOf(shoppingGoodscart.getCount()).multiply(BigDecimal.valueOf(shoppingGoodscart.getPrice()));
		ShoppingStorecart shoppingStorecart=shoppingStorecartService.getById(shoppingGoodscart.getScId()+"");
		shoppingStorecart.setTotalPrice(BigDecimal.valueOf(shoppingStorecart.getTotalPrice()).subtract(money).doubleValue());
		shoppingStorecartService.updateOne(shoppingStorecart);
		
		shoppingCartGspService.delete(pammermap.getGoodscart_id());
		dao.delete(pammermap.getGoodscart_id());
		return rest;
	}

	@Override
	public Map<String,Object> ckeckTotalPrice(Map<String, Object> map) {
		
		return dao.ckeckTotalPrice(map);
	}

	@Override
	public List<OrderGoods> listByOrderGoods(Map<String, Object> map) {
		return dao.listByOrderGoods(map);
	}

	@Override
	public void deleteByOrderId(String order_id) {
		dao.deleteByOrderId(order_id);
	}


	}
