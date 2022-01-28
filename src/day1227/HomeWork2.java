package day1227;
class HomeWork2 {
	public static void main(String[] args) {
		double left = -1.23;//실수를 사용하실 때에는 float보다는 double로 써주세요.
		double right = -3.45;
	
		System.out.println("나의 왼쪽 눈 시력 " + left + "오른쪽 눈 시력 " + right);
		System.out.println("양안 시력" + (double)(left + right)/2);
	}
}
