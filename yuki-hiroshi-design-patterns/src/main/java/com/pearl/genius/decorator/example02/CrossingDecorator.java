package com.pearl.genius.decorator.example02;

public class CrossingDecorator extends DisplayDecorator {

	public CrossingDecorator(Display decorateDisplay) {
		super(decorateDisplay);
	}

	public void draw() {
		super.draw();
		drawCrossing();
	}

	private void drawCrossing() {
		System.out.println("\t교차 표시");
	}
}