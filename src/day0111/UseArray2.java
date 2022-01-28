package day0111;

public class UseArray2 {

	public UseArray2(){
		/*
		 * - 학생 7명의 점수를 처리하는 프로그램 작성.
점수는 1번 학생 부터 89, 77, 91, 99, 63, 100, 86의 점수를 가진다.
		 */
		//변수를 사용하여 작성
		int num1 = 89;
		int num2 = 77;
		int num3 = 91;
		int num4 = 99;
		int num5 = 63;
		int num6 = 100;
		int num7 = 86;
		
		//모든 학생의 점수 츨력.
		System.out.println("1번 : " + num1);
		System.out.println("2번 : " + num2);
		System.out.println("3번 : " + num3);
		System.out.println("4번 : " + num4);
		System.out.println("5번 : " + num5);
		System.out.println("6번 : " + num6);
		System.out.println("7번 : " + num7);
		//총합 점수 출력
		int totalScore = num1 + num2 + num3 + num4 + num5 + num6 + num7;
		System.out.println("총 점수 " + totalScore);
		
		System.out.println("------------------------------");
		
		
		
		int[] studentScores = {89, 77, 91, 99, 63, 100, 86};
		
		totalScore = 0;
		
		
		for(int i = 0 ; i < studentScores.length ; i++) {
			
			System.out.printf("%d번 : %d점 %s\n", i + 1, studentScores[i], gradeText(studentScores[i]));
			totalScore += studentScores[i];
		}//for
		System.out.println("총 점수 " + totalScore);
		
		int top = topScore(studentScores);//Call By Refernece
		System.out.printf("%d",top);
		
		//char형으로 배열을 만들고, 배열명을 출력하면 다른 배열과 다르게 값이 출력된다.
		System.out.println(studentScores);
		
		char[] tempArr = {'A','b','c','D','e'};
		System.out.println(tempArr);
		
		for(int i = 0 ; i < tempArr.length; i++) {
			System.out.print(tempArr[i]);
		}//for
		
		System.out.println("------------------------------------------");
		//개선된 for문 모든 방의 값을 출력
		for(char value : tempArr) {
			System.out.println(value);
		}//for
		
	}//UseArray2
	
	//배열의 방의 값 중에 최고점수 출력.
	public int topScore(int[] score){
		int topScore = score[0];
//		for(int i = 1; i < score.length ; i++) {
//			if(topScore < score[i]) {
//				topScore = score[i];
//			}//if
//		}//for
		
		//score배열의 방의 값을 변경
		/////////////개선된 for////////////////
		for(int value : score) {
			if(topScore < value) {
				topScore = value;
			}//if
		}//for
		
	return topScore;
	}
	
	
	//학점 구하는 업무
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
