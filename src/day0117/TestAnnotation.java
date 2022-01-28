package day0117;

import java.util.Date;
import java.util.List;

public class TestAnnotation {
	@Deprecated
	public void test() {
		System.out.println("일.....");
	}//test
	
	
		@SuppressWarnings({"rawtypes","unused"})//method위에 설정 : method내의 모든 경고상황 처리
	public void temp() {
//		@SuppressWarnings("unused")//변수 위 설정
		int i;
//		@SuppressWarnings("unused")//변수 위 설정
//		@SuppressWarnings({"rawtypes","unused"})//여러가지의 경고상황을 묶어서 처리
		List l = null;
		
	}//temp

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.getYear());
		
		TestAnnotation ta = new TestAnnotation();
		ta.test();
		
	}//main

}//class
