package day1227;
/**
���� �� ��ȯ <br>
�����ڰ� �ʿ��� ������������ ��ȯ�ϴ� ��.<br>
����)
 (��ȯ�� ������ ��) ������ �Ǵ� ���;
*/

public class Casting{
	public static void main(String[] args) {

		char c = 'A';
		//���� �տ� ���� �� ��ȯ
		int i = (int)c;
		System.out.println(c + "�� Unicode�� " + i);
		
		//��� �տ� ���� �� ��ȯ
		float f = (float)12.27;//���ͷ��� 8byte�̰�, ���� �� ��ȯ���� ���� 4byte�� �Ҵ� �ȴ�.
		System.out.println("float : " + f);

		//i = f;//4byte�� ũ��� ������ ���� ������ �ٸ��Ƿ� �Ҵ���� �ʴ´�.
		i = (int)f;//�� �ս� �߻� : 
		System.out.println( "�� �ս� �߻� : ���� �� : " + f + ",��ȯ�� �� : " + i);

		//boolean�� ���� �����θ� ��ȯ�ȴ�.
		boolean b = true;
		boolean b1 = false;
		//i = (int)b;//���� : boolean�� �ٸ� ������ ��ȯ���� �ʴ´�.
		b1 = (boolean)b;//(boolean)�� �ʿ� ���� ��
		System.out.println(b1 + " / " + b);

		//�⺻�� ���������� ���������� ���� �� ��ȯ.
		//i = 12;
		//String s = (String)i;// �⺻�� i �� ������ String���� Casting �� �� ����.
		String s = "2021";
		System.out.println(s);

		//i = (int)s; // ������ s�� �⺻�� int�� Casting �� �� ����.
	}//main
}//class