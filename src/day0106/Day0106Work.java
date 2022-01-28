package day0106;

/**
 * 아래의 업무를 처리할 수 있는 method를 작성하고, 호출하여 반환 값을 받아 출력하세요.
1. 자신의 성(last name) 을 문자로 반환하는 method를 작성.
2. 점수를 입력 받아서 판정을 반환하는 method작성
    (판정 : 0~100 사이 일 때는 true를 그렇지 않다면 false 반환)
3. 점수를 입력 받아서 학점 (’A’ ~ ‘F’)을 구하여 반환하는 method작성. (if로 작성)
4. 수업시간에 작성한 printStar를 호출하여 별을 아래와 같이 출력.
    ★
    ☆☆
    ★★★
    ☆☆☆☆
5. 구구단을 출력하는 method를 작성하세요.
    매개변수 없이 method를 호출하면 구구단 2단을 출력하고,
    단을 넣어 method를 호출하면 입력한 단의 구구단을 출력하는 method를 작성할 것
 * @author user
 */
public class Day0106Work {
	
	/**
	 * 1. 자신의 성(last name) 을 문자로 반환하는 method를 작성.
	 */
	public static void lastname(){
		System.out.println("S");
	}//lastname
	
	/**
	 * 2. 점수를 입력 받아서 판정을 반환하는 method작성
    (판정 : 0~100 사이 일 때는 true를 그렇지 않다면 false 반환)
	 */

	
	public static void test(int i) {
		
		if(i > 1 && i < 101) {
			System.out.println(true);
			
		}else{
			System.out.println(false);
		}//if
	}//test
	
	/**
	 * 3. 점수를 입력 받아서 학점 (’A’ ~ ‘F’)을 구하여 반환하는 method작성. (if로 작성)
	 * @param i
	 */
	public static void grade(int i) {
		if(i <= 59 && i >= 0) {
			System.out.println('F');
		}else if(i <= 69 && i >= 60){
			System.out.println('D');
		}else if(i <= 79 && i >= 70) {
			System.out.println('C');
		}else if(i <= 89 && i >= 80) {
			System.out.println('B');
		}else if(i <= 100 && i >= 90) {
			System.out.println('A');
		}else {
			System.out.println("오류");
		}//if
		
		
	}//grade
	
	/**
	 * 5. 구구단을 출력하는 method를 작성하세요.
    매개변수 없이 method를 호출하면 구구단 2단을 출력하고,
    단을 넣어 method를 호출하면 입력한 단의 구구단을 출력하는 method를 작성할 것
	 */
	public void gugu(int i) {
		
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
				
			}//for
	}//gugu
	
	public void gugu() {
		int i = 2;
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
				
			}//for
		
	}//gugu
	
	
	public static void main(String[] args) {
		
		TestOverload to = new TestOverload();
		
		
		Day0106Work.lastname();
		Day0106Work.test(60);
		Day0106Work.grade(100);
				
		for(int i = 1 ; i < 5 ; i++) {
			if(i % 2 != 0) {
				for(int j = 0 ; j < i ; j++) {
					to.printStar();
				}//for
			}else{
				to.printStar(i);
			}//if
			System.out.println();
		}//for
		
		
		Day0106Work dw = new Day0106Work();
		dw.gugu(3);

	}//main

}//class
