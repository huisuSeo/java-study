package day0105;

/**
 * instance method�� �ۼ�, ȣ��.
 * @author user
 */
public class UseInstanceMethod {
	/**
	 * 
	 *instance method
	 */
	
	public void test() {
		System.out.println("test method ȣ��!!!");
	}//test
	
	public static void main(String[] args) {
	//test();//static ���������� instance method �� ���� ȣ���� �� ����.
	//2. ��üȭ
		UseInstanceMethod uim = new UseInstanceMethod();
	//3. ȣ��
		uim.test();

	}//main

}//class
