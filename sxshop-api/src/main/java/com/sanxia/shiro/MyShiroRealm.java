package com.sanxia.shiro;
//package com.jss.shiro;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//
//
//
//
//
//
//
//
//
//import org.apache.log4j.Logger;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.AccountException;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.AuthenticationInfo;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authc.DisabledAccountException;
//import org.apache.shiro.authc.SimpleAuthenticationInfo;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.apache.shiro.subject.SimplePrincipalCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//
//
//import com.jss.market.entity.JssAdminUsers;
//import com.jss.market.entity.JssTgMenuRole;
//import com.jss.market.entity.JssTgRole;
//import com.jss.market.service.JssAdminUsersService;
//import com.jss.market.service.JssTgMenuRoleService;
//import com.jss.market.service.JssTgRoleService;
//
///**
// * shiro身份校验核心类
// * 
// * @author 作者: z77z
// * @date 创建时间：2017年2月10日 下午3:19:48
// */
//
//public class MyShiroRealm extends AuthorizingRealm {
//
////	@Autowired
////	private JssAdminUsersService sysUserService;
////	
////	@Autowired
////	private JssTgMenuRoleService sysPermissionService;
////	
////	@Autowired
////	private JssTgRoleService sysRoleService;
//	
//
//	/**
//	 * 认证信息.(身份验证) : Authentication 是用来验证用户身份
//	 * 
//	 * @param token
//	 * @return
//	 * @throws AuthenticationException
//	 */
//	@Override
//	protected AuthenticationInfo doGetAuthenticationInfo(
//			AuthenticationToken authcToken) throws AuthenticationException {
//		System.out.println("身份认证方法：MyShiroRealm.doGetAuthenticationInfo()");
//		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
//		String name = token.getUsername();
//		String password = String.valueOf(token.getPassword());
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("email", name);
//		map.put("accountType", "1");
//		//map.put("loginpwd", password);
////		JssAdminUsers user = null;
//		// 从数据库获取对应用户名密码的用户
////		List<JssAdminUsers> userList = sysUserService.listBy(map);
//		if(userList.size()!=0){
//			user = userList.get(0);
//		}
//		if (null == user) {
//			throw new AccountException("帐号不正确！");
//		}
//		else if(!PassWordChecked.checkPwd(user, password)){
//			throw new AccountException("密码不正确！");
//		}
//		
//		else if("1".equals(user.getStatus())){
//			System.out.println("user.getStatus()="+user.getStatus());
//			throw new DisabledAccountException("帐号已经禁止登录！");
//		}
//		else{
//			token.setPassword(user.getEncryptedPassword().toCharArray());
//			//更新登录时间 last login 
//			user.setLastSignInAt(new Date());
//			sysUserService.updateOne(user);
//		}
//		return new SimpleAuthenticationInfo(user, user.getEncryptedPassword(), getName());
//	}
//
//	/**
//	 * 授权
//	 */
//	@Override
//	protected AuthorizationInfo doGetAuthorizationInfo(
//			PrincipalCollection principals) {
//		System.out.println("权限认证方法：MyShiroRealm.doGetAuthorizationInfo()");
//		JssAdminUsers user = (JssAdminUsers)SecurityUtils.getSubject().getPrincipal();
//		String roleId = user.getTg_role_id()+"";
//		SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
//		//根据用户ID查询角色（role），放入到Authorization里。
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("id", roleId);
//		List<JssTgRole> roleList = sysRoleService.listBy(map);
//		Set<String> roleSet = new HashSet<String>();
//		for(JssTgRole role : roleList){
//			roleSet.add(role.getId());
//		}
//		//根据用户ID查询权限（permission），放入到Authorization里。
//		map.clear();
//		map.put("roleId", roleId);
//		map.put("status", "1");
//		List<JssTgMenuRole> permissionList = sysPermissionService.listBy(map);
//		Set<String> permissionSet = new HashSet<String>();
//		for(JssTgMenuRole Permission : permissionList){
//		//	System.out.println("Permission=>"+Permission.getShiroRole());
//			permissionSet.add(Permission.getShiroRole());
//		}
//		info.setStringPermissions(permissionSet);
//        return info;
//	}
//}
