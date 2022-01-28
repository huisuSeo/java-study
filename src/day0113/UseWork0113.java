package day0113;

public class UseWork0113 {

	public static void main(String[] args) {
		Work0113[] students = new Work0113[4];
		students[0] = new Work0113("김진영", 89, 88, 91);
		students[1] = new Work0113("정시헌", 90, 76, 82);
		students[2] = new Work0113("김현우", 77, 77, 76);
		students[3] = new Work0113("황성준", 100, 94, 97);

		for (Work0113 temp : students) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", temp.getName(), temp.getJava(), temp.getOracle(),
					temp.getHtml(), temp.getTotal(), temp.getAvg());

		} // for
		int kimJavaTotal = 0;
		double findKim = 0.0;
		for (Work0113 temp : students) {
			if (temp.getName().startsWith("김")) {
				findKim += 1;
				kimJavaTotal += temp.getJava();
			} // if
		} // for
		if (findKim == 0.0) {//이코드는 작성한 이유는? 0명일 때 에러가 나서.. 0명이면 출력안하시면 되요.넵!!
			findKim = 1;
		} // if
		System.out.println("김 씨의 자바점수 합 : " + kimJavaTotal + ", 김 씨의 자바점수 평균 : " + kimJavaTotal / findKim);

	}// main

}// class
