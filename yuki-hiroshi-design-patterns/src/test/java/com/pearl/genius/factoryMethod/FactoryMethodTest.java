package com.pearl.genius.factoryMethod;

import com.pearl.genius.factoryMethod.framework.Factory;
import com.pearl.genius.factoryMethod.framework.Product;
import com.pearl.genius.factoryMethod.idcard.IDCardFactory;
import org.junit.Before;
import org.junit.Test;

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