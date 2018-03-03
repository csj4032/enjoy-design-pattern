package factory.simpleFactory;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<>();
}