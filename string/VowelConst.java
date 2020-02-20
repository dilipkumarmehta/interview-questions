package com.dilip.string;

public class VowelConst {
	public static void main(String[] args) {
		String str = "dilipkumarmehta";
		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.toLowerCase().charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println("Vowel\t =" + c);
			} else {
				System.out.println("consonants\t ="+c);
			}
		}
	}
}
