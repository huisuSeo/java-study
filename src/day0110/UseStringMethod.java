package day0110;

/**
 * String class���� �����ϴ� method ���.
 * @author user
 */
public class UseStringMethod {

	public static void main(String[] args) {
		String str = "AbcdEf";//�⺻�� ����
		String str2 = new String("os333@naver.com");//������ ����
		
		System.out.println(str + "�� ���� �� : " + str.length());
		System.out.println(str2 + "�� ���� �� : " + str2.length());
		
		System.out.println(str + "�� ��� �빮�� : " + str.toUpperCase());
		System.out.println(str2 + "�� ��� �빮�� : " + str2.toUpperCase());
		
		System.out.println(str + "�� ��� �ҹ��� : " + str.toLowerCase());
		System.out.println(str2 + "�� ��� �ҹ��� : " + str2.toLowerCase());
		
		str = "AbcdEfbcd";
		System.out.println(str + "���� 'c'�� �ε��� " + str.indexOf("c"));
		//���� ���ڿ��� ���� ���� ���� �ε����� ��ȯ
		System.out.println(str + "���� 'Efb'�� �ε��� " + str.indexOf("Efb"));
		//�������� �ʴ� ���ڿ��� -1�� ��ȯ
		System.out.println(str + "���� 'a'�� �ε��� " + str.indexOf("a"));
		
		//���ڿ��� �ڿ��� ���� �ε��� ���
		System.out.println(str + "���� �ڷκ��� ã������ 'c'�� �ε��� " + str.lastIndexOf("c"));
		System.out.println(str + "���� �ڷκ��� ã������ 'bcd'�� �ε��� " + str.lastIndexOf("bcd"));
		System.out.println(str + "���� �ڷκ��� ã������ 'k'�� �ε��� " + str.lastIndexOf("k"));
		
		//Ư�� ���ؽ��� ���� ���.
		System.out.println(str + "4��° �ε����� �ش��ϴ� ���� : " + str.charAt(4));
		System.out.println(str + "2��° �ε����� �ش��ϴ� ���� : " + str.charAt(2));
		//�������� �ʴ� �ε����� ����ϸ� Error�� �߻�
//		System.out.println(str + "20��° �ε����� �ش��ϴ� ���� : " + str.charAt(20));
		
		//1.str2���� ������ �ּҿ� ���� �ּҸ� �и��Ͽ� ���
		//2.str2�� ���� �ּҸ� unicode������ ���
		
		
		
	}//main

}//class
