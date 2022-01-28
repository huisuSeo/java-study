package day0113;

/**
 * 행마다 열의 개수가 다른 배열
 * @author user
 */
public class VariableArray {
	public VariableArray() {
		//1.선언) 데이터형[][] 배열명 = null;
		int[][] arr = null;
		
		//2.생성) 배열명 = new 데이터형[행의수][]; //열의 개수를 설정하지 않는다.
		arr = new int[5][];
		
		//3.행마다 일차원 배열로 열을 생성) 배열명[행의번호] = new 데이터형[열의 수];
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[1];
		arr[3] = new int[]{1,2,3,4,5};//초기값을 줄 떄에는 열의 수를 넣지 않음
		arr[4] = new int[]{10, 20, 30};
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr[" + i + "]행 열의 개수 : " + arr[i].length);
		}//for
		
		//4. 값 할당) - 인덱스 주의
		arr[0][0] = 100;
		arr[1][1] = 200;
		
		//5. 값 사용) - 인덱스 주의
		System.out.println(arr[0][0] + " / " + arr[0][1]);
		
		//일괄처리
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.printf("arr[%d][%d]=%d\t",i,j,arr[i][j]);
			}//for
			System.out.println();
		}//for
		
		
		System.out.println("---------------------------------------------------");
		//기본형 형식의 사용 : 행 구분 괄호에서 값의 개수를 다르게 묶는다.
		int[][] arr2 = {{10, 20, 30}, {40} , {50 ,60, 70, 80}};
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.println("arr[" + i + "]행 열의 개수 : " + arr2[i].length);
		}//for
		
		//개선된 for
		for(int[] tempArr1 : arr2) {
			for(int value : tempArr1) {
				System.out.printf("%-4d",value);
			}//for
			System.out.println();
		}//for
		
		//int[] temp =arr2[0];
		temp(arr2[2]); //이차원 배열의 행은 일차원 배열로 이루어져 있다.
		
		
		
	}//VariableArray
	
	public void temp(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}//for
	}//temp

	public static void main(String[] args) {
		new VariableArray();

	}//main

}//class
