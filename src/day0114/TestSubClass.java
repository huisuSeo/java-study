package day0114;

/**
 * TestSuperClass 의 자식클래스
 * @author user
 *
 */
public class TestSubClass extends TestSuperClass {
	
	int c;//부모클래스에 존재하는 변수명과 동일한 변수 선언 자식꺼를 씀

	public TestSubClass() {
		System.out.println("자식클래스의 생성자");
	}//TestSubClass
	public void parentResource() {
		this.a = 10;//public
		this.b = 20;//protected //this이름만 안겹치면 다 가능
		this.c = 30;//default
		super.c = 40;//같은 이름의 변수가 존재하면 부모의 변수는 super로 자식의 변수는 this로 접근한다
//		d = 10//private
//		System.out.println(super);
	System.out.println("자식 method " + a + " , " + b + ","+ c);
	}
}//class
