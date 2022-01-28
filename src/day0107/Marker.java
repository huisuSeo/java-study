package day0107;

/**
 * ��ī���� �߻�ȭ�Ͽ� ������ Ŭ����.<br>.
 * ������� Ư¡ : �Ѳ�, ��ü, ��<br>
 * �������� Ư¡ : ����.
 * @author user
 */
public class Marker {
	private int cap;//�Ѳ��� ����
	private int body;//��ü�� ����
	private String color;//��
	
	/**
	 * 01-10-2022 �� �߰��� �⺻������.<br>
	 * �Ѳ� 1��, ��ü 1��, �������� ��ī�� ��ü�� ������ �� ����Ѵ�.<br>
	 * ����)<br>
	 * Marker ��ü�� = new Marker();<br>
	 * �� �������� �����Ͽ� ����Ѵ�.
	 */
	public Marker() {
		this(1, 1, "����");
//		cap = 1;
//		body = 1;
//		color = "����";
	}//Marker
	
	/**
	 * �Էµ� ������ �Ѳ�, ��ü, ���� �����Ͽ� ��ü�� �����ϴ� ������. 
	 * @param cap �Ѳ��� ����
	 * @param body ��ü�� ����
	 * @param color ��
	 */
	public Marker(int cap, int body, String color) {
		this.cap = cap;
		this.body = body;
		this.color = color;
	}//Marker
	
	/**
	 * ������ ��ī�� ��ü�� �Ѳ��� ������ �����ϴ� ��.
	 * @param cap ������ �Ѳ��� ����
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}//setCap
	
	/**
	 * ������ ��ī�� ��ü�� ������ �Ѳ� ������ ��ȯ�ϴ� ��.
	 * @return �Ѳ��� ����
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * ������ ��ī�水ü�� ��ü������ �����ϴ� ��.
	 * @param body ������ ��ü�� ����
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	
	/**
	 * ������ ��ī�� ��ü�� ������ ��ü�� ����.
	 * @return
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * ĥ�ǿ� ������ ��ī�� ��ü�� ����Ͽ� "�ȳ��ϼ���?"�� ���� �� ����.
	 * @return �޽���
	 */
	public String write() {
	return "�Ѳ�" + cap + "��, ��ü" + body + "��, " + color + "���� ��ī������ \"�ȳ��ϼ���?\" �� ĥ�ǿ� ����.";
	}//write
	
	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ��.
	 * @param color ������ ��
	 */
	public void setColor(String color) {
		this.color = color;
	}//setColor
	
	/**
	 * ������ ��ī�� ��ü�� ���� ���� ��� ��.
	 * @return ��
	 */
	public String getColor() {
		return color;
	}//getColor
	
	
	/**
	 * ĥ�ǿ� ������ ��ī�� ��ü�� ����Ͽ� �Էµ� �޽����� ���� �� ����.
	 * @param msg
	 * @return �޽���
	 */
	public String write(String msg) {
		return color + "���� ��ī�� ���� \"" + msg + "\" �� ĥ�ǿ� ����.";
	}
}//class
