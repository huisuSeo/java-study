package day0114;

/**
 * @author user
 *
 */
public class Parent {
	public Parent() {
//	this(10);//2.
		this(10);
		System.out.println("부모의 기본 생성자");
	}// Parent

	public Parent(int i) {
//		this();//1.
		System.out.println("부모의 오버로딩된 생성자 " + i);
	}// Parent
}// class
