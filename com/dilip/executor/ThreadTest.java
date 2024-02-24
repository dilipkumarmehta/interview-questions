package com.dilip.executor;

public class ThreadTest {
	public static void main(String[] args) {
		for (int i = 0; i < 14; i++) {

			Thread t = new Thread(new Task());
			t.start();
			System.out.println("Thread Name " + Thread.currentThread().getName());
		}
	}
}

class Task implements Runnable {
	//	Asynchronous
	@Override
	public void run() {
		System.out.println("Thread Name " + Thread.currentThread().getName());

	}

}