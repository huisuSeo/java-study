package day0104;

/**
 * ����for<br>
 * ����<br>
 * �ٱ� for�� �ѹ� �� �� ���� for�� ��� �ݺ��ϴ����� �� �ľ��ؾ��Ѵ� for(�ʱⰪ ; ���ǽ� ; ��, ���ҽ�){<br>
 * for(�ʱⰪ ; ���ǽ� ; ��, ���ҽ�){<br>
 * �ݺ����� ����<br>
 * }<br>
 * }
 * 
 * @author user
 *
 */
public class UseFor2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("i = " + i + ",j = " + j);
			} // end for
			System.out.println("------------");
		} // end for
		
		System.out.println();
		
		//�������� 2~9�ܱ��� ����, �� �ܿ��� 1~9���� �ݺ�
		for(int i = 2 ; i < 10 ; i++) {//��
			System.out.println(i + "��");
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
		}//end for
		System.out.println("----------------------------------");
		//01020304
		//121314
		//2324
		//34
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = i + 1 ; j < 5 ; j++) {
				System.out.print(i + "" + j);
			}
			System.out.println();
			
		}//end for
		
		//0 0
		//1 0 1 1
		//2 0 2 1 2 2
		//3 0 3 1 3 2 3 3
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < i + 1 ; j++ ) {
				System.out.print(i + "" + j);
			}
			System.out.println();
		}//end for
		
		
		
	}// main

}// class
