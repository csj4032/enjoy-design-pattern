package com.pearl.genius.facade;

import org.junit.Test;

import java.io.IOException;

public class facadeTest {

	@Test
	public void test() throws IOException {
		PageMaker.makeWelcomePage("youngjin@youngjin.com", "welcome.html");
	}
}
