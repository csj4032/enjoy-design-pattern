package strategy.step1;

import org.junit.Before;
import org.junit.Test;

public class SimpleDuckTest {

	private Duck duck;
	private Duck mallardDuck;
	private Duck redHeadDuck;
	private Duck rubberDuck;

	@Before
	public void setUp() {
		duck = new Duck();
		mallardDuck = new MallardDuck();
		redHeadDuck = new RedHeadDuck();
		rubberDuck = new RubberDuck();
	}

	@Test
	public void simpleDuckTest() {
		duck.quack();
		duck.swim();
		duck.display();
		duck.fly();

		System.out.println();

		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.display();
		mallardDuck.fly();

		System.out.println();

		redHeadDuck.quack();
		redHeadDuck.swim();
		redHeadDuck.display();
		redHeadDuck.fly();

		System.out.println();
		rubberDuck.quack();
		rubberDuck.swim();
		rubberDuck.display();
		rubberDuck.fly();
	}
}
