package com.pearl.genius.facade;

import org.junit.Test;

import java.io.IOException;

/**
 *  Facade 역할은 시스템의 외부에 대해서는 단순한 인터페이스(API)를 보여줍니다.
 */
public class facadeTest {

	@Test
	public void test() throws IOException {
		PageMaker.makeWelcomePage("youngjin@youngjin.com", "welcome.html");
	}
}