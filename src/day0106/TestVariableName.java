package day0106;

/**
 * ���� �̸��� ������ ������� ��.
 * @author user
 */
public class TestVariableName {
	//class field : instance(member) variable, static(class) variable
	//class field���� ����Ǵ� ������ �̸��� �ߺ��� �� ����.
	int i;
	static int j;
//	static int i;//���� �̸��� ������ �����ϱ� ������ error

	public static void main(String[] args) {
		//lacal : local variable
		//������ class field�� ������ �ٸ��� ������ class field�� ����� �̸��� ���� ������ ������ �� �ִ�.
		int i = 0;
		System.out.println("��������" + i);//���������� �������� �ٷ� ���.
		//�ν��Ͻ� ���� ���. 2.��üȭ(Ŭ������ ��ü�� = new Ŭ������();), 
		//3.��ü������ ������ ���(��ü��.������)
		TestVariableName tvn = new TestVariableName();
		System.out.println("�ν��Ͻ����� " + tvn.i);
				
		
	}

}
