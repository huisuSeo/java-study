package day0118;

/**
 * 사람을 대상으로 객체모델링하여 작성한 클래스.<br>
 * 01 - 17 - 2022 Person class를 추상클래스로 수정
 * 명사적 : 눈, 코, 입, 이름
 * 동사적 : 먹는일 
 * (모든 사람이 먹는 일은 하지만 다 다른걸 먹는다 => 부모클래스에서 구현할 필요가 없음 => 추ㅅ상 method)
 * @author user
 */
public abstract class Person {
	private int eye;//눈
	private int nose;//코
	private int mouth;//입
	private String name;//이름
	
	/**
	 * 사람 객체가 생성될 때 기본적으로 가지고 있어야 할 값 설정하는 기본 생성자.<br>
	 * 눈 2개, 코 1개, 입 1개
	 */
	public Person() {
		//사람 객체가 생성될 때 기본적으로 가지고 있어야 할 값 설정
		this(2, 1, 1); //01 - 13 - 2022년 생성자를 호출하는 코드로 변경.
	}//Person
	
	/**
	 * 눈, 코, 입의 개수가 다른 사람 객체를 생성할 때 사용하는 생성자.(Overload된 생성자)
	 * @param eye 눈
	 * @param nose 코
	 * @param mouth 입
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
	}//Person
	
	/**
	 * setter method : 입력된 값을 instance variable에 설정하는 일.
	 * 생성된 사람 객체에 눈의 개수를 설정하는 일.
	 * @param eye 설정할 눈의 개수.
	 */
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye

	/**
	 * 생성된 사람 객체에 코의 개수를 설정하는 일.
	 * @param nose 설정할 코의 개수.
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}//setEye
	
	/**
	 * 생성된 사람 객체에 입의 개수를 설정하는 일.
	 * @param mouth 설정할 입의 개수.
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setEye
	
	/**
	 * 생성된 사람객체에 이름을 설정하는 일.
	 * @param name 설정할 이름.
	 */
	public void setName(String name) {
		this.name = name;
	}//setName
	
	/**
	 * getter method : 객체가 가지고 있는 instance variable에 값을 얻는 일
	 * @return 객체의 눈의 개수.
	 */
	public int getEye() {
		return eye;
	}//getEye
	
	/**
	 * 생성된 사람 객체가 가지고 있는 nose 변수에 값을 얻는 일.
	 * @return 객체의 코의 개수.
	 */
	public int getNose() {
		return nose;
	}//getNose

	/**
	 * 생성된 사람 객체가 가지고 있는 Mouth 변수에 값을 얻는 일.
	 * @return 객체의 입의 개수.
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	/**
	 * 생성괸 사람 객체가 가지고 있는 name instance variable에 값을 얻는 일.
	 * @return 객체의 이름.
	 */
	public String getName() {
		return name;
	}//getName
	
	/**
	 * 동사적인 특징 구현.
	 * 생성된 사람 객체가 집에서 밥을 먹는 일.
	 * @return 밥을 먹는 일.
	 */
	public abstract String eat();
	
	/**
	 * 생성된 사람 객체가 밖에서 음식을 사먹는 일.
	 * @param menu 음식종류
	 * @param price 음식가격
	 * @return 밖에서 사먹는 일
	 */
	public abstract String eat(String menu, int price);
	
}//class