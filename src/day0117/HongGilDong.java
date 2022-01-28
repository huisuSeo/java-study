package day0117;

/**
 *사람의 공통 특징(눈, 코, 입, 이름, 먹는일)은 Person 클래스에서 가져다 사용하고 자신의 특징만 정의하는 
 *자식클래스<br>
 *홍길동은 싸움을 잘하는 특징.
 *싸움 레벨은 1~10까지 존재.<br> 평균 성인의 싸움등급 3으로 본다.
 * @author user
 *
 */
public class HongGilDong extends Person {
	private int myLevel;
	public HongGilDong() {
		super();
		myLevel = 5;
	}//HongGilDong
	
	public String fight(int yourLevel) {
		String resultMsg = "";
		if(myLevel < yourLevel) {//지는 경우
			resultMsg = "OTz 싸움에서 졌음";
			myLevel--;
			if(myLevel < 1) {
				myLevel = 1;
			}//if
		}else if(myLevel > yourLevel) {//이기는 경우
			resultMsg = "s('.^)V 싸움에서 이겼음.";
			myLevel++;
			if(myLevel > 10) {
				myLevel = 10;
			}//if
		}else {//비기는 경우
			resultMsg = "(--+)싸움에서 비겼음.";
		}//else
		return resultMsg;
	}//fight
	
	@Override
	public String eat() {
		return getName() + "이 집에서 밥을 먹는다.";
	}//eat
	
	@Override
	public String eat(String fn, int price) {
		//name은 부모클래스에서 private 접근지정자로 되어있으므로 외부에서 직접 접근을 할 수 없다.
//		return name + "이(가) 식당에서 " + fn + "인 음식을 " + price + " 원 내고 사먹는다.";
		//public인 method를 호출하여 사용한다.
		return getName() + "이(가) 주막에서 " + fn + "인 음식을 " + price + "냥 내고 사먹는다.";
	}//eat

}//class
