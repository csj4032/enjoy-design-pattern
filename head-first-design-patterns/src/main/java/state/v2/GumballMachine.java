package state.v2;

public class GumballMachine {

	State soldOutState;
	State state;

	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
	}

	public void insertQuarter() {
		state.insertQuarter();
	}
}
