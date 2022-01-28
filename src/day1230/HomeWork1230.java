package day1230;

public class HomeWork1230 {
	
	public static final int TOWN_BUS = 800;
	public static final int BUS = 1250;
	public static final int SUBWAY = 1300;
	
	public static void main(String[] args) {
		
		int year = Integer.parseInt(args[0]);

		System.out.print(year + "년도에 태어난 사람은 ");
		if (year % 12 == 0) {
			System.out.println("원숭이띠");
		} else if (year % 12 == 1) {
			System.out.println("닭띠");
		} else if (year % 12 == 2) {
			System.out.println("개띠");
		} else if (year % 12 == 3) {
			System.out.println("돼지띠");
		} else if (year % 12 == 4) {
			System.out.println("쥐띠");
		} else if (year % 12 == 5) {
			System.out.println("소띠");
		} else if (year % 12 == 6) {
			System.out.println("호랑이띠");
		} else if (year % 12 == 7) {
			System.out.println("토끼띠");
		} else if (year % 12 == 8) {
			System.out.println("용띠");
		} else if (year % 12 == 9) {
			System.out.println("뱀띠");
		} else if (year % 12 == 10) {
			System.out.println("말띠");
		} else if (year % 12 == 11) {
			System.out.println("양띠");
		}

		int score = Integer.parseInt(args[1]);
		System.out.print("점수 " + score + "은");
		if (score < 0 || score > 100) {
			System.out.println(" 유효점수가 아닙니다.");
		} else if (score <= 39) {
			System.out.println(" 과락");
		} else if (score <= 59) {
			System.out.println(" 다른 점수 참조");
		} else {
			System.out.println(" 합격");
		} // end else

		int km = Integer.parseInt(args[3]);
		int pay = 0;
		//교통기본료는 Constant로 만들어서 넣고 코드를 만들어보세요
		if (args[2].equals("마을버스")) {
			pay = TOWN_BUS;

		} else if (args[2].equals("버스")) {
			pay = BUS;

		} else if (args[2].equals("지하철")) {
			pay = SUBWAY;

		} else {
			System.out.print(args[2] + "은(는) 대중교통이 아닙니다.");
		}

		if (pay > 0) {
			System.out.println(
					"입력 교통수단 " + args[2] + " 이동거리 " + km + "km 기본요금 " + pay + "원 초과요금 " + ((km - 10) / 5 * 100) + "원");
			System.out.println("한달 20일 기준 교통비 " + 20 * (pay + (km - 10) / 5 * 100) + "원");
		}

	}// main
}// class
