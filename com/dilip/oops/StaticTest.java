package com.dilip.oops;

public class StaticTest {
	static int a = 90;
	{
		//System.out.println(a );
		// 3
		System.out.println("first instance bloc");
	}
	static {
		// 1
		System.out.println("first static block");
	}

	StaticTest() {
		System.out.println("constructor ");
	}

	public static void main(String[] args) {
		//StaticTest t1 = new StaticTest();
		System.out.println("main");
	//	StaticTest t2 = new StaticTest();

	}

	static {
		// 2
		System.out.println("second static block");
	}
	{// 4
		System.out.println("second instance block");
	}
}
