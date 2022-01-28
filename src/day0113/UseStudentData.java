package day0113;

/**
 * int, String, int, String, double �� ������ ����� ���� �ڷ����� ���.
 * @author user
 */
public class UseStudentData {

	public static void main(String[] args) {
		Student sungjun = new Student(1, "Ȳ����", 25, "AB", 183.5);
		Student sihun = new Student(2, "������", 26, "A", 176.2);
		
		System.out.printf("%s�л��� %d���̰� %d�� �������� %s�� �Դϴ�.\n",
				sungjun.getName(),sungjun.getNum(),sungjun.getAge(),sungjun.getBloodtype());
		System.out.printf("%s�л��� %d���̰� %d�� �������� %s�� �Դϴ�.\n",
				sihun.getName(),sihun.getNum(),sihun.getAge(),sihun.getBloodtype());
		
		///�׷��� 1���� �����µ�...
		sungjun.setAge(sungjun.getAge()+1);
		sihun.setAge(sihun.getAge()+1);
		System.out.printf("%s�л��� %d���̰� %d�� �������� %s�� �Դϴ�.\n",
				sungjun.getName(),sungjun.getNum(),sungjun.getAge(),sungjun.getBloodtype());
		System.out.printf("%s�л��� %d���̰� %d�� �������� %s�� �Դϴ�.\n",
				sihun.getName(),sihun.getNum(),sihun.getAge(),sihun.getBloodtype());
		
		
		//��ü �迭, �濡 ��ü�� �ּҸ� �����ϴ� �迭.
		//���� + ����
		Student[] students = new Student[3];
		//�� �Ҵ� : �濡�� ����� �����ڷ���(Student)���� ������ ��ü�� �Ҵ��Ѵ�.
		students[0] = new Student(1, "������", 24, "A", 162.1);
		students[1] = new Student(2, "������", 26, "AB", 181.1);
		students[2] = new Student(3, "������", 26, "O", 177.2);
		
		System.out.println(students[0] + " / " + students[1]);
		
		Student temp = null;
		for(int i = 0 ; i < students.length ; i++) {
//			System.out.println(students[i].getName());
			temp = students[i];
			System.out.println(temp.getName() + " / " + temp.getAge());
		}//for
		
		System.out.println("-------------------------------");
		//������ for������ students �迭�� ��� ���� ���� ���.
		//��� ��, �̸�, ����, Ű , �¾ ��
		for(Student tempData : students) {
			System.out.println(tempData.getName() + " / " + tempData.getAge() + " / " +
		(2022 - tempData.getAge() + 1));
		}
		
		}//main

}//class
