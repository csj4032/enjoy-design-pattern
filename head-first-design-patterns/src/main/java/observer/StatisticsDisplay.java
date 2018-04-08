package observer;

public class StatisticsDisplay implements Observer {

	private final Subject subject;

	public StatisticsDisplay(Subject weatherData) {
		subject = weatherData;
	}

	@Override
	public void update(Message message) {

	}
}
