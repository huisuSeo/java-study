package day0113;

/**
 * �л��� ������ ������ �� �ִ� ��������. �л��� ������ �й�, �̸�, ����, ������, Ű �� ����Ǿ�� �Ѵ�.
 * 
 * @author user
 */
public class Student {
	private int num;
	private String name;
	private int age;
	private String bloodtype;
	private double height;
	

	public Student(int num, String name, int age, String bloodtype, double height) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.bloodtype = bloodtype;
		this.height = height;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


}