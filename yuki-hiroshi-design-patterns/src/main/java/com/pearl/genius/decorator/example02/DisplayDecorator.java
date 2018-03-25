package com.pearl.genius.decorator.example02;

public abstract class DisplayDecorator implements Display {

	private Display decorateDisplay;

	public DisplayDecorator(Display decorateDisplay) {
		this.decorateDisplay = decorateDisplay;
	}

	@Override
	public void draw() {
		decorateDisplay.draw();
	}
}