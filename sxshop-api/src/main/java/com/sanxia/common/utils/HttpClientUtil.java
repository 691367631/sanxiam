package com.sanxia.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 
 * @author zhaoguannan HttpClient工具类
 * @param 
 * 
 */
public class HttpClientUtil {

	private final static Logger logger = (Logger) LoggerFactory.getLogger(HttpClientUtil.class);
	/***
     * 带参数的get请求
     */
    public static String doGet(String url, Map<String, String> param) {

    	logger.info("请求url:"+url);
    	if(param!=null){
    	logger.info("参数:"+param.toString());
    	}
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
       
        String resultString = "";
        CloseableHttpResponse response = null;
        try {
            // 创建uri
            URIBuilder builder = new URIBuilder(url);
            if (param != null) {
                for (String key : param.keySet()) {
                    builder.addParameter(key, param.get(key));
                }
            }
            URI uri = builder.build();

            // 创建http GET请求
            HttpGet httpGet = new HttpGet(uri);

            // 执行请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
            logger.info("请求结果:"+resultString);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }

    /***
     * 不带参数的get请求
     */
    public static String doGet(String url) {
        return doGet(url, null);
    }

    /***
     * 带参数的post请求
     */
    public static String doPost(String url, Map<String, Object> param) {
       
    	logger.info("请求url:"+url);
    	logger.info("参数:"+param.toString());
    	// 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            // 创建参数列表
            if (param != null) {
                List<NameValuePair> paramList = new ArrayList<NameValuePair>();
                for (String key : param.keySet()) {
                    paramList.add(new BasicNameValuePair(key, param.get(key).toString()));
                }
                // 模拟表单
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList);
                httpPost.setEntity(entity);
            }
            // 执行http请求
            response = httpClient.execute(httpPost);
            resultString = EntityUtils.toString(response.getEntity(), "utf-8");
            logger.info("请求结果:"+resultString);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return resultString;
    }

    /***
     * 不带参数的post请求
     */
    public static String doPost(String url) {
        return doPost(url, null);
    }
    
    /***
     * 参数为json串的post请求
     */
    public static String doPostJson(String url, String json) {
    	logger.info("请求url:"+url);
    	logger.info("参数:"+json);
        // 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            // 创建请求内容
            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            // 执行http请求
            response = httpClient.execute(httpPost);
            resultString = EntityUtils.toString(response.getEntity(), "utf-8");
            logger.info("请求结果:"+resultString);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return resultString;
    }
    
    public static String httpPostSendReceive(String url,String jsonString) throws IOException 
    {
        CloseableHttpResponse response = null;
        CloseableHttpClient client = null;
        String res = null;
            System.out.println("请求url：" + url);
            HttpPost httpPost = new HttpPost(url);
            StringEntity entityParams = new StringEntity(jsonString, "utf-8");
            System.out.println("发送请求：" + new String(EntityUtils.toByteArray(entityParams), "UTF-8"));

            httpPost.setEntity(entityParams);
            //text/plain    //application/json
            httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");
            client = HttpClients.createDefault();
            response = client.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();

            if (response == null || httpEntity == null) {
                res = "操作失败";
                return "";
            }

            res = new String(EntityUtils.toByteArray(httpEntity), "UTF-8");
            System.out.println("请求结果：" + res);


            if (response != null) {
                response.close();
            }
            if (client != null) {
                client.close();
            }
        return res;

    }
    
    /**   
     *   
     * @param requestUrl请求地址   
     * @param requestMethod请求方法   
     * @param outputStr参数   
     */     
    public static String httpRequest(String requestUrl,String requestMethod,String outputStr){     
        // 创建SSLContext    
    	logger.info("请求url:"+requestUrl);
    	logger.info("参数:"+outputStr);
        StringBuffer buffer = null;     
        try{     
            URL url = new URL(requestUrl);     
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();     
            conn.setRequestMethod(requestMethod);     
            conn.setDoOutput(true);     
            conn.setDoInput(true);     
            conn.connect();     
            //往服务器端写内容     
            if(null !=outputStr){     
                OutputStream os=conn.getOutputStream();     
                os.write(outputStr.getBytes("utf-8"));     
                os.close();     
            }     
            // 读取服务器端返回的内容     
            InputStream is = conn.getInputStream();     
            InputStreamReader isr = new InputStreamReader(is, "utf-8");     
            BufferedReader br = new BufferedReader(isr);     
            buffer = new StringBuffer();     
            String line = null;     
            while ((line = br.readLine()) != null) {     
                buffer.append(line);     
            }     
        }catch(Exception e){     
            e.printStackTrace();     
        }  
        logger.info("请求结果:"+buffer.toString());
        return buffer.toString();  
    }       
    public static String urlEncodeUTF8(String source){     
        String result=source;     
        try {     
            result=java.net.URLEncoder.encode(source, "UTF-8");     
        } catch (UnsupportedEncodingException e) {     
            // TODO Auto-generated catch block     
            e.printStackTrace();     
        }     
        return result;     
    }   
}
