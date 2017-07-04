package com.pearl.genius.memento.game;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Memento {

	public int money;
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