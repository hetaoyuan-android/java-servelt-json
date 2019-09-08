package com.zml.test;

import com.zml.utils.DataUtil;
import com.zml.utils.JsonTools;

/**
 * @author 王耀
 * 
 * @version 1.0
 */
public class testjson {

	public static void main(String[] args) {
			String jsonString;
			jsonString = JsonTools.createJsonString("person",DataUtil.getPerson());

			System.out.println(jsonString);			
			jsonString = JsonTools.createJsonString("persons",DataUtil.getPersons());

			System.out.println(jsonString);			
			jsonString = JsonTools.createJsonString("strings",DataUtil.getStrings());

			System.out.println(jsonString);		
			jsonString = JsonTools.createJsonString("maps",DataUtil.getMaps());
			System.out.println(jsonString);		
		}
		
	

}
