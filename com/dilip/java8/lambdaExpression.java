package com.dilip.java8;

import java.util.Objects;

public class lambdaExpression {
	public static void main(String[] args) {
		c c = new c();
		c.show();
	}

}
interface I {

	default boolean equal(Object obj) {
		System.out.println("dsafa");
		return false;

	}

	 static void add(){
		 System.out.println("static method");
	 }

	default void show() {
		System.out.println("I");
	}
}

interface J {
//	void add();

	default void show() {
		System.out.println("I");
	}
}

class c implements J{

	public void shoow() {
		I.add();
	}

}

//Functional Interface

@FunctionalInterface
interface FunctionInte {
	public void count();
}

interface Defaultmeh {

	public void show();

	default void show1(String name) {
		Objects.requireNonNull(name);
		System.out.println(name.length());
		System.out.println("Default Method");
	}

	static void show2() {
		System.out.println("static method");
	}
}

class DefaultmethodImpl implements Defaultmeh {

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

}
