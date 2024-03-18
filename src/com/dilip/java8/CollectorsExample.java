package com.dilip.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
	public static void main(String[] args) {

		Map<String, String> params = Map.of("param1", "value1", "param2", "value2", "param3", "value1", "param4",
				"value2");

		// Construct query string
		String queryString = params.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue())
				.collect(Collectors.joining("&"));
		System.out.println(queryString);
	}
}
