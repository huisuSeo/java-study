package day0104.work;

/**
 *������ �Է¹޾� �Է¹��� ������ 0~100������ �� 0~39 ���ϴ� ��������, 40~59�� ���̴� ���ٸ� ���� ������, 60~100�� ���̴� ���հݡ��� ����ϰ� 0~100���̰� �ƴ� ������ ����ȿ������ �ƴմϴ�.���� ����ϴ� �ڵ�.
 * @author user
 */
public class Work2 {
	
	public static void main(String[] args) {
		int score = 0;
		score = Integer.parseInt(args[0]);
		
		System.out.print(score + "���� ");
		
		if(score > -1 && score < 101) {
			//System.out.println("0~100����");
			if(score < 40) {
				System.out.println("����");
			}else if(score < 60){	
				System.out.println("�ٸ����� ����");
			}else {	
				System.out.println("�Է¼���");
			}//end else
			
		}else {
			System.out.println("��ȿ������ �ƴմϴ�.");
			
		}//end else
		
	}//main

}//class
