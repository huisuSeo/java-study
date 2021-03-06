package day1228;
/**
쉬프트 연산자<br>
<< : left shift - 비트를 왼쪽으로 밀고, 밀어서 빈칸을 항상 0으로 채운다.
>> : rightshift - 비트를 오른쪽으로 밀고, 밀어서 빈칸을 최상위 부호 비트에 따라 양수면 0을
				음수면 1을 채운다.
>>> : unsigned right shift - 비트를 오른쪽으로 밀고, 밀어서 빈칸을 0으로 채운다.
*/
class  Operator3{
	public static void main(String[] args) {

		int i = 6;// 0000 0110 << 3 = 0011 0000
		System.out.println(i + " << 3 = " + (i << 3));

		i = 1;//0000 0000 0000 0000 0000 0000 0000 0001 << 31 = 1000 0000 0000 0000 0000 0000 0000 0000
		System.out.println(i + " << 31 = " + (i << 31));//비트가 밀려 부호비트로 올라가면 부호가 변경된다.

		i = 80;//0101 0000 >> 4 = 0000 0101
		System.out.println( i + " >> 4 = " + (i >> 4));

		i = 37;//0010 0101
		/*
		기본형 데이터형은 값만 사용할 수 있지만, Wrapper 클래스는 값이외에 여러가지 기능(일 = method)을 사용할 수 있다.
		System.out.println(i + "를 2진수로 " + Integer.toBinaryString(i));
		System.out.println(i + "를 16진수로 " + Integer.toHexString(i));
		System.out.println(i + "를 8진수로 " + Integer.toOctalString(i));
		*/
		System.out.println(i + " >> 3 = " + (i >> 3));//0010 0101 >> 3 = 0000 0100

		i = -1;//1111 111
		System.out.println(i + " >> 100 = " + (i >> 100));

		i = 45;// 0010 1101
		System.out.println(i + " >>> 2 = " + ( i >>> 2 ));//0010 1101 >> 2 = 0000 1011 01

		i = -1;//1111 1111 1111 1111 1111 1111 1111 1111
		System.out.println( i + " >>> 1 = " + ( i >>> 1 ));//0111 1111 1111 1111 1111 1111 1111 1111 1

	}
}
