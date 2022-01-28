package day0120;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : �������� ��¥ ������ ���� �� ����ϴ� Ŭ����
 * @author user
 *
 */
public class UseCalendar {
	
	public UseCalendar() {
//		Calendar cal = new Calendar();//�߻�Ŭ�����̹Ƿ� ��üȭ�� ���� �ʴ´�.
		//is a ������ ��üȭ
		Calendar cal = new GregorianCalendar();
		
		//�ڽ�Ŭ������ ����� ��üȭ
		GregorianCalendar gc = new GregorianCalendar();
		
		//static method�� ���.
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println("cal : " + cal);
		System.out.println("gc : " + gc);
		System.out.println("cal2 : " + cal2);
		
		System.out.println(cal2.get(Calendar.YEAR) + " / " + Calendar.YEAR);
		
		System.out.println("----------------------------------------------");
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int amPm = cal.get(Calendar.AM_PM);//0 - ����, 1 - ����
		int week = cal.get(Calendar.DAY_OF_WEEK);//1-��, 2-�� ~ 7-��
		//������ ���ڰ� �ƴ� ���ڿ��� ���
		
//		String weekText= "";
		String[] weekText = "��,��,ȭ,��,��,��,��".split(",");
		
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		
		int hour = cal.get(Calendar.HOUR);//12�ð���
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);//24�ð���
		
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int maximum = cal.getActualMaximum(Calendar.DATE);
		
//		switch(week) {
//		case Calendar.SUNDAY : weekText = "�Ͽ���";break;
//		case Calendar.MONDAY : weekText = "������";break;
//		}
		
		
		System.out.println(year + "-" + month + "-" + day + " " + 
		(amPm == Calendar.AM?"����" : "����") + " " + weekText[week - 1] + "����" + " " + 
				dayOfYear + " " + hour + "(" + hourOfDay + ") " + min + " : " + second);
		System.out.println("������ �� : " + maximum);
		
		System.out.println("---------------------------------------------------");
		
		Calendar cal4 = Calendar.getInstance();
		///�� ����
		cal4.set(Calendar.YEAR,2021);
		//�� ����
		cal4.set(Calendar.MONTH,3);
		//�� ����
		cal4.set(Calendar.DAY_OF_MONTH,1);
		
		
		System.out.println(cal4.get(Calendar.YEAR)  + cal4.get(Calendar.MONTH)+1 + 
				cal4.get(Calendar.DAY_OF_MONTH) + weekText[cal4.get(Calendar.DAY_OF_WEEK)-1]);
		
	}//UseCalendar
	public static void main(String[] args) {
		new UseCalendar();
	}//main

}//class
