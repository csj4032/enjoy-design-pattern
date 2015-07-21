package com.pearl.genius.singleton;

/**
 * Created by genius on 15. 7. 21..
 */
public class Singleton {

	//private static Singleton singleton = new Singleton();
	//private static Singleton singleton;
	private volatile static Singleton singleton;
	private int ticket = 0;

	private Singleton() {
		System.out.println("Singleton 생성");
	}

	/*
	public static synchronized Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	*/

	public static Singleton getInstance() {
		if(singleton == null) {
			synchronized (Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	public int getNextTickerNumber() {
		return ticket++;
	}
}