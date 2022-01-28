package day0104.work;

/**
 * 1. 1~100���� ���� �Ʒ��� ���� ���
    12¦45¦78¦
2. �Ʒ��� ���� ������ ���
    2 x 1 = 2  3 x 1 = 3 ~ 9 x 1 = 9
    .
    2 x 9 = 16                  9 x 9 = 81
3. �ԷµǴ� ���� 2~9�� ������ ���� �ԷµǴ� ������ �������� ����ϼ���.
    2~9�� �ƴ϶�� ���������� 2~9������ ���� �մϴ�.�� �� ���
 * @author user
 *
 */
public class HomeWork {

	public static void main(String[] args) {
		for(int i = 1 ; i < 101 ; i++) {
			if(i % 3 == 0) {
			System.out.print("¦");
			}else{
				System.out.print(i);
			}//if

		}//end for
		
		System.out.println();
		
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println();
			for(int j = 2 ; j < 10 ; j++) {
				System.out.print(j + " x " + i + " = " + j*i + " ");
			}
			
		}//for

		System.out.println("\n");
	
		
		int i = Integer.parseInt(args[0]);
		if(i > 1 && i < 10) {
				for(int j = 1 ; j < 10 ; j++) {
				
					System.out.println(i + " x " + j + " = " + i*j);
				}//for
		}else{
			System.out.println("�������� 2~9������ ���� �մϴ�.");
		}//else
		
	}//main

}//class
