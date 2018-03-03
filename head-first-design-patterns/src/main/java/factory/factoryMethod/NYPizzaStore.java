package factory.factoryMethod;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) return new NYStyleCheesePizza();
		if (type.equals("veggie")) return new NYStyleVeggiePizza();
		if (type.equals("clam")) return new NYStyleClamPizza();
		if (type.equals("pepperoni")) return new NYStylePepperoniPizza();
		return null;
	}
}
