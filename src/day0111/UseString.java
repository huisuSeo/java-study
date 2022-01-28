package day0111;

/**
 * 문자열을 다루는 String class 사용<br>
 * 
 * 주의 : 1. java.lang 패키지에 존재하는 클래스 이름으로 클래스를 생성하면 패키지에 정의한 
 * 			같은 이름의 클래스를 먼저 사용한다. (java,lang 패키지의 클래스를 사용하는 것이 아니므로 error)
 * 			-import를 사용해도 동일 적용.
 * 해결 : 1. 같은 이름의 클래스 정의할 때에는 "자바에서 제공하는 클래스를 full path"로 식별하여 사용.
 * 			full path = 클래스를 사용할 때 패키지 명을 모두 명시하여 사용하는 문법.
 * 			String이 아닌 java.lang.String
 *		 2. java.lang 패키지에 존재하는 이름으로 클래스를 만들지 않는다.
 * @author user
 */
public class UseString {
	
	public static void main(String[] args) {
		String str = "AbcdEfg"; //기본형 형식의 사용
		String str2 = new String("os333@naver.com"); //참조형 형식의 사용
		
		//substring(시작문자열, 끝문자열 + 1)
		System.out.println(str + "에서 0~2 인덱스 사이의 자식문자열 " + str.substring(0, 2));
		System.out.println(str + "에서 'Efg'를 잘라보기 " + str.substring(4, 7));
		System.out.println(str + "에서 메일 주소 자르기 " + str2.substring(0, str2.indexOf("@")));
		System.out.println(str + "에서 도메인 주소 자르기 " + str2.substring(str2.indexOf("@") + 1, 15));
		//subtring(시작문자열) : 끝 인덱스를 생략하면 문자열의 끝까지 자른다.
		System.out.println(str + "에서 도메인 주소 자르기 " + str2.substring(str2.indexOf("@") + 1));//substring이 오버로딩 되어있기 떄문.\
		
		str = "김진영";
		System.out.println(str + " 은 '김진영'인가" + str.startsWith("김진영"));
		System.out.println(str + " 은 '김'으로 시작" + str.startsWith("김"));
		System.out.println(str + " 은 '영'으로 끝" + str.endsWith("영"));
		str = "서희수";
		System.out.println(str + " 은 '김진영'인가" + str.startsWith("김진영"));
		System.out.println(str + " 은 '김'으로 시작" + str.startsWith("김"));
		System.out.println(str + " 은 '영'으로 끝" + str.endsWith("영"));
		
		str = "오늘은 토요일 입니다.";
		System.out.println(str + " 은 '요일'을 포함 " + str.contains("요일"));
		
		str = "Java";
		String str3 = str.concat(" SE");
//		Stirng str3 = str + " SE";
		
		System.out.println(str3);
		
		str = "   Java SE   ";
		System.out.println("[" + str.trim() + "]");
		
		str = "Java Java Java";
		//치환 : 찾은 글자를 다른 글자로 변경
		System.out.println(str.replace("Ja", "t"));
		
		str = "   Java SE   ";
		//replace 사용한 문자열 내 모든 공백 제거
		System.out.println("[" + str.replaceAll(" ", "") + "]");
		
		//method chain : method를 계속 연결하여 사용하는 문법.
		str = "나 지금 피씨방이야! 넌 어딘데 씨방새야.ㅆㅣㅂㅏ";
//		String filterTxt = str.replaceAll("씨방", "**");
		String filterTxt = str.replaceAll("씨", "*").replaceAll("방", "*").replaceAll("ㅆ","*").replaceAll("ㅣ","*");
		System.out.println(filterTxt);
		
		int i = 11;
		double l = 2022.0111;
		
		str = String.valueOf(i); //str = i + "";
		str2 = String.valueOf(l);
		System.out.println(str + "/" + str2);
		
		//////////////////////String 초기화//////////////////////
		str = null;
		str2 = "";
		
		if(str == null) {//null인 상태에서는 String class가 제공하는 method를 호출할 수 없다.
			System.out.println(str + "은 heap에 주소를 저장하지 않았습니다.");
		}//if
		
		
		if(str2.isEmpty()) {//empty인 상태에서는 String class가 제공하는 method를 호출할 수 있다.
			System.out.println(str2 + " 은 문자열 저장소의 주소를 저장하였습니다.");
		}//if
		
	}//main

}//class
