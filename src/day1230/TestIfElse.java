package day1230;
/**
if~else : �� �� �ϳ��� �ڵ带 �����ؾ� �� ��.
*/
class TestIfElse {
	public static void main(String[] args) {
	//����, ��� ������ �Ǻ��ϴ� �ڵ� �ۼ�.

	int num = -12;

	if(num > -1){
		System.out.println("���");
	}else{
		System.out.println("����");
	}//end if

	//Ȧ��, ¦�� ����

	int num1 = 12;

	System.out.print( num1 + "��(��) ");
	if(num1 % 2 == 0){
		System.out.println("¦��");
	}else{
		System.out.println("Ȧ��");
	}//end else

	//�Է¹��� ������ 0~100 ���̸� "��ȿ����" �� �׷��� ������ "��ȿ����"�� ����ϴ� �ڵ� �ۼ�

	int score = Integer.parseInt( args[0]);

	System.out.print(score + "���� ");

	if(score >= 0 && score <= 100){
		System.out.println("��ȿ����");
	}else{
		System.out.println("��ȿ����");
	}//end else

	//args[1]���� �ԷµǴ� ���� ������ ��ȯ�ϰ�, ��ȯ�� ���� �빮���� ������� �빮�ڷ� ����ϰ�
	//�׷��� �ʴٸ� ���ڸ� �״�� ���

	int num2 = Integer.parseInt( args[1]);

	System.out.print(num2 + "��(��) ");

	if(num2 > 64 && num2 < 91){
		System.out.println((char)num2);
	}else{
		System.out.println(num2);
	}//end else


	}//main
}//class
