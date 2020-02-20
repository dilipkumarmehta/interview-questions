package com.dilip.array;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountInString {
	public static void main(String[] args) {

		String string = "dilipkumarmehtaabcdefdilipkumarmehtaabcdef";
		String strarr[] = string.split("");
		Map<String, Long> collect = Arrays.stream(strarr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.forEach((k, v) -> System.out.println("key-" + k + "\t value " + v));

	}
}
