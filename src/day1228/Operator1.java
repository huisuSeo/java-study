package day1228;
/**
���� ������<br>
������ ���ü.
~, !, +, -, ++, --
*/
public class Operator1 {
	public static final int MAX = 100;
	public static void main(String[] args) {
		int i = 12;
		int j = -19;
		System.out.println("~" + i + " = " + ~i);//~��� : ��ȣ���� 1���� ~12 => -13
		System.out.println("~" + j + " = " + ~j);//~���� : ��ȣ���� 1���� ~-19 => 18

		i = 12;
		j = 28;

		System.out.println(i + " > " + j + " = " + !(i > j));

		boolean flag1 = true, flag2 = false;
		//!�� boolean�� �տ� ���.
		System.out.println("!" + flag1 + " = " + !flag1);
		System.out.println("!" + flag2 + " = " + !flag2);

		i = 12;
		j = -37;
		//+�����ڴ� �ƹ��� �ϵ� ���� �ʴ´�.(�������� ����)
		System.out.println("+" + i + " = " + i );
		System.out.println("+" + j + " = " + j);

		//-�����ڴ� ���� �״�� �ΰ� ��ȣ�� ����
		System.out.println("+" + i + " = " + -i );//-12
		System.out.println("+" + j + " = " + -j);//37

		//��������, ���ҿ���
		i = 10;
		j = 12;
		System.out.println( "i : " + i + ",j : " + j);
		//��������
		++i;//�������� 10 -> 11
		i++;//�������� 11 -> 12

		//���ҿ���
		--j;//�������� 12 -> 11
		j--;//�������� 11 -> 10
		System.out.println("���� ���� �� i : " + i);
		System.out.println("���� ���� �� j : " + j);

		int result = 0;
		//�������� : ���� �� ����
		result = ++i;
		System.out.println("�������� �� i = " + i + ", result : " + result);//i = 13, result = 13
		result = 0;
		//�������� : ���� �� ����.
		result = i++;
		System.out.println("�������� �� i = " + i + ", result : " + result);//i = 14 , result = 13

		System.out.println("���� :"+  ++i);//i�� ������ �� method�� �Ҵ� 15�� ���
		System.out.println(i);//15

		System.out.println("���� :"+  i++);//i�� method�� �Ҵ� i�� ���� 15�� ���
		System.out.println(i);//16

		i = 10;
		j = 20;
		System.out.println(i++ + --j);//i�� ����, j�� ���� 19 ����

	//i = 20++;//������� ����, ���� �����ڸ� ����� �� ����.
	//i = --MAX;//Constant���� ����, ���� �����ڸ� ����� �� ����.
	}//main
}//class
