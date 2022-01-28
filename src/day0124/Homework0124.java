package day0124;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Homework0124 {
	
	public String trans(String kind, int distance, int day) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("마을버스", 800 );
		map.put("버스", 1250 );
		map.put("지하철", 1300 );
		Set<String> keys = map.keySet();
		
		if(!keys.contains(kind)) {
			return "대중교통 수단이 아닙니다.";
		}//if
		
		int def = map.get(kind);
		int add = 0;
		if(distance > 10) {
			add = (distance - 10) / 5 * 100;
		}//if
		int all = (def + add) * day;
		
		String sentence = "입력교통수단 " + kind + " 이동거리 " + distance + "km 기본요금 " + def + "원 초과요금 " + 
		add + "원 한달 " + day + "일 기준 교통비 " + all + "원";
		return sentence;
	}//trans
	
	
	

	public static void main(String[] args) {
		Homework0124 hw = new Homework0124();
		
		System.out.println(hw.trans("지하", 15, 20));
		
		Random ran = new Random(new Random().nextLong());
		String[] transf = {"마을버스","버스","지하철","따릉이"};
		
			
			
			List<String> list = new ArrayList<String>();
			
			
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(31);
			int r3 = ran.nextInt(3) + 20;
			list.add(hw.trans(transf[r1], r2, r3));//이 코드를 여러번 (20~22 중 하나)를 실행해서 여러개를 리스트에 저장해서 출력하는 거에요. 
		for(String a : list) {
			System.out.println(a);
		}//for

	}//main

}//class
