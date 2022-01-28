package day0107;

public class MakeRamen {

	public static void main(String[] args) {
		Ramen 신라면 = new Ramen();
		
		
		신라면.setType("신라면");
		신라면.setWater(500);
		신라면.setTopping("스팸");
		
		System.out.println(신라면.write());
		
		
		Ramen 오징어짬뽕 = new Ramen();
		
		
		오징어짬뽕.setType("오징어짬뽕");
		오징어짬뽕.setWater(450);
		오징어짬뽕.setTopping("콩나물");
		
		System.out.println(오징어짬뽕.write());
		
		
		Ramen 진라면 = new Ramen();
		
		
		진라면.setType("진라면");
		진라면.setWater(550);
		진라면.setTopping("계란");
		
		System.out.println(진라면.write());
	}//main

}//class
