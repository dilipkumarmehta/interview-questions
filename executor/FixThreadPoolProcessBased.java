package com.dilip.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixThreadPoolProcessBased {
	public static void main(String[] args) {

		int count=Runtime.getRuntime().availableProcessors();
		System.out.println(count);
		ExecutorService executorService = Executors.newFixedThreadPool(count);
		for (int i = 0; i < 10; i++) {
			executorService.execute(new TaskFixdPr());
			System.out.println("Thread Name " + Thread.currentThread().getName());
		}

	}
}

class TaskFixdPr implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread Name " + Thread.currentThread().getName());
        
	}

}