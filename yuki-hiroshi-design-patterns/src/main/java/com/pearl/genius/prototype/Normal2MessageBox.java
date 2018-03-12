package com.pearl.genius.prototype;

public class Normal2MessageBox extends AbstractMessageBox {

	public Normal2MessageBox(String decorateString) {
		super(decorateString);
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		lineDecorate(length);
		System.out.println(s);
		lineDecorate(length);
	}

	private void lineDecorate(int length) {
		for (int i = 0; i < length; i++) System.out.print(decorateString);
		System.out.println("");
	}
}