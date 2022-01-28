package day0111;

public class UseArray2 {

	public UseArray2(){
		/*
		 * - �л� 7���� ������ ó���ϴ� ���α׷� �ۼ�.
������ 1�� �л� ���� 89, 77, 91, 99, 63, 100, 86�� ������ ������.
		 */
		//������ ����Ͽ� �ۼ�
		int num1 = 89;
		int num2 = 77;
		int num3 = 91;
		int num4 = 99;
		int num5 = 63;
		int num6 = 100;
		int num7 = 86;
		
		//��� �л��� ���� ����.
		System.out.println("1�� : " + num1);
		System.out.println("2�� : " + num2);
		System.out.println("3�� : " + num3);
		System.out.println("4�� : " + num4);
		System.out.println("5�� : " + num5);
		System.out.println("6�� : " + num6);
		System.out.println("7�� : " + num7);
		//���� ���� ���
		int totalScore = num1 + num2 + num3 + num4 + num5 + num6 + num7;
		System.out.println("�� ���� " + totalScore);
		
		System.out.println("------------------------------");
		
		
		
		int[] studentScores = {89, 77, 91, 99, 63, 100, 86};
		
		totalScore = 0;
		
		
		for(int i = 0 ; i < studentScores.length ; i++) {
			
			System.out.printf("%d�� : %d�� %s\n", i + 1, studentScores[i], gradeText(studentScores[i]));
			totalScore += studentScores[i];
		}//for
		System.out.println("�� ���� " + totalScore);
		
		int top = topScore(studentScores);//Call By Refernece
		System.out.printf("%d",top);
		
		//char������ �迭�� �����, �迭���� ����ϸ� �ٸ� �迭�� �ٸ��� ���� ��µȴ�.
		System.out.println(studentScores);
		
		char[] tempArr = {'A','b','c','D','e'};
		System.out.println(tempArr);
		
		for(int i = 0 ; i < tempArr.length; i++) {
			System.out.print(tempArr[i]);
		}//for
		
		System.out.println("------------------------------------------");
		//������ for�� ��� ���� ���� ���
		for(char value : tempArr) {
			System.out.println(value);
		}//for
		
	}//UseArray2
	
	//�迭�� ���� �� �߿� �ְ����� ���.
	public int topScore(int[] score){
		int topScore = score[0];
//		for(int i = 1; i < score.length ; i++) {
//			if(topScore < score[i]) {
//				topScore = score[i];
//			}//if
//		}//for
		
		//score�迭�� ���� ���� ����
		/////////////������ for////////////////
		for(int value : score) {
			if(topScore < value) {
				topScore = value;
			}//if
		}//for
		
	return topScore;
	}
	
	
	//���� ���ϴ� ����
	public String gradeText(int score) {
		String txt = "";

		if(score <= 100 && score >= 90) {
			txt = "A";
		}else if(score <= 89 && score >= 80 ) {
			txt = "B";
		}else if(score <= 79 && score >= 70) {
			txt = "C";
		}else if(score <= 69 && score >= 60) {
			txt = "D";
		}else {
			txt = "F";
		}
		return txt;
	}//gradeText
	
	public static void main(String[] args) {
		new UseArray2();
		
		

	}//main

}//class
