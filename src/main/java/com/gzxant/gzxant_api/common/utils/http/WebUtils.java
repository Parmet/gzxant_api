package com.gzxant.gzxant_api.common.utils.http;

import javax.servlet.http.HttpServletRequest;

public class WebUtils {
	public static String getRealRemoteIP(HttpServletRequest request){
		  String ip = request.getHeader("x-forwarded-for"); 
		  
	      if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	          ip = request.getHeader("Proxy-Client-IP"); 
	      } 
	      if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	          ip = request.getHeader("WL-Proxy-Client-IP"); 
	      } 
	      if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	          ip = request.getRemoteAddr(); 
	      } 
	      
	      return ip; 
	}
}
