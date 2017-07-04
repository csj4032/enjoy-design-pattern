package com.pearl.genius.factoryMethod;

import com.pearl.genius.factoryMethod.framework.Factory;
import com.pearl.genius.factoryMethod.framework.Product;
import com.pearl.genius.factoryMethod.idcard.IDCardFactory;

/**
 * 상위 클래스에서 동작의 골격을 이해하고 거기에서 사용되고 있는 추상 메소드가 무엇인지를 확인하고 또한 그 추상 메소드를 실제 로 구현하고 있는 클래스의 소스 코드를 살펴볼 필요가 있
 */
public class FactoryMethodMain {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("강길동");
		Product card2 = factory.create("김길동");
		Product card3 = factory.create("홍길동");
	}
}