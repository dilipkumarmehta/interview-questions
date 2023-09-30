package com.dilip.stream;


@FunctionalInterface
interface Functional {
	public int show(int a, int b);
	
	boolean equals(Object obj);

	public String toString();

	default public int add(int a, int b) {
		return a + b;
	}

	default public int mul(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

}



public class FunctionInterface1 {
	public static void main(String[] args) {
		Functional f1 = (int a, int b) -> {
			System.out.println(a + b);
			System.out.println(b);
			return a + b;
		};
		int sum = f1.show(21, 32);
		System.out.println(sum);
		int sum1 = f1.add(1, 23);
		
		System.out.println(sum1);
	}
}
