package day0114;

/**
 * TestSuperClass �� �ڽ�Ŭ����
 * @author user
 *
 */
public class TestSubClass extends TestSuperClass {
	
	int c;//�θ�Ŭ������ �����ϴ� ������� ������ ���� ���� �ڽĲ��� ��

	public TestSubClass() {
		System.out.println("�ڽ�Ŭ������ ������");
	}//TestSubClass
	public void parentResource() {
		this.a = 10;//public
		this.b = 20;//protected //this�̸��� �Ȱ�ġ�� �� ����
		this.c = 30;//default
		super.c = 40;//���� �̸��� ������ �����ϸ� �θ��� ������ super�� �ڽ��� ������ this�� �����Ѵ�
//		d = 10//private
//		System.out.println(super);
	System.out.println("�ڽ� method " + a + " , " + b + ","+ c);
	}
}//class
