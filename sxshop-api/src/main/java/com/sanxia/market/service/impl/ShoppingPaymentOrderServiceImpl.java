package com.sanxia.market.service.impl;

import com.sanxia.common.core.service.BaseServiceImpl;
import com.sanxia.common.enums.CodesEnum;
import com.sanxia.common.enums.OrderStatusEnum;
import com.sanxia.common.utils.JSONUtils;
import com.sanxia.common.utils.JsonUtil;
import com.sanxia.market.dao.ShoppingPaymentOrderDao;
import com.sanxia.market.dto.payment.paytype.PayAfter;
import com.sanxia.market.entity.GoodsInventoryDetail;
import com.sanxia.market.entity.ShoppingCartGsp;
import com.sanxia.market.entity.ShoppingGoods;
import com.sanxia.market.entity.ShoppingGoodscart;
import com.sanxia.market.entity.ShoppingOrderform;
import com.sanxia.market.entity.ShoppingPaymentOrder;
import com.sanxia.market.service.ShoppingCartGspService;
import com.sanxia.market.service.ShoppingGoodsService;
import com.sanxia.market.service.ShoppingGoodscartService;
import com.sanxia.market.service.ShoppingOrderformService;
import com.sanxia.market.service.ShoppingPaymentOrderService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


 

 /**   
* @Title: ShoppingPaymentOrderService.java 
* @Package com.sanxia.market.service
* @Description: 
* @author 赵贯男
* @date 2018-12-20 14:59:35
* @version V1.0   
* create by codeFactory
*/
@Service("ShoppingPaymentOrderServiceImpl")
public class ShoppingPaymentOrderServiceImpl extends BaseServiceImpl<ShoppingPaymentOrder>  implements ShoppingPaymentOrderService{

	@Autowired
	private ShoppingPaymentOrderDao dao;
	
	@Autowired
	private ShoppingOrderformService shoppingOrderformService;
	
	@Autowired
	private ShoppingGoodscartService shoppingGoodscartService;
	
	@Autowired
	private ShoppingGoodsService shoppingGoodsService;
	
	@Autowired
	private ShoppingCartGspService shoppingCartGspService;
	
	@Override
	public Map<String, Object> payAfter(PayAfter payAfter) {
		String code=payAfter.getCode();
		//支付失败
		if(!"1".equals(code)) {
			return this.payFail(payAfter);
		}
		
		//支付成功
		return this.paySuccess(payAfter);
	}

	//支付成功处理
	private Map<String,Object> paySuccess(PayAfter payAfter){
		Map<String,Object> map=new HashMap<String,Object>();
		String code=payAfter.getCode();
		String msg=payAfter.getMsg();
		String paymentOrderNo= payAfter.getPaymentOrderNo();
		String thirdPartyNo= payAfter.getThirdPartyNo();
		ShoppingPaymentOrder shoppingPaymentOrder=dao.getById(paymentOrderNo);
		String orderIds=shoppingPaymentOrder.getOrderIds();
		String[] order_ids=orderIds.split(",");
		for (int i = 0; i < order_ids.length; i++) {
			this.onlyOrderform(order_ids[i]);
		}
		
		
		//更改支付流水状态
		shoppingPaymentOrder.setPayStatus(Integer.parseInt(code));
		shoppingPaymentOrder.setThirdPartyNo(thirdPartyNo);
		shoppingPaymentOrder.setPayOrderDesc(msg);
		dao.updateOne(shoppingPaymentOrder);
		map.put("code",CodesEnum.SUCCESS.getCode() );
		map.put("msg", "处理成功");
		return map;
	}
	
