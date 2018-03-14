package com.pearl.genius.bridge;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * ‘기능의 클래스 계층’ 과 ‘구현의 클래스 계층’ 사이에 다리를 놓는다
 * 기능 클래스 : Display
 * 구현 클래스 : DisplayImpl
 * Bridge 패턴의 특정은 ‘기능의 클래스 계층’ 과 ‘구현의 클래스 계층’ 을 분리하는 것입니다.
 * 이 두 개의 클래스 계층을 분리해 두면 각각의 클래스 계층을 독립적으로 확장할 수 있습니다.
 *
 **/
public class BridgeTest {

	private Display d1;
	private Display d2;
	private CountDisplay d3;
	private CountDisplay d4;
	private EvenDisplay d5;

	@Before
	public void setUp() {
		d1 = new Display(new StringDisplayImpl("Hello Korea"));
		d2 = new CountDisplay(new StringDisplayImpl("Hello World"));
		d3 = new CountDisplay(new StringDisplayImpl("Hello Universe."));
		d4 = new CountDisplay(new NumericDisplayImpl("1234567890"));
		d5 = new EvenDisplay(new NumericDisplayImpl("1234567890"));
	}

	@Test
	public void bridgeTest() {
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		d4.display();
		d5.display();
		d5.evenDisplay(10);
	}
}
