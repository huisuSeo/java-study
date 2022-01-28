package day0104;

/**
 * 다중for<br>
 * 형식<br>
 * 바깥 for가 한번 돌 때 안쪽 for가 몇번 반복하는지를 잘 파악해야한다 for(초기값 ; 조건식 ; 증, 감소식){<br>
 * for(초기값 ; 조건식 ; 증, 감소식){<br>
 * 반복수행 문장<br>
 * }<br>
 * }
 * 
 * @author user
 *
 */
public class UseFor2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("i = " + i + ",j = " + j);
			} // end for
			System.out.println("------------");
		} // end for
		
		System.out.println();
		
		//구구단은 2~9단까지 존재, 각 단에서 1~9까지 반복
		for(int i = 2 ; i < 10 ; i++) {//단
			System.out.println(i + "단");
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
		}//end for
		System.out.println("----------------------------------");
		//01020304
		//121314
		//2324
		//34
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = i + 1 ; j < 5 ; j++) {
				System.out.print(i + "" + j);
			}
			System.out.println();
			
		}//end for
		
		//0 0
		//1 0 1 1
		//2 0 2 1 2 2
		//3 0 3 1 3 2 3 3
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < i + 1 ; j++ ) {
				System.out.print(i + "" + j);
			}
			System.out.println();
		}//end for
		
		
		
	}// main

}// class
