package day1229;
/**
	main method�� �ܺΰ� �Է��Ͽ� ����ϱ�.
*/
class UseArguments {
	public static void main(String[] args) {
		System.out.println("ó�� �� : " + args[0]);
		System.out.println("�ι�° �� : " + args[1]);

		System.out.println(args[0] + args[1]);

		//int i = args[0]; error ���ڿ��� �⺻���� ������ �� ����.
		//int j = args[1];

		int i = Integer.parseInt( args[0]);//���ڿ��� int������ ��ȯ�Ͽ� int�� ������ �Ҵ�.
		int j = Integer.parseInt( args[1]);//

		System.out.println(args[0] + " + " + args[1] + " = " + (i + j) );

		System.out.println( "i = " + i + ", j = " + j + " " + (i > j ? i + "�� Ů�ϴ�." : j + "�� Ů�ϴ�."));
	}
}