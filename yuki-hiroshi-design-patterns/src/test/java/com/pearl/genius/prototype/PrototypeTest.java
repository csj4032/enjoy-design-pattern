package com.pearl.genius.prototype;

import com.pearl.genius.prototype.framework.Manager;
import com.pearl.genius.prototype.framework.MessageBox;
import org.junit.Before;
import org.junit.Test;

public class PrototypeTest {

	private Manager manager;

	@Before
	public void setUp() {
		manager = new Manager();
		manager.register("warning box", new WarningMessageBox("*"));
		manager.register("normal box", new NormalMessageBox("+"));
		manager.register("normal2 box", new Normal2MessageBox("++"));
	}

	@Test
	public void prototypeTest() {
		MessageBox p1 = manager.create("warning box");
		p1.use("Hello world");

		System.out.println("");

		p1 = manager.create("normal box");
		p1.use("Hello world");

		p1 = manager.create("normal2 box");
		p1.use("Hello world!!!!!!");
	}
}