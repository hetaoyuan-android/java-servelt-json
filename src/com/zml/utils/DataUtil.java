package com.zml.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zml.pojo.Person;

/**
 * 用于生成四种类型的数据来测试json解析：
 * ①Person对象类型 ②List<Person> ③List<String> ④List<Map<String,Object>>
 * 
 * @author 王耀
 * 
 * @version 1.0
 */
public class DataUtil {

	public static Person getPerson() {

		return new Person("郑"
				+ "明亮", "男", "1072307340", "15733100573");
	}

	public static List<Person> getPersons() {
		List<Person> list = new ArrayList<Person>();
		list.add(getPerson());
		list.add(new Person("张三", "男", "123456789", "98765432"));
		list.add(new Person("李四", "女", "762348234", "12312124324"));
		return list;

	}
	
	public static List<String>	getStrings(){
		List<String>list = new ArrayList<String>();
		list.add("郑明亮");
		list.add("张三");
		list.add("李四");
		
		return list;
	}
	
	public static List<Map<String,Object>> getMaps(){
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("name","郑明亮" );
		map.put("blog", "blog.csdn.net/zml_2015");
		map.put("person", getPerson());
		list.add(map);
		return list;
		
	}

}
