package day0117;

/**
 * 눈,코,입,이름,먹는 일은 부모클래스에서 정의된 코드를 사용하고(상속 : 코드의 재사용성)
 * 자신만의 특징을 정의한 클래스<br>
 * 힘이 쎼다. 일반 성인의 힘은 평균 2.
 * 힘은 1~10까지
 * @author user
 *
 */
public class Clark extends Person {
	public int power;
	
	public Clark() {
		super(3,1,1);//부모클래스의 오버로딩 된 생성자
		power = 8;
	}//Clark

	/**
	 * 돌에 따라서 힘이 달라진다
	 * @param stone
	 * @return
	 */
	public String power(String stone) {
		String result = "";
		
		if(stone.equals("크립토나이트")) {//힘이 방전
			result = "~(_-_)~ 힘이 빠진다.....";
			power = 1;
		}else if(stone.equals("다이아몬드")) {//기부니가 좋은 돌
			result = "~(^^~)(~^^)~ 감사합니다.";
			power = 10;
		}else {//기분이 나쁜 돌
			result = "(-- +) 기분나쁨.";
			power = 12;
		}//else
		
		return result;
	}//power
	
	@Override
	public String eat() {
		return getName() + "이(가) 집에서 빵과 오트밀을 먹는다";
	}//eat
	
	@Override
	public String eat(String menu, int price) {
		return getName() + "이(가) 레스토랑에서 " + menu + "인 음식을 " + price + "$ 내고 사먹는다.";
	}//eat
	
}//class
