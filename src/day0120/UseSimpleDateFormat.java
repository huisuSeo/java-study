package day0120;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Formatter class => ������ �����ϴ� ���� �ϴ� Ŭ������.
 * java.text�� �����Ѵ�.
 * @author user
 *
 */
public class UseSimpleDateFormat {
	public UseSimpleDateFormat() {
		
		Date date = new Date();
		//1. Formatter class���� (����� ���� ����)
		SimpleDateFormat sdf = new SimpleDateFormat
				("yyyy-MM-dd a HH(kk,KK,hh) : mm : ss EEEE");
		
		
		//2. ������ ������ ��¥ ������ ���(Date�� has a)
		String formatDate = sdf.format(date);
		
		//3.���
		System.out.println(formatDate);
		System.out.println("--------------------------------------------");
		//Locale�� ����� �ٸ� ������ ��¥ ����.
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("yyyy0MM-dd a HH(hh) : mm : ss EEEE",Locale.JAPAN);
		
		System.out.println(sdf2.format(date));
		
	}//UseSimpleDateFormat

	public static void main(String[] args) {
		new UseSimpleDateFormat();

	}//main

}//class
