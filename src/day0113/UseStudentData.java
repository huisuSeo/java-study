package day0113;

/**
 * int, String, int, String, double 로 구성된 사용자 정의 자료형을 사용.
 * @author user
 */
public class UseStudentData {

	public static void main(String[] args) {
		Student sungjun = new Student(1, "황성준", 25, "AB", 183.5);
		Student sihun = new Student(2, "정시헌", 26, "A", 176.2);
		
		System.out.printf("%s학생은 %d번이고 %d살 혈액형은 %s형 입니다.\n",
				sungjun.getName(),sungjun.getNum(),sungjun.getAge(),sungjun.getBloodtype());
		System.out.printf("%s학생은 %d번이고 %d살 혈액형은 %s형 입니다.\n",
				sihun.getName(),sihun.getNum(),sihun.getAge(),sihun.getBloodtype());
		
		///그렇게 1년이 지나는데...
		sungjun.setAge(sungjun.getAge()+1);
		sihun.setAge(sihun.getAge()+1);
		System.out.printf("%s학생은 %d번이고 %d살 혈액형은 %s형 입니다.\n",
				sungjun.getName(),sungjun.getNum(),sungjun.getAge(),sungjun.getBloodtype());
		System.out.printf("%s학생은 %d번이고 %d살 혈액형은 %s형 입니다.\n",
				sihun.getName(),sihun.getNum(),sihun.getAge(),sihun.getBloodtype());
		
		
		//객체 배열, 방에 객체의 주소를 저장하는 배열.
		//선언 + 생성
		Student[] students = new Student[3];
		//값 할당 : 방에는 사용자 정의자료형(Student)으로 생성한 객체를 할당한다.
		students[0] = new Student(1, "김진영", 24, "A", 162.1);
		students[1] = new Student(2, "정시헌", 26, "AB", 181.1);
		students[2] = new Student(3, "강현모", 26, "O", 177.2);
		
		System.out.println(students[0] + " / " + students[1]);
		
		Student temp = null;
		for(int i = 0 ; i < students.length ; i++) {
//			System.out.println(students[i].getName());
			temp = students[i];
			System.out.println(temp.getName() + " / " + temp.getAge());
		}//for
		
		System.out.println("-------------------------------");
		//개선된 for문으로 students 배열의 모든 방의 값을 출력.
		//출력 값, 이름, 나이, 키 , 태어난 해
		for(Student tempData : students) {
			System.out.println(tempData.getName() + " / " + tempData.getAge() + " / " +
		(2022 - tempData.getAge() + 1));
		}
		
		}//main

}//class
