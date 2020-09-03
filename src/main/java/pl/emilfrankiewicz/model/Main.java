package pl.emilfrankiewicz.model;

import pl.emilfrankiewicz.converter.TemperatureConverter;

public class Main {

	private String temp;
	private String temp_min;
	private String temp_max;

	public String getTemp() {
		return TemperatureConverter.kelvinToCelsius(temp);
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getTemp_min() {
		return TemperatureConverter.kelvinToCelsius(temp_min);
	}

	public void setTemp_min(String temp_min) {
		this.temp_min = temp_min;
	}

	public String getTemp_max() {
		return TemperatureConverter.kelvinToCelsius(temp_max);
	}

	public void setTemp_max(String temp_max) {
		this.temp_max = temp_max;
	}

	@Override
	public String toString() {
		return "Main [temp=" + TemperatureConverter.kelvinToCelsius(temp) + ", temp_min="
				+ TemperatureConverter.kelvinToCelsius(temp_min) + ", temp_max="
				+ TemperatureConverter.kelvinToCelsius(temp_max) + "]";
	}
}
