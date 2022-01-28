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
		
		map.put("��������", 800 );
		map.put("����", 1250 );
		map.put("����ö", 1300 );
		Set<String> keys = map.keySet();
		
		if(!keys.contains(kind)) {
			return "���߱��� ������ �ƴմϴ�.";
		}//if
		
		int def = map.get(kind);
		int add = 0;
		if(distance > 10) {
			add = (distance - 10) / 5 * 100;
		}//if
		int all = (def + add) * day;
		
		String sentence = "�Է±������ " + kind + " �̵��Ÿ� " + distance + "km �⺻��� " + def + "�� �ʰ���� " + 
		add + "�� �Ѵ� " + day + "�� ���� ����� " + all + "��";
		return sentence;
	}//trans
	
	
	

	public static void main(String[] args) {
		Homework0124 hw = new Homework0124();
		
		System.out.println(hw.trans("����", 15, 20));
		
		Random ran = new Random(new Random().nextLong());
		String[] transf = {"��������","����","����ö","������"};
		
			
			
			List<String> list = new ArrayList<String>();
			
			
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(31);
			int r3 = ran.nextInt(3) + 20;
			list.add(hw.trans(transf[r1], r2, r3));//�� �ڵ带 ������ (20~22 �� �ϳ�)�� �����ؼ� �������� ����Ʈ�� �����ؼ� ����ϴ� �ſ���. 
		for(String a : list) {
			System.out.println(a);
		}//for

	}//main

}//class
