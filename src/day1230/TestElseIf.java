package day1230;
/**
다중 if.(else~if)
연관된 여러 조건을 비교할 때 사용
*/
public class  TestElseIf{
	public static void main(String[] args) {

	//점수를 입력받아 0점보다 작았을 때의 실패메시지와 100점보다 컸을 때 실패메시지와
	//성공했을 때 메시지를 출력

	
	int score = Integer.parseInt(args[0]);
	//int score = 0;

	System.out.print( score + "점은");

	if(score < 0){//0보다 작은 경우
		System.out.println(" 0점 보다 작을 수 없습니다.");
	}else if(score > 100){//100보다 큰 경우
		System.out.println(" 100보다 클 수 없습니다.");
	}else{//그렇지 않은 경우
		System.out.println(" 입력성공");
	}//end else

//수를 입력받아 0~39 까지는 " 과락" 40 ~59까지는 "다른 점수 참조",
//60~100까지는 "합격" -else를 생략하는 코드 작성.
	System.out.print(score + "점");
	if(score >= 0 && score <= 39 ){//0~39
		System.out.println(" 과락");
	}else if(score >=40 && score <=59){//40~59
		System.out.println(" 다른 점수 참조");
	}else if(score >= 60 && score <=100){//60~100
		System.out.println(" 합격!!!");
	}//end if

	
	}//main
}//class
