package day0105;

/**
 * continue 사용. (반복문의 반복실행을 건너뛰고 증,감소식으로 이동한다.)
 * @author user
 */
public class UseContinue {

	public static void main(String[] args) {
		for(int i = 1 ; i < 101 ; i++) {
			System.out.print("필수반복 ");
			if(i % 2 == 1) {
				continue;//반복문 안에서만 사용. 특정조건에 만족할때에만 실행되도록 조건문 안에서만 작성
				
			}//end if
			System.out.println(" 상황반복" + i + " ");
			
		}//for
		
		for(int i = 1 ; i < 101 ; i++) {
			
		}

	}//main

}//class
