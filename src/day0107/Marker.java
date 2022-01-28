package day0107;

/**
 * 마카펜을 추상화하여 생성한 클래스.<br>.
 * 명사적인 특징 : 뚜껑, 몸체, 색<br>
 * 동사적인 특징 : 쓴다.
 * @author user
 */
public class Marker {
	private int cap;//뚜껑의 개수
	private int body;//몸체의 개수
	private String color;//색
	
	/**
	 * 01-10-2022 에 추가된 기본생성자.<br>
	 * 뚜껑 1개, 뭄체 1개, 검은색인 마카펜 객체를 생성할 때 사용한다.<br>
	 * 사용법)<br>
	 * Marker 객체면 = new Marker();<br>
	 * 의 문법으로 생성하여 사용한다.
	 */
	public Marker() {
		this(1, 1, "검은");
//		cap = 1;
//		body = 1;
//		color = "검은";
	}//Marker
	
	/**
	 * 입력된 값으로 뚜껑, 뭄체, 색을 설정하여 객체를 생성하는 생성자. 
	 * @param cap 뚜껑의 개수
	 * @param body 몸체의 개수
	 * @param color 색
	 */
	public Marker(int cap, int body, String color) {
		this.cap = cap;
		this.body = body;
		this.color = color;
	}//Marker
	
	/**
	 * 생성된 마카펜 객체에 뚜껑의 개수를 설정하는 일.
	 * @param cap 설정할 뚜껑의 개수
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}//setCap
	
	/**
	 * 생성된 마카펜 객체에 설정된 뚜껑 개수를 반환하는 일.
	 * @return 뚜껑의 개수
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * 생성된 마카펜객체의 몸체개수를 설정하는 일.
	 * @param body 설정할 몸체의 개수
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	
	/**
	 * 생성된 마카펜 객체에 설정된 몸체의 개수.
	 * @return
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * 칠판에 생성된 마카펜 객체를 사용하여 "안녕하세요?"를 쓰는 일 구현.
	 * @return 메시지
	 */
	public String write() {
	return "뚜껑" + cap + "개, 몸체" + body + "개, " + color + "색인 마카펜으로 \"안녕하세요?\" 를 칠판에 쓴다.";
	}//write
	
	/**
	 * 생성된 마카펜 객체에 색을 설정하는 일.
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
		this.color = color;
	}//setColor
	
	/**
	 * 생성된 마카펜 객체가 가진 색을 얻는 일.
	 * @return 색
	 */
	public String getColor() {
		return color;
	}//getColor
	
	
	/**
	 * 칠판에 생성된 마카펜 객체를 사용하여 입력된 메시지를 쓰는 일 구현.
	 * @param msg
	 * @return 메시지
	 */
	public String write(String msg) {
		return color + "색인 마카펜 으로 \"" + msg + "\" 를 칠판에 쓴다.";
	}
}//class
