package com.dilip.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSortingKeyVlue {
	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 12);
		map.put(4, 22);
		map.put(3, 3);
		map.put(2, 44);
		Map<Integer, Integer> map1 = new LinkedHashMap<>();

		/*
		 * map.entrySet().stream().sorted(Map.Entry.comparingByValue()) .map(mapper ->
		 * map1.put(mapper.getKey(), mapper.getValue())).count();
		 */

		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.map(mapper -> map1.put(mapper.getKey(), mapper.getValue())).count();
		map1.forEach((k, v) -> System.out.println(k + "\tvalue  " + v));

	}
}
