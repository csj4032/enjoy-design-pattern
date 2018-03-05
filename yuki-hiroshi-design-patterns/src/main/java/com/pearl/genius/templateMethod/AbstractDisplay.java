package com.pearl.genius.templateMethod;

/**
 * Created by Administrator on 2015-07-21.
 */
public abstract class AbstractDisplay {

	public abstract void open();

	public abstract void print();

	public abstract void close();

	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}