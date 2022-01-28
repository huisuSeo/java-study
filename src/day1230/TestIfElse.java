package day1230;
/**
if~else : 둘 중 하나의 코드를 실행해야 할 때.
*/
class TestIfElse {
	public static void main(String[] args) {
	//음수, 양수 인지를 판별하는 코드 작성.

	int num = -12;

	if(num > -1){
		System.out.println("양수");
	}else{
		System.out.println("음수");
	}//end if

	//홀수, 짝수 구분

	int num1 = 12;

	System.out.print( num1 + "은(는) ");
	if(num1 % 2 == 0){
		System.out.println("짝수");
	}else{
		System.out.println("홀수");
	}//end else

	//입력받은 점수가 0~100 사이면 "유효점수" 를 그렇지 않으면 "무효점수"를 출력하는 코드 작성

	int score = Integer.parseInt( args[0]);

	System.out.print(score + "점은 ");

	if(score >= 0 && score <= 100){
		System.out.println("유효점수");
	}else{
		System.out.println("무효점수");
	}//end else

	//args[1]으로 입력되는 값을 정수로 변환하고, 변환된 값이 대문자의 범위라면 대문자로 출력하고
	//그렇지 않다면 숫자를 그대로 출력

	int num2 = Integer.parseInt( args[1]);

	System.out.print(num2 + "은(는) ");

	if(num2 > 64 && num2 < 91){
		System.out.println((char)num2);
	}else{
		System.out.println(num2);
	}//end else


	}//main
}//class
