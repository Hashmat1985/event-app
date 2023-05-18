package dragons.event;

import java.time.LocalDate;

import dragons.event.data.DataProvider;
import dragons.event.models.Event;

public class DragonsEventApp {

	public static void main(String[] args) {

		// Create object of Data provider Class.
		DataProvider dataProvider = new DataProvider();

		// we need to know what is today date.
		LocalDate todayDate = LocalDate.now();
		dataProvider.printMessage("Today's Date " + todayDate);
		// we need to find the event that is after today date.

		Event event = dataProvider.findNextEvent(todayDate);
		dataProvider.printEvent(event);

	}

}
