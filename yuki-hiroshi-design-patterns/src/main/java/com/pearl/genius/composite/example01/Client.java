package com.pearl.genius.composite.example01;

public class Client {

	public static void main(String[] args) {
		Body body = new Body(100, 70);
		Keyboard keyboard = new Keyboard(5,2);
		Monitor monitor = new Monitor(20,30);

		Computer computer = new Computer();
		computer.addBody(body);
		computer.addKeyboard(keyboard);
		computer.addMonitor(monitor);

		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();

		System.out.println(computerPrice + " W");
		System.out.println(computerPower + " 만원");
	}
}