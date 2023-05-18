package dragons.event.utility;

import dragons.event.models.Event;

public class ConsoleOutput {
	
	// Method to print a message (normal);
	public  void printMessage(String message) {
		System.out.println("Info: " + message);
	}
	//Method to print error (in red)
	public  void printError(String message) {
		System.err.println("Error: " + message);
	}
	//Method to print event information
	
      public void printEvent(Event event) {
      
		//Null check for event object.
    	  if (event != null) {
  			printMessage("Holiday Name " + event.getHolidayName());
  			printMessage("Event Date " + event.getDate());
  			printMessage("Federal Holiday " + event.isFedHoliday());
  			
  		}else {
  			printError("Not a good event object");
		
			
		}
	}

}
