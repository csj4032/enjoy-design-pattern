package com.pearl.genius.decorator.example02;

public class TrafficDecorator extends DisplayDecorator {

	public TrafficDecorator(Display decorateDisplay) {
		super(decorateDisplay);
	}

	public void draw() {
		super.draw();
		drawTraffic();
	}

	private void drawTraffic() {
		System.out.println("\t교통량 표시");
	}
}
