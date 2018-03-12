package factory.abstractfactory;

public interface PizzaIngrediedientFactory {

	Dough createDough();

	Sauce createSause();

	Cheese createCheese();

	Veggies[] createVeggies();

	Pepperoni createPepperoni();

	Clams createClam();
}
