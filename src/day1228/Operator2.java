package day1228;
/**
산술연산자
+, -, *, /, %
*/
public class Operator2 {
	public static void main(String[] args) {
	//자바는 정수 / 정수 = 정수가 나온다.
		int num = 10;
		System.out.println(num / 3);
		//정수 / 실수 = 실수가 나온다.
		System.out.println((double)num / 3);
		int i = 20212021;
		System.out.println(i + "를 두가지의 수로 얻기 " + i%2);//1

		int birth = 1995;
		System.out.println( birth + "를 12로 나눈 나머지 " + birth%12 );//0~11까지
	}//main
}//class
