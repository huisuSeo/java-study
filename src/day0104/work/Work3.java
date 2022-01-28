package day0104.work;

/**
 *�ʰ���� :

�⺻����� 10km���� ��ȿ�ϸ�, 10km�� �ʰ��ϸ� �� 5km���� �߰������ 100���� �ٴ´�.
���߱�������� ��쿡�� �Ʒ��� ���� ����ϼ���.
�� �Է� ������� ��XX�� �̵��Ÿ� xxkm�⺻��� xx�� �ʰ���� xx��
�Ѵ� 20�� ���� ����� xx��
���߱������ �ƴ� ��쿡�� �����߱����� �ƴմϴ١��� ����� ��.
 * 
 */
public class Work3 {
//���߱�������� �⺻ ����� ���� ������� �ʴ� ���� ���� ���¸� �����Ƿ� Constant�� ����
	public static final int TOWN_BUS = 800;//��������
	public static final int BUS = 1250;//����
	public static final int SUBWAY = 1300;//����ö
	
	public static void main(String[] args) {
		
		
		if(args[0].equals("��������")||args[0].equals("����")||args[0].equals("����ö")){//���߱������
			int distance = 0;//�Էµ� �̵��Ÿ�.
			int fare = 0;//���
			int overFare = 0;//�ʰ����
			
			distance = Integer.parseInt(args[1]);

			if(args[0].equals("��������")) {
				fare = Work3.TOWN_BUS;
			}else if(args[0].equals("����")) {
				fare = Work3.BUS;
			}else
				fare = Work3.SUBWAY;		
			
			if(distance > 10) {
				overFare = (((distance - 10) / 5) + 1)*100;
			}//end if
			//�Է� ������� ��XX�� �̵��Ÿ� xxkm�⺻��� xx�� �ʰ���� xx��
			//�Ѵ� 20�� ���� ����� xx��
			System.out.println("�Է� ������� " + args[0] + " �̵��Ÿ� " + distance + "km, �⺻��� " + fare + "��, �ѿ�� " + (fare + overFare) + "�� �Ѵ� 20�� ���� �����" + (fare + overFare)*20 + "��");
			
			}else {//���߱�������� �ƴѰ��
				System.out.println("�Է��Ͻ� " + args[0] + "��(��) ���߱�������� �ƴմϴ�.");
			}//end else
			//�ʰ����
		
	}//main

}//class
