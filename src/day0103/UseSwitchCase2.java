package day0103;

/**
 * switch~case 사용.
 * @author user
 */
public class UseSwitchCase2 {

	public static final int ZERO=0;
	public static final int ONE=1;
	public static final int TWO=2;
	//힉점 비교용 Constant
	public static final int GRADE_A_PLUS = 10;
	public static final int GRADE_A = 9;
	public static final int GRADE_B = 8;
	public static final int GRADE_C = 7;
	public static final int GRADE_D = 6;
	
	public static void main(String[] args) {
		int i = 3;
		//int j = 0;
		switch(i) {//입력 값에 따라 0-zero, 1-one, 2-two 그외 others를 출력
		case ZERO : System.out.println("Zero");break;
		case ONE : System.out.println("One");break;
		case TWO : System.out.println("Two");break;
		default : System.out.println("Others");//default 뒤에는 break를 기술하지 않아도
		//실행될 문장이 없기 때문에 생략해도 된다.
		
		}//end switch

		//main method의 arguments를 받아서 출력.
		//점수를 입력받아서 점수에 해당하는 학점 출력.
		int score = Integer.parseInt(args[0]);
		System.out.print(score + "점의 학점은 ");
		
//		char grade = ' ';
//		switch( score / 10) {
//		case GRADE_A_PLUS
//		case GRADE_A: grade = 'A';break;
//		case GRADE_B: grade = 'B';break;
//		case GRADE_C: grade = 'C';break;
//		case GRADE_D: grade = 'D';break;
//		default : grade = 'F';		
//		}//end switch
		char grade = 64;
		switch(score / 10) {
		case GRADE_D : grade++;//64->65
		case GRADE_C : grade++;//65->66 64>65
		case GRADE_B : grade++;//66->67 65>66 64>65
		case GRADE_A : 
		case GRADE_A_PLUS : grade++;/*67->68* 66>67 65>66*/ break;
		default : grade += 6;
		}
		
		System.out.println(grade + "학점");
		
		//태어난 해를 입력받아 띠를 출력하는 switch~case문 작성.
		
		int year = Integer.parseInt(args[1]);
		System.out.print(year + "년에 태어난 사람은 ");
		
		switch(year  % 12) {
		case 0 :System.out.println("원숭이띠"); break;
		case 1 :System.out.println("닭띠"); break;
		case 2 :System.out.println("개띠"); break;
		case 3 :System.out.println("돼지띠"); break;
		case 4 :System.out.println("쥐띠"); break;
		case 5 :System.out.println("소띠"); break;
		case 6 :System.out.println("호랑이띠"); break;
		case 7 :System.out.println("토끼띠"); break;
		case 8 :System.out.println("용띠"); break;
		case 9 :System.out.println("뱀띠"); break;
		case 10 :System.out.println("말띠"); break;
		case 11 :System.out.println("양띠"); break;
		
		}
		
	}//main

}//class
