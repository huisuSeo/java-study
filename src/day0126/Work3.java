package day0126;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work3 {
	public Map<String, List<String>> week(int year){
		Calendar cal = Calendar.getInstance();
		Map<String,List<String>> map = new HashMap<String, List<String>>();
		cal.set(Calendar.YEAR, year);
		for(int i = 0 ; i < 12 ; i++) {
			cal.set(Calendar.MONTH, i);
			cal.set(Calendar.DATE, 1);
			int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			List<String> list = new ArrayList<String>();
			
			for(int j = 1 ; j <= lastday ; j++) {
				cal.set(Calendar.DAY_OF_MONTH, j);
				int dow = cal.get(Calendar.DAY_OF_WEEK);
				if(dow == 7 || dow == 1) {
					list.add(String.valueOf(j));
				}
			}
			map.put(String.valueOf(i + 1), list);
		}
	return map;	
	}
	
	public void print(int year) {
		Work3 w3 = new Work3();
		Map<String, List<String>> map = w3.week(year);
		for(int i = 0 ; i < 12 ; i++) {
		System.out.println((i + 1) + "¿ù Äá´«ÀÌ º¸´Â ³¯Àº" + map.get(String.valueOf(i + 1)));
		}
	}

	public static void main(String[] args) {
		Work3 w = new Work3();
		w.print(2022);
	}//main

}//class
