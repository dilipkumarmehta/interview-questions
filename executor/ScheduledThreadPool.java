package com.dilip.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
	public static void main(String[] args) {

		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
		
		//executorService.schedule(new Scheduled(), 2, TimeUnit.SECONDS);
		//executorService.scheduleAtFixedRate(new Scheduled(),/*initial delay*/ 1,/*period*/ 5, TimeUnit.SECONDS);
		executorService.scheduleWithFixedDelay(new Scheduled(), 1, 5,TimeUnit.SECONDS);
		
	}
}

class Scheduled implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread Name " + Thread.currentThread().getName());
        
	}

}