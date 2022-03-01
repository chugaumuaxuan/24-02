package Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEXP {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate date1 = LocalDate.of(2020, 12, 27);
		
		System.out.println("Kiem tra nam nhuan: " + date1.isLeapYear());
		
		//plus day
		LocalDate yesterday = date.minusDays(1);
		System.out.println(yesterday);
		
		//minus day
		LocalDate tomorrow = date1.plusDays(1);
		System.out.println(tomorrow);
		
		LocalDateTime datetime = date.atTime(4, 20, 01);
		System.out.println(datetime);
		
		//format date to string 
		LocalDate date2 = LocalDate.of(2007, 03, 22);
		String strDate2 = date2.format(DateTimeFormatter.ISO_DATE);
		System.out.println(strDate2);
		
		
	}
}
