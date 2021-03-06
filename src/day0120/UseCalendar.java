package day0120;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : 개별적인 날짜 정보를 얻을 때 사용하는 클래스
 * @author user
 *
 */
public class UseCalendar {
	
	public UseCalendar() {
//		Calendar cal = new Calendar();//추상클래스이므로 객체화가 되지 않는다.
		//is a 관계의 객체화
		Calendar cal = new GregorianCalendar();
		
		//자식클래스를 사용한 객체화
		GregorianCalendar gc = new GregorianCalendar();
		
		//static method를 사용.
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println("cal : " + cal);
		System.out.println("gc : " + gc);
		System.out.println("cal2 : " + cal2);
		
		System.out.println(cal2.get(Calendar.YEAR) + " / " + Calendar.YEAR);
		
		System.out.println("----------------------------------------------");
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int amPm = cal.get(Calendar.AM_PM);//0 - 오전, 1 - 오후
		int week = cal.get(Calendar.DAY_OF_WEEK);//1-일, 2-월 ~ 7-토
		//요일을 숫자가 아닌 문자열로 출력
		
//		String weekText= "";
		String[] weekText = "일,월,화,수,목,금,토".split(",");
		
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		
		int hour = cal.get(Calendar.HOUR);//12시간제
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);//24시간제
		
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int maximum = cal.getActualMaximum(Calendar.DATE);
		
//		switch(week) {
//		case Calendar.SUNDAY : weekText = "일요일";break;
//		case Calendar.MONDAY : weekText = "월요일";break;
//		}
		
		
		System.out.println(year + "-" + month + "-" + day + " " + 
		(amPm == Calendar.AM?"오전" : "오후") + " " + weekText[week - 1] + "요일" + " " + 
				dayOfYear + " " + hour + "(" + hourOfDay + ") " + min + " : " + second);
		System.out.println("마지막 날 : " + maximum);
		
		System.out.println("---------------------------------------------------");
		
		Calendar cal4 = Calendar.getInstance();
		///년 변경
		cal4.set(Calendar.YEAR,2021);
		//월 변경
		cal4.set(Calendar.MONTH,3);
		//일 변경
		cal4.set(Calendar.DAY_OF_MONTH,1);
		
		
		System.out.println(cal4.get(Calendar.YEAR)  + cal4.get(Calendar.MONTH)+1 + 
				cal4.get(Calendar.DAY_OF_MONTH) + weekText[cal4.get(Calendar.DAY_OF_WEEK)-1]);
		
	}//UseCalendar
	public static void main(String[] args) {
		new UseCalendar();
	}//main

}//class
