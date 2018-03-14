package com.pearl.genius.bridge;

public class NumericDisplayImpl implements DisplayImpl {

	private String number;
	private int width;

	public NumericDisplayImpl(String string) {
		this.number = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + number + "|");
	}

	@Override
	public void rawClose() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}