package day0113;

/**
 * this ���
 * @author user
 *
 */
public class TestThisConstructor {
	public TestThisConstructor() {
		//this(13);
		System.out.println("�⺻������");
	}//TestThisConstructor
	
	public TestThisConstructor(int i) {
		this();
		System.out.println("overload�Ȼ�����");
		//this(); //�������� ù��° �ٿ����� ����� �� �ִ�.
	}//TestThisConstructor

	public static void main(String[] args) {
		//new TestThisConstructor();
		new TestThisConstructor();

	}//main

}//class
