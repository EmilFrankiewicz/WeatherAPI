package pl.emilfrankiewicz.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.emilfrankiewicz.model.ResultWeather;

@RestController
public class WeatherContent {

	String URL = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={key}";
	String city = "Warsaw";
	String key = "8be8a2ebba645b1beae760d9ac5d4229";

	@GetMapping("/test")
	public void callGet() {

		RestTemplate restTemplate = new RestTemplate();
		ResultWeather response = restTemplate.getForObject(URL, ResultWeather.class, city, key);

		System.out.println(response);

	}
}
