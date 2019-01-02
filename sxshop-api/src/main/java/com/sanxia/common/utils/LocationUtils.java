package com.sanxia.common.utils;

/**   
 * 根据两点的经纬度计算两点之间的距离  
 */    
public class LocationUtils {    
    private static double EARTH_RADIUS = 6378.137;    
    
    private static double rad(double d) {    
        return d * Math.PI / 180.0;    
    }    
    
    /**   
     * 通过经纬度获取距离(单位：米)   
     * @param userlat   
     * @param userlng   
     * @param storelat   
     * @param storelng   
     * @return   
     */    
    public static int getDistance(double userlat, double userlng, double storelat,    
                                     double storelng) {    
        double radLat1 = rad(userlat);    
        double radLat2 = rad(storelat);    
        double a = radLat1 - radLat2;    
        double b = rad(userlng) - rad(storelng);    
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)    
                + Math.cos(radLat1) * Math.cos(radLat2)    
                * Math.pow(Math.sin(b / 2), 2)));    
        s = s * EARTH_RADIUS;    
        s = Math.round(s * 10000d) / 10000d;    
        s = s*1000; 
        return (int)s;    
    }    
    
    public static void main(String[] args) {
        
	 	int length = LocationUtils.getDistance(39.675370, 116.529110, 39.661280, 116.622620);
	   System.out.println(length);
    }
}    

