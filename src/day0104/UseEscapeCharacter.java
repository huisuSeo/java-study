package day0104;

/**
 * Ư�������� ���.
 * @author user
 *
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		//"�ȳ��ϼ���?"�� �ѹ� ���.
		//\���� <= Ư�����ڴ� ����� ������ ����� �� �ִ�.
		//System.out.println("\"�ȳ��ϼ���?\"");
		System.out.println("�ȳ�\n�ϼ���?");		
		System.out.println("�ȳ�\r�ϼ���?");//\rƯ�����ڸ� ���� ���� ���� ���������� TextArea
		//���� enter key�� ������ \r \n �ڵ� 2���� �����.
		System.out.println("�ȳ�\t�ϼ���?");
		System.out.println("������ \"ȭ����\" �Դϴ�.");
		System.out.println("������ \'ȭ����\' �Դϴ�.");
		System.out.println("�� ������ e:\\temp\\new.txt���� �Դϴ�.");
		System.out.println("�ȳ�\b");
		
	}//main

}//class
