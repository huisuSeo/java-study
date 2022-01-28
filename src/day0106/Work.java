package day0106;

/**
 * ����Ǯ�� :
 * @author user
 */
public class Work {
	/**
	 * ��(lastname)�� ��ȯ�ϴ� ��. - ���� �� ����
	 * @return ��
	 */
	public char lastname() {
		return 'S';
	}//lastname
	
	/**
	 * �ԷµǴ� ������ ����.<br>
	 * 0 ~ 100 ���̸� true, �׷��� ������ false
	 * @param score ������ ����
	 * @return �������
	 */
	public boolean scoreJudge(int score) {
		return score > -1 && score < 101;
	}//scoreJudge
	
	/**
	 * ������ �Է¹޾� ������ �´� ���ڸ� ���ؼ� ��ȯ. - ���� ��.
	 * @param score ����
	 * @return ������ ������ ����
	 */
	
	public char gradeText(int score) {
		char temp = '\u0000';
		if(score > 89 && score < 101) {//���� ����
			temp ='A';
		}else if(score > 79 && score < 90) {
			temp = 'B';
		}else if(score > 69 && score < 80) {
			temp = 'C';
		}else if(score > 59 && score < 70) {
			temp = 'D';
		}else {
			temp = 'F';
		}//else
		
		return temp;//���� �������� ����� ���� ��ȯ
	}//gradeText
	
	/**
	 * ���� ���. - ������
	 * �ٸ� Ŭ������ �����ϴ� method�� ��Ȳ�� �°� ȣ��.
	 */
	public void printStar() {
		//printStar method�� ������ Ŭ������ ��üȭ.
		TestOverload to = new TestOverload();
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < i + 1 ; j++) {//for�� �ȿ��� ���� �������� �� ��
				if(i % 2 == 0) {
				to.printStar();//������
				}else {
				to.printStar(1);//��
				}//if
			}//for
			System.out.println();
		}//for
	}//printStar
	
	/**
	 * ������ 2�� ���
	 */
	public void multiplicationTable() {
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println("2 x " + i + " = " + 2*i);
		}//for
	}//mpT
	
	public void multiplicationTable(int level) {
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(level + " x " + i + " = " + level*i);
		}//for
	}//mpT
	
	public static void main(String[] args) {
		//��üȭ : instance method ȣ��.
		Work w = new Work();
		//1�� ���� ȣ��
		char familyName = w.lastname();
		System.out.println("�� ���� " + familyName);
		
		//2�� ���� ȣ��
		int score = 100;//��谪 -1,0 ~ 100,101
		boolean flag = w.scoreJudge(score);
		System.out.println(score + "���� " + flag);
		
		//3�� ���� ȣ��
		if(flag) {
		char gradeText = w.gradeText(score);
		System.out.println("�Է����� : " + score + "��, ���� " + gradeText);
		}//if
		
		//4�� ���� ȣ��
		w.printStar();
		
		//5�� ���� ȣ��
		w.multiplicationTable(5);
		
	}//main

}//class
