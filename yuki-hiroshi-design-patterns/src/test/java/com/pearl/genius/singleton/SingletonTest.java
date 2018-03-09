package com.pearl.genius.singleton;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void singletonTest() throws InterruptedException {

		Thread thread1 = new Thread(getRunnable());
		thread1.setName("Thread1");

		Thread thread2 = new Thread(getRunnable());
		thread2.setName("Thread2");

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
	}

	private Runnable getRunnable() {
		return () -> {
			String threadName = Thread.currentThread().getName();
			int count = 0;
			while (count < 1000) {
				try {
					Singleton singleton = Singleton.getInstance();
					System.out.println(threadName + " : " + singleton.getNextTickerNumber());
				} catch (Exception e) {
					e.printStackTrace();
				}
				count++;
				//System.out.println(threadName + " : " + count);
			}
		};
	}
}