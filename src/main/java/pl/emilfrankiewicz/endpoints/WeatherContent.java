package pl.emilfrankiewicz.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.emilfrankiewicz.convert.Response;

@RestController
public class WeatherContent {

	String URL = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={key}";
	String city = "Warsaw";
	String key = "8be8a2ebba645b1beae760d9ac5d4229";

	@RequestMapping("/test")
	public void callGet() {
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(URL, String.class, city, key);
		System.out.println(response.toString());
	}
}
