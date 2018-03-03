package factory.simpleFactory;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PizzaTestDrive {

	private Pizza pizza;

	@Test
	public void pizzaTest() {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		pizza = factory.createPizza("cheese");
		assertThat(pizza.getName(), is("Cheese Pizza"));
		pizza = factory.createPizza("pepperoni");
		assertThat(pizza.getName(), is("Pepperoni Pizza"));
	}
}