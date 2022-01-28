package day0110;

/**
 * Person 클래스를 객체화하여 사용할 목적으로 만드는 클래스.
 * @author user
 */
public class UsePerson {

	/**
	 * Java Application
	 * @param args
	 */
	public static void main(String[] args) {
		//객체화
		Person huisu = new Person();
		//method호출(일을 하기 위해)
//		huisu.setEye(2);
//		huisu.setNose(1);
//		huisu.setMouth(1);
		huisu.setName("서희수");
		
		//생성된 객체를 사용.
		System.out.println(huisu.eat());
		System.out.println(huisu.eat("뜨끈한 국밥", 9000));
		
		Person jinban = new Person(3, 1, 1);//객체화 : 사람이 태어난 것. - 태어난 사람이 아무것도 가지지 않음.
		
//		jinban.setEye(3);//태어난 이후 눈
//		jinban.setNose(1);//코
//		jinban.setMouth(1);//입을 설정
		
		jinban.setName("천진반");
		System.out.println(jinban.getEye() + " / " + jinban.getNose() + " / " + jinban.getMouth() + " / " + jinban.getName());
		
		System.out.println(jinban.eat());//생성된 객체 사용
		System.out.println(jinban.eat("선두", 0));
		
	}//main

}//class
