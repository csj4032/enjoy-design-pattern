package state.v2;

public interface State {

	void insertQuarter();

	void ejectQuarter();

	void turnCrank();

	void dispense();

	void refill();
}
