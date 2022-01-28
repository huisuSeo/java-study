package day1229;
/**
	main method에 외부값 입력하여 사용하기.
*/
class UseArguments {
	public static void main(String[] args) {
		System.out.println("처음 값 : " + args[0]);
		System.out.println("두번째 값 : " + args[1]);

		System.out.println(args[0] + args[1]);

		//int i = args[0]; error 문자열은 기본형에 저장할 수 없다.
		//int j = args[1];

		int i = Integer.parseInt( args[0]);//문자열을 int형으로 변환하여 int형 변수에 할당.
		int j = Integer.parseInt( args[1]);//

		System.out.println(args[0] + " + " + args[1] + " = " + (i + j) );

		System.out.println( "i = " + i + ", j = " + j + " " + (i > j ? i + "가 큽니다." : j + "가 큽니다."));
	}
}
