package day0114;

public class TestThisKeyword {
	
	private int value;
	
	/**
	 * this를 사용하지 않았을 때 매개변수와 인스턴스 변수명이 같다면 heap에 주소를 받을 수 있는
	 * 매개변수를 선언하고, 주소를 받아 매개변수(stack)와 인스턴스변수(heap)을 식별하여 사용해야 한다.
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
		System.out.println(" useThis--->" + this);//this를 사용하면 method를 호출하는객체의 주소로 변경된다.
		this.value = value;
	}//useThis
	
	
	public static void main(String[] args) {
//		value = 10; //static영역이 memory에 처음 로드되기 때문에 사용할 수 없다.
		TestThisKeyword ttk = new TestThisKeyword();
//		ttk.nonThis(100,ttk);
		ttk.useThis(200);
		System.out.println(ttk.getValue());//100이 출력되도록 코드 수정.
	}//main

}//class
