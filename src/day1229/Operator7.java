package day1229;
/**
대입연산자.
=
+=, 
*/
class Operator7 {
	public static void main(String[] args) {
		int i = 5;
		//순수대입
		i = 7;
		//산술대입
		i += 5;//i = i + 5;
		i -= 4;//i = i - 4;
		i *= 3;//i = i * 3;
		i /= 5;//i = i / 5; 정수 / 정수 = 정수
		i %= 3;//i = i % 3;
		//쉬프트대입
		i <<= 4;// i = i << 4; //0000 0001 << 4 = 0001 0000
		i >>= 1;// i = i >> 1; //0001 0000 >> 1 = 0000 1000
		i >>>= 1;// i = i >>> 1; // 0000 1000 >>> 1 = 0000 0100   0

		//비트논리 대입.
		i &= 12;// i = i & 12; // 0000 0100 & 0000 1100 = 0000 0100
		i |= 6;// i = i | 6; //0000 0100 | 0000 0110 = 0000 0110
		i ^= 12;// i  = i ^ 12; // 0000 0110 ^ 0000 1100 = 0000 1010

		System.out.println( i );
	}
}
