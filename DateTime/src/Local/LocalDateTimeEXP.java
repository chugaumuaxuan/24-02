package Local;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeEXP {
	public static void main(String[] args) {
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Before Formatting: " +datetime);
		
		//format date to string 
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		String formatdate = format.format(datetime);
		System.out.println("After format: " +  formatdate);
		
		//plus
		LocalDateTime datetime2 = datetime.plusDays(12);
		String formatdate2 = format.format(datetime2);
		System.out.println(formatdate2);
		
		//get()
		LocalDateTime datetime3 = LocalDateTime.of(2022, 12, 27, 17, 20);
		System.out.println("day of years: " + datetime3.get(ChronoField.DAY_OF_YEAR));
		System.out.println("hour of day: " + datetime3.get(ChronoField.HOUR_OF_DAY));
		
	}
}
