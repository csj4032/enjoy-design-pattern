package com.pearl.genius.decorator;

import org.junit.Test;

/**
 * 데커레이터 패턴은 기본 기능에 추가할 수 있는 기능의 종류가 많은 경우에 각 추가 기능을 Decorator 클래스로 정의한 후
 * 필요한 Decorator 객체를 조합함으로써 추가 기능의 조합을 설계하는 방식
 */
public class DecorateTest {

	@Test
	public void decorateTest(){
		Display b1 = new StringDisplay("Hello, world");
		Display b2 = new SideBorder(b1, '#');
		Display b3 = new FullBorder(b2);
		b1.show();

		System.out.println();
		b2.show();

		System.out.println();
		b3.show();

		System.out.println();
		Display b4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("안녕하세요")), '*'))),'/');
		b4.show();
	}
}