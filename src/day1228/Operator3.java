package day1228;
/**
����Ʈ ������<br>
<< : left shift - ��Ʈ�� �������� �а�, �о ��ĭ�� �׻� 0���� ä���.
>> : rightshift - ��Ʈ�� ���������� �а�, �о ��ĭ�� �ֻ��� ��ȣ ��Ʈ�� ���� ����� 0��
				������ 1�� ä���.
>>> : unsigned right shift - ��Ʈ�� ���������� �а�, �о ��ĭ�� 0���� ä���.
*/
class  Operator3{
	public static void main(String[] args) {

		int i = 6;// 0000 0110 << 3 = 0011 0000
		System.out.println(i + " << 3 = " + (i << 3));

		i = 1;//0000 0000 0000 0000 0000 0000 0000 0001 << 31 = 1000 0000 0000 0000 0000 0000 0000 0000
		System.out.println(i + " << 31 = " + (i << 31));//��Ʈ�� �з� ��ȣ��Ʈ�� �ö󰡸� ��ȣ�� ����ȴ�.

		i = 80;//0101 0000 >> 4 = 0000 0101
		System.out.println( i + " >> 4 = " + (i >> 4));

		i = 37;//0010 0101
		/*
		�⺻�� ���������� ���� ����� �� ������, Wrapper Ŭ������ ���̿ܿ� �������� ���(�� = method)�� ����� �� �ִ�.
		System.out.println(i + "�� 2������ " + Integer.toBinaryString(i));
		System.out.println(i + "�� 16������ " + Integer.toHexString(i));
		System.out.println(i + "�� 8������ " + Integer.toOctalString(i));
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
