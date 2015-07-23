package com.pearl.genius.composite.example01;

/**
 * Created by Administrator on 2015-07-23.
 */
public class Body {

	private int price;
	private int power;

	public Body(int power, int price) {
		this.power = power;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
}