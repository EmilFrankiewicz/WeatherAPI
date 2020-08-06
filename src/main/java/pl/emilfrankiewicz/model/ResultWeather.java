package pl.emilfrankiewicz.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ResultWeather {

	private String name;
	private Weather[] weather;
	private Main main;
	private Sys sys;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Weather[] getWeather() {
		return weather;
	}
	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	@Override
	public String toString() {
		return "ResultWeather [name=" + name + ", weather=" + Arrays.toString(weather) + ", main=" + main + ", sys="
				+ sys + "]";
	}
	

	
	
}
