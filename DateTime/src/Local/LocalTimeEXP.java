package Local;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeEXP {
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime time1 = LocalTime.of(12, 10, 30);
		System.out.println(time1);
		
		
		//plus
		LocalTime time2 = time1.plusHours(12);
		System.out.println(time2);
		
		//minus
		LocalTime time3 = time1.minusMinutes(120);
		System.out.println(time3);
		
		//zone
		ZoneId zone1 = ZoneId.of("Europe/London");
		LocalTime time4 = LocalTime.now(zone1);
		System.out.println(time4);
	}
}
