package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private Message message;

	public WeatherData() {
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if (!observers.isEmpty()) observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(Message message) {
		this.message = message;
	}
}