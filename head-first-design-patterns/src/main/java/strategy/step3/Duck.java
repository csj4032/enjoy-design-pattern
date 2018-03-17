package strategy.step3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	abstract void display();

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
