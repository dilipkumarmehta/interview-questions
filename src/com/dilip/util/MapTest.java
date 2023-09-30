package com.dilip.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "dilip");
		map.put("2", "dilip1");
		map.put("3", "dilip2");
		map.put("4", "dilip3");
		map.put("5", "dilip4");
		map.put("6", "dilip5");

		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> s : entrySet) {
			s.getKey();
			s.getValue();
		}
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key:"+key);
			System.out.println("value:"+map.get(key));
		}
		map.forEach((k,v)->	System.out.println("key:"+k +"value:"+v));	
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(""+map.get(next));
			
		}
		
		
	}
}
