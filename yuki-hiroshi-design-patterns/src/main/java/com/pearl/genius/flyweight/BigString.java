package com.pearl.genius.flyweight;

public class BigString {

	private BigChar[] bigChars;

	public BigString(String string) {
		bigChars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for (int i = 0; i < bigChars.length; i++) {
			BigChar bigChar = factory.getBigChar(string.charAt(i));
			bigChars[i] = bigChar;
		}
	}

	public void print() {
		for (int i = 0; i < bigChars.length; i++) {
			bigChars[i].print();
		}
	}
}