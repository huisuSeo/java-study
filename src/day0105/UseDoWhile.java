package day0105;

/**
 * do~while���.
 * �ּ� 1�� ���࿡ �ִ� ���Ǳ��� ����.
 * @author user
 */
public class UseDoWhile {

	public static void main(String[] args) {
		
		int i = 0;//�ʱⰪ
		do {
			System.out.println(i);//�ݺ����� ����
			i++;//��.���ҽ�
		}while(i < 10);//���ǽ�

		//���� main method arguments�� �Է¹޾� �Է¹��� ������ ������ ���.
		int j = Integer.parseInt(args[0]);
		int k = 1;
		do {
			System.out.println(j + " * " + k + " = " + j * k);
			k++;
		}while(k < 10);
		
	
				
		
	}//main

}//class
