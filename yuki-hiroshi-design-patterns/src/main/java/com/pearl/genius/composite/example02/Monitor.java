package com.pearl.genius.composite.example02;

public class Monitor extends ComputerDevice {

	private int price;
	private int power;

	public Monitor(int power, int price) {
		this.price = price;
		this.power = power;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getPower() {
		return power;
	}
}
