package com.pearl.genius.factoryMethod;

import com.pearl.genius.factoryMethod.framework.Factory;
import com.pearl.genius.factoryMethod.framework.Product;
import com.pearl.genius.factoryMethod.idcard.IDCardFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * 팩토리 메소드 패턴에서는 객체를 생성하기 위한 인터페이스를 정의하는데, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만듭니다.
 * 팩토리 메서드 패턴을 이용하면 클래스의 인스턴스를 만드는 일을 서브클래스에게 맡기는 것이죠
 */
public class FactoryMethodTest {

	private Factory factory;

	@Before
	public void setUp() {
		factory = new IDCardFactory();
	}

	@Test
	public void cardTest() {
		Product card1 = factory.create("강길동");
		Product card2 = factory.create("김길동");
		Product card3 = factory.create("홍길동");

		card1.use();
		card2.use();
		card3.use();
	}
}