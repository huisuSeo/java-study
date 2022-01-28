package day0113;

/**
 * ������ �迭�� ���.
 * @author user
 */
public class UseArray3 {
	public UseArray3() {
		//1. ����) ��������[][][] �迭�� = null;
		int[][][] arr = null;
		//2. ����) �迭�� = new ��������[��][��][��];
		arr = new int[3][3][4];
		System.out.println("���� �� : " + arr.length + ", ���� �� : " + arr[0].length + ", ���� �� : " + arr[0][0].length);
		
		//�� �Ҵ�) �迭��[��][��][��] = ��;
		arr[0][0][0] = 2022;
		arr[1][1][1] = 1;
		arr[2][2][3] = 13;
		//4.�� ���)
		System.out.println(arr[0][0][0] + " / " + arr[0][0][1]);
		
		//�ϰ�ó��
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(i + "�� ����");
			for(int j = 0 ; j < arr[i].length ; j ++) {
				System.out.println(j + "�� ����");
				for(int k = 0 ; k < arr[i][j].length ; k++) {
					System.out.printf("arr[%d][%d][%d]=%-5d",i,j,k,arr[i][j][k]);
				}//for
				System.out.println("\n" + j + "�� ��");
			}//for
			System.out.println("\n" + i + "�� ��");
			
		}//for
		
		//�⺻�� ���� : �� ���� ��ȣ, �� ���� ��ȣ
		int[][][] arr2 = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		System.out.println(arr2.length + "��," + arr2[0].length + "��," + arr2[0][0].length + "��");
		
		for(int[][] tempArr2 : arr2) {//������ �迭�� �� ���� ������ �迭
			for(int[] tempArr1 : tempArr2) {//������ �迭�� �� ���� ������ �迭
				for(int value : tempArr1) {//������ �迭�� �� ���� ������ �迭
					System.out.printf("%-6d", value);
				}//for
				System.out.println();
			}//for
			System.out.println();
		}//for		
	}//UseArray3 

	public static void main(String[] args) {
		new UseArray3();
	}//main

}//class
