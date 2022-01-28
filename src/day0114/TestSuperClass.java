package day0114;

/**
 * 부모클래스 : 자식이 사용할 공통 코드 정의. => 코드의 재사용성
 * @author user
 *
 */
public class TestSuperClass {
	public int a;
	protected int b;
	int c;
	private int d;
	
	public TestSuperClass() {
		System.out.println("부모클래스의 기본생성자");
	}//Testsuperclass
	
	public void parentMethod() {
		System.out.println("부모의 method");
	}//parentMethod
	
	
}//class

