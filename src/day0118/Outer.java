package day0118;

/**
 * Inner class
 * @author user
 *
 */
public class Outer {
	private int outI;
	
	public Outer() {
		System.out.println("�ٱ�Ŭ������ ������");
	}//Outer
	
	public void outMethod() {
		System.out.println("�ٱ�Ŭ������ method");
		
//		inI = 10;//�ٱ�Ŭ���������� ���� Ŭ������ ������ ���� ����� �� ����.
//		inMethod();//�ٱ�Ŭ���������� ���� Ŭ������ method�� ���� ����� �� ����.
		System.out.println("---------------------------------------");
		//instance method���� inner class�� ��üȭ
//		Inner in = this.new Inner();
		Inner in = new Inner(); //instance���� �ȿ����� this�� �����ؼ� ����� �� �ִ�.
		System.out.println(in);
		
	}//outMethod
	
	///////////////////////���� Ŭ������ ����//////////////////////////////
	public class Inner{
		int inI;
		
		public Inner() {
			System.out.println("���� Ŭ������ ������");
		}//Inner
		
		public void inMethod() {
			System.out.println("���� Ŭ������ method");
			//�ٱ� Ŭ������ �ڿ��� ���� ����� �� �ִ�.
			outI = 100;
			outMethod();
		}//inMethod
		
	}//class
	
	
	///////////////////////���� Ŭ���� ��//////////////////////////////
	public static void main(String[] args) {
		//1.�ٱ�Ŭ������ ��üȭ : Ŭ������ ��ü�� = new ������();
		Outer out = new Outer();
		//2.����Ŭ������ ��üȭ : �ٱ�Ŭ������.����Ŭ������ ��ü�� = �ٱ�Ŭ������ ��ü��.new ����Ŭ������ ������();
		//�ٱ�Ŭ�������� ��������.
		Outer.Inner in = out.new Inner();
		//3.����Ŭ������ �ڿ� ���.
		in.inI = 200;//���� ���
		in.inMethod();//method ���
		
		
	}//main
}//class
