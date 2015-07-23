package com.pearl.genius.composite.example01;

/**
 * Created by Administrator on 2015-07-23.
 */
public class Computer {

	private Body body;
	private Keyboard keyboard;
	private Monitor monitor;
	private Speaker speaker;

	public void addBody(Body body) {
		this.body = body;
	}

	public void addKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public void addMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public int getPrice() {
		int bodyPrice = body.getPrice();
		int keyboardPrice = keyboard.getPrice();
		int monitorPrice = monitor.getPrice();
		int speakerPrice = speaker.getPrice();
		return bodyPrice + keyboardPrice + monitorPrice + speakerPrice;
	}

	public int getPower() {
		int bodyPower = body.getPower();
		int keyboardPower = keyboard.getPower();
		int monitorPower = monitor.getPower();
		int speakerPrice = speaker.getPower();
		return bodyPower + keyboardPower + monitorPower + speakerPrice;
	}
}