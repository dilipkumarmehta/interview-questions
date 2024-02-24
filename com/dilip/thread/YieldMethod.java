package com.dilip.thread;

public class YieldMethod {

	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}

class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("chaild thread");
			Thread.yield();
		}
	}
}
