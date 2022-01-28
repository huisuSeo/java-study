package day0104;

/**
 * for문의 다양한 형태
 * 
 * @author user
 *
 */
public class UseFor3 {

	public static void main(String[] args) {
		// 무한루프
		for (;;) {
			System.out.println("무한루프");
			break;// 가장 가까운 반복문을 빠져 나간다.
		} // end for

		// 증가하는 수를 세는 무한루프
		System.out.println("안녕");
//		for(int i = 0 ; ; i++) {
//			System.out.println("무한루프" + i);
//			break;
		// }end for

		// 여러개의 초기값을 사용하는 for.
		for (int i = 0, j = 10, k = 100; i < 10/*조건은 하나만*/; i++, j--, k += k) {
			System.out.println("i = " + i + ",j = " + j + ", k = " + k);
		}//end for
		
		int[] temp = {1,2,3,4,5,6,7};
//		for(int i = 0 ; i < temp.length ; i++) {
//			System.out.println(temp[i]);
//		}//end for
		//개선된 for
		for(int i : temp) {
			System.out.println(i);
		}//end for
		
	}// main

}// class
