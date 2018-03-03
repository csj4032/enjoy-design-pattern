package factory.factoryMethod;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PizzaStoreTest {

	@Test
	public void pizzaTest() {
		Pizza pizza = new ChicagoStyleCheesePizza();
		assertThat(pizza.getName(), is("Chicago Style Deep Dish Cheese Pizza"));
	}

	@Test
	public void pizzaStoreTest() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		assertEquals("NY Style Sauce and Cheese Pizza", pizza.getName());
	}
}