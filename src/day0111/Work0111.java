package day0111;

public class Work0111 {
	
	private String number;
	
	
	/**
	 * 1. 주민번호를 입력 받아 인스턴스 변수에 저장하는 생성자를 만드세요. (인스턴스면수 만들기, 생성자 만들기)
	 * @return 주민번호
	 */
	public Work0111(String number) {
	this.number = number;
	}//Work0111
	
	
	
	/**
	 *  2. 입력된 주민번호의 길이가 14자인지 체크하여 boolean으로 반환하는 method를 작성하세요.
    14자 –true 그렇지 않으면 false
	 * @return 주민번호 길이가 맞는지 
	 */
	public boolean checkNumber() {
		return number.length() == 14;
	}//checkNumber
	
	
	
	/**
	 *  3. 입력된 주민번호에 ‘-’이 올바른 위치에 있는지 체크하여 boolean으로 반환하는  method를 작성하세요.   
     7번째 자리에 ‘–’이 있으면 true, 그렇지 않으면 false
	 * @return '-'가 있는지
	 */
	public boolean checkBar() {
		return number.indexOf("-") == 6;
	}//checkBar
	
	
	
	/**
	 *  4. 입력된 주민번호에서 생년월일을 연산하여 문자열로 반환하는 method를 작성하세요.,<br>
    반환 예) 입력주민 번호가 880102-1234567이라면  1988년 1월 2일 로 반환 되어야합니다.<br>
       판단기준 ‘-’ 뒷자리가 1,2,5,6 이라면 1900년대생  3,4,7,8 이라면 2000년대생,
          0,9라면 1800년대생입니다.
	 * @return 생년월일
	 */
	public String birthday() {
		String day = "";
		if(number.charAt(7) == '1' || number.charAt(7) == '2' || number.charAt(7) == '5' || number.charAt(7) == '6') {
			day = "19";
		}else if(number.charAt(7) == '3' || number.charAt(7) == '4' || number.charAt(7) == '7' || number.charAt(7) == '8') {
			day = "20";
		}else {
			day = "18";
		}//if
		
		day = day + number.charAt(0) + number.charAt(1) + "년 " + Integer.parseInt(number.substring(2, 4)) + "월 " 
		+ Integer.parseInt(number.substring(4, 6)) + "일";
		
		return day;
		}//birthday
	
	
	
	/**
	 * 5. 입력된 주민번호에서 나이를 구해서 정수로 반환하는 method를 작성하세요.
	 * @return 나이
	 */
	public int age() {
		int age = 0;
		age = 2022 - Integer.parseInt(birthday().substring(0, 4)) + 1;
		return age;
	}//age
	
	
	
	/**
	 *  6. 입력된 주민번호에서 성별을 구해 문자열로 반환하는 method를 작성하세요.
	 * @return 성별
	 */
	public String gender() {
		String gender = "";
		if(number.charAt(7) == '1' || number.charAt(7) == '5'|| number.charAt(7) == '3'|| number.charAt(7) == '7') {
			gender = "남";
		}else {
			gender = "여";
		}//if
		return gender;
	}//gender
	
	
	
	/**
	 *  7. 입력된 주민번호에서 띠를 구해서 문자열로 반환하는 method를 작성하세요.
	 * @return 띠
	 */
	public String animal() {
		String[] animals = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
				
		return animals[Integer.parseInt(birthday().substring(0, 4)) % 12] + "띠";
		//연산된 결과로 배열의 방의 값을 반환하면 조건문이 필요없다.
	}//animal
	
	
	
	public static void main(String[] args) {
		
		Work0111 w1 = new Work0111("950915-2234507");
		
		if(w1.checkNumber() == true) {
			if(w1.checkBar() == true) {
				System.out.println("입력주민번호 : " + w1.number);
				System.out.println("생년월일 : " + w1.birthday());
				System.out.println("나이 : " + w1.age());
				System.out.println("성별 : " + w1.gender());
				System.out.println("띠 : " + w1.animal());
				
			}else {
				System.out.println("'-'이 정상적인 위치에 없습니다.");
			}//else
		}else {
			System.out.println("주민번호의 글자수가 맞지 않습니다.");
		}//else
		
		
	}//main

}//class
