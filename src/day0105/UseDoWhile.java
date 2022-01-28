package day0105;

/**
 * do~while사용.
 * 최소 1번 수행에 최대 조건까지 수행.
 * @author user
 */
public class UseDoWhile {

	public static void main(String[] args) {
		
		int i = 0;//초기값
		do {
			System.out.println(i);//반복수행 문장
			i++;//증.감소식
		}while(i < 10);//조건식

		//단을 main method arguments로 입력받아 입력받은 단으로 구구단 출력.
		int j = Integer.parseInt(args[0]);
		int k = 1;
		do {
			System.out.println(j + " * " + k + " = " + j * k);
			k++;
		}while(k < 10);
		
	
				
		
	}//main

}//class
