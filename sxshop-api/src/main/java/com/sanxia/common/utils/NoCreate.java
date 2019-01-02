package com.sanxia.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NoCreate {

	public static String createNoByUserId(String UserId) {
		String no="";
		Date date=new Date();
		SimpleDateFormat smft=new SimpleDateFormat("YYYYMMddHHmmssSSS");
		no=smft.format(date)+UserId+(int)(Math.random()*1000);
		return no;
	}
}
