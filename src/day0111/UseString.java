package day0111;

/**
 * ���ڿ��� �ٷ�� String class ���<br>
 * 
 * ���� : 1. java.lang ��Ű���� �����ϴ� Ŭ���� �̸����� Ŭ������ �����ϸ� ��Ű���� ������ 
 * 			���� �̸��� Ŭ������ ���� ����Ѵ�. (java,lang ��Ű���� Ŭ������ ����ϴ� ���� �ƴϹǷ� error)
 * 			-import�� ����ص� ���� ����.
 * �ذ� : 1. ���� �̸��� Ŭ���� ������ ������ "�ڹٿ��� �����ϴ� Ŭ������ full path"�� �ĺ��Ͽ� ���.
 * 			full path = Ŭ������ ����� �� ��Ű�� ���� ��� ����Ͽ� ����ϴ� ����.
 * 			String�� �ƴ� java.lang.String
 *		 2. java.lang ��Ű���� �����ϴ� �̸����� Ŭ������ ������ �ʴ´�.
 * @author user
 */
public class UseString {
	
	public static void main(String[] args) {
		String str = "AbcdEfg"; //�⺻�� ������ ���
		String str2 = new String("os333@naver.com"); //������ ������ ���
		
		//substring(���۹��ڿ�, �����ڿ� + 1)
		System.out.println(str + "���� 0~2 �ε��� ������ �ڽĹ��ڿ� " + str.substring(0, 2));
		System.out.println(str + "���� 'Efg'�� �߶󺸱� " + str.substring(4, 7));
		System.out.println(str + "���� ���� �ּ� �ڸ��� " + str2.substring(0, str2.indexOf("@")));
		System.out.println(str + "���� ������ �ּ� �ڸ��� " + str2.substring(str2.indexOf("@") + 1, 15));
		//subtring(���۹��ڿ�) : �� �ε����� �����ϸ� ���ڿ��� ������ �ڸ���.
		System.out.println(str + "���� ������ �ּ� �ڸ��� " + str2.substring(str2.indexOf("@") + 1));//substring�� �����ε� �Ǿ��ֱ� ����.\
		
		str = "������";
		System.out.println(str + " �� '������'�ΰ�" + str.startsWith("������"));
		System.out.println(str + " �� '��'���� ����" + str.startsWith("��"));
		System.out.println(str + " �� '��'���� ��" + str.endsWith("��"));
		str = "�����";
		System.out.println(str + " �� '������'�ΰ�" + str.startsWith("������"));
		System.out.println(str + " �� '��'���� ����" + str.startsWith("��"));
		System.out.println(str + " �� '��'���� ��" + str.endsWith("��"));
		
		str = "������ ����� �Դϴ�.";
		System.out.println(str + " �� '����'�� ���� " + str.contains("����"));
		
		str = "Java";
		String str3 = str.concat(" SE");
//		Stirng str3 = str + " SE";
		
		System.out.println(str3);
		
		str = "   Java SE   ";
		System.out.println("[" + str.trim() + "]");
		
		str = "Java Java Java";
		//ġȯ : ã�� ���ڸ� �ٸ� ���ڷ� ����
		System.out.println(str.replace("Ja", "t"));
		
		str = "   Java SE   ";
		//replace ����� ���ڿ� �� ��� ���� ����
		System.out.println("[" + str.replaceAll(" ", "") + "]");
		
		//method chain : method�� ��� �����Ͽ� ����ϴ� ����.
		str = "�� ���� �Ǿ����̾�! �� ��� �������.���Ӥ���";
//		String filterTxt = str.replaceAll("����", "**");
		String filterTxt = str.replaceAll("��", "*").replaceAll("��", "*").replaceAll("��","*").replaceAll("��","*");
		System.out.println(filterTxt);
		
		int i = 11;
		double l = 2022.0111;
		
		str = String.valueOf(i); //str = i + "";
		str2 = String.valueOf(l);
		System.out.println(str + "/" + str2);
		
		//////////////////////String �ʱ�ȭ//////////////////////
		str = null;
		str2 = "";
		
		if(str == null) {//null�� ���¿����� String class�� �����ϴ� method�� ȣ���� �� ����.
			System.out.println(str + "�� heap�� �ּҸ� �������� �ʾҽ��ϴ�.");
		}//if
		
		
		if(str2.isEmpty()) {//empty�� ���¿����� String class�� �����ϴ� method�� ȣ���� �� �ִ�.
			System.out.println(str2 + " �� ���ڿ� ������� �ּҸ� �����Ͽ����ϴ�.");
		}//if
		
	}//main

}//class
