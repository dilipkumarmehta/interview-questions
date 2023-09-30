package com.dilip.lamda;

public class Test {
	public static void main(String[] args) {
		System.out.println("dhslakf");
		B b = new C();
		A a = new C();
		D d = new C();
		System.out.println(D.a);
		D.show();
		a.show1();
		b.show();
		a.show();
	}
}

interface A {
	public void show();

	default void show1() {
		System.out.println(this);
	}
}

interface B {
	
	public void show();

	default void show1() {
		System.out.println(this);
	}

}

interface D {
	public static int a=90;
	public static void show() {
		System.out.println("static method in calss D");
	}
}

class C implements B, A, D {
 
	@Override
	public void show() {
		System.out.println("Hello"+a);
		// TODO Auto-generated method stub

	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		A.super.show1();
	}

}