package com.sanxia.shiro;
//package com.jss.shiro;
//
//
//
//import com.jss.common.utils.BCrypt;
//import com.jss.common.utils.MD5Util;
//import com.jss.market.entity.JssAdminUsers;
//
//public class PassWordChecked {
//	
//	public static boolean checkPwd(JssAdminUsers user,String password){
//		String pwd=user.getEncryptedPassword();
//		
//		boolean ytt=BCrypt.checkpw(password, pwd.substring(0,2)+"a"+pwd.substring(3));
////		String loginpassword=MD5Util.MD5Encode(user.getEmail()+user.getSalt()+password, "UTF-8");
////		System.out.println(loginpassword);
////		if(loginpassword.equals(user.getLoginpwd())){
////			return true;
////		}
//		return ytt;
//	};
//
//	public static String createPwd(String password){
//		
//		
//		String pwd=BCrypt.hashpw(password, BCrypt.gensalt());
////		String loginpassword=MD5Util.MD5Encode(user.getEmail()+user.getSalt()+password, "UTF-8");
////		System.out.println(loginpassword);
////		if(loginpassword.equals(user.getLoginpwd())){
////			return true;
////		}
//		String ytt=pwd.substring(0,2)+"y"+pwd.substring(3);
//		return ytt;
//	};
//}
