package com.sanxia.jms;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;  
import org.springframework.stereotype.Component;

//import com.jss.market.service.JssTgUserCountService;
//import com.jss.market.service.JssTgUserService;
import com.sanxia.common.utils.JsonUtil;
import com.sanxia.market.dto.phpapi.PhpUser;
  
@Component  
public class Consumer {  
	private final Logger logger = (Logger) LoggerFactory.getLogger(Consumer.class);
	
//	@Autowired 
//	private JssTgUserService jssTgUserService;
//	
//	@Autowired 
//	private JssTgUserCountService  jssTgUserCountService;
	
    //    使用JmsListener配置消费者监听的队列，其中text是接收到的消息  
    @JmsListener(destination = "user.queue")  
    public void receiveUserQueue(final TextMessage text, Session session) throws JMSException {  
    	try{
    		String jsonstr=text.getText();
    	    logger.info("user.queue:Consumer收到的报文为:"+jsonstr);
//    	    jssTgUserService.userQueue(jsonstr);
    	}catch(Exception e){
    		e.printStackTrace();
    		session.recover();
    	}
    }  
    
    
//  使用JmsListener配置消费者监听的队列，其中text是接收到的消息  
  @JmsListener(destination = "order.queue")  
  public void receiveOrderQueue(final TextMessage text, Session session) throws JMSException {  
  	try{
  		String jsonstr=text.getText();
  	    logger.info("user.queue:Consumer收到的报文为:"+jsonstr);
//  	    jssTgUserService.orderQueue(jsonstr);
//  	    jssTgUserCountService.orderQueue(jsonstr);
  	}catch(Exception e){
  		e.printStackTrace();
  		session.recover();
  	}
  }  
}  