package com.dilip.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "cilip");
		map.put("B", "zilip");
		map.put("C", "nilip");
		map.put("E", "rilip");
		map.put("P", "eilip");
		map.put("D", "cilip");
		map.put("K", "bilip");
		map.put("O", "ailip");

		System.out.println(map);	
		Map<String, String> mapl = new LinkedHashMap<String, String>();
		mapl.put("A", "cilip");
		mapl.put("B", "zilip");
		mapl.put("C", "nilip");
		mapl.put("E", "rilip");
		mapl.put("P", "eilip");
		mapl.put("D", "cilip");
		mapl.put("K", "bilip");
		mapl.put("O", "ailip");
		System.out.println(mapl);
		Map<String, String> result2 = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.map(mapper -> result2.put(mapper.getKey(), mapper.getValue())).count();

		System.out.println(result2);

	}
}
