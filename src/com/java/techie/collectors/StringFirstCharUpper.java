package com.java.techie.collectors;

public class StringFirstCharUpper {
	public static void main(String[] args) {
		String s = "dilip kumar mehta";

		String[] str = s.split(" ");
		for (String ch : str) {
			char charAt = ch.charAt(ch.length() - 1);
			String string = Character.toString(charAt).toUpperCase();
			System.out.println(string);
		}
		
		
		/*
		 * Arrays.stream(s.split(" ")).map(word -> Character.toUpperCase(word.charAt(0))
		 * + word.substring(1)) .forEach(System.out::println);
		 */

	}

}
