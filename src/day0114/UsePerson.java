package day0114;

public class UsePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HongGilDong hgd = new HongGilDong();
		//코드의 재사용성. : 부모 클래스의 자원을 자식 클래스에 존재하는 것 처럼 사용한다.
		hgd.setName("홍길동");
		System.out.printf("%s의 눈 %d개, 코 %d개, 입 %d개\n", hgd.getEye(),hgd.getEye(),hgd.getNose(),hgd.getMouth());
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("뜨근한 국밥",1));
		//자신만의 특징을 구현한 method호출.
		System.out.println(hgd.fight(4));//5>6
		System.out.println(hgd.fight(5));//6>7
		System.out.println(hgd.fight(7));//7
		System.out.println(hgd.fight(10));//7>6
		System.out.println(hgd.fight(6));//7>6
		
		System.out.println("=======================================");
		Clark superman = new Clark();
		//코드의 재사용성.
		superman.setName("클락 켄트");
		System.out.printf("%s의 눈 %d개, 코 %d개, 입 %d개\n", superman.getName(),superman.getEye(),superman.getNose(),superman.getMouth());
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크",10));
		
		//자신만의 특징을 구현
		String stone = "짱돌";
		System.out.println(superman.power(stone));
		stone = "다이아몬드";
		System.out.println(superman.power(stone));
		stone = "크립토나이트";
		
		System.out.println(superman.power(stone));
		
		System.out.println("===============================================");
		Huisu pet = new Huisu();
		//코드의 재사용성.
		pet.setName("서희수");
		System.out.printf("%s의 눈 %d개, 코 %d개, 입 %d개\n", pet.getName(),pet.getEye(),pet.getNose(),pet.getMouth());
		System.out.println(pet.eat());
		System.out.println(pet.eat("치킨",10000));
		
		//자신만의 특징을 구현
		String touch = "오징어";
		System.out.println(pet.feel(touch));
		touch = "폴";
		System.out.println(pet.feel(touch));
		touch = "센";
		
		System.out.println(pet.feel(touch));
	}//main

}//class
