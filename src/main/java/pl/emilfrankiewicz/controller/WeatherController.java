package pl.emilfrankiewicz.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import pl.emilfrankiewicz.exceptions.ResourceDoesNotExistException;
import pl.emilfrankiewicz.model.ResultWeather;

@RestController
public class WeatherController {

	private final String URL = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={key}";
	private final String key = "8be8a2ebba645b1beae760d9ac5d4229";
	private RestTemplate restTemplate = new RestTemplate();
	private ResultWeather resultWeather = new ResultWeather();

	@RequestMapping(value = "/api/WeatherAPI/{cityName}", method = RequestMethod.GET)
	public ResultWeather getWeatherByCityName(@PathVariable("cityName") String cityName)
			throws ResourceDoesNotExistException {
		
		try {
			resultWeather = restTemplate.getForObject(URL, ResultWeather.class, cityName, key);
		} catch (RestClientException e) {
			throw new ResourceDoesNotExistException("City not found.");
		}
		return resultWeather;
	}
}
