package day0120;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Work {
	
	public String getDay(CustomDate customDate) {
		Calendar cal = new GregorianCalendar();
		String[] weekText = "일,월,화,수,목,금,토".split(",");
		cal.set(Calendar.YEAR,customDate.year);
		cal.set(Calendar.MONTH,customDate.month - 1);
		cal.set(Calendar.DAY_OF_MONTH,customDate.day);
		
		
		return weekText[cal.get(Calendar.DAY_OF_WEEK) - 1];
	}//getDay
	
	
	public String nation(int n) {
		Date date = new Date();
		Locale locale = new Locale("KOREA");
		switch(n) {
		case 0 : locale = Locale.KOREA; break;
		case 1 : locale = Locale.US; break;
		case 2 : locale = Locale.CHINA; break;
		case 3 : locale = Locale.JAPAN; break;
		case 4 : locale = Locale.UK; break;
		
		}//switch
		SimpleDateFormat sdf = 
				new SimpleDateFormat("MM-dd-yyyy EEEE HH : mm",locale);
		return sdf.format(date);
	}//nation
	
	
	

	public static void main(String[] args) {
		Work w = new Work();
		System.out.println(w.nation(1));
		CustomDate cd = new CustomDate(1995,9, 15);
		System.out.println(w.getDay(cd));
	}//main

}//class
