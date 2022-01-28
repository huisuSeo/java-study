package day0112;

public class UseArray2_2 {

	public void scoreProcess() {
		String[] names = { "강명준", "권용현", "김정하", "김현우", "김진영" };
		int[][] score = { { 90, 94, 91 }, { 86, 84, 71 }, { 96, 99, 100 }, { 75, 76, 73 }, { 63, 69, 69 } };

		System.out.println("-----------------------------------------------------------");
		System.out.println("번호\t이름\t자바\t오라클\tHTML\t총점\t평균");
		System.out.println("-----------------------------------------------------------");

		int totalScore = 0;// 학생 총점

		for (int i = 0; i < score.length; i++) {// 행
			System.out.printf("%d\t%s\t", i + 1, names[i]);
			for (int j = 0; j < score[i].length; j++) {// 열
				System.out.printf("%d\t", score[i][j]);
				totalScore += score[i][j];
			} // for
			System.out.printf("%d\t%.2f\n", totalScore, (double) totalScore / score[0].length);
			totalScore = 0;

			System.out.println();
		} // for
		System.out.println("----------------------------------------------------------");
		System.out.printf("응시인원 [ %d ]명\n", score.length);
		// 숙제. 코드를 직접 기술해서 처리.
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				cnt++;
			}
		}
		System.out.printf("전체 총점 [ %d ]점, 전체 평균 [ %.2f ]\n", sum, (double) sum / cnt);

		// 숙제. 아래의 작업을 instance variable과 method를 작성하여 처리 결과를 출력.
		int[] each_total = each2(score);
		System.out.printf("자바 총점 [ %d ]점, 오라클 총점 [ %d ], HTML 총점[ %d ]\n", each_total[0], each_total[1], each_total[2]);
		int best = best_java(score);
		System.out.printf("자바 최고점수 [ %d ]점\n", best);
		int number = best_total(score);
		System.out.printf("1등 학생의 번호 [ %d ], 이름[ %s ]\n", number + 1, names[number]);

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
		for(int[] arr : score) {//개선된 for문 사용
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
