package day1224;
/**
	���������� ���.
*/
class  UseLocalVariable{
	//Java Application
	public static void main(String[] args) {
		//1. ���� ���� : �������� �ٸ��ٸ� ��� ������ �� �ִ�.
		int i; //�ʱ�ȭ�� ���� �ʿ� ����.
		int age = 0; //�ʱ�ȭ�� ����.
		//2. �� �Ҵ�
		i = 2021;
		age = 27;
		System.out.println(age);
		//�� �Ҵ��� ������ �� �� �ִ�.
		age = 28;

		
		//3. ���
		System.out.println( i );
		System.out.println( "�� ���̴� " + age + "��" );

		//�������� �ѱ۷� �ο�.(�ѱ۷� �ۼ����� �ʴ´�.)
		int ���� = 0;
		int ���� = 2021;
		���� = 27;

		int �¾�� = ���� - ���� + 1;
		System.out.println("�� ���� " + ���� + "��" );
		System.out.println( �¾�� );

	}//main
}//class
