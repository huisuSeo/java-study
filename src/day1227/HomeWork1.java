package day1227;
class  HomeWork1{
	public static final int MONEY = 20000;
	public static final int BUS = 2100;
	public static void main(String[] args) {
		int lunch = 8000;
		System.out.println("�Ϸ� �뵷 " + MONEY + "�� " + "�� ���� " + BUS + "�� " + "�պ� ���� " + BUS * 2 + "��");
		System.out.println("���� �� " + lunch + "��");
		System.out.println("���� �ݾ� " + (MONEY - BUS * 2 - lunch) + "��");
	}
}
