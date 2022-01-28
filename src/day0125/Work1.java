package day0125;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author user
 * 주말에 해달하는 일자 뽑기
 * 숙제 01/25
 */
public class Work1 {
	
	
	public Map<String,List<Integer>> weekend(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year); //입력받은 year로 변경
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>(); // Map
		
//		int day = Calendar.DAY_OF_MONTH;
//		int dayOfWeek = Calendar.DAY_OF_WEEK;  //상수를 변수에 저장해서 변경한다는 의미라 지금은 안써도 됨
		
		List<Integer> list = null;
		int lastDay = 0 ;//월의; 마지막날을 저장할 변수
		
		for (int i = 0; i < 12; i++) {
			list = new ArrayList<Integer>(); //휴일을 저장할 List 생성
			cal.set(Calendar.MONTH, i);//0~11월이 설정
			lastDay = cal.getActualMaximum(Calendar.DATE);//설정된 월의 마지막 날 얻기
			System.out.println(cal.get(Calendar.MONTH) + " " + lastDay);
			for (int j = 1 ; j < lastDay ; j++) {
				cal.set(Calendar.DAY_OF_MONTH, j);//일자 설정
				
				switch(cal.get(Calendar.DAY_OF_WEEK)) {//설정된 일자의 요일 비교
				case Calendar.SUNDAY: list.add(j); break;
				 	case Calendar.SATURDAY: list.add(j); break; //1, 7이라고 쓰지말고, constant로 쓰기..
				 }//end switch
				map.put(String.valueOf(i+1), list);
			} // end for
			//출력하는 일
		} // end for
		//월을 설정하기 전에 모든 월에 존재라는 일로 초기화
		cal.set(Calendar.DAY_OF_MONTH,1);
		
//		System.out.println(map.get(12));
		return map;
	}// weekend

	public void print(Map<String,List<Integer>> map, int year) {
		System.out.println(year + "년 휴일 정보");
		for(int i = 1 ; i < 13 ; i++) {
			System.out.println(year+"년 "+(i)+"월 주말, "+map.get(String.valueOf(i)));
		}
	}
	
	
	public static void main(String[] args) {

		Work1 w1 = new Work1();
		int year = 2022;
		w1.print(w1.weekend(year),year);

	}// main

}//class
