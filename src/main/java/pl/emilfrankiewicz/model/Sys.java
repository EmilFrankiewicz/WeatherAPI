package pl.emilfrankiewicz.model;

import pl.emilfrankiewicz.converter.TimeConverter;

public class Sys {

	private String country;
	private String sunrise;
	private String sunset;
	private TimeConverter timeConverter = new TimeConverter();

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSunrise() {
		return timeConverter.sunriseFromMillisecondToTime(sunrise);
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunset() {
		return timeConverter.sunsetFromMillisecondToTime(sunset);
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	@Override
	public String toString() {
		return "Sys [country=" + country + ", sunrise=" + timeConverter.sunriseFromMillisecondToTime(sunrise)
				+ ", sunset=" + timeConverter.sunsetFromMillisecondToTime(sunset) + "]";
	}
}
