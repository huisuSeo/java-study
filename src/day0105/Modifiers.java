package day0105;

/**
 * instance(member) value�� ���� ������ ����<br>
 * 
 * @author user
 */
public class Modifiers {
	public int instanceA;//��Ű���� ������� ���ٰ���.
	protected int instanceB;//���� ��Ű���� Ŭ�������� ���ٰ���. 
							//��Ű���� �ٸ��� ��Ӱ����� �ڽ�Ŭ���������� ���ٰ���.
	int instanceC;//���� ��Ű���� Ŭ�������� ���� ����.
	private int instanceD;//Ŭ���� �ȿ����� ���� ����.

	public static void main(String[] args) {
		//��üȭ : �ν��Ͻ������� ����ϱ� ����.
		Modifiers m = new Modifiers();
		//������ ���� Ŭ���� �ȿ����� ���������ڿ� ������� ����� �� �ִ�.
		System.out.println("public : " + m.instanceA);
		System.out.println("protected : " + m.instanceB);
		System.out.println("default : " + m.instanceC);
		System.out.println("private : " + m.instanceD);

	}//main

}//class
