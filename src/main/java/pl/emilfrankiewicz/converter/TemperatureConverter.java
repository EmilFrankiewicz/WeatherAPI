package pl.emilfrankiewicz.converter;

public class TemperatureConverter {

	public static final String kelvinToCelsius(String kelvin) {
		Double celsius = (Double.parseDouble(kelvin) - 273.15);
		Double roundOff = Math.round(celsius * 10) / 10.0;
		return roundOff.toString();
	}
}
