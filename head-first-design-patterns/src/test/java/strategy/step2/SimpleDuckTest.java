package strategy.step2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SimpleDuckTest {

	private List<Duck> ducks = new ArrayList();
	private MallardDuck mallardDuck;

	@Before
	public void setUp() {
		mallardDuck = new MallardDuck();
		ducks.add(mallardDuck);
	}

	@Test
	public void simpleDuckTest() {
		for (Object object : ducks) {
			if (object instanceof MallardDuck) {
				MallardDuck duck = (MallardDuck) object;
				duck.quack();
				duck.swim();
				duck.display();
				duck.fly();
			}

			if (object instanceof RedHeadDuck) {
				RedHeadDuck duck = (RedHeadDuck) object;
				duck.quack();
				duck.swim();
				duck.display();
				duck.fly();
			}
		}
	}
}
