package com.dilip.thread;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	public void printNumber(int msg, ArrayList al) {
		while (msg > 0) {
			System.out.println("start" + Thread.currentThread().getName());
			synchronized (al) {
				al.add("AA");
				al.add("AA");
				System.out.println(this);
				for (Object object : al) {
					System.out.println(object + " :\t" + Thread.currentThread().getName());
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				al.removeAll(al);
			}

			System.out.println(msg + " after block \t" + Thread.currentThread().getName());
		}
		msg--;
	}
}
