package day0107;

/**
 * 1. ��ī�� Ŭ������ ����Ͽ� ��ü�� �����ϰ�
 * 2. ��ī�� ��ü�� �����ϴ� ����� ���.
 * @author user
 */
public class UseMarker {

	public static void main(String[] args) {
		//��ī�� Ŭ������ ����Ͽ� ������ ��ī�� ����.
		Marker black = new Marker();//���������������� ����.
		
		System.out.println(black);
		//black��ü�� �Ѳ�1��, ��ü1��, �������� �����غ���!!!
		//black.cap = 1;//instance ������ private ���������ڰ� ����Ǿ��־� �ܺο��� ����� ������ �� ����.
		
		//������ ��ī�� ��ü�� ���� ����.
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("����");
		
		System.out.println(black.getColor() + "���� ��ī���� �Ѳ�" + black.getCap() + "��, ��ü" + black.getBody() + "��");
		
		
		//5.��ī�� Ŭ������ �����ϴ� ����� ���.
		System.out.println(black.write());
		
		/////////������ ��ī���� �����Ͽ� ���� �ְ� ����غ�����.
		Marker red = new Marker(1, 1, "����");
		
//		black.setCap(2);
//		black.setBody(2);
//		black.setColor("����");
		System.out.println(black.getColor() + "�� ��ī�� �Ѳ�" + black.getCap() + "��, ��" + black.getBody() + "��");
		System.out.println(black.write("��ſ� �ָ�"));
		
	}//main

}//class
