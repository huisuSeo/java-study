package day0119;

import java.util.StringTokenizer;

/**
 * ���ڿ��� ª�� �� ����(��ū)���� ������ �� ����ϴ� Ŭ����.
 * @author user
 *
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String msg = "�ڹ�,����Ŭ.JDBC,HTML,CSS";
		//CSV(Comma Separated Value)Data : Ư�� ���ڿ��� ���е� ������
		
		//1. StringTokenizer ����
//		StringTokenizer stk = new StringTokenizer(msg);//�������� ��ū�� ����.
//		StringTokenizer stk = new StringTokenizer(msg,",");//Ư�����ڿ��� ���� ��ū ����.
		//���й��ڿ����� or��� - ���й��ڿ��� �ش��ϴ� ��� ���ڿ��� ��ū���� ����.
//		StringTokenizer stk = new StringTokenizer(msg,",.B");//Ư�����ڿ��� ���� ��ū ����.
		StringTokenizer stk = new StringTokenizer(msg,",",false);//Ư�����ڿ��� ���� ��ū ����. ���й��ڿ��� ��ū���� ����.
		//2.��ū�� ��.(��ū�� ����� ������ �����Ѵ�.)
		System.out.println(stk.countTokens());
		
		
		//3.��ū�� �����ϴ���?
		String token = "";
		while(stk.hasMoreTokens()) {
			//��ū�� ���, �����͸� ���� ��ū������ �̵�
//			stk.nextToken();
			token = stk.nextToken();
			System.out.println(token);
		}//while

		
	}//UseStringTokenizer

	public static void main(String[] args) {
		new UseStringTokenizer();

	}//main

}//class
