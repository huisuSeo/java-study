package day0107;

public class MakeRamen {

	public static void main(String[] args) {
		Ramen �Ŷ�� = new Ramen();
		
		
		�Ŷ��.setType("�Ŷ��");
		�Ŷ��.setWater(500);
		�Ŷ��.setTopping("����");
		
		System.out.println(�Ŷ��.write());
		
		
		Ramen ��¡��«�� = new Ramen();
		
		
		��¡��«��.setType("��¡��«��");
		��¡��«��.setWater(450);
		��¡��«��.setTopping("�ᳪ��");
		
		System.out.println(��¡��«��.write());
		
		
		Ramen ����� = new Ramen();
		
		
		�����.setType("�����");
		�����.setWater(550);
		�����.setTopping("���");
		
		System.out.println(�����.write());
	}//main

}//class
