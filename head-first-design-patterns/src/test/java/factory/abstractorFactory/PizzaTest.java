package factory.abstractorFactory;

import factory.abstractfactory.ChicagoPizzaStore;
import factory.abstractfactory.NYPizzaStore;
import factory.abstractfactory.Pizza;
import factory.abstractfactory.PizzaStore;
import org.junit.Before;
import org.junit.Test;

public class PizzaTest {

	private PizzaStore nyStore;
	private PizzaStore chicagoStore;

	@Before
	public void setUp() {
		nyStore = new NYPizzaStore();
		chicagoStore = new ChicagoPizzaStore();
	}

	@Test
	public void pizzaTest() {
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
