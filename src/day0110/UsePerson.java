package day0110;

/**
 * Person Ŭ������ ��üȭ�Ͽ� ����� �������� ����� Ŭ����.
 * @author user
 */
public class UsePerson {

	/**
	 * Java Application
	 * @param args
	 */
	public static void main(String[] args) {
		//��üȭ
		Person huisu = new Person();
		//methodȣ��(���� �ϱ� ����)
//		huisu.setEye(2);
//		huisu.setNose(1);
//		huisu.setMouth(1);
		huisu.setName("�����");
		
		//������ ��ü�� ���.
		System.out.println(huisu.eat());
		System.out.println(huisu.eat("�߲��� ����", 9000));
		
		Person jinban = new Person(3, 1, 1);//��üȭ : ����� �¾ ��. - �¾ ����� �ƹ��͵� ������ ����.
		
//		jinban.setEye(3);//�¾ ���� ��
//		jinban.setNose(1);//��
//		jinban.setMouth(1);//���� ����
		
		jinban.setName("õ����");
		System.out.println(jinban.getEye() + " / " + jinban.getNose() + " / " + jinban.getMouth() + " / " + jinban.getName());
		
		System.out.println(jinban.eat());//������ ��ü ���
		System.out.println(jinban.eat("����", 0));
		
	}//main

}//class
