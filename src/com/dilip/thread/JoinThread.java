package com.dilip.thread;

public class JoinThread {
	public static void main(String[] args) throws InterruptedException {
		Thread3 th = new Thread3();
		th.start();
		th.join();
		for (int i = 0; i < 20; i++) {
			System.out.println("main thread");
		}
	}
}

class Thread3 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}