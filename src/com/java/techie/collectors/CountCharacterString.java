package com.java.techie.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharacterString {

	public static void main(String[] args) {
		String s = "fafgasfeddafdsfas";
		String[] split = s.split("");
		System.out.println(Arrays.toString(split));
		Stream<String> stream = Arrays.stream(split);
		Map<String, List<String>> collect = stream.collect(Collectors.groupingBy(p -> p));
		System.out.println(collect);
		Stream<String> stream1 = Arrays.stream(split);
		Map<String, Long> collect2 = stream1.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect2);

		Map<String, Long> collect3 = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect3);

	}

}
