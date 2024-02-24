package com.dilip.oops;

public class ControllFlow {
	int a = 90;
	static int b = 90;

	static {
		System.out.println(b);
		System.out.println(ControllFlow.c);
		System.out.println(b);
		get();
	}
	static int c = 9;

	public static void get() {

		int a = 2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println(c);
	}
}
