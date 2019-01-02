package com.sanxia.common.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Tool {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map getMapByStr(String str, String split) {
		Map map = new LinkedHashMap();
		for (String s : str.split(split)) {
			String[] rst = s.split("=");
			map.put(rst[0], 1 == rst.length ? "" : rst[1]);
		}
		return map;
	}
	
	
	/**
	 * 把传递过来的map升序排序后返回List()类型数据
	 * @param map
	 * @return
	 */
	public static String valueUpSort(Map<String, Integer> map) {
		// 升序比较器
		Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue();
			}
		};
		// map转换成list进行排序
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		// 排序
		Collections.sort(list, valueComparator);
		List<String> upsortList = new LinkedList<String>();
		// 默认情况下，TreeMap对key进行升序排序
		//System.out.println("------------map按照value升序排序--------------------");
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			upsortList.add(entry.getKey());
		}
		return upsortList.get(0);
	}
	
}
