package com.dilip.string;

public class removeChar {
	public static void main(String[] args) {
		String str = "dilipkumarmehtad";
		String str1 = "";
		char c = 'd';
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) == c)) {
				str1 = str1 + str.charAt(i);
			}

		}
		System.out.println(str1);
	}
}
