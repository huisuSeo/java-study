package day0119;

public class UseString {

	public static void main(String[] args) {
		
		String str = "안녕";
		str += "하세요?";
		System.out.println(str + " 눈오는 수요일 " + "오전 입니다.");
		
		/*
		String str = "\uC548\uB155";
        str = (new StringBuilder(String.valueOf(str))).append("\uD558\uC138\uC694?").toString();
        System.out.println((new StringBuilder(String.valueOf(str))).append(" \uB208\uC624\uB294 \uC218\uC694\uC77C ").append("\uC624\uC804 \uC785\uB2C8\uB2E4.").toString());
		 */
		
		String csvData = "java,Oracle,JDBC,HTML";
		String[] arr = csvData.split(",");
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}//for

	}//main

}//class
