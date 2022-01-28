package day1230;

public class HomeWork1230 {
	
	public static final int TOWN_BUS = 800;
	public static final int BUS = 1250;
	public static final int SUBWAY = 1300;
	
	public static void main(String[] args) {
		
		int year = Integer.parseInt(args[0]);

		System.out.print(year + "�⵵�� �¾ ����� ");
		if (year % 12 == 0) {
			System.out.println("�����̶�");
		} else if (year % 12 == 1) {
			System.out.println("�߶�");
		} else if (year % 12 == 2) {
			System.out.println("����");
		} else if (year % 12 == 3) {
			System.out.println("������");
		} else if (year % 12 == 4) {
			System.out.println("���");
		} else if (year % 12 == 5) {
			System.out.println("�Ҷ�");
		} else if (year % 12 == 6) {
			System.out.println("ȣ���̶�");
		} else if (year % 12 == 7) {
			System.out.println("�䳢��");
		} else if (year % 12 == 8) {
			System.out.println("���");
		} else if (year % 12 == 9) {
			System.out.println("���");
		} else if (year % 12 == 10) {
			System.out.println("����");
		} else if (year % 12 == 11) {
			System.out.println("���");
		}

		int score = Integer.parseInt(args[1]);
		System.out.print("���� " + score + "��");
		if (score < 0 || score > 100) {
			System.out.println(" ��ȿ������ �ƴմϴ�.");
		} else if (score <= 39) {
			System.out.println(" ����");
		} else if (score <= 59) {
			System.out.println(" �ٸ� ���� ����");
		} else {
			System.out.println(" �հ�");
		} // end else

		int km = Integer.parseInt(args[3]);
		int pay = 0;
		//����⺻��� Constant�� ���� �ְ� �ڵ带 ��������
		if (args[2].equals("��������")) {
			pay = TOWN_BUS;

		} else if (args[2].equals("����")) {
			pay = BUS;

		} else if (args[2].equals("����ö")) {
			pay = SUBWAY;

		} else {
			System.out.print(args[2] + "��(��) ���߱����� �ƴմϴ�.");
		}

		if (pay > 0) {
			System.out.println(
					"�Է� ������� " + args[2] + " �̵��Ÿ� " + km + "km �⺻��� " + pay + "�� �ʰ���� " + ((km - 10) / 5 * 100) + "��");
			System.out.println("�Ѵ� 20�� ���� ����� " + 20 * (pay + (km - 10) / 5 * 100) + "��");
		}

	}// main
}// class
