package state.v3;

public interface State {

	void insertQuarter();

	void ejectQuarter();

	void turnCrank();

	void dispense();

	void refill();
}
