package strategy.step1;

public class RubberDuck extends Duck {

	@Override
	public void quack() {
		System.out.println("오리 삑삑!!!");
	}

	@Override
	public void display() {
		System.out.println("Rubber Duck 입니다.");
	}

	@Override
	public void fly() {
	}
}
