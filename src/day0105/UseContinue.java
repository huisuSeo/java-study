package day0105;

/**
 * continue ���. (�ݺ����� �ݺ������� �ǳʶٰ� ��,���ҽ����� �̵��Ѵ�.)
 * @author user
 */
public class UseContinue {

	public static void main(String[] args) {
		for(int i = 1 ; i < 101 ; i++) {
			System.out.print("�ʼ��ݺ� ");
			if(i % 2 == 1) {
				continue;//�ݺ��� �ȿ����� ���. Ư�����ǿ� �����Ҷ����� ����ǵ��� ���ǹ� �ȿ����� �ۼ�
				
			}//end if
			System.out.println(" ��Ȳ�ݺ�" + i + " ");
			
		}//for
		
		for(int i = 1 ; i < 101 ; i++) {
			
		}

	}//main

}//class
