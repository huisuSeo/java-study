package day0107;

public class Ramen {
	private String type;
	private int water;
	private String topping;
	
	public void setType(String type) {
		this.type = type;
	}//setType
	
	public String getType() {
		return type;
	}//getType
	
	public void setWater(int water) {
		this.water = water;
	}//setWater
	
	public int getWater() {
		return water;
	}//getWater
	
	public void setTopping(String topping) {
		this.topping = topping;
	}//setTopping
	
	public String setTopping() {
		return topping;
	}//getTopping
	
	public String write() {
		return type +  "에 물을 " + water + "ml 넣고 " + topping + "을 넣고 맛있게 먹는다.";
	}//write
	
}//class
