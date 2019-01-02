package com.sanxia.common.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;





public class CreateSignUtil {


	/** 
	 * 支付签名算法sign 
	 * @param characterEncoding    编码集   UTF-8
	 * @param parameters           传入的有序map
	 * @param key                  传入的秘钥
	 * @return 
	 */  
	@SuppressWarnings({ "rawtypes" })  
	public static String createSignBalance(String characterEncoding,SortedMap<String,Object> parameters,String pkey){  
		StringBuffer sb = new StringBuffer();  
		Set es = parameters.entrySet();//所有参与传参的参数按照accsii排序（升序）  
		Iterator it = es.iterator();  
		while(it.hasNext()) {  
			Map.Entry entry = (Map.Entry)it.next();  
			String k = (String)entry.getKey();  
			Object v = entry.getValue();  
			if(null != v && !"".equals(v)   
					&& !"sign".equals(k) && !"key".equals(k)) {  
				sb.append(k + "=" + v + "&");  
			}  
		}  
		sb.append("key=" + pkey);  
		String sign = MD5Util.MD5Encode(sb.toString(), characterEncoding).toUpperCase();
		return sign;  
	}  



	/** 
	 * 支付签名算法sign 
	 * @param characterEncoding    编码集   UTF-8
	 * @param parameters           传入的有序map
	 * @param key                  传入的秘钥
	 * @return 
	 */  
	@SuppressWarnings({ "rawtypes" })  
	public static String createSignnotity(String characterEncoding,Map<String,Object> parameter,String pkey){  
		 SortedMap<String, Object> parameters = new TreeMap<String, Object>();
		 Set e = parameter.entrySet();//所有参与传参的参数按照accsii排序（升序）  
			Iterator i = e.iterator();  
			while(i.hasNext()) {  
				Map.Entry entry = (Map.Entry)i.next();  
				String k = (String)entry.getKey();  
				Object v = entry.getValue();  
				if(null != v && !"".equals(v)   
						&& !"sign".equals(k) && !"key".equals(k)) {  
					parameters.put(k, v);
				}  
			}  
		
		StringBuffer sb = new StringBuffer();  
		Set es = parameters.entrySet();//所有参与传参的参数按照accsii排序（升序）  
		Iterator it = es.iterator();  
		while(it.hasNext()) {  
			Map.Entry entry = (Map.Entry)it.next();  
			String k = (String)entry.getKey();  
			Object v = entry.getValue();  
			if(null != v && !"".equals(v)   
					&& !"sign".equals(k) && !"key".equals(k)) {  
				sb.append(k + "=" + v + "&");  
			}  
		}  
		sb.append("key=" + pkey);  
		String sign = MD5Util.MD5Encode(sb.toString(), characterEncoding).toUpperCase();
		return sign;  
	}  

}
