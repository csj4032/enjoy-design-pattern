package com.pearl.genius.flyweight;

import java.util.HashMap;

public class BigCharFactory {

	private HashMap pool = new HashMap();
	private static BigCharFactory singleton = new BigCharFactory();

	private BigCharFactory() {
	}

	public static BigCharFactory getInstance() {
		return singleton;
	}

	public synchronized BigChar getBigChar(char charName) {
		BigChar bc = (BigChar) pool.get("" + charName);
		if (bc == null) {
			bc = new BigChar(charName);
			pool.put("" + charName, bc);
		}
		return bc;
	}
}