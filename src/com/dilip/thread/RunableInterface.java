package com.dilip.thread;

class Runable1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

public class RunableInterface {
	public static void main(String[] args) {

		Runnable r = () -> System.out.println("hello");
		Thread t = new Thread(r);
		t.start();
	}
}
