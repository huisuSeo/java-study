package day0117;

import java.util.Date;
import java.util.List;

public class TestAnnotation {
	@Deprecated
	public void test() {
		System.out.println("��.....");
	}//test
	
	
		@SuppressWarnings({"rawtypes","unused"})//method���� ���� : method���� ��� ����Ȳ ó��
	public void temp() {
//		@SuppressWarnings("unused")//���� �� ����
		int i;
//		@SuppressWarnings("unused")//���� �� ����
//		@SuppressWarnings({"rawtypes","unused"})//���������� ����Ȳ�� ��� ó��
		List l = null;
		
	}//temp

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.getYear());
		
		TestAnnotation ta = new TestAnnotation();
		ta.test();
		
	}//main

}//class
