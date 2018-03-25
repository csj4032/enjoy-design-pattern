package com.pearl.genius.decorator.example01;

public class RoadDisplayWithTrafficCrossing extends RoadDisplay {

	public void draw() {
		super.draw();
		drawTraffic();
		drawCrossing();
	}

	private void drawTraffic() {
		System.out.println("교통량 표시");
	}

	private void drawCrossing() {
		System.out.println("\t 교차로 표시");
	}
}