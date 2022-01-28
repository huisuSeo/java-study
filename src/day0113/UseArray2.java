package day0113;

public class UseArray2 {
	public UseArray2() {
		int[][] arr = new int[3][3];
		for(int i = 0 ; i < arr.length ; i++) {//행
			for(int j = 0 ; j < arr[i].length ; j++) {//열
				if(i == 0 || i == arr.length -1 || j == 0 || j == arr[i].length - 1) {//처음 행, 마지막 행, 처음 열, 마지막 열
					arr[i][j] = 1;
				}//if
				System.out.printf("%-3d",arr[i][j]);
			}//for
			System.out.println();
		}//for
		
	}//UseArray2

	public static void main(String[] args) {
		new UseArray2();
		

	}//main

}//class
