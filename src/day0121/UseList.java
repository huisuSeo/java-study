package day0121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * java.util.List의 사용
 * @author user
 *
 */
public class UseList {

	public void useArrayList() {
		//1. 생성
		List<String> list = new ArrayList<String>();
		
		//2. 값 할당)값은 순차적으로 할당되며, 값을 할당할 때 마다 방의 개수가 증가한다.
		//중복값을 허용한다.
		list.add("Java"); //0
		list.add("Oracle"); //1
		list.add("JDBC"); //2
		list.add("Java"); //3
		list.add("HTML"); //4
		
//		list.add(2, "포항항항"); //LinkedList 킹추천
		if(list.isEmpty()) {
			System.out.println("리스트가 비어있음");
		}else {
			System.out.println("리스트에 값 있음");
			
			//값 얻기
			String val = list.get(0);
			System.out.println("처음 번째 방 값 : " + val);
			//모든 방의 값 출력.
			for(int i = 0 ; i < list.size(); i++) {
				System.out.printf("list.get(%d) = %s \n",i ,list.get(i));
			}//for
			
		}//else
		
		//배열로 복사 : Generic이 설정되어야 함.
		//1.복사할 배열을 생성하고
		String[] copy = new String[list.size()];
		//2.복사
		list.toArray(copy);
		
		//삭제
		//인덱스
		list.remove(1);
		//방의 내용으로 삭제. 중복 값이 존재한다면 가장 처음 값만 삭제.
		list.remove("Java");
		//모든 방의 값 삭제
		list.clear();
		
		System.out.println(list + " / " + list.size());
		
		System.out.println(Arrays.toString(copy));
		
	}//useArrayList
	
	public void useVector() {
		//1. 생성
				List<String> list = new Vector<String>();
				
				//2. 값 할당)값은 순차적으로 할당되며, 값을 할당할 때 마다 방의 개수가 증가한다.
				//중복값을 허용한다.
				list.add("Java"); //0
				list.add("Oracle"); //1
				list.add("JDBC"); //2
				list.add("Java"); //3
				list.add("HTML"); //4
				String key = "java";
				System.out.println(key + " " + (list.contains(key)? "있음" : "없음"));
				
//				list.add(2, "포항항항"); //LinkedList 킹추천
				if(list.isEmpty()) {
					System.out.println("리스트가 비어있음");
				}else {
					System.out.println("리스트에 값 있음");
					
					//값 얻기
					String val = list.get(0);
					System.out.println("처음 번째 방 값 : " + val);
					//모든 방의 값 출력.
					for(int i = 0 ; i < list.size(); i++) {
						System.out.printf("list.get(%d) = %s \n",i ,list.get(i));
					}//for
					
				}//else
				
				//배열로 복사 : Generic이 설정되어야 함.
				//1.복사할 배열을 생성하고
				String[] copy = new String[list.size()];
				//2.복사
				list.toArray(copy);
				
				//삭제
				//인덱스
				list.remove(1);
				//방의 내용으로 삭제. 중복 값이 존재한다면 가장 처음 값만 삭제.
				list.remove("Java");
				//모든 방의 값 삭제
				list.clear();
				
				System.out.println(list + " / " + list.size());
				
				System.out.println(Arrays.toString(copy));
	}//useVector
	
	public void useLinkedList() {
	
		//1. 생성
				List<String> list = new LinkedList<String>();
				
				//2. 값 할당)값은 순차적으로 할당되며, 값을 할당할 때 마다 방의 개수가 증가한다.
				//중복값을 허용한다.
				list.add("Java"); //0
				list.add("Oracle"); //1
				list.add("JDBC"); //2
				list.add("Java"); //3
				list.add("HTML"); //4
				
//				list.add(2, "포항항항"); //LinkedList 킹추천
				if(list.isEmpty()) {
					System.out.println("리스트가 비어있음");
				}else {
					System.out.println("리스트에 값 있음");
					
					//값 얻기
					String val = list.get(0);
					System.out.println("처음 번째 방 값 : " + val);
					//모든 방의 값 출력.
					for(int i = 0 ; i < list.size(); i++) {
						System.out.printf("list.get(%d) = %s \n",i ,list.get(i));
					}//for
					
				}//else
				
				//배열로 복사 : Generic이 설정되어야 함.
				//1.복사할 배열을 생성하고
				String[] copy = new String[list.size()];
				//2.복사
				list.toArray(copy);
				
				//삭제
				//인덱스
				list.remove(1);
				//방의 내용으로 삭제. 중복 값이 존재한다면 가장 처음 값만 삭제.
				list.remove("Java");
				//모든 방의 값 삭제
				list.clear();
				
				System.out.println(list + " / " + list.size());
				
				System.out.println(Arrays.toString(copy));
				
	}//useLinkedList
	
	
	public static void main(String[] args) {
		UseList ul = new UseList();
		System.out.println("--------------------ArrayList----------------------");
		ul.useArrayList();
		System.out.println("--------------------Vector----------------------");
		ul.useVector();
		System.out.println("---------------------LinkedList---------------------");
		ul.useLinkedList();
	}//main

}//class
