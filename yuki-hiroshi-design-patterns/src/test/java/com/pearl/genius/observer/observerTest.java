package com.pearl.genius.observer;

import org.junit.Test;

public class observerTest {

	@Test
	public void test() {
		NumberGenerator generator = new RandomNumberGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.execute();

		System.out.println();

		generator.deleteObserver(observer1);
		generator.execute();
	}
}