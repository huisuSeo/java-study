package day0118;

public class UseAnonymous {
	
	/**
	 * Ŭ����(�������̽�)�� �Ű������� �޴� method
	 * @param ta
	 */
	public void useTestA(TestA ta) {
		ta.testA();
	}//useTestA
	
	public static void main(String[] args) {
//		1. Ŭ������ ��üȭ
		UseAnonymous ua = new UseAnonymous();
//		3. �������̽��� ������ Ŭ������ ��üȭ
//		ua.useTestA(new TestA());
		TestAImpl tai = new TestAImpl();//TestAImple�� TestA �̴� (is a ����)
		
		//4. 3������ ������ ��ü�� arguments �Է��Ͽ� methodȣ��
		ua.useTestA(tai);
		ua.useTestA(tai);//�ѹ� �̻� ȣ���ϴ��� ��ü�� �����Ͽ� ȣ���ϸ� �ȴ�. => �ߺ��ڵ尡 �پ���.
		
		
		System.out.println("-----------------------anonymous inner class--------------------------------");
		//1.Ŭ������ ��üȭ
		UseAnonymous ua2 = new UseAnonymous();
		//2.anonymous inner class�� ��ü�� �����Ͽ� arguments�� �Է��Ѵ�.
		ua2.useTestA(new TestA() {
			@Override
			public void testA() {
				System.out.println("anonymous inner class�� ������ ��ü.");
			}
		});
		ua2.useTestA(new TestA() {
			@Override
			public void testA() {
				System.out.println("�ѹ��̻� ȣ��Ǹ� �ߺ��ڵ��� ���� �����Ѵ�");
			}
		});
			
	}//main

}//class
