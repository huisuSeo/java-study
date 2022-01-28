package day0106;

/**
 * method overload. ���� �̸��� method�� ������ �ۼ��ϴ� ��.
 * - �Ű������� �ٸ��� �����Ѵ�.
 * @author user
 */
public class TestOverload {
	
	/**
	 * ���� �ϳ� ����ϴ� ��
	 */
	public void printStar() {
		System.out.print("��");
	}//printStar
	
	/**
	 * �Էµ� �� ��� ���� ����ϴ� ��
	 * @param cnt ����� ���� ����.
	 */
	public int printStar(int cnt) {
		for(int i = 0 ; i < cnt ; i++) {
			System.out.print("��");
		}//for
		return 0;
	}//printStar

	public static void main(String[] args) {
		
		TestOverload to = new TestOverload();
		//�� �ϳ� ���
		to.printStar();
		//�� ������ ���
		to.printStar(5);

	}//main

}//class
