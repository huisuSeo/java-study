package day0106;

/**
 * method�� 4���� ���¿� ȣ��.
 * @author user
 */
public class TestMethodType {
	
	/**
	 * ������( ��ȯ�� ����, �Ű����� ���� ��) ������ method.
	 */
	public void typeA() {
		System.out.println("������ : ȣ���� �ϴ��� �׻� ���� ���� �����Ѵ�.");
	}//typeA

	/**
	 * ���� �� (��ȯ�� ����, �Ű����� �ִ� ��) ������ method.<br>
	 * �ԷµǴ� ������ ������ ���� ������ �� �ִ�.
	 * @param i �Է°�
	 */
	public void typeB(int i) {
		System.out.println("������ : �Է°��� ���� �ٸ� ���� �����Ѵ�." + i);
	}//typeB
	
	/**
	 * ���� ��(��ȯ�� �ְ�, �Ű����� ���� ��)������ method.
	 * �׻� ���� ���� ��ȯ�ȴ�.
	 * @return ���� 2022�� ��ȯ
	 */
	public int typeC() {
		int i = 2022;
		return i;
	}//typeC
	
	/**
	 * ���� ��(��ȯ�� �ְ�, �Ű����� �ִ� ��) ������ method.
	 * �Ű������� ���� �ٸ� ����� ��ȯ �ȴ�.
	 * @param d �Ǽ����� �Է� ��
	 * @return ������ ��ȯ ��
	 */
	public int typeD(double d) {
		return (int)d;
	}//typeD
	
	public static void main(String[] args) {
		//��üȭ : �ν��Ͻ� ������ �ν��Ͻ� method�� ����ϱ� ���ؼ� �ݵ�� �ʿ��� �۾�.
		TestMethodType tmt = new TestMethodType();
		
	tmt.typeA();//���� ��
//	tmt.typeA();
//	tmt.typeA();
//	tmt.typeA();
	
	tmt.typeB(0);//���� ��
//	tmt.typeB(10);
//	tmt.typeB(100);
	
	int value = tmt.typeC();//���� ��. ó������� ������ �����Ѵ�
	System.out.println("���� �� : ȣ���ϸ� �׻� ���� ���� ��ȯ�ȴ�." + value);
//	int value2 = tmt.typeC();
//	System.out.println("���� �� : ȣ���ϸ� �׻� ���� ���� ��ȯ�ȴ�." + value2);
	
	int value3 = tmt.typeD(2022.0106);
	System.out.println("���� �� : �Ű������� ���� ȣ������ �� �ٸ� ���� ��ȯ�ȴ�." + value3);
	int value4 = tmt.typeD(2021.0106);
	System.out.println("���� �� : �Ű������� ���� ȣ������ �� �ٸ� ���� ��ȯ�ȴ�." + value4);

	}//main

}//class
