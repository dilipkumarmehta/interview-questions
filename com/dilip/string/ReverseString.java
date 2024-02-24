package com.dilip.string;

public class ReverseString {
	public static void main(String[] args) {
		String s = "dilipkumar";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(recusrion(s));
	}

	private static String recusrion(String s) {
		if (s.length() < 2)
			return s;
		return recusrion(s.substring(1)) + s.charAt(0);

	}
}
