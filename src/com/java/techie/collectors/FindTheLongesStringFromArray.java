package com.java.techie.collectors;

import java.util.Arrays;
import java.util.Optional;

public class FindTheLongesStringFromArray {
	public static void main(String[] args) {
		String str[] = { "dilip", "kumar", "mehtaji" };
		Optional<String> reduce = Arrays.stream(str)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		System.out.println(reduce.get());
	}
}
