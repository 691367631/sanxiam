
package com.sanxia.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public enum IconClsEnum {

	综合演示("fa fa-heartbeat"),
	表单组件("fa fa-bank"),
	表格和树("fa fa-table"),
	菜单按钮("fa fa-list"),
	图形报表("fa fa-bar-chart"),
	基础表单演示("fa fa-sitemap"),
	文件形式(""),
	扩展组件("fa fa-map");

	/** 描述 */
	private String desc;

	private IconClsEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public static Map<String, Map<String, Object>> toMap() {
		IconClsEnum[] ary = IconClsEnum.values();
		Map<String, Map<String, Object>> enumMap = new HashMap<String, Map<String, Object>>();
		for (int num = 0; num < ary.length; num++) {
			Map<String, Object> map = new HashMap<String, Object>();
			String key = ary[num].name();
			map.put("value", ary[num].name());
			map.put("desc", ary[num].getDesc());
			enumMap.put(key, map);
		}
		return enumMap;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List toList() {
		IconClsEnum[] ary = IconClsEnum.values();
		List list = new ArrayList();
		for (int i = 0; i < ary.length; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("code", ary[i].getDesc());
			map.put("ss", ary[i].name());
			list.add(map);
		}
		return list;
	}

	public static IconClsEnum getEnum(String name) {
		IconClsEnum[] arry = IconClsEnum.values();
		for (int i = 0; i < arry.length; i++) {
			if (arry[i].name().equalsIgnoreCase(name)) {
				return arry[i];
			}
		}
		return null;
	}

	/**
	 * 取枚举的json字符串
	 * 
	 * @return
	 */
	public static String getJsonStr() {
		IconClsEnum[] enums = IconClsEnum.values();
		StringBuffer jsonStr = new StringBuffer("[");
		for (IconClsEnum senum : enums) {
			if (!"[".equals(jsonStr.toString())) {
				jsonStr.append(",");
			}
			jsonStr.append("{id:'").append(senum).append("',desc:'").append(senum.getDesc()).append("'}");
		}
		jsonStr.append("]");
		return jsonStr.toString();
	}

}
