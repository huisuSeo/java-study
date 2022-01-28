package day0111;

public class HomeWork0112 {
	private String socialNum;
	boolean flag;
	

	//1��
	public HomeWork0112(String socialNum) {
		this.socialNum = socialNum;  
	}
	
	//2��
	public boolean letters() {
		flag = false;
		if(socialNum.length()==14) {
			flag=true;
		}
		return flag;
		
	}
	
	//3��
	public boolean dash() {
		flag = false;
		if(socialNum.indexOf("-") == 6) {
			flag = true;
		}
		return flag;
	}
	
	//4.
	public String birthday() {
	 	String fyear = socialNum.substring(7,8);
	 	int year=Integer.valueOf(socialNum.substring(0,2));
		
	 	//month�� day�� ��½� 0�� ������������� ������ ��ȯ
		int month= Integer.valueOf(socialNum.substring(2,4));
		int day = Integer.valueOf(socialNum.substring(4,6));

	 	switch(fyear){
		case "1":case "2":case "5":case "6":
	       year= 1900 + year;
	       break;
		case "3":case "4":case "7":case "8":
		  year = 2000 + year;
		  break;
		default:
			year = 1800 + year;
		}

	 
		
		String birthday = year+"�� "+month+"�� "+day+"�� ";
		
		return birthday;
	}

	
	//5. 
	public int age() {
	 	int year = Integer.valueOf(birthday().substring(0,4));

		return 2022-year+1;
		
		
	}
	
	
	//6. ����
	public String gender() {
		String gender= socialNum.substring(7,8);
		
		if(gender.equals("1") || gender.equals("3")) {
			gender="����";
		} else if(gender.equals("2") || gender.equals("4")){
			gender = "����";
		}
		return gender;
	}
	
	public String zodiac() {
		int year = Integer.valueOf(birthday().substring(0,4));
		String zodiac="";
		switch(year%12) {
		// 0-������, 1- ��, 2-��, 3- ����, 4-�� 5-��, 6-ȣ����, 7-�䳢, 8-��, 9-��, 10-��, 11-��
			case 0: zodiac = "������"; break;
			case 1: zodiac = "��"; break;
			case 2: zodiac = "��"; break;
			case 3: zodiac = "����"; break;
			case 4: zodiac = "��"; break;
			case 5: zodiac = "��"; break;
			case 6: zodiac = "ȣ����"; break;
			case 7: zodiac = "�䳢"; break;
			case 8: zodiac = "��"; break;
			case 9: zodiac = "��"; break;
			case 10: zodiac = "��"; break;
			default: zodiac = "��";
		}
		return zodiac;
		
	}
	
	public static void main(String[] args) {
		 HomeWork0112 hw1= new HomeWork0112("970324-2000000");
		if(hw1.letters()) {
			if(hw1.dash() ) {
				System.out.println("�Է��ֹι�ȣ :"+hw1.socialNum);	
				System.out.println("�������: "+hw1.birthday());
				System.out.println("����: "+hw1.age());
				System.out.println("����: "+hw1.gender());
				System.out.println("��: "+hw1.zodiac());
			}else {
				System.out.println("'-' �� ������ġ�� �����ϴ�.");
			}
		}else {
			System.out.println("�ֹι�ȣ�� ���ڼ��� �ٸ��ϴ�.");
		}
		System.out.println("------------------------------------");
		HomeWork0112 hw2= new HomeWork0112("000825-3000000");
		if(hw2.letters()) {	
			if(hw2.dash() ) { //dash method�� boolean�� ��ȯ�ϱ� ������ ==true������ ���� �ʿ�� �����.
				System.out.println("�Է��ֹι�ȣ :"+hw2.socialNum);	
				System.out.println("�������: "+hw2.birthday());
				System.out.println("����: "+hw2.age());
				System.out.println("����: "+hw2.gender());
				System.out.println("��: "+hw2.zodiac());
			}else {
				System.out.println("'-' �� ������ġ�� �����ϴ�.");
			}
		}else {
		System.out.println("�ֹι�ȣ�� ���ڼ��� �ٸ��ϴ�.");
	}
		
		
	}

}
