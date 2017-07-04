package com.pearl.genius.composite.example02;

/**
 * Created by Administrator on 2015-07-23.
 */
public class Client {

	public static void main(String[] args) {
		Body body1 = new Body(100,70);
		Body body2 = new Body(1000,70);
		Keyboard keyboard = new Keyboard(5,2);
		Monitor monitor = new Monitor(20,30);
		Speaker speaker = new Speaker(100,100);

		Computer computer = new Computer();
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

		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();

		System.out.println(computerPower + "W");
		System.out.println(computerPrice + "만원");
	}
}
