package day1227;
/**
�ڵ� â���� �پ��� ������ ���.
*/
class  UseRadix{
	public static void main(String[] args) {

		int decimal = 10;//10����
		int octal = 012;//8����
		int hex = 0xa;//16���� (0xA �Ǵ� 0xa) 16������ ��ҹ��� ��� ��� ����.

		//�پ��� ������ ����ϴ��� ����� 10������ �ȴ�.
		System.out.println("10���� " + decimal);
		System.out.println("8���� " + octal);
		System.out.println("16���� " + hex);

		//���� �ٸ� ������ ����ϴ��� ������ �����Ѵ�.
		System.out.println(decimal + octal + hex);//2�������� �����ؼ� 10������ ���´�.
	}
}
