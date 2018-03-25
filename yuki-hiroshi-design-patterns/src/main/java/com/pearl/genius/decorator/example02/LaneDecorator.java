package com.pearl.genius.decorator.example02;

public class LaneDecorator extends DisplayDecorator {

	public LaneDecorator(Display decorateDisplay) {
		super(decorateDisplay);
	}

	public void draw() {
		super.draw();
		drawLane();
	}

	private void drawLane() {
		System.out.println("\t차선 표시");
	}
}
