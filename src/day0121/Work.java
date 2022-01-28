package day0121;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public class Work {
	public Random ran;
	public Work() {
		this.ran = new Random(new Random().nextLong());
	}//Work
	
	public List<String> password() {//��ȯ���� ����� ������ Generic�� ������ּ���.
		List<String> list = new ArrayList<String>();
		String str = "`1234567890-=qwertyuiop[]asdfghjkl;��zxcvbnm,./QWERTYUIOASDFGHJKLZXCVBNM";
			
		int temp = ran.nextInt(8)+6;//������ ����
		
		for(int i = 0 ; i < temp ; i++) {
			int randomIndex = ran.nextInt(str.length());
			String word = Character.toString(str.charAt(randomIndex));
			list.add(word); 
		}//for
		
		return list;
	}//Work
	
	public List<String> name() {
		List<String> list = new ArrayList<String>();
		String[] name = {"������", "����", "������", "�ǿ���", "�迹��", "������", "������", "������", "������"};
		
		int temp = ran.nextInt(11) + 10;
		
		for(int i = 0 ; i < temp ; i++) {
			int randomIndex = ran.nextInt(name.length);
			String word = name[randomIndex];
			list.add(word);
		}//for
		return list;
	}//name
	
	public void calendar() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n","��","��","ȭ","��","��","��","��");
				
		
		for(int i = 1 ; i < 38 ; i++) { //37���� �ݺ��ϴ� ������ �������� �ڿ� ������ ����ϰ� �;�׷��ǰ���?
			if(i < 7) {
				System.out.print("\t");
			}else {
			System.out.printf("%d\t",i - 6);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	
		}
		
		}//calendar
	
	

	public static void main(String[] args) {
	Work w = new Work();
	System.out.println(w.password());
	List<String> list = w.name();
	for(String i : list) {
		System.out.printf("%3s,",i);
	}//for
	System.out.println();
	w.calendar();
	
		
	}//main

}//class
