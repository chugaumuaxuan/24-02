package Local;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class convertStringtoObjDatetime {
	public static void main(String[] args) {
		
		
		String dateString = " 01-03-2022";
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		//convert String To Obj
		Date startDate;
		try {
			startDate = df.parse(dateString);
			String newDateString = df.format(startDate);
			System.out.println(newDateString);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//convert Obj to String
		Date today = Calendar.getInstance().getTime();        
		String todayAsString = df.format(today);

		System.out.println(todayAsString);
		
		
		//convert long to Obj
		
		Date d = new Date(1220227200L * 1000);
		System.out.println(d);
		
	}
}