	//支付失败处理
	private Map<String,Object> payFail(PayAfter payAfter){
		Map<String,Object> map=new HashMap<String,Object>();
		String code=payAfter.getCode();
		String msg=payAfter.getMsg();
		String paymentOrderNo= payAfter.getPaymentOrderNo();
		String thirdPartyNo= payAfter.getThirdPartyNo();
		ShoppingPaymentOrder shoppingPaymentOrder=dao.getById(paymentOrderNo);
		shoppingPaymentOrder.setPayStatus(Integer.parseInt(code));
		shoppingPaymentOrder.setThirdPartyNo(thirdPartyNo);
		shoppingPaymentOrder.setPayOrderDesc(msg);
		dao.updateOne(shoppingPaymentOrder);
		map.put("code",CodesEnum.SUCCESS.getCode() );
		map.put("msg", "处理成功");
		return map;
	}

	/**
	 * 单个订单状态处理及商品库存更改
	 */
	private Map<String,Object> onlyOrderform (String order_id){
		ShoppingOrderform shoppingOrderform=shoppingOrderformService.getById(order_id);
		shoppingOrderform.setOrderStatus(Long.valueOf(OrderStatusEnum.payed.getCode()));
		shoppingOrderformService.updateOne(shoppingOrderform);
		
		//修改库存
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("ofId", order_id);
		List<ShoppingGoodscart> list=shoppingGoodscartService.listBy(map);
		for (int i = 0; i < list.size(); i++) {
			ShoppingGoodscart shoppingGoodscart	=list.get(i);
			String goodsId=shoppingGoodscart.getGoodsId()+"";
			ShoppingGoods shoppingGoods=shoppingGoodsService.getById(goodsId);
			String inventory_type=shoppingGoods.getInventoryType();
			if("all".equals(inventory_type)) {//all为不区分规格，走总库存
				shoppingGoods.setGoodsInventory(BigDecimal.valueOf(shoppingGoods.getGoodsInventory()).subtract(BigDecimal.valueOf(shoppingGoodscart.getCount())).longValue());
				shoppingGoodsService.updateOne(shoppingGoods);
			}
			if("spec".equals(inventory_type)) {//spec为根据规格取库存和价格
				map.clear();
				map.put("cartId", shoppingGoodscart.getId()+"");
				List<ShoppingCartGsp> listcartGsp =shoppingCartGspService.listBy(map);
				String gspids="";
				for (int j = 0; j < listcartGsp.size(); j++) {
					gspids=gspids+listcartGsp.get(j).getGspId()+",";
				}
				String goodsInventoryDetail=""+shoppingGoods.getGoodsInventoryDetail()+"";
				System.out.println("goodsInventoryDetail="+goodsInventoryDetail);
				List<GoodsInventoryDetail>listdetail=(ArrayList<GoodsInventoryDetail>) JsonUtil.jsonStr2List(goodsInventoryDetail,GoodsInventoryDetail.class );
				String[]gsp_ids =gspids.split(",");
				
				for (int j = 0; j < listdetail.size(); j++) {
					System.out.println(listdetail.get(j));
					GoodsInventoryDetail	goodsInventory= listdetail.get(j);
					String[] temp_ids= goodsInventory.getId().split("_");
					Arrays.sort(gsp_ids);
			        Arrays.sort(temp_ids);
			        if (Arrays.equals(gsp_ids, temp_ids)) {
			        	goodsInventory.setCount(new  BigDecimal(goodsInventory.getCount()).subtract(new BigDecimal(shoppingGoodscart.getCount())).toString());
			        }
				}
				String goodsInventoryDetailnew=JSONUtils.toJSONString(listdetail);
				System.out.println("goodsInventoryDetailnew="+goodsInventoryDetailnew);
				shoppingGoods.setGoodsInventoryDetail(goodsInventoryDetailnew);
				shoppingGoods.setGoodsInventory(BigDecimal.valueOf(shoppingGoods.getGoodsInventory()).subtract(BigDecimal.valueOf(shoppingGoodscart.getCount())).longValue());
				shoppingGoodsService.updateOne(shoppingGoods);
			}
		}
		
		return null;
		
	}
	}
