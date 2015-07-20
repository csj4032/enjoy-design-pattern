package com.pearl.genius.templateMethod;

/**
 * Created by Administrator on 2015-07-21.
 */
public class StringDisplay extends AbstractDisplay {

	private String str;
	private int width;

	public StringDisplay(String str) {
		this.str = str;
		width = str.getBytes().length;
		System.out.println(width);
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + str + "|");
	}

	@Override
	public void close() {
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
