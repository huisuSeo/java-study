package day0103;

/**
 * swich~case의 사용.
 * @author user
 */
public class UseSwitchCase {

	public static void main(String[] args) {
		//1.변수선언
		int i = 30;
		
		switch( i ) { //타서=>찾기=>흘러내려
		case 0 : System.out.println("0인경우");
		case 1 : System.out.println("1인경우");
		case 2 : System.out.println("2인경우");
		case 3 : System.out.println("3인경우");
		default : System.out.println("상수가 없는 경우");
		
		}//end switch
		
		//switch의 상수에는 입력되는 변수의 범위까지만 사용할 수 있다.
		char j = 'A';//byte, short, int, /*long - switch에 사용할 수 없다.*/, char
		switch (j) {
		case 65:System.out.println("실행");
//		case 'A':System.out.println("실행");//문자를 case에 사용하든지, Unicode값을 사용하든지
		case 1:
		}//end switch
		
		//JDK1.7에서 부터는 문자열을 비교할 수 있다.
		String str = "가나다";
		switch( str ) {
		}
		
		/////////////////////////////////////////break 사용 ////////////////////////////////////
		
		i = 0;
		switch( i ) {
		case 0 : System.out.println("A");
		case 1 : System.out.println("B"); break;//switch 빠져나감.
		case 2 : System.out.println("C");
		case 3 : System.out.println("D"); break;
		default : System.out.println("E");
		}
		
		
	}//main

}//class
