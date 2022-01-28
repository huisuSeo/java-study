package day1227;
class  HomeWork1{
	public static final int MONEY = 20000;
	public static final int BUS = 2100;
	public static void main(String[] args) {
		int lunch = 8000;
		System.out.println("하루 용돈 " + MONEY + "원 " + "편도 차비 " + BUS + "원 " + "왕복 차비 " + BUS * 2 + "원");
		System.out.println("점심 값 " + lunch + "원");
		System.out.println("남은 금액 " + (MONEY - BUS * 2 - lunch) + "원");
	}
}
