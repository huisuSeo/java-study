package day0105;

/**
 *1. 어디에서나 호출할 수 있고, 태어난 해를 입력받아 나이를 연산하여 출력하는 method 작성.
 *2. 정수를 입력받아서(Main method의 arguments를 받는것이 아님) 대문자, 소문자, 숫자에 해당하는 범위라면
    해당 문자로 출력하고, 그렇지 않다면 입력된 숫자를 출력하는 method 작성.
 * @author user
 */
public class Day0105Work {

	public void age(int c) {
		System.out.println((2022 - c + 1) + "살" );
	}//age
	
	public void letter(int c) {
		if((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
		System.out.println((char)c);
		}else {
			System.out.println(c);
		}//if
	}//letter
	
	public static void main(String[] args) {
		
		Day0105Work dw = new Day0105Work();
		
		
		dw.age(1995);

		dw.letter(122);
	}//main

}//class
