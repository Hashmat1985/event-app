package dragons.event.data;

import java.time.LocalDate;

import dragons.event.models.Event;
import dragons.event.utility.ConsoleOutput;
import dragons.event.utility.DateConvertor;

public class DataProvider extends ConsoleOutput {

	// This Class is out event data source
	// An Array for Events can Store event.
	// We need method to create object of events.
	// We need a method to find the event.
	private Event[] events = new Event[5];

	public DataProvider() {
		generateEventData();
	}

	public void generateEventData() {
		Event event1 = new Event("MLK Day", "02/16/2023", true);
		events[0] = event1;

		Event event2 = new Event("President's Day", "02/20/2023", true);
		events[1] = event2;

		Event event3 = new Event("Easter Sunday", "04/09/2023", false);
		events[2] = event3;

		Event event4 = new Event("Mother's Day", "05/14/2023", false);
		events[3] = event4;
		Event event5 = new Event("Memorial Day", "05/29/2023", true);
		events[4] = event5;
	}

	public Event findNextEvent(LocalDate date) {
		DateConvertor convertor = new DateConvertor();
		for (Event event : events) {
			LocalDate eventDate = convertor.toLocalDate(event.getDate());
			// to check if a LocalDate is After another local Date
			// we use method is After
			if (eventDate.isAfter(date)) {
				return event;
			}
		}
		// in case array is empty
		// or in case event not found we return null to the method
		printError("No Event Found returning null");
		return null;
	}

}
