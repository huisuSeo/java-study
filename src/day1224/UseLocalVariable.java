package day1224;
/**
	지역변수의 사용.
*/
class  UseLocalVariable{
	//Java Application
	public static void main(String[] args) {
		//1. 변수 선언 : 변수명이 다르다면 몇개든 선언할 수 있다.
		int i; //초기화가 되지 않운 변수.
		int age = 0; //초기화된 변수.
		//2. 값 할당
		i = 2021;
		age = 27;
		System.out.println(age);
		//값 할당을 여러번 할 수 있다.
		age = 28;

		
		//3. 사용
		System.out.println( i );
		System.out.println( "내 나이는 " + age + "살" );

		//변수명을 한글로 부여.(한글로 작성하지 않는다.)
		int 나이 = 0;
		int 올해 = 2021;
		나이 = 27;

		int 태어난해 = 올해 - 나이 + 1;
		System.out.println("내 나이 " + 나이 + "살" );
		System.out.println( 태어난해 );

	}//main
}//class
