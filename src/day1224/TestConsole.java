package day1224;
/**
console ��� ����
*/
//1.�ҽ��ڵ� �ۼ�
class TestConsole{
	/*main method�� ���� Ŭ������ �ܵ����� ����� �� �ִ� Ŭ�����̴�.
	�ܵ����� ����� �� �ִ� Ŭ������ Java Application �̶�� �Ѵ�.
	*/
	public static void main(String[] args){
		//System.out.print("�ȳ��ϼ���?");
		//System.out.print("������ ũ�������� �̺��Դϴ�.");
		//System.out.println("�ȳ��ϼ���?");
		//System.out.println("������ ũ�������� �̺��Դϴ�.");
		
		System.out.println("��� ���");
		System.out.println( 24 );//���� ���
		System.out.println( 12.24 );//�Ǽ� ���
		System.out.println( 'A' );//���� ���
		System.out.println( true );//�Ҹ� ���
		System.out.println( "�ȳ�" );//���ڿ����
		
		System.out.println("����");
		int i = 12; //�⺻�� ��������
		TestConsole t = new TestConsole();//������ ��������

		System.out.println(i);//�⺻�� ���������� ���� ���.
		System.out.println(t);//������ ���������� �ּҰ� ���.

		System.out.println("�����");
		System.out.println(12 + 24);//������� ������ ����� ���.

		System.out.println("12 + 24 = " +(12+24));
	}//main

}//class

//2. ���� : TestConsole.java

//3. ������ : javac TestConsole.java

//4. ���� : java TestConsole