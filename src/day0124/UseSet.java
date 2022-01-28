package day0124;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 검색의 기능이 없고, 중복값을 저장하지 않는 자료구조.
 * 입려값은 순차적으로 들어가지 않는다.
 * @author user
 *
 */
public class UseSet {
	public UseSet() {
		//1.생성
		Set<String> set = new HashSet<String>();
		//2. 값 할당 - 입력값은 순차적으로 들어가지 않는다.
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("HTML");
		set.add("CSS");
		set.add("JavaScript");
		//중복 값 - 입력되는 값과 동일한 값이 있을 때에는 입력되지 않는다.
		set.add("HTML");
		set.add("HTML");
		set.add("Java");

		//3.크기
		System.out.println(set.size());
		
		//4.배열로 복사
		//빈 배열 생성
		String[] copyArr = new String[set.size()];
		//복사
		set.toArray(copyArr);
		
		//검색 - 기능 없음.
//		set.get(0); //Error
		//검색대행
		//개선된 for사용하면 iterator 없어도 출력된다.
//		for(String subject : set) {
//			System.out.println(set);
//		}
		//검색대행 : Iterator
		//1. set객체의 제어권을 받는다.
		Iterator<String> ita = set.iterator();
		//2.Iterator를 통해서 Set의 요소가 존재하는지 검색을 한 후
//		String value = null;
//		while(ita.hasNext()) {
//		//3.요소가 존재한다면 값을 얻고, 포인터를 다음으로 이동시킨다.
//			value = ita.next();
//			System.out.println(value);
//		}//while
		
		
		//삭제.
		set.remove("JDBC");//특정 방의 값 삭제
		set.clear();//모든 방의 값 삭제.
		
		System.out.println(set.isEmpty());
		
		System.out.println(set);
		System.out.println("--------------------복사된 값-------------------------");
		for(int i = 0 ; i < copyArr.length ; i++) {
			System.out.println(copyArr[i]);
		}//for
	}//UseSet
	
	/**
	 * Set의 중복 값 저장 여부
	 */
	public void dupVal() {
		//1.생성
		Set<TestVO> set = new HashSet<TestVO>();
		
		//2.값 할당 -> set이 1차적으로 저장한 값은 중복 값을 저장하지 않는다.
		set.add(new TestVO("정시헌",25));//new로 생성된 객체의 주소가 다르므로
		set.add(new TestVO("정인선",24));
		set.add(new TestVO("장정우",24));
		set.add(new TestVO("정시헌",25));//이전의 같은 값을 가지더라도 입력된다.
		
		TestVO tv = new TestVO("전민정",26);
		set.add(tv);//하나의 주소가
		set.add(tv);//여러 번 입력되면 추가되지 않는다.
		
		System.out.println(set);
	}//dupVal

	public static void main(String[] args) {
		UseSet us = new UseSet();
		System.out.println("-----------------중복값의 처리---------------------");
		us.dupVal();
	}//main

}//class
