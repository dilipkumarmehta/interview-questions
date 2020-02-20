package com.dilip.thread;

public class DeadLocak {
	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		Dedlock t = new Dedlock(a, b);
		Dedlock1 t1 = new Dedlock1(a, b);
		t.start();
		t1.start();
	}
}

class A {

	public synchronized void d1(B b)  {
		System.out.println("A D1");
		
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.last();
		System.out.println("A D1 after last");

	}

	public synchronized void last() {
		System.out.println("last of A method");
	}
}

class B {

	public synchronized void d1(A a)  {
		System.out.println("B D1");
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.last();
		System.out.println("B D1 after last");

	}

	public synchronized void last() {
		System.out.println("last of B method");
	}
}

class Dedlock extends Thread {

	A a;
	B b;

	public Dedlock(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void run() {
		a.d1(b);
	}

}

class Dedlock1 extends Thread {

	A a;
	B b;

	public Dedlock1(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void run() {
		b.d1(a);
	}

}