package com.pearl.genius.templateMethod;

import org.junit.Before;
import org.junit.Test;

public class TemplateMethodTest {

	private AbstractDisplay d1;
	private AbstractDisplay d2;
	private AbstractDisplay d3;

	@Before
	public void setUp() {
		d1 = new CharDisplay('H');
		d2 = new StringDisplay("Hello World");
		d3 = new StringDisplay("안녕하세요");
	}

	@Test
	public void DisplayTest() {
		d1.display();
		d2.display();
		d3.display();
	}
}