package observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
	private float temperature;
	private float humidity;
	private float pressure;

	public Message(int temperature, int humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
}
