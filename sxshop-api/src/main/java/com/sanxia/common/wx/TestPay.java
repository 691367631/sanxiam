package com.sanxia.common.wx;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;



public class TestPay {

	
	
	public static void main(String[] args) throws IOException {
//		String url="https://api.mch.weixin.qq.com/pay/unifiedorder";
//		String key="5A11D6A13AEC422BB2ADD7ABE38754C3";
//		String appid="wx9776777eb68c78d7";//wx9776777eb68c78d7 //wx9ad3e8bdb00f9975
//		String mch_id="1251586201";
//		String nonce_str="555666";
//		String sign="";
//		String body="测试交易";
//		String out_trade_no="20180308000000013";
//		int total_fee=1;
//		String spbill_create_ip="127.0.0.1";
//		String notify_url="https://xcxtest.dianpass.com/Member_Small_Program/wxPay/payNotify";
//		String trade_type="JSAPI";
//		String openid="oBu8Y0WjzioywMlIb4W6OcXV2RlY";
//		
//		SortedMap<String, Object> parameters = new TreeMap<String,Object>();
//		parameters.put("appid", appid);
//		parameters.put("mch_id", mch_id);
//		parameters.put("nonce_str", nonce_str);
//		parameters.put("body", body);
//		parameters.put("out_trade_no", out_trade_no);
//		parameters.put("total_fee", total_fee);
//		parameters.put("spbill_create_ip", spbill_create_ip);
//		parameters.put("notify_url", notify_url);
//		parameters.put("trade_type", trade_type);
//		parameters.put("openid", openid);
//		sign=CreateSignUtil.createSign("utf8",parameters,key);
//		parameters.put("sign", sign);
		
//		String xml=XmlParse.mapToXml(parameters, "xml");
//		System.out.println("请求参数："+xml);
//		String str=HttpClientUtil.httpRequest(url, "POST", xml);
//		System.out.println("请求结果："+str);
		//wx201803081409017eb8c8fe500675613705
		
	//	String str="<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg><appid><![CDATA[wx9ad3e8bdb00f9975]]></appid><mch_id><![CDATA[1251586201]]></mch_id><nonce_str><![CDATA[P4hZBDzPJm6MwG3x]]></nonce_str><sign><![CDATA[11FE268013BE668614D75F2DFB9BDF93]]></sign><result_code><![CDATA[SUCCESS]]></result_code><prepay_id><![CDATA[wx20180308155825c6ef347ed00981164204]]></prepay_id><trade_type><![CDATA[JSAPI]]></trade_type></xml>";
//		Map<String,Object> map=XmlParse.xml2Map(str);
//		System.out.println(map.get("xml"));
//		 HashMap<String,Object> jsonobj= JSONUtils.toHashMap(map.get("xml"));
//		 System.out.println(jsonobj.get("result_code"));
//		 System.out.println(jsonobj.get("return_code"));
		 
	//	 {result_code=SUCCESS, sign=27080E9474BD042F212AA36E615AC35A, mch_id=1251586201, prepay_id=wx201803091438453084337a6a0005421886, return_msg=OK, appid=wx9776777eb68c78d7, nonce_str=WUVPhzSddyGquHrv, return_code=SUCCESS, trade_type=JSAPI}

//		parameters.clear();
//		parameters.put("appId", appid);
//		parameters.put("timeStamp", new Date().getTime()/1000+"");
//		parameters.put("nonceStr", "123456");
//		parameters.put("package", "prepay_id=wx20180309145313e69d7d19b90619934646");
//		parameters.put("signType", "MD5");
//		
//		sign=CreateSignUtil.createSign("utf8",parameters,key);
//		parameters.put("sign", sign);
//		System.out.println(parameters.toString());
		
		
		String  file="D:/ansi.ctl";
		String url ="http://localhost:8080/fileUpload/upload";
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("filename", new File(file));
//		HttpClientUtil.doPost("filename", map);
		
	     // 上传文件测试
//        String str = uploadFile("http://localhost:8080/fileUpload/upload",new String[] { "D:\\ansi.ctl" });
//        System.out.println(str);

		upload();
		
	}
	
