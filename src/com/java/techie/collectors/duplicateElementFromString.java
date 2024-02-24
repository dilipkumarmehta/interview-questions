package com.java.techie.collectors;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateElementFromString {
	public static void main(String[] args) {
		String s = "fafgasfeddafdsfas";
		// find the duplicate Elements
		Set<String> collect = Arrays.stream(s.split("")).collect(Collectors.toSet());
		String s2 = "";
		for (String sstr : collect) {
			s2 = s2.concat(sstr);
		}
		System.out.println(s2);

	}
}
