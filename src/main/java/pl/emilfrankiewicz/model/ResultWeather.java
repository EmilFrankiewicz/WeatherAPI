package pl.emilfrankiewicz.model;

public class ResultWeather {

	private String name;
	private String temperature;

	public ResultWeather() {
	}

	// not necessary
	public ResultWeather(String name, String temperature) {
		this.name = name;
		this.temperature = temperature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "ResultWeather [name=" + name + ", temperature=" + temperature + "]";
	}

}
