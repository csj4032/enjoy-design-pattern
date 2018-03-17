package strategy.step3;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SimpleDuckTest {

	List<Duck> ducks = new ArrayList();
	private Duck mallardDuck;
	private Duck redHeadDuck;

	@Before
	public void setUp() {
		mallardDuck = new MallardDuck();
		redHeadDuck = new RedHeadDuck();
		ducks.add(mallardDuck);
		ducks.add(redHeadDuck);
	}

	@Test
	public void simpleDuckTest() {
		for (Duck duck: ducks) {
			duck.setFlyBehavior(() -> System.out.println("날아보자"));
			duck.setQuackBehavior(() -> System.out.println("꽥"));
			duck.performFly();
			duck.performQuack();
			duck.display();
			duck.swim();
		}
	}
}