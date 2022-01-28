package day0104;

/**
 * 특수문자의 사용.
 * @author user
 *
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		//"안녕하세요?"를 한번 출력.
		//\문자 <= 특수문자는 몇가지의 종류만 사용할 수 있다.
		//System.out.println("\"안녕하세요?\"");
		System.out.println("안녕\n하세요?");		
		System.out.println("안녕\r하세요?");//\r특수문자를 따로 쓰면 줄을 변경하지만 TextArea
		//에서 enter key를 누르면 \r \n 코드 2개가 생긴다.
		System.out.println("안녕\t하세요?");
		System.out.println("오늘은 \"화요일\" 입니다.");
		System.out.println("오늘은 \'화요일\' 입니다.");
		System.out.println("내 파일은 e:\\temp\\new.txt파일 입니다.");
		System.out.println("안녕\b");
		
	}//main

}//class
