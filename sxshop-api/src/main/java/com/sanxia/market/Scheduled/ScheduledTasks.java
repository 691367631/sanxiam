package com.sanxia.market.Scheduled;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



/**
 * 定时任务，定时请求微信接口获取access_token，并更新至数据库
 * @author vagun
 *
 */
@Component
public class ScheduledTasks implements CommandLineRunner {
	
	private final  Logger logger = (Logger) LoggerFactory.getLogger(ScheduledTasks.class);
	
	private static final long ScheduledTasksTime = 110*60*1000;//定时任务执行间隔时间
	
//	@Resource
//	private WXStoreInfoBusService storeinfoBusService;
//	@Resource
//	private WeChatAccessTokenBusService getAccessTokenBusService;
	
	/**
	 * 项目启动时执行一次
	 */
	@Override
	public void run(String... args) throws Exception {
		logger.info("项目启动时执行一次,获取AccessToken");
	//	initAccessToken();
	}
	
	/**
	 * 每隔相应时间执行一次
	 */
    @Scheduled(fixedDelay = ScheduledTasksTime)
    public void reportCurrentTime() {
    	logger.info("每隔相应时间执行一次,获取AccessToken");
    	initAccessToken();
    }
    
    /**
     * 初始化AccessToken
     */
    private void initAccessToken() {
//    	logger.info("方法：initAccessToken()");
//    	Map<String, Object> paramMap = new HashMap<String, Object>();
//		paramMap.put("isOpen", "1");//是否开通小程序
//		List<Store> stores = storeinfoBusService.getStoreList(paramMap);
//		String flog="";
//		if (!stores.isEmpty()) {
//			for (Store store : stores) {
//				String pub_appId = store.getPub_appid();
//				String pub_appSecret = store.getPub_secret();
//				logger.info("pub_appId:"+pub_appId+"---------pub_appSecret:"+pub_appSecret);
//				if (StringUtils.isBlank(pub_appId) || StringUtils.isBlank(pub_appSecret)) {
//					logger.info("主键:"+store.getSerialNo()+"数据的pub_appId或pub_appSecret为空");
//					continue;
//				}
//				if(flog.contains(pub_appId)){
//					logger.info("主键:"+store.getSerialNo()+"数据pub_appId:"+pub_appId+"对应的access_token已经被更新");
//					logger.info("flog:"+flog);
//					continue;
//				}
//				flog=flog+","+pub_appId;
//				String accessToken = getAccessTokenBusService.getAccessTokenToString(pub_appId, pub_appSecret);//请求接口获取access_token
//				if (StringUtils.isBlank(accessToken)) {
//					logger.info("pub_appId:"+pub_appId+",pub_appSecret:"+pub_appSecret+"请求接口获取accessToken失败");
//					continue;
//				}
//				String wx_card_ticket = getAccessTokenBusService.getWxCardTicketString(accessToken);//请求接口获取access_token
//				if (StringUtils.isBlank(wx_card_ticket)) {
//					logger.info("pub_appId:"+pub_appId+",pub_appSecret:"+pub_appSecret+"请求接口获取wx_card_ticket失败");
//					continue;
//				}
//				storeinfoBusService.updateAccessToken(pub_appId, accessToken,wx_card_ticket);//更新数据库中access_token
//			}
//		}else{
//		logger.info("暂无已开通小程序的店铺列表");
//		}
    }
}
