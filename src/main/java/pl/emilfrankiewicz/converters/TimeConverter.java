package pl.emilfrankiewicz.converters;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// i w ogole to uproscic bo naćkane za duzo
public class TimeConverter {

	static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("k:mm")
			.withZone(ZoneId.of("Europe/Paris"));

	static String formatTime(Instant time) {
		return formatter.format(time);
	}

	public String sunriseMillisecondToDate(String sunrise) {

		Long sunriseTime = Long.parseLong(sunrise);   // tu jeszcze na longa pomyslec warto
		System.out.println(formatTime(Instant.ofEpochSecond(sunriseTime)));
		return formatTime(Instant.ofEpochSecond(sunriseTime));

	}

	public String sunsetMillisecondToDate(String sunset) {
		Long sunsetTime = Long.parseLong(sunset);
		System.out.println(formatTime(Instant.ofEpochSecond(sunsetTime)));
		return formatTime(Instant.ofEpochSecond(sunsetTime));

	}
}
