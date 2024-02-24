package com.dilip.string;

public class ReplacespecialChar {
	public static void main(String[] args) {
		String str = "Java is Great";
		str.replaceAll("\\s+","");
		System.out.println(str);
	}
}
