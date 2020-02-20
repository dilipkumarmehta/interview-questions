package com.dilip.thread;

import java.util.concurrent.atomic.AtomicLong;

public class EvenOdd {
	
	public static void main(String[] args) {
		AtomicLong num = new AtomicLong(1);
		Object loc = new Object();
		Odd odd = new Odd(num, loc);
		Even evn = new Even(num, loc);
		odd.start();
		evn.start();

	}

}

class Even extends Thread {
	AtomicLong num;
	Object loc;

	Even(AtomicLong num, Object loc) {
		this.num = num;
		this.loc = loc;
	}

	public void run() {
		synchronized (loc) {
			while (true) {
				if (num.get() % 2 == 0 && num.get()<20) {
					System.out.println("Even Number" + num);
					try {
						loc.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					num.incrementAndGet();
					loc.notifyAll();
				}
			}
		}
	}
}

class Odd extends Thread {
	AtomicLong num;
	Object loc;

	Odd(AtomicLong num, Object loc) {
		this.num = num;
		this.loc = loc;
	}

	public void run() {
		synchronized (loc) {
			while (true) {
				if (num.get() % 2 != 0 && num.get()<20) {
					System.out.println("Odd Nubmer" + num);
					try {
						loc.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {

					num.incrementAndGet();
					loc.notifyAll();
				}
			}
		}

	}
}
