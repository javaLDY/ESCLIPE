package com.baiing.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		JSONArray jsonarray = new JSONArray();
		json.put("a", 1);
		json.put("b", 2);
		jsonarray.add(json);
		System.out.println(json);
		System.out.println(jsonarray);
		
		List<String> test = new ArrayList<String>();
		test.add("aaa");
		test.add("bbb");
		System.out.println(test);
		System.out.println(jsonarray.toJSONString(test));//集合转换json
		
		Map<Object,String> map = new HashMap<Object, String>();
		map.put("a1", "1");
		map.put("a2", "2");
		map.put("a3", "3");
		System.out.println(map);
		System.out.println(jsonarray.toJSONString(map));//map转换json
		System.out.println(json.toJSON(map));//map转换json
		
		List<Map<Object, String>> list = new ArrayList<Map<Object, String>>();
		list.add(map);
		System.out.println(list);
		System.out.println(json.toJSON(list));//list<map>转换json
		System.out.println(jsonarray.toJSONString(list));//list<map>转换json
	}
	
}
