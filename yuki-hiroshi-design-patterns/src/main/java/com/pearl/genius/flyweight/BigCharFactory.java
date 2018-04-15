package com.pearl.genius.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BigCharFactory {

	private Map<Character, BigChar> pool = new ConcurrentHashMap<>();
	private static BigCharFactory singleton = new BigCharFactory();

	private BigCharFactory() {
	}

	public static BigCharFactory getInstance() {
		return singleton;
	}

	public BigChar getBigChar(char charName) {
		//If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
		//return pool.putIfAbsent(charName, new BigChar(charName));

		//If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.
		return pool.computeIfAbsent(charName, k -> new BigChar(k));
	}
}