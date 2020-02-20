package com.dilip.string;

public class hasCodeExmaple {
	public static void main(String[] args) {
		String s = "AaAa";
		String s1 = "BBBB";
		String s3 = "AaBB";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
	}
}
