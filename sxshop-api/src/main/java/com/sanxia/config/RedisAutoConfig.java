package com.sanxia.config;

/**
 * 配置redis过期时间类
 * 
 */
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;  
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

//@EnableCaching
//@Configuration
public class RedisAutoConfig extends CachingConfigurerSupport {
	
//	@Bean
//    public CacheManager cacheManager(RedisTemplate redisTemplate) {
//        RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
//        // 开启使用缓存名称最为key前缀
//        rcm.setUsePrefix(true);
//        //设置缓存过期时间
//        Map<String, Long> expires = new HashMap<>();
//        expires.put("12h",3600 * 12L);
//        expires.put("1h",3600 * 1L);
//        expires.put("10m",60 * 5L);
//        expires.put("11s",11*1L);
//        rcm.setExpires(expires);
//        rcm.setDefaultExpiration(60*60*12L);//秒
//        return  rcm;
//    }

	 	@Bean  
	    public KeyGenerator wiselyKeyGenerator(){  
	        return new KeyGenerator() {  
	            @Override  
	            public Object generate(Object target, Method method, Object... params) {  
	                StringBuilder sb = new StringBuilder();  
	                sb.append(target.getClass().getName());  
	                sb.append(method.getName());  
	                for (Object obj : params) {  
	                    sb.append(obj.toString());  
	                }  
	                return sb.toString();  
	            }  
	        };  
	  
	    }  
	 	
	 	
	 
}
