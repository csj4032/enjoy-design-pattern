package com.pearl.genius.prototype;

public class WarningMessageBox extends AbstractMessageBox {

	public WarningMessageBox(String decorateString) {
		super(decorateString);
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		lineDecorate(length);
		System.out.println(decorateString + "" + s + "" + decorateString);
		lineDecorate(length);
	}

	private void lineDecorate(int length) {
		for (int i = 0; i < length; i++) System.out.print(decorateString);
		System.out.println("");
	}
}