package day0113;

public class UseWork0113 {

	public static void main(String[] args) {
		Work0113[] students = new Work0113[4];
		students[0] = new Work0113("������", 89, 88, 91);
		students[1] = new Work0113("������", 90, 76, 82);
		students[2] = new Work0113("������", 77, 77, 76);
		students[3] = new Work0113("Ȳ����", 100, 94, 97);

		for (Work0113 temp : students) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", temp.getName(), temp.getJava(), temp.getOracle(),
					temp.getHtml(), temp.getTotal(), temp.getAvg());

		} // for
		int kimJavaTotal = 0;
		double findKim = 0.0;
		for (Work0113 temp : students) {
			if (temp.getName().startsWith("��")) {
				findKim += 1;
				kimJavaTotal += temp.getJava();
			} // if
		} // for
		if (findKim == 0.0) {//���ڵ�� �ۼ��� ������? 0���� �� ������ ����.. 0���̸� ��¾��Ͻø� �ǿ�.��!!
			findKim = 1;
		} // if
		System.out.println("�� ���� �ڹ����� �� : " + kimJavaTotal + ", �� ���� �ڹ����� ��� : " + kimJavaTotal / findKim);

	}// main

}// class
