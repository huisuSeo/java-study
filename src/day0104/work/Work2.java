package day0104.work;

/**
 *점수를 입력받아 입력받은 점수가 0~100사이일 때 0~39 이하는 “과락”, 40~59점 사이는 “다른 점수 참조”, 60~100점 사이는 “합격”을 출력하고 0~100사이가 아닐 때에는 “유효점수가 아닙니다.”를 출력하는 코드.
 * @author user
 */
public class Work2 {
	
	public static void main(String[] args) {
		int score = 0;
		score = Integer.parseInt(args[0]);
		
		System.out.print(score + "점은 ");
		
		if(score > -1 && score < 101) {
			//System.out.println("0~100사이");
			if(score < 40) {
				System.out.println("과락");
			}else if(score < 60){	
				System.out.println("다른점수 참조");
			}else {	
				System.out.println("입력성공");
			}//end else
			
		}else {
			System.out.println("유효점수가 아닙니다.");
			
		}//end else
		
	}//main

}//class
