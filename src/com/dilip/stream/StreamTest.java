package com.dilip.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		System.out.println("dsafsa");
		List<String> result = Stream.of("EURO/INR", "USD/AUD", "USD/GBP", "USD/EURO").filter(e -> e.length() > 7)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toLowerCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
		result.forEach(System.out::print);

	}
}
