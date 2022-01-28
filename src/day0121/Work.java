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
	
	public List<String> password() {//반환형을 사용할 때에도 Generic을 사용해주세요.
		List<String> list = new ArrayList<String>();
		String str = "`1234567890-=qwertyuiop[]asdfghjkl;’zxcvbnm,./QWERTYUIOASDFGHJKLZXCVBNM";
			
		int temp = ran.nextInt(8)+6;//난수를 뽑음
		
		for(int i = 0 ; i < temp ; i++) {
			int randomIndex = ran.nextInt(str.length());
			String word = Character.toString(str.charAt(randomIndex));
			list.add(word); 
		}//for
		
		return list;
	}//Work
	
	public List<String> name() {
		List<String> list = new ArrayList<String>();
		String[] name = {"강명준", "강산", "강현모", "권용현", "김예진", "김의정", "김정하", "김진영", "김현우"};
		
		int temp = ran.nextInt(11) + 10;
		
		for(int i = 0 ; i < temp ; i++) {
			int randomIndex = ran.nextInt(name.length);
			String word = name[randomIndex];
			list.add(word);
		}//for
		return list;
	}//name
	
	public void calendar() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n","일","월","화","수","목","금","토");
				
		
		for(int i = 1 ; i < 38 ; i++) { //37까지 반복하는 이유는 마지막날 뒤에 공백을 출력하고 싶어서그런건가요?
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
