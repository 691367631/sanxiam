package com.sanxia.shiro;
//package com.jss.shiro;
//
//
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
//import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
//import org.apache.shiro.web.servlet.AbstractShiroFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.jss.market.entity.JssTgMenu;
//import com.jss.market.service.JssTgMenuService;
//
//
//
//@Service
//public class ShiroService {
//	
//	@Autowired
//	ShiroFilterFactoryBean shiroFilterFactoryBean;
//	
//	@Autowired
//	JssTgMenuService sysPermissionInitService;
//	
//	/**
//	 * 初始化权限
//	 */
//	public Map<String, String> loadFilterChainDefinitions() {
//		// 权限控制map.从数据库获取
//		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
//		Map<String,Object> map=new HashMap<String,Object>();
//		map.put("status", "1");
//		List<JssTgMenu> list = sysPermissionInitService.listBy(map);
//
//		for (JssTgMenu sysPermissionInit : list) {
//			filterChainDefinitionMap.put(sysPermissionInit.getUrl(),
//					sysPermissionInit.getShiroRole());
//		}
//		return filterChainDefinitionMap;
//	}
//
//	/**
//	 * 重新加载权限
//	 */
//	public void updatePermission() {
//
//		synchronized (shiroFilterFactoryBean) {
//
//			AbstractShiroFilter shiroFilter = null;
//			try {
//				shiroFilter = (AbstractShiroFilter) shiroFilterFactoryBean
//						.getObject();
//			} catch (Exception e) {
//				throw new RuntimeException(
//						"get ShiroFilter from shiroFilterFactoryBean error!");
//			}
//
//			PathMatchingFilterChainResolver filterChainResolver = (PathMatchingFilterChainResolver) shiroFilter
//					.getFilterChainResolver();
//			DefaultFilterChainManager manager = (DefaultFilterChainManager) filterChainResolver
//					.getFilterChainManager();
//
//			// 清空老的权限控制
//			manager.getFilterChains().clear();
//
//			shiroFilterFactoryBean.getFilterChainDefinitionMap().clear();
//			shiroFilterFactoryBean
//					.setFilterChainDefinitionMap(loadFilterChainDefinitions());
//			// 重新构建生成
//			Map<String, String> chains = shiroFilterFactoryBean
//					.getFilterChainDefinitionMap();
//			for (Map.Entry<String, String> entry : chains.entrySet()) {
//				String url = entry.getKey();
//				String chainDefinition = entry.getValue().trim()
//						.replace(" ", "");
//				manager.createChain(url, chainDefinition);
//			}
//
//			System.out.println("更新权限成功！！");
//		}
//	}
//}
