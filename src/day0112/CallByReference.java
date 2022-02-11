package day0112;

/**
 * �޼ҵ��� �Ű������� ������ ������������ ����Ǿ��ִٸ�, �ּҰ� ���޵ȴ�.
 * �Է¹��� ��ü�� ���� �����ϸ�, ������ü�� ���� ����ȴ�.
 * @author user
 */
public class CallByReference {
	private int i;
	private int j;
	
	public void swap(CallByReference cbr) {
		int temp = 0;
		temp = cbr.i;
		cbr.i = cbr.j;
		cbr.j = temp;
		System.out.printf("swap method �� i = %d, j = %d\n", cbr.i, cbr.j);
	}//swap

	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i = 100;
		cbr.j = 300;
		
		System.out.printf("swap ȣ�� �� i = %d, j = %d\n", cbr.i, cbr.j);
		cbr.swap(cbr);//�Էµ� ��ü�� ���� method�ȿ��� ����Ǹ� �ϳ��� �ּҸ� ����ϱ� ������
		System.out.printf("swap ȣ�� �� i = %d, j = %d\n", cbr.i, cbr.j);//���� ����� ����޴´�.
	}//main

}//class