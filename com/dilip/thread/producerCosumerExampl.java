package com.dilip.thread;

public class producerCosumerExampl {
	public static void main(String[] args) {

		ProducerConsumer pc = new ProducerConsumer();
		Producer1 p = new Producer1(pc);
		Consumer1 c = new Consumer1(pc);
		p.start();
		c.start();
	}
}

class Producer1 extends Thread {
	ProducerConsumer pc;

	public Producer1(ProducerConsumer pc) {
		super();
		this.pc = pc;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			pc.produce(i);
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class Consumer1 extends Thread {
	ProducerConsumer pc;

	public Consumer1(ProducerConsumer pc) {
		super();
		this.pc = pc;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			int consume = pc.consume();
			System.out.println(consume);
		}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ProducerConsumer {

	boolean avaialbe = false;
	int cpdata;

	public synchronized void produce(int data) {
		while (avaialbe) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		cpdata = data;
		avaialbe = true;
		notify();
	}

	public synchronized int consume() {
		while (avaialbe == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notify();
		avaialbe = false;
		return cpdata;

	}
}