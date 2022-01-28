package day0105;

/**
 * while 사용.(시작과 끝을 모를 때 사용하는 반복문)<br>
 * 최소 0번 수행에 최대 조건까지 수행.
 * @author user
 */
public class UseWhile {

	public static void main(String[] args) {
		//1~9까지 출력
		int i = 1;//초기값 -> 기역변수
		while(i < 10) {//조건식
			System.out.print(i + " ");//반복수행문장
			i++;//증.감소식
		}//while
		
		System.out.println();
		//1~100까지 수 중에 3의 배수만 출력
		
		i = 1;
		while(i < 101) {
			if(i % 3 == 0) {
			System.out.print(i + " ");
			}
			i++;
		}//while
		
		System.out.println();
		//while을 사용하여 구구단 9단을 출력
		
		int k = 9;
		int j = 1;
		while(j < 10) {
	
			System.out.println(k + " * " + j + " = " + k*j);
			j++;
		}//while
		
		//while 무한루프
		while(true) {
			System.out.println("무한루프");
			break;
		}
		
	}//main

}//class
