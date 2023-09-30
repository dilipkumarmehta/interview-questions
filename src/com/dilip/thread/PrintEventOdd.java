package com.dilip.thread;

import java.util.concurrent.atomic.AtomicLong;

public class PrintEventOdd {
	public static void main(String[] args) {
		AtomicLong num = new AtomicLong();

		Object lock = new Object();

		Even even = new Even(num, lock);
		Odd odd = new Odd(num, lock);
		odd.start();
		even.start();

	}
}

class Even extends Thread {
	AtomicLong num;
	Object lock;

	Even(AtomicLong Atnum, Object obj) {
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

class Odd extends Thread {
	AtomicLong num;
	Object lock;

	Odd(AtomicLong Atnum, Object obj) {
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
