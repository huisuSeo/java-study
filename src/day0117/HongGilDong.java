package day0117;

/**
 *����� ���� Ư¡(��, ��, ��, �̸�, �Դ���)�� Person Ŭ�������� ������ ����ϰ� �ڽ��� Ư¡�� �����ϴ� 
 *�ڽ�Ŭ����<br>
 *ȫ�浿�� �ο��� ���ϴ� Ư¡.
 *�ο� ������ 1~10���� ����.<br> ��� ������ �ο��� 3���� ����.
 * @author user
 *
 */
public class HongGilDong extends Person {
	private int myLevel;
	public HongGilDong() {
		super();
		myLevel = 5;
	}//HongGilDong
	
	public String fight(int yourLevel) {
		String resultMsg = "";
		if(myLevel < yourLevel) {//���� ���
			resultMsg = "OTz �ο򿡼� ����";
			myLevel--;
			if(myLevel < 1) {
				myLevel = 1;
			}//if
		}else if(myLevel > yourLevel) {//�̱�� ���
			resultMsg = "s('.^)V �ο򿡼� �̰���.";
			myLevel++;
			if(myLevel > 10) {
				myLevel = 10;
			}//if
		}else {//���� ���
			resultMsg = "(--+)�ο򿡼� �����.";
		}//else
		return resultMsg;
	}//fight
	
	@Override
	public String eat() {
		return getName() + "�� ������ ���� �Դ´�.";
	}//eat
	
	@Override
	public String eat(String fn, int price) {
		//name�� �θ�Ŭ�������� private ���������ڷ� �Ǿ������Ƿ� �ܺο��� ���� ������ �� �� ����.
//		return name + "��(��) �Ĵ翡�� " + fn + "�� ������ " + price + " �� ���� ��Դ´�.";
		//public�� method�� ȣ���Ͽ� ����Ѵ�.
		return getName() + "��(��) �ָ����� " + fn + "�� ������ " + price + "�� ���� ��Դ´�.";
	}//eat

}//class
