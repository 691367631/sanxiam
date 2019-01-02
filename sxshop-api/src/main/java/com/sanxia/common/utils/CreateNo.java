package com.sanxia.common.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class CreateNo {
	/**
	 * 生成的数值理论上会重复，只是有一个界限值。(后期可以优化)
	 * @return
	 */
	
	public static synchronized String  cerateNo(){
		//格式化当前时间
				SimpleDateFormat sfDate = new SimpleDateFormat("yyyyMMddHHmmssSSS");
				String strDate = sfDate.format(new Date());
				//得到17位时间如：20170411094039080
				System.out.println("时间17位：" + strDate);
				//为了防止高并发重复,再获取3个随机数
				String random = getRandom620(3);
				//最后得到20位订单编号。
				return strDate + random;
	}
	
	
	/**
	 * 获取6-10 的随机位数数字
	 * @param length	想要生成的长度
	 * @return result
	 */
	public static  String getRandom620(Integer length) {
		String result = "";
		Random rand = new Random();
		int n = 20;
		if (null != length && length > 0) {
			n = length;
		}
		int randInt = 0;
		for (int i = 0; i < n; i++) {
			randInt = rand.nextInt(10);
			result += randInt;
		}
		return result;
	}
}
