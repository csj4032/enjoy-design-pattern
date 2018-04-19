package com.pearl.genius.proxy;

import org.junit.Test;

/**
 * 일반적으로 프록시는 다른 무언가와 이어지는 인터페이스의 역할을 하는 클래스
 */
public class ProxyTest {

	@Test
	public void test() {
		Printable p = new PrinterProxy("Alice");
		System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
		p.setPrinterName("Bob");
		System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
		p.print("Hello world");
	}
}