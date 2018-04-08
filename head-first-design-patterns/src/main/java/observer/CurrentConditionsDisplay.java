package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private final Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Message message) {
		this.temperature = message.getTemperature();
		this.humidity = message.getHumidity();
		display();
	}
}
