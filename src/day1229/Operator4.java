package day1229;
/**
���迬����
>, <, >=, <=, !=
*/
public class Operator4 {
	public static void main(String[] args) {
		int i = 10, j =12, k = 10;
		//== ���� ���ٸ� true, ���� �ٸ��ٸ� false
		System.out.println(i + " == " + k + " = " + (i == k));//true
		System.out.println(i + " == " + j + " = " + (i == j));//false

		//!== ���� ���ٸ� false, ���� �ٸ��ٸ� true
		System.out.println(i + " != " + k + " = " + (i != k));//false
		System.out.println(i + " != " + j + " = " + (i != j));//true
	}
}
