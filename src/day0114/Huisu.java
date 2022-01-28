package day0114;

public class Huisu extends Person {
	public int power;
	public Huisu() {
		power = 5; 
	}//Huisu
	
	public String feel(String touch) {
		String msg = "";
		if(touch.equals("폴")) {
			msg = "귀여운 폴이 왔구나^^";
			power = 10;
		}else if(touch.equals("센")) {
			msg = "예쁘고 깜찍하고 사랑스러운 우리 센이 왔구나(><)";
			power = 100;
		}else {
			msg = "이게모지..";
		}//else
		return msg;
	}//feel

}//class
