package com.pearl.genius.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {

	private int money;
	private ArrayList fruits;

	public Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList();
	}

	public int getMoney() {
		return money;
	}

	public void addFruit(String fruit) {
		fruits.add(fruit);
	}

	public List getFruits() {
		return fruits;
	}
}