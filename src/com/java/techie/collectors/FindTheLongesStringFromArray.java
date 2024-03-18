package com.java.techie.collectors;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindTheLongesStringFromArray {
	public static void main(String[] args) {
		String str[] = { "dilip", "kumar", "mehtaji" };

		String s = "dilip Kumar mehta";

		 Arrays.stream(s.split("")).reduce((s2, s3)->s2.length()>s3.length()?s2:s3 );

	
	
		Optional<String> reduce = Arrays.stream(str)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		System.out.println(reduce.get());
	}
}
