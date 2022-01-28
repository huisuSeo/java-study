package day0110;

/**
 * ����� ������� ��ü�𵨸��Ͽ� �ۼ��� Ŭ����.<br>
 * ����� : ��, ��, ��, �̸�
 * ������ : �Դ���
 * @author user
 */
public class Person {
	private int eye;//��
	private int nose;//��
	private int mouth;//��
	private String name;//�̸�
	
	/**
	 * ��� ��ü�� ������ �� �⺻������ ������ �־�� �� �� �����ϴ� �⺻ ������.<br>
	 * �� 2��, �� 1��, �� 1��
	 */
	public Person() {
		//��� ��ü�� ������ �� �⺻������ ������ �־�� �� �� ����
		this(2, 1, 1); //01 - 13 - 2022�� �����ڸ� ȣ���ϴ� �ڵ�� ����.
	}//Person
	
	/**
	 * ��, ��, ���� ������ �ٸ� ��� ��ü�� ������ �� ����ϴ� ������.(Overload�� ������)
	 * @param eye ��
	 * @param nose ��
	 * @param mouth ��
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
	}//Person
	
	/**
	 * setter method : �Էµ� ���� instance variable�� �����ϴ� ��.
	 * ������ ��� ��ü�� ���� ������ �����ϴ� ��.
	 * @param eye ������ ���� ����.
	 */
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye

	/**
	 * ������ ��� ��ü�� ���� ������ �����ϴ� ��.
	 * @param nose ������ ���� ����.
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}//setEye
	
	/**
	 * ������ ��� ��ü�� ���� ������ �����ϴ� ��.
	 * @param mouth ������ ���� ����.
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setEye
	
	/**
	 * ������ �����ü�� �̸��� �����ϴ� ��.
	 * @param name ������ �̸�.
	 */
	public void setName(String name) {
		this.name = name;
	}//setName
	
	/**
	 * getter method : ��ü�� ������ �ִ� instance variable�� ���� ��� ��
	 * @return ��ü�� ���� ����.
	 */
	public int getEye() {
		return eye;
	}//getEye
	
	/**
	 * ������ ��� ��ü�� ������ �ִ� nose ������ ���� ��� ��.
	 * @return ��ü�� ���� ����.
	 */
	public int getNose() {
		return nose;
	}//getNose

	/**
	 * ������ ��� ��ü�� ������ �ִ� Mouth ������ ���� ��� ��.
	 * @return ��ü�� ���� ����.
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	/**
	 * ������ ��� ��ü�� ������ �ִ� name instance variable�� ���� ��� ��.
	 * @return ��ü�� �̸�.
	 */
	public String getName() {
		return name;
	}//getName
	
	/**
	 * �������� Ư¡ ����.
	 * ������ ��� ��ü�� ������ ���� �Դ� ��.
	 * @return ���� �Դ� ��.
	 */
	public String eat() {
		return name + "��(��) ������ ���� �Դ´�";
	}//eat
	
	/**
	 * ������ ��� ��ü�� �ۿ��� ������ ��Դ� ��.
	 * @param menu ��������
	 * @param price ���İ���
	 * @return �ۿ��� ��Դ� ��
	 */
	public String eat(String menu, int price) {
		return name + "��(��) �Ĵ翡�� " + menu + "�� ������ " + price + " �� ���� ��Դ´�.";
	}//eat
	
}//class