package day0105;

/**
 *1. ��𿡼��� ȣ���� �� �ְ�, �¾ �ظ� �Է¹޾� ���̸� �����Ͽ� ����ϴ� method �ۼ�.
 *2. ������ �Է¹޾Ƽ�(Main method�� arguments�� �޴°��� �ƴ�) �빮��, �ҹ���, ���ڿ� �ش��ϴ� �������
    �ش� ���ڷ� ����ϰ�, �׷��� �ʴٸ� �Էµ� ���ڸ� ����ϴ� method �ۼ�.
 * @author user
 */
public class Day0105Work {

	public void age(int c) {
		System.out.println((2022 - c + 1) + "��" );
	}//age
	
	public void letter(int c) {
		if((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
		System.out.println((char)c);
		}else {
			System.out.println(c);
		}//if
	}//letter
	
	public static void main(String[] args) {
		
		Day0105Work dw = new Day0105Work();
		
		
		dw.age(1995);

		dw.letter(122);
	}//main

}//class
