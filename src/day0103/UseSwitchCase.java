package day0103;

/**
 * swich~case�� ���.
 * @author user
 */
public class UseSwitchCase {

	public static void main(String[] args) {
		//1.��������
		int i = 30;
		
		switch( i ) { //Ÿ��=>ã��=>�귯����
		case 0 : System.out.println("0�ΰ��");
		case 1 : System.out.println("1�ΰ��");
		case 2 : System.out.println("2�ΰ��");
		case 3 : System.out.println("3�ΰ��");
		default : System.out.println("����� ���� ���");
		
		}//end switch
		
		//switch�� ������� �ԷµǴ� ������ ���������� ����� �� �ִ�.
		char j = 'A';//byte, short, int, /*long - switch�� ����� �� ����.*/, char
		switch (j) {
		case 65:System.out.println("����");
//		case 'A':System.out.println("����");//���ڸ� case�� ����ϵ���, Unicode���� ����ϵ���
		case 1:
		}//end switch
		
		//JDK1.7���� ���ʹ� ���ڿ��� ���� �� �ִ�.
		String str = "������";
		switch( str ) {
		}
		
		/////////////////////////////////////////break ��� ////////////////////////////////////
		
		i = 0;
		switch( i ) {
		case 0 : System.out.println("A");
		case 1 : System.out.println("B"); break;//switch ��������.
		case 2 : System.out.println("C");
		case 3 : System.out.println("D"); break;
		default : System.out.println("E");
		}
		
		
	}//main

}//class
