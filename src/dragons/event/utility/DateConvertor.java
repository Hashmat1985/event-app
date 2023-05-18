package dragons.event.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConvertor {

	public LocalDate toLocalDate(String date ) {
		
		// How to convert String to LocalDate object.
		//First We need DateTimeFormatter of a pattern (MM/dd/yyyy);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		//Then LocalDate.parse()
				return LocalDate.parse(date, formatter);
	}
	
}
