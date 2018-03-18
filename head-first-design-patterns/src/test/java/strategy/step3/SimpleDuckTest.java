package strategy.step3;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SimpleDuckTest {

	List<Duck> ducks = new ArrayList();
	private Duck mallardDuck;
	private Duck redHeadDuck;
	private Duck rubberDuck;

	@Before
	public void setUp() {
		mallardDuck = new MallardDuck();
		redHeadDuck = new RedHeadDuck();
		rubberDuck = new RubberDuck();
		ducks.add(mallardDuck);
		ducks.add(redHeadDuck);
		ducks.add(rubberDuck);
	}

	@Test
	public void simpleDuckTest() {
		for (Duck duck: ducks) {
			duck.setFlyBehavior(new FlyRocketPowered());
			duck.setQuackBehavior(() -> System.out.println("꽥"));
			duck.performFly();
			duck.performQuack();
			duck.display();
			duck.swim();
		}
	}
}