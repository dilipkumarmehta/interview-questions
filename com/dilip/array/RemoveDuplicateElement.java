package com.dilip.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5 };
		Integer arr1[] = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 10, 20, 33, 22 };
		List<Integer> arr = Arrays.stream(array).boxed().distinct().collect(Collectors.toList());
		arr.forEach(System.out::print);
		
		Map<Integer, Long> count = Arrays.stream(array).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		count.forEach((k, v) -> System.out.println("Key- " + k + "\t value- " + v));
		for (Map.Entry<Integer, Long> map : count.entrySet()) {
			System.out.println(map);
		}

	}

}

//filter ,map flat map 