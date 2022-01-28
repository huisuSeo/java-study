package day0119;

/**
 * 긴 문자열을 다루는 클래스
 * @author user
 *
 */
public class UseStringBuilder {
	
	public void useStringBuffer() {
		StringBuffer sb = new StringBuffer();
		//값 추가. append()
		sb.append(2022);//정수
		sb.append('A');//문자
		sb.append("1.19");//
		sb.append(false);//
		
		System.out.println(sb + " " + sb.length());
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("오늘은 수요일 입니다.");//붙임
		sb2.insert(4, "2022년 1월 19일 ");//삽입
		sb2.delete(4, 9);//삭제 2022년

		
		System.out.println(sb2);
	}//UseStringBuffer
	

		public void useStringBuilder() {
			StringBuffer sb = new StringBuffer();
			//값 추가. append()
			sb.append(2022);//정수
			sb.append('A');//문자
			sb.append("1.19");//
			sb.append(false);//
			
			System.out.println(sb + " " + sb.length());
			
			StringBuilder sb2 = new StringBuilder();
			sb2.append("오늘은 수요일 입니다.");//붙임
			sb2.insert(4, "2022년 1월 19일 ");//삽입
			sb2.delete(4, 9);//삭제 2022년

			
			System.out.println(sb2);
			
			String fileName = "e:/dev/workspace/javase_prj/day0119/UseStringBuilder.java";
			
			StringBuilder sb3 = new StringBuilder(fileName);
			sb3.insert(sb3.lastIndexOf("."), "_bak");
			
			System.out.println(sb3);
//			String temp = sb3.toString();
//			System.out.println(temp.toUpperCase());
			System.out.println(sb3.toString().toUpperCase());
			//위에 경로/파일명을 "e:/dev/workspace/javase_prj/day0119/UseStringBuilder_bak.java"
			//로 변경하여 출력!!! UseStringBuilder.java 파일명에_bak를 넣어서 만들어 출력.
		
	}//UseStringBuilder
	
	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		System.out.println("-----------------useStringBuffer--------------------");
		
		usb.useStringBuffer();
		System.out.println("-----------------useStringBuilder--------------------");
		usb.useStringBuilder();
		
		
		
		
		
	}//main

}//class
