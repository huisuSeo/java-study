package day1224;
/*
	Data Type : 값을 저장하기 위해 이름을 부여하여 미리 언어에서 예약해둔 공간.
	기본형 데이터 형 : Primitive Type

*/
public class DataType{ 
	public static void main(String[] args) {
		byte a = -128; //signed value 음수와 양수의 범위로 할당한다.

		System.out.println( a );

		//평생 벌고 싶은 돈의 액수를 저장하여 출력하는 코드를 작성.

		long money = 4000000000l;
		System.out.println("평생 벌고 싶은 돈 " + money + "원");
	}
}
