package com.pearl.genius.composite;

import com.pearl.genius.composite.example01.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class CompositeTest1 {

	private Body body;
	private Keyboard keyboard;
	private Monitor monitor;
	private Computer computer;
	private Speaker speaker;

	@Before
	public void setUp() {
		body = new Body(100, 70);
		keyboard = new Keyboard(5, 2);
		monitor = new Monitor(20, 30);
		speaker = new Speaker(10, 20);

		computer = new Computer();
		computer.addBody(body);
		computer.addKeyboard(keyboard);
		computer.addMonitor(monitor);
		computer.addSpeaker(speaker);
	}

	@Test
	public void compositeTest() {
		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();
		log.info("{}", computerPrice + " W");
		log.info("{}", computerPower + " 만원");
	}
}