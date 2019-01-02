package com.sanxia.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;


/**
 * @Title:获取配置文件
 * @Author:gaoshicheng
 * @Datetime:2016年11月16日上午10:19:25
 */
public class PropertiesConfigUtil {
	
	private static Logger logger = Logger.getLogger(PropertiesConfigUtil.class);
//	
//	/**
//	 * @Title:通用可获取全部Properties配置文件
//	 * @Author:gaoshicheng
//	 * @Param:@param propertiesName文件名称
//	 * @Param:@param propertiesKey获取KEY
//	 * @Param:@return
//	 * @Return:String
//	 */
//	public static String getPropertiesValue(String propertiesName, String propertiesKey) {
//		Properties properties = new Properties();
//		InputStream in = properties.getClass().getResourceAsStream("/"+propertiesName+".properties");
//		String propertiesValue = "";
//		try {
//			properties.load(in);
//			propertiesValue = properties.getProperty(propertiesKey);
//		} catch (IOException e) {
//			logger.error("加载"+propertiesName+".properties配置文件失败", e);
//		} finally {
//			try {
//				if(in!=null){
//				in.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return propertiesValue;
//	}
	
	
	 private static Properties properties = new Properties();

	    private PropertiesConfigUtil() {

	    }

	    // 通过类装载器装载进来
	    static {
	        try {
	            // 从类路径下读取属性文件
	            properties.load(PropertiesConfigUtil.class.getClassLoader()
	                    .getResourceAsStream("properties_config.properties"));
	        } catch (IOException e) {
	        	logger.error(e);
	        }
	    }

	    /**
	     * 函数功能说明 ：读取配置项 Administrator 2012-12-14 修改者名字 ： 修改日期 ： 修改内容 ：
	     *
	     * @参数：
	     * @return void
	     * @throws
	     */
	    public static String readConfig(String key) {
	        return (String) properties.get(key);
	    }
}
