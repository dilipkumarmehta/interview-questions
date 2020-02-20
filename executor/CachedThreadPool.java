package com.dilip.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10 ; i++) {
			executorService.execute(new Cached());
			
		}

	}
}

class Cached implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread Name " + Thread.currentThread().getName());
        
	}

}