package com.dilip.string;

public class Anagrams {
	public static void main(String[] args) {

		String s = "dilip";
		char[] aa = s.toCharArray();
		String ss="";
		for (char c : aa) {
        ss= ss+" "+String.valueOf(c);
	 	}
		System.out.println(ss);

	}
}
