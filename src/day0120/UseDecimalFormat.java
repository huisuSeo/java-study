package day0120;

import java.text.DecimalFormat;

/**
 * 숫자포맷.
 * # : 데이터가 존재할 때만 출력.
 * 0 : 값이 없는 부분에 0을 넣어 출력.
 * @author user
 *
 */
public class UseDecimalFormat {
	public UseDecimalFormat() {
		int i = 1_500_000;//JDK1.7에서 부터는 숫자에 구분자로 _를 넣어 가독성을 향상 시킬 수 있다.
		//_는 출력되지 않는다.
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
