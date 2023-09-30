package com.dilip.thread;

public class DedLoc {
	public static void main(String[] args) {
		Test t = new Test();
		Test1 t1 = new Test1();
		Test2 t2 = new Test2(t1, t);
		t2.start();
	}
}
 

class Test {
	public synchronized void show(Test1 t1) {
		t1.show1();
	}

	public synchronized void show1() {
		System.out.println("show1 Test");
	}
}

class Test1 {
	public synchronized void show(Test t) {
		t.show1();
	}

	public synchronized void show1() {
		System.out.println("show1 Test1");
	}
}

class Test2 extends Thread {
	Test1 t1;
	Test t;

	public Test2(Test1 t1, Test t) {
		this.t1 = t1;
		this.t = t;
	}

	public void run() {
		t.show(t1);
		t1.show(t);

	}

}
