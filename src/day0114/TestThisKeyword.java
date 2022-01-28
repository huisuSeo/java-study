package day0114;

public class TestThisKeyword {
	
	private int value;
	
	/**
	 * this�� ������� �ʾ��� �� �Ű������� �ν��Ͻ� �������� ���ٸ� heap�� �ּҸ� ���� �� �ִ�
	 * �Ű������� �����ϰ�, �ּҸ� �޾� �Ű�����(stack)�� �ν��Ͻ�����(heap)�� �ĺ��Ͽ� ����ؾ� �Ѵ�.
	 * @param value
	 * @param ttk
	 */
	public void nonThis(int value, TestThisKeyword ttk) {
		System.out.println("nonThis---->" + ttk);
		ttk.value = value;
	}//nonThis

	public int getValue() {
		return value;
	}//getValue
	
	
	public void useThis(int value) {
		System.out.println(" useThis--->" + this);//this�� ����ϸ� method�� ȣ���ϴ°�ü�� �ּҷ� ����ȴ�.
		this.value = value;
	}//useThis
	
	
	public static void main(String[] args) {
//		value = 10; //static������ memory�� ó�� �ε�Ǳ� ������ ����� �� ����.
		TestThisKeyword ttk = new TestThisKeyword();
//		ttk.nonThis(100,ttk);
		ttk.useThis(200);
		System.out.println(ttk.getValue());//100�� ��µǵ��� �ڵ� ����.
	}//main

}//class
