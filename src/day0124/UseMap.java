package day0124;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 키와 값의 쌍으로 된 자료구조 - Map
 * @author user
 *
 */
public class UseMap {
	/**
	 * Hashtable : 기본 생성자를 사용해서 생성하면 11개의 행 생성된다.
	 * 동기화 처리
	 */
	public void useHashtable() {
		//1. 생성)
		Map<String, String> map = new Hashtable<String, String>();
		//2.값 할당
		map.put("A", "세심하다. 친절하다. ^o^");
		map.put("B", "성질 드럽다.(--+)");
		map.put("AB", "싸이코 @.,@");
		map.put("O", "우유부단하다 ~(^^~)(~^^)~");
		
		//중복 값에 대한 동작. 키는 중복될 수 없고, 값은 중복된다.
		map.put("A", "소심하다.(^^;;)"); //키는 중복되지 않는다.
		map.put("a", "소심하다.(^^;;)"); //값은 중복될 수 있다.
		
		System.out.println(map);  
		
		//키가 존재하는 지.
		System.out.println(map.containsKey("a"));
		//값 얻기 :키가 존재하면 값이 반환되고, 키가 없으면 null이 반환된다.
		System.out.println(map.get("a") + " / " + map.get("ab"));
		//모든 키 얻기
		Set<String> keys = map.keySet();
		//모든 키를 출력.
		Iterator<String> ita = keys.iterator();
		String key = "";
		while(ita.hasNext()) {
			key = ita.next(); //값을 얻고 포인터를 다음 위치로 이동시킨다.
			System.out.println(key + " " + map.get(key));
		}//while
		
		System.out.println("행의 수 : " + map.size());
		System.out.println("map 행이 존재? : " + map.isEmpty());
		map.remove("O");
		map.clear();
		System.out.println("행의 수 : " + map.size());
		System.out.println("map 행이 존재? : " + map.isEmpty());
		
		System.out.println(map);
		
	}//useHashtable
	/**
	 * HashMap : 기본 생성자를 사용해서 생성하면 16개의 행이 생성된다.
	 * 동기화 처리x
	 */
	public void useHashMap() {
		//1. 생성)
			Map<String, String> map = new HashMap<String, String>();
				
		//2.값 할당
			map.put("A", "세심하다. 친절하다. ^o^");
			map.put("B", "성질 드럽다.(--+)");
			map.put("AB", "싸이코 @.,@");
			map.put("O", "우유부단하다 ~(^^~)(~^^)~");
				
			//중복 값에 대한 동작. 키는 중복될 수 없고, 값은 중복된다.
			map.put("A", "소심하다.(^^;;)"); //키는 중복되지 않는다.
			map.put("a", "소심하다.(^^;;)"); //값은 중복될 수 있다.
			
			System.out.println(map);  
			
			//키가 존재하는 지.
			System.out.println(map.containsKey("a"));
			//값 얻기 :키가 존재하면 값이 반환되고, 키가 없으면 null이 반환된다.
			System.out.println(map.get("a") + " / " + map.get("ab"));
			//모든 키 얻기
			Set<String> keys = map.keySet();
			//모든 키를 출력.
			Iterator<String> ita = keys.iterator();
			String key = "";
			while(ita.hasNext()) {
				key = ita.next(); //값을 얻고 포인터를 다음 위치로 이동시킨다.
				System.out.println(key + " " + map.get(key));
			}//while
			
			System.out.println("행의 수 : " + map.size());
			System.out.println("map 행이 존재? : " + map.isEmpty());
			map.remove("O");
			map.clear();
			System.out.println("행의 수 : " + map.size());
			System.out.println("map 행이 존재? : " + map.isEmpty());
			
			System.out.println(map);
	
	}//useHashMap

	public static void main(String[] args) {
		UseMap um = new UseMap();
		System.out.println("--------------------Hashtable------------------------");
		um.useHashtable();
		System.out.println("--------------------HashMap------------------------");
		um.useHashMap();
	}//main

}//class
