package com.pearl.genius.decorator.example02;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
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

@Builder
@Getter
@Setter
class Item {
	private Long id;
	private String name;
	private int price;
	private int isdn;
	private String banner;
}

interface Validator {
	boolean validation(Item item);
}


class ValidatorPrice implements Validator {

	private Validator validator;

	public ValidatorPrice(Validator validator) {
		this.validator = validator;
	}

	@Override
	public boolean validation(Item item) {
		validator.validation(item);
		if (item.getPrice() > 0) {
			return true;
		} else {
			throw new RuntimeException();
		}
	}
}

class ValidatorIsdn implements Validator {

	private Validator validator;

	public ValidatorIsdn(Validator validator) {
		this.validator = validator;
	}

	@Override
	public boolean validation(Item item) {
		validator.validation(item);
		if (item.getIsdn() > 0) {
			return true;
		} else {
			throw new RuntimeException("");
		}

	}
}

class ValidatorName implements Validator {
	@Override
	public boolean validation(Item item) {
		if (item.getName().length() > 10) {
			return true;
		} else {
			throw new RuntimeException("name");
		}
	}
}
