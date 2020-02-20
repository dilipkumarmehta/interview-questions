package com.dilip.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterService1 {
	public static void main(String[] args) {

		int pro = Runtime.getRuntime().availableProcessors();
		System.out.println(pro);
		ExecutorService es = Executors.newFixedThreadPool(20);
		ExecutorService ctp = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 100; i++) {
			ctp.submit(new myExecuter());
			
		}

	}
}

class myExecuter implements Callable {	@Override
	public Object call() throws Exception {
		System.out.println("hello");
		return Thread.currentThread().getName();
	}

}