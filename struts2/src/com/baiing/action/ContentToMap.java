package com.baiing.action;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class ContentToMap {

	
	public static void main(String[] args) {
		String content = "开始日期:2014-06-09 00:00:00 产品类型:C网<font color=red>业务</font> 结束日期:2018-06-09 00:00:00 退订受理渠道:营业厅 新装受理渠道:营业厅 内部10000号是否主动宣传:主动宣传 ";
		String[] contents = content.split(" ");
		Map<String,String> map = new HashMap<String,String>();
		JSONObject js = new JSONObject();
		for(String ss : contents){
			String[] s = ss.split(":");
			if(s[0].contains("是否主动宣传")){
				js.put("value", s[1]);
			}
		}
		System.out.println(js.toJSONString());
	}
	
}
