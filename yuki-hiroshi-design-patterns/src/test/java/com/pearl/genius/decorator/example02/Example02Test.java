package com.pearl.genius.decorator.example02;

import org.junit.Test;

public class Example02Test {

	@Test
	public void exampleTest() {
		Display road = new RoadDisplay();
		road.draw();

		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();

		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw();

		Display roadWithLaneAndCrossing = new CrossingDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndCrossing.draw();

		Display roadWithLaneAndCrossingAndTraffic = new TrafficDecorator(new CrossingDecorator(new LaneDecorator(new RoadDisplay())));
		roadWithLaneAndCrossingAndTraffic.draw();
	}
}