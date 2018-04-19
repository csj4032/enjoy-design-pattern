package com.pearl.genius.flyweight;

import org.junit.Test;

/**
 * 플라이웨이트 패턴(Flyweight pattern)는 동일하거나 유사한 객체들 사이에 가능한 많은 데이터를 서로 공유하여 사용하도록 하여 메모리 사용량을 최소화하는 소프트웨어 디자인 패턴이다.
 */
public class FlyweightTest {

	@Test
	public void test() {
		BigString bs = new BigString("010-3529-7530");
		bs.print();
	}
}