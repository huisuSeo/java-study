package day1229;
/**
����(����) ������
? :
*/
class Operator6 {
	public static void main(String[] args) {
		int i = -1;
		System.out.println( i + " ��(��) " + (i > -1 ? "���" : "����") );

		i = 12;
		//i�� Ȧ�� ���� ¦�������� ����ϴ� �ڵ�
		System.out.println( i + " ��(��) " + ( i % 2 == 1 ? "Ȧ��" : "¦��")); //2�� ���� ���� ����� ���Ϳ�?
	}
}
