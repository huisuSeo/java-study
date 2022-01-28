package day0120;

import java.text.DecimalFormat;

/**
 * ��������.
 * # : �����Ͱ� ������ ���� ���.
 * 0 : ���� ���� �κп� 0�� �־� ���.
 * @author user
 *
 */
public class UseDecimalFormat {
	public UseDecimalFormat() {
		int i = 1_500_000;//JDK1.7���� ���ʹ� ���ڿ� �����ڷ� _�� �־� �������� ��� ��ų �� �ִ�.
		//_�� ��µ��� �ʴ´�.
		System.out.println(i);
		
		DecimalFormat df = new DecimalFormat("#,###,###");
		System.out.println(df.format(i));
		
		DecimalFormat df2 = new DecimalFormat("00,000,000");
		System.out.println(df2.format(i));
		
		double d = 2022.0120;
		DecimalFormat df3 = new DecimalFormat("##,###,###.##");
		System.out.println(df3.format(d));
		DecimalFormat df4 = new DecimalFormat("00,000,000.00");
		System.out.println(df4.format(d));
		
		i = Integer.MAX_VALUE;
		DecimalFormat df5 = new DecimalFormat("#,###");
		System.out.println(df5.format(i));
	}

	public static void main(String[] args) {
		new UseDecimalFormat();
		}//main

}//class