	 /**
	 35      * 多文件上传的方法
	 36      * 
	 37      * @param actionUrl：上传的路径
	 38      * @param uploadFilePaths：需要上传的文件路径，数组
	 39      * @return
	 40      */
	     @SuppressWarnings("finally")
	      public static String uploadFile(String actionUrl, String[] uploadFilePaths) {
	          String end = "\r\n";
	          String twoHyphens = "--";
	          String boundary = "*****";
	
	          DataOutputStream ds = null;
	          InputStream inputStream = null;
	          InputStreamReader inputStreamReader = null;
	          BufferedReader reader = null;
	          StringBuffer resultBuffer = new StringBuffer();
	          String tempLine = null;
	  
	          try {
	              // 统一资源
	             URL url = new URL(actionUrl);
	             // 连接类的父类，抽象类
	             URLConnection urlConnection = url.openConnection();
	            // http的连接类
	            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
	 
	             // 设置是否从httpUrlConnection读入，默认情况下是true;
	             httpURLConnection.setDoInput(true);
	              // 设置是否向httpUrlConnection输出
	              httpURLConnection.setDoOutput(true);
	              // Post 请求不能使用缓存
	              httpURLConnection.setUseCaches(false);
	             // 设定请求的方法，默认是GET
	              httpURLConnection.setRequestMethod("POST");
	              // 设置字符编码连接参数
	              httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
	              // 设置字符编码
	             httpURLConnection.setRequestProperty("Charset", "UTF-8");
	             // 设置请求内容类型
	             httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
	 
	             // 设置DataOutputStream
	              ds = new DataOutputStream(httpURLConnection.getOutputStream());
	             for (int i = 0; i < uploadFilePaths.length; i++) {
	                 String uploadFile = uploadFilePaths[i];
	                 System.out.println("uploadFile="+uploadFile);
	                  String filename = uploadFile.substring(uploadFile.lastIndexOf("//") + 1);
	                  System.out.println("filename="+filename);
	                  ds.writeBytes(twoHyphens + boundary + end);
	                  ds.writeBytes("Content-Disposition: form-data; " + "name=\"file" + i + "\";filename=\"" + filename
	                          + "\"" + end);
	                 ds.writeBytes(end);
	                  FileInputStream fStream = new FileInputStream(uploadFile);
	                 int bufferSize = 1024;
	                 byte[] buffer = new byte[bufferSize];
	                 int length = -1;
	                  while ((length = fStream.read(buffer)) != -1) {
	                      ds.write(buffer, 0, length);
	                  }
	                  ds.writeBytes(end);
	                  /* close streams */
	                  fStream.close();
	              }
	              ds.writeBytes(twoHyphens + boundary + twoHyphens + end);
	              /* close streams */
	              ds.flush();
	             if (httpURLConnection.getResponseCode() >= 300) {
	                 throw new Exception(
	                         "HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
             }
	 
	             if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
	                 inputStream = httpURLConnection.getInputStream();
	                 inputStreamReader = new InputStreamReader(inputStream);
	                 reader = new BufferedReader(inputStreamReader);
	                 tempLine = null;
	                 resultBuffer = new StringBuffer();
	                 while ((tempLine = reader.readLine()) != null) {
	                     resultBuffer.append(tempLine);
	                     resultBuffer.append("\n");
	                 }
	             }
	 
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	             e.printStackTrace();
	         } finally {
	             if (ds != null) {
	                 try {
	                     ds.close();
	                 } catch (IOException e) {
	                     // TODO Auto-generated catch block
	                     e.printStackTrace();
	                 }
	             }
	             if (reader != null) {
	                 try {
	                     reader.close();
	                 } catch (IOException e) {
	                     // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
	             if (inputStreamReader != null) {
	                 try {
	                    inputStreamReader.close();
	                } catch (IOException e) {
	                    // TODO Auto-generated catch block
	                     e.printStackTrace();
	                }
	            }
	            if (inputStream != null) {
	                try {
	                     inputStream.close();
	                } catch (IOException e) {
	                     // TODO Auto-generated catch block
	                    e.printStackTrace();
	                 }
	             }
	
	             return resultBuffer.toString();
	        }
	     }
	 
//	     String  file="D:/ansi.ctl";
//			String url ="http://localhost:8080/fileUpload/upload";
//	    
	     public static void upload() { 
	         CloseableHttpClient httpclient = HttpClients.createDefault(); 
	         //CloseableHttpClient httpclient = HttpClientBuilder.create().build();
	         try { 
	             HttpPost httppost = new HttpPost("http://192.168.1.112:8080/fileUpload/upload"); 
	    
	             RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(200000).setSocketTimeout(200000).build();
	             httppost.setConfig(requestConfig);
	            
	             FileBody bin = new FileBody(new File("D:\\codepage.txt")); 
	             StringBody comment = new StringBody("This is comment", ContentType.TEXT_PLAIN); 
	    
	             HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("file", bin).addPart("comment", comment).build(); 
	    
	             httppost.setEntity(reqEntity); 
	    
	             System.out.println("executing request " + httppost.getRequestLine()); 
	             CloseableHttpResponse response = httpclient.execute(httppost); 
	             try { 
	                 System.out.println(response.getStatusLine()); 
	                 HttpEntity resEntity = response.getEntity(); 
	                 if (resEntity != null) { 
	                     String responseEntityStr = EntityUtils.toString(response.getEntity());
	                     System.out.println(responseEntityStr);
	                     System.out.println("Response content length: " + resEntity.getContentLength()); 
	                 } 
	                 EntityUtils.consume(resEntity); 
	             } finally { 
	                 response.close(); 
	             } 
	         } catch (ClientProtocolException e) { 
	             e.printStackTrace(); 
	         } catch (IOException e) { 
	             e.printStackTrace(); 
	         } finally { 
	             try { 
	                 httpclient.close(); 
	             } catch (IOException e) { 
	                 e.printStackTrace(); 
	             } 
	         } 
	     }
	 
}
