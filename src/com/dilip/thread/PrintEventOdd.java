package com.dilip.thread;

import java.util.concurrent.atomic.AtomicLong;

public class PrintEventOdd {
	public static void main(String[] args) {
		AtomicLong num = new AtomicLong();

		Object lock = new Object();

		Even1 even = new Even1(num, lock);
		Odd1 odd = new Odd1(num, lock);
		odd.start();
		even.start();

	}
}

class Even1 extends Thread {
	AtomicLong num;
	Object lock;

	Even1(AtomicLong Atnum, Object obj) {
		this.lock = obj;
		this.num = Atnum;
	}

	public void run() {
		synchronized (lock) {
			while (true) {
				if (num.get() % 2 != 0) {

					try {
						lock.wait(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else {
					System.out.println(Thread.currentThread().getName() + " Even" + num);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					num.incrementAndGet();
					lock.notifyAll();
				}

			}

		}

	}
}

class Odd1 extends Thread {
	AtomicLong num;
	Object lock;

	Odd1(AtomicLong Atnum, Object obj) {
		this.lock = obj;
		this.num = Atnum;
	}

	public void run() {
		synchronized (lock) {
			while (true) {
				if (num.get() % 2 == 0) {

					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else {
					System.out.println(Thread.currentThread().getName() + " odd" + num);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					num.incrementAndGet();
					lock.notifyAll();
				}

			}

		}

	}
}
