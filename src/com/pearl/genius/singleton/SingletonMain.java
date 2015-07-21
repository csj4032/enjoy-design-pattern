package com.pearl.genius.singleton;

/**
 * Created by genius on 15. 7. 21..
 */
public class SingletonMain {

	public static void main(String[] args) throws Exception {
		//Singleton singleton1 = Singleton.getInstance();
		//Singleton singleton2 = Singleton.getInstance();

		//if(singleton1 == singleton2) {
		//	System.out.println("동일한 인스턴스");
		//}
		SingletonMain singletonMain = new SingletonMain();
		singletonMain.test();
	}


	public void test() throws Exception {

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				int count = 0;
				while (count < 1000) {
					try {
						Singleton singleton1 = Singleton.getInstance();
						System.out.println(threadName + " : " + singleton1.getNextTickerNumber());
					} catch (Exception e) {
						e.printStackTrace();
					}
					count++;
					//System.out.println(threadName + " : " + count);
				}
			}
		});
		thread1.setName("Thread1");

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				int count = 0;
				while (count < 1000) {
					try {
						Singleton singleton2 = Singleton.getInstance();
						System.out.println(threadName + " : " + singleton2.getNextTickerNumber());
					} catch (Exception e) {
						e.printStackTrace();
					}
					count++;
					//System.out.println(threadName + " : " + count);
				}
			}
		});
		thread2.setName("Thread2");

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
	}
}