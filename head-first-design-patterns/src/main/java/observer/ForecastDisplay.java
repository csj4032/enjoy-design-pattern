package observer;

public class ForecastDisplay implements Observer {

	private final Subject weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public void update(Message message) {

	}
}
