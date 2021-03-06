package day0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Homework24 {
	private Map<String,Integer> map;//갹체가 생성될 때 한번만 만들어지게
	
	public Homework24() {
	map = new HashMap<String,Integer>();
	map.put("마을버스", 800);
	map.put("버스", 1250);
	map.put("지하철", 1300);
	}
	
	public String overCharge(String transit, int distance) {
		
		String result = "대중교통이 아닙니다";
		if (map.containsKey(transit)) {
			int fee = map.get(transit);
			int overFee = ((distance-10)/5)*100+100;
			if (distance <= 10) {
				overFee = 0;
			}
			result = String.format
					("입력 교통수단: %s\t 이동거리: %dkm\t 기본요금: %d\t 초과요금: %d원\t 한달20일기준교통비: %d", 
					transit,distance,fee,overFee,((fee+overFee))*20);
		} 
		return result;
	}
	
	public void useOverCharge() {
		String[] transArr = {"버스","지하철","택시","따릉이"};
		List<String> list = new ArrayList<String>();
		Random r = new Random();
		int days = r.nextInt(3)+21;
		
		for (int i = 1; i < days; i++) {
			list.add(overCharge(transArr[r.nextInt(4)], r.nextInt(30)+1));
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		Homework24 hm= new Homework24();
		//1
		System.out.println(hm.overCharge("버스", 12));
		System.out.println("------------------------------------------------------------------");
		//2
		hm.useOverCharge();
		
		System.out.println("----------------------------------------------");

	}

}
