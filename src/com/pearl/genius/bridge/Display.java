package com.pearl.genius.bridge;

/**
 * Created by Administrator on 2015-07-23.
 */
public class Display {

	private DisplayImpl impl;

	public Display(DisplayImpl impl) {
		this.impl = impl;
	}

	public void open() {
		impl.rawOpen();
	}

	public void print() {
		impl.rawPrint();
	}

	public void close() {
		impl.rawClose();
	}

	public final void display() {
		open();
		print();
		close();
	}
}