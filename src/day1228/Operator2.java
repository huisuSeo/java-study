package day1228;
/**
���������
+, -, *, /, %
*/
public class Operator2 {
	public static void main(String[] args) {
	//�ڹٴ� ���� / ���� = ������ ���´�.
		int num = 10;
		System.out.println(num / 3);
		//���� / �Ǽ� = �Ǽ��� ���´�.
		System.out.println((double)num / 3);
		int i = 20212021;
		System.out.println(i + "�� �ΰ����� ���� ��� " + i%2);//1

		int birth = 1995;
		System.out.println( birth + "�� 12�� ���� ������ " + birth%12 );//0~11����
	}//main
}//class
