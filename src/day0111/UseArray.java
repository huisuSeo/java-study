package day0111;

/**
 * 일차원 배열의 사용.
 * @author user
 */
public class UseArray {
	
	public void useArray1() {
		//1. 선언 : 데이터형[] 배열명 = null;
		int[] arr = null;
		//2. 생성 : 배열명 = new 데이터형[방의 수];
		//- heap에 생성되고, 모든 방의 값은 자동초기화 된다. -방의 개수는 병하지 않는다.(고정길이형)
		arr = new int[5];
		
		//3. 값할당 : 배열명[방의번호] = 값;
		arr[0] = 2022;
		arr[1] = 1;
		arr[2] = 11;
		arr[3] = 15;
		arr[4] = 7;
		
		//4. 값 사용 : 배열명[방의번호]
		
		System.out.println(arr[0] + " / " + arr[1] + " / " + arr[2]);
		System.out.println("arr배열의 방의 개수 : " + arr.length);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}//for
		
		System.out.println("------------------------------------------");
		for(int i = 0 ; i < arr.length ; i+=2) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}//for
		System.out.println("------------------------------------------");
		//배열의 마지막 방부터 처음 방까지 출력
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}//for
		System.out.println("-------------------배열의 기본형 형식의 사용-----------------------");
		//int[] arr2 = new int[] {10, 20, 30, 40, 50, 60};
		int[] arr3 = {10, 20, 30, 40, 50, 60};//new생략
		
		System.out.println(arr3.length);
		
		for(int i = 0 ; i < arr3.length ; i++) {
			System.out.printf("arr[%d] = %-5d", i, arr3[i]);
		}//for
		System.out.println();
		
	}//useArray1

	public static void main(String[] args) {
//		UseArray ua = new UseArray();
//		ua.useArray1();
		new UseArray().useArray1();// chain
		
	}//main

}//class
