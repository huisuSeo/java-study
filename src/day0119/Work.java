package day0119;

/**
 * 1번숙제
 * @author user
 *
 */
public class Work {
	public static final int UPPER_CASE = 0;
	public static final int LOWER_CASE = 1;
	public static final int NUMBER = 2;
	
	/**
	 * 임시 비밀번호를 생성하는 일
	 * @return
	 */
	public char[] tempPassword() {
		char[] temp = new char[8];
		
		int flag = 0;
		for(int i = 0 ; i < temp.length ; i++) {
			flag = (int)(Math.random()*3);
			switch(flag) {
			case UPPER_CASE : temp[i] = (char)((Math.random()*26) + 65);
			break;
			case LOWER_CASE : temp[i] = (char)((Math.random()*26) + 97);
			break;
			case NUMBER : temp[i] = (char)((Math.random()*10) + 48);
			break;
			}//switch
					
		}//for
		return temp;
		
	}//tempPassword
	
	
	public char[] tempPasswoed2() {
		char[] temp = new char[8];
		
		int tempNum = 0;
		for(int i = 0 ; i < temp.length ; i++) {
			tempNum = (int)(Math.random()*123);
			if((tempNum > 47 && tempNum < 58) ||(tempNum > 64 && tempNum < 91) ||
			(tempNum > 96 && tempNum < 123)) {
				temp[i] = (char)tempNum;
				i++;
			}//if
			
		}//for
		
		return temp;
	}
	
	public char[] tempPassword3() {
		char[] temp = new char[8];
		String passwordSet = "`1234567890-=qwertyuiop[]asdfghjkl;'zxcvbnm,./";
		int passSetSize = passwordSet.length();
		for(int i = 0 ; i < temp.length ; i++) {
			temp[i] = passwordSet.charAt((int)(Math.random()*passSetSize));
		}//for
		return temp;
	}//tempPassword3
	
	/**
	 * 비밀번호를 출력하는 일
	 */
	public void printPassword(char[] tempPass) {
		System.out.println(tempPass);
	}//printPassword

	public static void main(String[] args) {
		Work w = new Work();
		char[] temp = w.tempPassword3();
		w.printPassword(temp);
	}//main

}//class
