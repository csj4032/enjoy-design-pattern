package com.pearl.genius.observer;

import org.junit.Test;

/**
 * 옵서버 패턴(observer pattern)은 객체의 상태 변화를 관찰하는 관찰자들,
 * 즉 옵저버들의 목록을 객체에 등록하여 상태 변화가 있을 때마다 메서드 등을 통해 객체가 직접 목록의 각 옵저버에게 통지하도록 하는 디자인 패턴이다
 * <p>
 * Observer는 관찰(observe) 하는 사람 즉 '관찰자' 라는 의미입니다.
 * Observer 패턴에서는 관찰 대상의 상태가 변화하면 관찰자에게 알려줍니다.
 * Observer 패턴은 상태 변화에 따른 처리를 기술할 때 효과적입니다.
 */
public class observerTest {

	@Test
	public void test() {
		NumberGenerator generator = new RandomNumberGenerator();

		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();

		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.execute();

	}
}