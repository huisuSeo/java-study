package day0117;

/**
 * ��,��,��,�̸�,�Դ� ���� �θ�Ŭ�������� ���ǵ� �ڵ带 ����ϰ�(��� : �ڵ��� ���뼺)
 * �ڽŸ��� Ư¡�� ������ Ŭ����<br>
 * ���� ���. �Ϲ� ������ ���� ��� 2.
 * ���� 1~10����
 * @author user
 *
 */
public class Clark extends Person {
	public int power;
	
	public Clark() {
		super(3,1,1);//�θ�Ŭ������ �����ε� �� ������
		power = 8;
	}//Clark

	/**
	 * ���� ���� ���� �޶�����
	 * @param stone
	 * @return
	 */
	public String power(String stone) {
		String result = "";
		
		if(stone.equals("ũ���䳪��Ʈ")) {//���� ����
			result = "~(_-_)~ ���� ������.....";
			power = 1;
		}else if(stone.equals("���̾Ƹ��")) {//��δϰ� ���� ��
			result = "~(^^~)(~^^)~ �����մϴ�.";
			power = 10;
		}else {//����� ���� ��
			result = "(-- +) ��г���.";
			power = 12;
		}//else
		
		return result;
	}//power
	
	@Override
	public String eat() {
		return getName() + "��(��) ������ ���� ��Ʈ���� �Դ´�";
	}//eat
	
	@Override
	public String eat(String menu, int price) {
		return getName() + "��(��) ����������� " + menu + "�� ������ " + price + "$ ���� ��Դ´�.";
	}//eat
	
}//class
