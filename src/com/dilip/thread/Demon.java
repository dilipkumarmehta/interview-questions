package com.dilip.thread;

public class Demon {
	public static void main(String[] args) {
		DemonTest t = new DemonTest();
		t.setDaemon(true);
		t.start();
		System.out.println("end of main thread");
	}

}

class DemonTest extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
