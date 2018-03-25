package com.pearl.genius.decorator.example01;

import org.junit.Test;

/**
 * 여러 가지 추가 기능을 조합해야 하는 경우
 * 추가 기능을 조합한 하위 클래스를 만듬
 * 예) RoadDisplayWithCrossing, RoadDisplayWithLaneCrossing, RoadDisplayWithTrafficCrossing
 **/
public class Example01Test {

	@Test
	public void example01Test() {
		RoadDisplay roadDisplay = new RoadDisplay();
		roadDisplay.draw();

		RoadDisplay roadDisplayWithLane = new RoadDisplayWithLane();
		roadDisplayWithLane.draw();

		RoadDisplay roadDisplayWithTraffic = new RoadDisplayWithTraffic();
		roadDisplayWithTraffic.draw();

		RoadDisplay roadDisplayWithTrafficCrossing = new RoadDisplayWithTrafficCrossing();
		roadDisplayWithTrafficCrossing.draw();
	}
}
