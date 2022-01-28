package day0104.work;

/**
 * 1. 1~100까지 수를 아래와 같이 출력
    12짝45짝78짝
2. 아래와 같이 구구단 출력
    2 x 1 = 2  3 x 1 = 3 ~ 9 x 1 = 9
    .
    2 x 9 = 16                  9 x 9 = 81
3. 입력되는 값이 2~9단 사이일 때에 입력되는 값으로 구구단을 출력하세요.
    2~9단 아니라면 “구구단은 2~9까지만 가능 합니다.” 를 출력
 * @author user
 *
 */
public class HomeWork {

	public static void main(String[] args) {
		for(int i = 1 ; i < 101 ; i++) {
			if(i % 3 == 0) {
			System.out.print("짝");
			}else{
				System.out.print(i);
			}//if

		}//end for
		
		System.out.println();
		
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println();
			for(int j = 2 ; j < 10 ; j++) {
				System.out.print(j + " x " + i + " = " + j*i + " ");
			}
			
		}//for

		System.out.println("\n");
	
		
		int i = Integer.parseInt(args[0]);
		if(i > 1 && i < 10) {
				for(int j = 1 ; j < 10 ; j++) {
				
					System.out.println(i + " x " + j + " = " + i*j);
				}//for
		}else{
			System.out.println("구구단은 2~9까지만 가능 합니다.");
		}//else
		
	}//main

}//class
