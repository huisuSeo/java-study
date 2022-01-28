package day0112;

public class UseArray2_2 {

	public void scoreProcess() {
		String[] names = { "������", "�ǿ���", "������", "������", "������" };
		int[][] score = { { 90, 94, 91 }, { 86, 84, 71 }, { 96, 99, 100 }, { 75, 76, 73 }, { 63, 69, 69 } };

		System.out.println("-----------------------------------------------------------");
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\tHTML\t����\t���");
		System.out.println("-----------------------------------------------------------");

		int totalScore = 0;// �л� ����

		for (int i = 0; i < score.length; i++) {// ��
			System.out.printf("%d\t%s\t", i + 1, names[i]);
			for (int j = 0; j < score[i].length; j++) {// ��
				System.out.printf("%d\t", score[i][j]);
				totalScore += score[i][j];
			} // for
			System.out.printf("%d\t%.2f\n", totalScore, (double) totalScore / score[0].length);
			totalScore = 0;

			System.out.println();
		} // for
		System.out.println("----------------------------------------------------------");
		System.out.printf("�����ο� [ %d ]��\n", score.length);
		// ����. �ڵ带 ���� ����ؼ� ó��.
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				cnt++;
			}
		}
		System.out.printf("��ü ���� [ %d ]��, ��ü ��� [ %.2f ]\n", sum, (double) sum / cnt);

		// ����. �Ʒ��� �۾��� instance variable�� method�� �ۼ��Ͽ� ó�� ����� ���.
		int[] each_total = each2(score);
		System.out.printf("�ڹ� ���� [ %d ]��, ����Ŭ ���� [ %d ], HTML ����[ %d ]\n", each_total[0], each_total[1], each_total[2]);
		int best = best_java(score);
		System.out.printf("�ڹ� �ְ����� [ %d ]��\n", best);
		int number = best_total(score);
		System.out.printf("1�� �л��� ��ȣ [ %d ], �̸�[ %s ]\n", number + 1, names[number]);

	}// useArray2
	

	public int[] each(int[][] score) {
		int[] each_total = {0, 0, 0};
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length ; j++) {
				each_total[j] += score[i][j];
			}//for
		}//for
		return each_total;
	}//each
	
	public int[] each2(int[][] score) {
		int[] each_total =new int[ score[0].length ];
		for(int[] arr : score) {//������ for�� ���
			for(int j = 0 ; j < arr.length ; j++) {
				each_total[j] += arr[j]; 
			}//for
		}//for
		return each_total;
	}//each
	
	
	
	
	
	
	
	public int best_java(int[][] score) {
		int best = 0;
		for(int i = 0 ; i < score.length ; i++) {
				if(best < score[i][0]) {
					best = score[i][0];
				}//if
		}//for
		return best;
	}//best_java
	
	public int best_total(int[][] score) {
		int best = 0;
		int number = 0;
		for(int i = 0 ; i < score.length ; i++) {
			int person = 0;
			for(int j = 0 ; j < score[i].length ; j++) {
				person += score[i][j];
				
			}//for
			if(best < person) {
				best = person;
				number = i;
			}//if
		}//for
		
		return number;
	}//best_total
	
	
	public static void main(String[] args) {
		new UseArray2_2().scoreProcess();

	}// main

}// class
