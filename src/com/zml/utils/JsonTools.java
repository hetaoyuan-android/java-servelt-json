package com.zml.utils;

import net.sf.json.JSONObject;

/**
 * @author 王耀
 * 
 * @version 1.0
 */
public class JsonTools {
	
	
	public static String  createJsonString(String key,Object value){
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put(key, value);
		return jsonObject.toString();
		
		}
	
	
		


}
