package pl.emilfrankiewicz.convert;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import pl.emilfrankiewicz.model.ResultWeather;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestResponse {

	private String[] messages;
	private ResultWeather result;

	public RestResponse() {
	}

	public String[] getMessages() {
		return messages;
	}

	public void setMessages(String[] messages) {
		this.messages = messages;
	}

	public ResultWeather getResult() {
		return result;
	}

	public void setResult(ResultWeather result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "RestResponse [messages=" + Arrays.toString(messages) + ", result=" + result + "]";
	}

}