package pl.emilfrankiewicz.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Weather {

	private String description;
	private String main;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	@Override
	public String toString() {
		return "Weather [description=" + description + ", main=" + main + "]";
	}
}
