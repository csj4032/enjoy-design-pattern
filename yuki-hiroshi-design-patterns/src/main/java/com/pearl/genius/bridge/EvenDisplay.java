package com.pearl.genius.bridge;

public class EvenDisplay extends Display {

	public EvenDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void evenDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			if ((i & 1) == 0) {
				print();
			} else {
				System.out.println();
			}
		}
		close();
	}
}
