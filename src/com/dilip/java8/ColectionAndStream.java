package com.dilip.java8;

import java.util.Arrays;
import java.util.List;

public class ColectionAndStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
		 list.stream()
	    .filter(name -> name.startsWith("f"))
	    .map(String::toUpperCase)
	    .sorted()
	    .forEach(System.out::println);
	}
}
