package com.pearl.genius.composite;

import com.pearl.genius.composite.example02.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class CompositeTest2 {

	private Computer computer;

	@Before
	public void setUp() {
		Body body1 = new Body(100,70);
		Body body2 = new Body(1000,70);
		Keyboard keyboard = new Keyboard(5,2);
		Monitor monitor = new Monitor(20,30);
		Speaker speaker = new Speaker(100,100);

		computer = new Computer();
		computer.addComponent(body1);
		computer.addComponent(body1);
		computer.addComponent(body1);
		computer.addComponent(body2);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);
		computer.addComponent(speaker);

		computer.removeComponent(body2);
		computer.removeComponent(body2);
		computer.removeComponent(body2);
	}

	@Test
	public void compositeTest() {
		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();
		log.info("{}", computerPrice + " W");
		log.info("{}", computerPower + " 만원");
	}
}