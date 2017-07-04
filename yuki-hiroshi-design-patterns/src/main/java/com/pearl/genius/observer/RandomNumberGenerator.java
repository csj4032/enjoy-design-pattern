package com.pearl.genius.observer;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumberGenerator extends NumberGenerator {

	private Random random = new Random();
	private int number;

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		Stream.generate(() -> number = random.nextInt(50)).limit(20).forEach(n -> notifyObservers());
//		Stream.iterate(0, n -> n + 1).limit(20).forEach(n -> {
//			number = random.nextInt(50);
//			notifyObservers();
//		});
	}
}
