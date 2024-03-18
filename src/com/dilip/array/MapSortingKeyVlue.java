package com.dilip.array;

import java.util.Arrays;
import java.util.Comparator;
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
		// System.out.println("dsfsdf");

		int x[] = new int[20];
		x[0] = 20;
		x[1] = 10;
		x[2] = 3;
		x[3] = 5;
		x[4] = 8;
		x[5] = 9;
		x[6] = 30;
		x[7] = 70;

		int[] sortedArr = Arrays.stream(x).sorted().toArray();

		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.map(mapper -> map1.put(mapper.getKey(), mapper.getValue())).count();

		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(s ->
		// System.out.println(s));

		// .map(mapper -> map1.put(mapper.getKey(), mapper.getValue())).count();

		// System.out.println(map1.size());
		// map1.forEach((k, v) -> System.out.println(k + "\tvalue " + v));

	}
}
