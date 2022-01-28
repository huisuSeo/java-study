package day0106;

/**
 * 숙제풀이 :
 * @author user
 */
public class Work {
	/**
	 * 성(lastname)을 반환하는 일. - 고정 값 형태
	 * @return 성
	 */
	public char lastname() {
		return 'S';
	}//lastname
	
	/**
	 * 입력되는 점수의 판정.<br>
	 * 0 ~ 100 사이면 true, 그렇지 않으면 false
	 * @param score 판정할 점수
	 * @return 판정결과
	 */
	public boolean scoreJudge(int score) {
		return score > -1 && score < 101;
	}//scoreJudge
	
	/**
	 * 학점을 입력받아 학점에 맞는 문자를 구해서 반환. - 가변 값.
	 * @param score 점수
	 * @return 구해진 학점의 문자
	 */
	
	public char gradeText(int score) {
		char temp = '\u0000';
		if(score > 89 && score < 101) {//값을 제어
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
		
		return temp;//가장 마지막에 제어된 값을 반환
	}//gradeText
	
	/**
	 * 별을 출력. - 고정일
	 * 다른 클래스에 존재하는 method를 상황에 맞게 호출.
	 */
	public void printStar() {
		//printStar method를 구현한 클래스를 객체화.
		TestOverload to = new TestOverload();
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < i + 1 ; j++) {//for문 안에서 변수 선언하지 말 것
				if(i % 2 == 0) {
				to.printStar();//검은별
				}else {
				to.printStar(1);//흰별
				}//if
			}//for
			System.out.println();
		}//for
	}//printStar
	
	/**
	 * 구구단 2단 출력
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
		//객체화 : instance method 호출.
		Work w = new Work();
		//1번 문제 호출
		char familyName = w.lastname();
		System.out.println("내 성은 " + familyName);
		
		//2번 문제 호출
		int score = 100;//경계값 -1,0 ~ 100,101
		boolean flag = w.scoreJudge(score);
		System.out.println(score + "점은 " + flag);
		
		//3번 문제 호출
		if(flag) {
		char gradeText = w.gradeText(score);
		System.out.println("입력점수 : " + score + "점, 학점 " + gradeText);
		}//if
		
		//4번 문제 호출
		w.printStar();
		
		//5번 문제 호출
		w.multiplicationTable(5);
		
	}//main

}//class
