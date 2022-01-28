package day0118;

/**
 * Local Class
 * @author user
 */
public class LocalOuter {
	int outI;
	
	public void method(int paramI, final int paramJ/*입력된 값을 변경하지 않고 사용.*/) {
		int localA = 2022;
		final int localB = 1;
//		paramJ = 1;
		
		//////////////지역클래스 시작//////////////////////////
		class LocalInner{
			int i;
			public LocalInner() {
				System.out.println("지역클래스의 생성자");
			}//LocalInner
			
			public void localMethod() {
				System.out.println("지역클래스의 method");
				System.out.println("바깥 클래스의 instance 변수 : " + outI);
				//JDK1.8부터 지역클래스에서 final이 명시되지 않은 변수를 사용할 수 있게 되었다.
				//paramI = 1;
				System.out.println("method의 매개변수 : " + paramI + "," + paramJ);
				//localA = 10;/값을 사용하는 것만 됨, 값 변경은안됨
				System.out.println("method의 지역변수 : " + localA + "," + localB);
			}//localMethod
			
		}//class
		//////////////지역클래스 끝//////////////////////////
		//지역클래스를 사용하기 위해서 객체화를 한다.
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
