package day1229;
/**
삼항(조건) 연산자
? :
*/
class Operator6 {
	public static void main(String[] args) {
		int i = -1;
		System.out.println( i + " 은(는) " + (i > -1 ? "양수" : "음수") );

		i = 12;
		//i가 홀수 인지 짝수인지를 출력하는 코드
		System.out.println( i + " 은(는) " + ( i % 2 == 1 ? "홀수" : "짝수")); //2로 나눈 값은 어떤값이 나와요?
	}
}
