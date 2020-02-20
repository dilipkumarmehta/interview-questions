package com.dilip.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixThreadPool {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(50);
		for (int i = 0; i < 20; i++) {
			executorService.execute(new TaskFixd());
			//System.out.println("Thread Name " + Thread.currentThread().getName());
		}

	}
}

class TaskFixd implements Runnable {
	@Override
	public void run() {
	
		System.out.println("Thread Name " + Thread.currentThread().getName());
        
	}

}