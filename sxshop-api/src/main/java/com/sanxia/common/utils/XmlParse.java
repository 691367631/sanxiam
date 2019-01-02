package com.sanxia.common.utils;



import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class XmlParse {

	
	@SuppressWarnings("unchecked")
	public static String xml2JSON(String xml) {
		JSONObject obj = new JSONObject();
		obj.accumulateAll(xml2Map(xml));
		return obj.toString();
	}

	public static Map<String,Object> xml2Map(String xml) {
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			InputStream is = new ByteArrayInputStream(xml.getBytes("utf-8"));
			SAXBuilder sb = new SAXBuilder();
			Document doc = sb.build(is);
			Element root = doc.getRootElement();
			map.put(root.getName(), iterateElement(root));

		} catch (Exception e) {
			System.err.println("Xml2Map Exception:"+ e);
		}
		return map;
	}

	public static Map<String,Object> xml2String(String xml) {
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			InputStream is = new ByteArrayInputStream(xml.getBytes("utf-8"));
			SAXBuilder sb = new SAXBuilder();
			Document doc = sb.build(is);
			Element root = doc.getRootElement();
			map.put(root.getName(), root.getText());

		} catch (Exception e) {
			System.err.println("Xml2Map Exception:"+ e);
		}
		return map;
	}

	private static Map<String,Object> iterateElement(Element element) {
		List node = element.getChildren();
		Element et = null;
		Map<String,Object> obj = new HashMap<String,Object>();
		List list = null;
		for (int i = 0; i < node.size(); i++) {
			list = new LinkedList();
			et = (Element) node.get(i);
			if (et.getTextTrim().equals("")) {

				if (0 < et.getChildren().size()) {
					list.add(iterateElement(et));
				} else {
					list.add("");
				}
			} else {
				list.add(et.getTextTrim());
			}

			if (obj.containsKey(et.getName())) {
				if (obj.get(et.getName()) instanceof List) {
					list.addAll((List)obj.get(et.getName()));
				} else {
					list.add(obj.get(et.getName()));
				}
			}
			
			if (1 < list.size()) {
				obj.put(et.getName(), list);
			} else {
				obj.put(et.getName(), list.get(0));
			}

		}
		return obj;
	}

	public static String mapToXml(Map<String,Object> obj,String rootName) throws IOException{
		Document doc=new Document();
		Element root = new Element(rootName); 
		doc.setRootElement(root);
		iterateMapToDoc(obj,root);
		Format format = Format.getPrettyFormat();     
        format.setEncoding("UTF-8");// 设置xml文件的字符为UTF-8，解决中文问题     
        XMLOutputter xmlout = new XMLOutputter(format);     
        ByteArrayOutputStream bo = new ByteArrayOutputStream();     
        xmlout.output(doc, bo);     
        return bo.toString();     
	}
	
	private static void iterateMapToDoc(Map<String,Object> obj,Element ele){
		Object currObj=null;
		Element currEle = null; 
		
		for(Map.Entry<String, Object> me:obj.entrySet()){
			currObj=me.getValue();
			currEle=new Element(me.getKey());
			if(currObj instanceof Map){
				iterateMapToDoc((Map<String, Object>) currObj,currEle);
			}else{
				currEle.setText(currObj.toString());
			}
			ele.addContent(currEle);
		}
	}
	

	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<String,Object>();
		
		map.put("name", "赵贯男");
		map.put("age", "21");
		
		Map<String,Object> cmap=new HashMap<String,Object>();
		cmap.put("city", "beijing");
		cmap.put("province", "shijiangshan");
		map.put("addr", cmap);
		String xmlstr="";
		try {
			xmlstr=mapToXml(map,"string");
			System.out.println(xmlstr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(xml2Map(xmlstr).get("string"));
	}
}

