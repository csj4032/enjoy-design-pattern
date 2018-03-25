package com.pearl.genius.decorator.example01;

public class RoadDisplayWithLane extends RoadDisplay {

	public void draw() {
		super.draw();
		drawLane();
	}

	private void drawLane() {
		System.out.println("차선 표시");
	}
}