package pl.emilfrankiewicz.converter;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeConverter {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("k:mm").withZone(ZoneId.of("Europe/Paris"));

	private String formatTime(Instant time) {
		return formatter.format(time);
	}

	public String sunriseFromMillisecondToTime(String sunrise) {
		return formatTime(Instant.ofEpochSecond(Long.parseLong(sunrise)));
	}

	public String sunsetFromMillisecondToTime(String sunset) {
		return formatTime(Instant.ofEpochSecond(Long.parseLong(sunset)));
	}
}
