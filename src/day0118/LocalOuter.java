package day0118;

/**
 * Local Class
 * @author user
 */
public class LocalOuter {
	int outI;
	
	public void method(int paramI, final int paramJ/*�Էµ� ���� �������� �ʰ� ���.*/) {
		int localA = 2022;
		final int localB = 1;
//		paramJ = 1;
		
		//////////////����Ŭ���� ����//////////////////////////
		class LocalInner{
			int i;
			public LocalInner() {
				System.out.println("����Ŭ������ ������");
			}//LocalInner
			
			public void localMethod() {
				System.out.println("����Ŭ������ method");
				System.out.println("�ٱ� Ŭ������ instance ���� : " + outI);
				//JDK1.8���� ����Ŭ�������� final�� ��õ��� ���� ������ ����� �� �ְ� �Ǿ���.
				//paramI = 1;
				System.out.println("method�� �Ű����� : " + paramI + "," + paramJ);
				//localA = 10;/���� ����ϴ� �͸� ��, �� �������ȵ�
				System.out.println("method�� �������� : " + localA + "," + localB);
			}//localMethod
			
		}//class
		//////////////����Ŭ���� ��//////////////////////////
		//����Ŭ������ ����ϱ� ���ؼ� ��üȭ�� �Ѵ�.
		LocalInner lo = new LocalInner();
		lo.i = 49;
		System.out.println(lo.i);
		lo.localMethod();
		
	}//method
	
	public static void main(String[] args) {
		LocalOuter loc = new LocalOuter();
		loc.method(100,300);
	}//main

}//class
