package day0104;

/**
 * 반복문(loop statement)
 * 시작과 끝을 알 떄 사용하는 반복문 for문.<br>
 * 단일 for문
 * @author user
 */
public class UseFor {

	public static void main(String[] args) {
		//0~9까지 10번 반복되는 for문.
//		for(int i = 0 ; i < 10 ; i++) {
//			System.out.println("안녕하세요?" + i);
//		}//end for
//
//		안녕하세요?를 한번 출력하는 코드 작성.
		for(int i = 0 ; i < 1 ; i++) {
			System.out.println("안녕하세요?");
		}//end for
		//1~10까지 1씩 증가하는 값을 행으로 출력.(이전의 값과 다음 값은 탭으로 구분하여 출력
		
		for(int i = 1 ; i < 11 ; i++) {
			System.out.print(i + "\t");
		}//end for
		System.out.println();
		//1~100까지 수 중에 짝수만 출력.(이전의 값과 다음 값을 공백(white space)으로 구분하여 출력
		for(int i = 1 ; i <= 100 ; i++ ) {
//			if(i % 2 == 0) {
//		i += 1;
		i++;
			System.out.print(i + " ");
//		}//end if
		}//end for
		
		System.out.println();
		
		//1에서부터 100까지 홀수만 행으로 출력.(값사이는 공백으로 구분)
		int cnt = 0;
		for(int i = 1 ; i <= 100 ; i+=2 ) {
			cnt++;
			System.out.print(i + " ");
		}//end for
		
		System.out.println("반복횟수 : " + cnt );
		
		System.out.println();
		
		//1~9 까지 1씩 증가하여 출력하는 코드 작성.(출력 열로 출력)
		
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}//end for
		
		//1~100 까지의 합(5050) 출력
		//1+2+3+4+..+100
		
		int sum = 0;
		
		for(int i = 1 ; i < 101 ; i++) {
			sum += i;
//			System.out.println(sum + " " + i);
		}//end for
		
		System.out.println("1~100까지의 합은" + sum);
		
		//10에서부터 0까지 1씩 감소하는 반복문을 작성. (값을 행으로 출력)
		//주의 : looping문은 조건이나 증감을 잘못 설정하면 무한루프(infinite loop)에 빠진다.
		for(int i = 10 ; i >= 0 ; i--) {
			System.out.print(i + " ");
		}//end for
		System.out.println();
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.println(i + " " + j);
			}
		}
		
	}//main

}//class
