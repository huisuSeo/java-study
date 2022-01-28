package day0121;

import java.util.ArrayList;
import java.util.List;

import day0120.UseDate;

/**
 * Generic을 사용하지 않고 List사용.
 * @author user
 *
 */
public class NotUseGeneric {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NotUseGeneric() {
		//1. List생성.
		List list = new ArrayList();
		//2. 값 할당 : 생성된 리스트 방에 모든 값을 넣을 수 있다. => 모든 값 저장(편의성)
		list.add(2022);
		list.add(1);
		list.add(12.42);
		list.add("안녕하세요?");
		list.add(new UseDate());
		
		System.out.println("--------------------------------------");
		//3. 일괄처리 하여 값을 얻기.
		
		for(int i = 0 ; i < list.size() ; i++) {
//			System.out.println(list.get(i)*10);//문제발생.연산이나 캐스팅은 안됨. 뭐가 들어간지 몰라서
			System.out.println(list.get(i));//모든 데이터가 나온다.
		}
	}//NotUseGeneric

	public static void main(String[] args) {
		new NotUseGeneric();
		
		int i = 10;
		Integer ii = 10; //원래는 Integer ii = new Integer(10); 근데 autoboxing 이 됨
//		Integer iii = new Integer(10);
		Integer iii = Integer.valueOf(10);
		
		Integer j = Integer.valueOf(10);
		int jj = j.intValue();

	}//main

}//class
