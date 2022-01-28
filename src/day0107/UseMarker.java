package day0107;

/**
 * 1. 마카펜 클래스를 사용하여 객체를 생성하고
 * 2. 마카펜 객체가 제공하는 기능을 사용.
 * @author user
 */
public class UseMarker {

	public static void main(String[] args) {
		//마카펜 클래스를 사용하여 검은색 마카펜 생성.
		Marker black = new Marker();//참조형데이터형을 생성.
		
		System.out.println(black);
		//black객체에 뚜껑1개, 몸체1개, 검은색을 설정해보자!!!
		//black.cap = 1;//instance 변수에 private 접근지정자가 선언되어있어 외부에서 절대로 접근할 수 없다.
		
		//생성괸 마카펜 객체에 값을 설정.
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("검은");
		
		System.out.println(black.getColor() + "색인 마카펜의 뚜껑" + black.getCap() + "개, 몸체" + black.getBody() + "개");
		
		
		//5.마카펜 클래스가 제공하는 기능을 사용.
		System.out.println(black.write());
		
		/////////빨간색 마카펜을 생성하여 값을 넣고 사용해보세요.
		Marker red = new Marker(1, 1, "빨간");
		
//		black.setCap(2);
//		black.setBody(2);
//		black.setColor("빨간");
		System.out.println(black.getColor() + "색 마카펜 뚜껑" + black.getCap() + "개, 몸" + black.getBody() + "개");
		System.out.println(black.write("즐거운 주말"));
		
	}//main

}//class
