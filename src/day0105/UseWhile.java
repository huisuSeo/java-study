package day0105;

/**
 * while ���.(���۰� ���� �� �� ����ϴ� �ݺ���)<br>
 * �ּ� 0�� ���࿡ �ִ� ���Ǳ��� ����.
 * @author user
 */
public class UseWhile {

	public static void main(String[] args) {
		//1~9���� ���
		int i = 1;//�ʱⰪ -> �⿪����
		while(i < 10) {//���ǽ�
			System.out.print(i + " ");//�ݺ����๮��
			i++;//��.���ҽ�
		}//while
		
		System.out.println();
		//1~100���� �� �߿� 3�� ����� ���
		
		i = 1;
		while(i < 101) {
			if(i % 3 == 0) {
			System.out.print(i + " ");
			}
			i++;
		}//while
		
		System.out.println();
		//while�� ����Ͽ� ������ 9���� ���
		
		int k = 9;
		int j = 1;
		while(j < 10) {
	
			System.out.println(k + " * " + j + " = " + k*j);
			j++;
		}//while
		
		//while ���ѷ���
		while(true) {
			System.out.println("���ѷ���");
			break;
		}
		
	}//main

}//class
