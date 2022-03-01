package Local;

import java.time.Period;
import java.time.ZonedDateTime;

public class ZonedDateTimeEXP {
	
	public static void main(String[] args) {
		
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone);
		System.out.println(zone.getZone());
		
		//plus
		ZonedDateTime zone1 = zone.plus(Period.ofDays(12));
		System.out.println(zone1);
		
		//minus
		ZonedDateTime zone2 = zone.minus(Period.ofMonths(2));
		System.out.println(zone2);
		
		
		
		
		
	}
}
