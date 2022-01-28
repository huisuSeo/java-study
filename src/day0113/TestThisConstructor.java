package day0113;

/**
 * this 사용
 * @author user
 *
 */
public class TestThisConstructor {
	public TestThisConstructor() {
		//this(13);
		System.out.println("기본생성자");
	}//TestThisConstructor
	
	public TestThisConstructor(int i) {
		this();
		System.out.println("overload된생성자");
		//this(); //생성자의 첫번째 줄에서만 기술할 수 있다.
	}//TestThisConstructor

	public static void main(String[] args) {
		//new TestThisConstructor();
		new TestThisConstructor();

	}//main

}//class
