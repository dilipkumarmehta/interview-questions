package com.dilip.stream;

public class MethodRef {
	public static void main(String[] args) {
		AddNumber s = new AddNumber();
		MyFung myf = () -> s.sum();
		myf.sum();
		MyFung myf1 = s::sum;
	}
}

@FunctionalInterface
interface MyFung {
	public void sum();
}

class AddNumber {
	public void sum() {
		System.out.println("hello");
	}
}