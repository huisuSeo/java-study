package day0104;

/**
 * �ݺ���(loop statement)
 * ���۰� ���� �� �� ����ϴ� �ݺ��� for��.<br>
 * ���� for��
 * @author user
 */
public class UseFor {

	public static void main(String[] args) {
		//0~9���� 10�� �ݺ��Ǵ� for��.
//		for(int i = 0 ; i < 10 ; i++) {
//			System.out.println("�ȳ��ϼ���?" + i);
//		}//end for
//
//		�ȳ��ϼ���?�� �ѹ� ����ϴ� �ڵ� �ۼ�.
		for(int i = 0 ; i < 1 ; i++) {
			System.out.println("�ȳ��ϼ���?");
		}//end for
		//1~10���� 1�� �����ϴ� ���� ������ ���.(������ ���� ���� ���� ������ �����Ͽ� ���
		
		for(int i = 1 ; i < 11 ; i++) {
			System.out.print(i + "\t");
		}//end for
		System.out.println();
		//1~100���� �� �߿� ¦���� ���.(������ ���� ���� ���� ����(white space)���� �����Ͽ� ���
		for(int i = 1 ; i <= 100 ; i++ ) {
//			if(i % 2 == 0) {
//		i += 1;
		i++;
			System.out.print(i + " ");
//		}//end if
		}//end for
		
		System.out.println();
		
		//1�������� 100���� Ȧ���� ������ ���.(�����̴� �������� ����)
		int cnt = 0;
		for(int i = 1 ; i <= 100 ; i+=2 ) {
			cnt++;
			System.out.print(i + " ");
		}//end for
		
		System.out.println("�ݺ�Ƚ�� : " + cnt );
		
		System.out.println();
		
		//1~9 ���� 1�� �����Ͽ� ����ϴ� �ڵ� �ۼ�.(��� ���� ���)
		
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}//end for
		
		//1~100 ������ ��(5050) ���
		//1+2+3+4+..+100
		
		int sum = 0;
		
		for(int i = 1 ; i < 101 ; i++) {
			sum += i;
//			System.out.println(sum + " " + i);
		}//end for
		
		System.out.println("1~100������ ����" + sum);
		
		//10�������� 0���� 1�� �����ϴ� �ݺ����� �ۼ�. (���� ������ ���)
		//���� : looping���� �����̳� ������ �߸� �����ϸ� ���ѷ���(infinite loop)�� ������.
		for(int i = 10 ; i >= 0 ; i--) {
			System.out.print(i + " ");
		}//end for
		System.out.println();
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.println(i + " " + j);
			}
		}
		
	}//main

}//class
