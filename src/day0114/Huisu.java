package day0114;

public class Huisu extends Person {
	public int power;
	public Huisu() {
		power = 5; 
	}//Huisu
	
	public String feel(String touch) {
		String msg = "";
		if(touch.equals("��")) {
			msg = "�Ϳ��� ���� �Ա���^^";
			power = 10;
		}else if(touch.equals("��")) {
			msg = "���ڰ� �����ϰ� ��������� �츮 ���� �Ա���(><)";
			power = 100;
		}else {
			msg = "�̰Ը���..";
		}//else
		return msg;
	}//feel

}//class
