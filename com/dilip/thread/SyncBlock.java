package com.dilip.thread;

class Display1 {
	Object obj = new Object();

	public synchronized void display(String s) {
		System.out.println("before" + this.getClass());
		synchronized (obj) {
			for (int i = 0; i < 10; i++) {
				System.out.print("hello :");
				try {
					// Thread.sleep(1000);
					wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(s);
			}
		}
		System.out.println("after" + this.getClass());
	}
}

class Mythread6 extends Thread {
	Display1 d;
	String s;

	Mythread6(Display1 d, String s) {
		this.d = d;
		this.s = s;
	}

	public void run() {
		d.display(s);
	}
}

public class SyncBlock {
	public static void main(String[] args) {

		Display1 d = new Display1();
		Mythread6 t = new Mythread6(d, "dilip");
		Mythread6 t1 = new Mythread6(d, "Mehta");
		t.start();
		t1.start();
	}

}
