package day0119;

import java.util.StringTokenizer;

public class HomeWork {
	
	public char[] password() {
		int[] number = new int[8];
		char[] password = new char[8];
			for(int i = 0 ; i < 8 ; i ++) {
				int ran = (int)(Math.random()*3);
				switch(ran) {
				case 0 : number[i] = ((int)(Math.random()*26) + 65);
				break;
				case 1 : number[i] = ((int)(Math.random()*26) + 97);
				break;
				case 2 : number[i] = ((int)(Math.random()*10) + 48);
				break;
				}//switch
			
				password[i] = (char)number[i];
			}//for
		
			
		return password;
	}//password
	
	
	public int[] lotto() {
		int[] lotto = new int[6];
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = ((int)(Math.random()*45) + 1);
	
			
			for(int j = 0 ; j < i ; j++) {
			if(lotto[i] == lotto[j]) {
				i--; //i가 감소하더라도 안쪽 for가 실행되기 때문에 
				break;//로 중복번호가 발생히면 빠져나가서 해당번째방에 다시 번호를 생성하도록 하시면 됩니다.
			}//if
			}//for
		}//for
		
		return lotto;
	}//lotto
	
	public String[] stringTokenizier() {
		String csvData = "우짤래미,저짤래미.뇌절티비~쿠쿠루삥뽕,포항항";
		StringTokenizer stk = new StringTokenizer(csvData,",.~");
		
		String[] result = new String[stk.countTokens()];
		
		String token = "";
		int i = 0;
		while(stk.hasMoreTokens()) {
			token = stk.nextToken();
			result[i++] = token;
			
		}//while
		
		return result;
	}//stringTokenizier
	
	 
	public int firstName(String firstname) {
		String data = "김의정,강명준,권용현,정인선,김예진,강산,김진영,김현우,박설진,서지숙,신유철,이내혁,강현모,장정우,김정하,장형근,전민정,정시헌,최연이,황성준,서희수";
		StringTokenizer stk = new StringTokenizer(data,firstname);
		int name = stk.countTokens() - 1;
		
		return name;
	}//firstName
	
	
	

	public static void main(String[] args) {
		HomeWork hw = new HomeWork();
		//1번
		System.out.println(hw.password());
		
		//2번
		for(int num : hw.lotto()) {
			System.out.print(num + " ");
		}//for
		
		System.out.println();
		
		//3번
		for(String str : hw.stringTokenizier()) {
			System.out.print(str + " ");
		}//for
		
		System.out.println();
		
		//4번
		System.out.println(hw.firstName("서"));
		
		
	}//main;

}//class
