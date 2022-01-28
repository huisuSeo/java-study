package day0125;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work2 {
	public Map<String,List<String>> weekend(int year){
		Calendar cal = Calendar.getInstance();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		cal.set(Calendar.YEAR, year);
		for(int i = 0 ; i < 12 ; i++) {
			cal.set(Calendar.MONTH, i);
			cal.set(Calendar.DATE, 1);
			int lastday = cal.getActualMaximum(Calendar.DATE);
			
			List<String> list = new ArrayList<String>();
			for(int j = 1 ; j <= lastday ; j++) {
				cal.set(Calendar.DATE,j);
				int dow = cal.get(Calendar.DAY_OF_WEEK);
				if(dow == 7 || dow == 1) {
					list.add(String.valueOf(j));
				}
			}
			map.put(String.valueOf(i + 1), list);
			
		}
		System.out.println(map);
		return map;
	}
		public void print(int year) {
			Work2 w2 = new Work2();
			Map<String, List<String>> map = w2.weekend(year);
			System.out.println(year + "년 휴일 정보");
			for(int i = 1 ; i < 13 ; i++) {
				System.out.println(year+"년 "+(i)+"월 주말, "+map.get(String.valueOf(i)));
			}
		}
	
	

	public static void main(String[] args) {
		Work2 w = new Work2();
		w.weekend(2022);
//		w.print(2022);
	}//main

}//class
