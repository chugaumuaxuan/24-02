package ClassDateAndCalendar;

import java.util.Calendar;

public class ClassCalendarEXP {
	
	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		
		System.out.println(ca.getTime());
		
		System.out.println("Year: " + ca.get(ca.YEAR));
		System.out.println("Day of Year: " + ca.get(ca.DAY_OF_YEAR));
		System.out.println("Hour of day: " + ca.get(ca.HOUR_OF_DAY));
		
		ca.add(ca.DATE, 15);
		System.out.println(ca.getTime());
		ca.add(ca.MONTH, 2);
		System.out.println(ca.getTime());
		
		
		
	}
}
