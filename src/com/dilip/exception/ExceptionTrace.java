package com.dilip.exception;

public class ExceptionTrace {
	public static void main(String[] args) {
		TestException p = new TestException();
		p.print();
	}
}

class TestException {

	public String print() {
		TestException1 ex = new TestException1();
		String s = ex.print();
		return s;

	}
}

class TestException1 {
	public String print() {
		TestException2 ex = new TestException2();
		String s = ex.print();
		return s;

	}
}

class TestException2 {
	public String print() {
		TestException3 ex = new TestException3();
		String s = ex.print();
		return s;

	}
}

class TestException3 {
	public String print() {
		int x = 1 / 0;
		return "helloworld!";

	}
}
