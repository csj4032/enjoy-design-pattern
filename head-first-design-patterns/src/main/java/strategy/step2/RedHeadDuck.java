package strategy.step2;

public class RedHeadDuck extends Duck implements Flyable, Quackable {

	@Override
	public void quack() {
		System.out.println("꽥꽥!!!");
	}

	@Override
	public void display() {
		System.out.println("RedHead Duck 입니다.");
	}

	@Override
	public void fly() {
		System.out.println("오리가 난다?");
	}
}
