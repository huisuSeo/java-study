package day1229;
/**
관계연산자
>, <, >=, <=, !=
*/
public class Operator4 {
	public static void main(String[] args) {
		int i = 10, j =12, k = 10;
		//== 값이 같다면 true, 값이 다르다면 false
		System.out.println(i + " == " + k + " = " + (i == k));//true
		System.out.println(i + " == " + j + " = " + (i == j));//false

		//!== 값이 같다면 false, 값이 다르다면 true
		System.out.println(i + " != " + k + " = " + (i != k));//false
		System.out.println(i + " != " + j + " = " + (i != j));//true
	}
}
