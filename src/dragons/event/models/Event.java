package dragons.event.models;

public class Event {
	// This class is Encapsulated class getter and Setter
	//to hold data for each event. 
	
	private String holidayName;
	private String date; 
	private boolean isFedHoliday;
	
	
	public Event(String holidayName, String date, boolean isFedHoliday) {
		
		this.holidayName = holidayName;
		this.date = date; 
		this.isFedHoliday = isFedHoliday;
		
	}


		
	


		
	


	public String getHolidayName() {
		return holidayName;
	}


	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public boolean isFedHoliday1() {
		return isFedHoliday;
	}	
	public void setFedHoliday(boolean isFedHoliday) {
		this.isFedHoliday = isFedHoliday;
	}


	public String getHolidayName1() {
		// TODO Auto-generated method stub
		return null;
	}


	public String isFedHoliday() {
		// TODO Auto-generated method stub
		return null;
	}

}
