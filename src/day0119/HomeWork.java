package day0119;

import java.util.StringTokenizer;

public class HomeWork {
	
	public char[] password() {
		int[] number = new int[8];
		char[] password = new char[8];
			for(int i = 0 ; i < 8 ; i ++) {
				int ran = (int)(Math.random()*3);
				switch(ran) {
				case 0 : number[i] = ((int)(Math.random()*26) + 65);
				break;
				case 1 : number[i] = ((int)(Math.random()*26) + 97);
				break;
				case 2 : number[i] = ((int)(Math.random()*10) + 48);
				break;
				}//switch
			
				password[i] = (char)number[i];
			}//for
		
			
		return password;
	}//password
	
	
	public int[] lotto() {
		int[] lotto = new int[6];
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = ((int)(Math.random()*45) + 1);
	
			
			for(int j = 0 ; j < i ; j++) {
			if(lotto[i] == lotto[j]) {
				i--; //i�� �����ϴ��� ���� for�� ����Ǳ� ������ 
				break;//�� �ߺ���ȣ�� �߻����� ���������� �ش��°�濡 �ٽ� ��ȣ�� �����ϵ��� �Ͻø� �˴ϴ�.
			}//if
			}//for
		}//for
		
		return lotto;
	}//lotto
	
	public String[] stringTokenizier() {
		String csvData = "��©����,��©����.����Ƽ��~�������,������";
		StringTokenizer stk = new StringTokenizer(csvData,",.~");
		
		String[] result = new String[stk.countTokens()];
		
		String token = "";
		int i = 0;
		while(stk.hasMoreTokens()) {
			token = stk.nextToken();
			result[i++] = token;
			
		}//while
		
		return result;
	}//stringTokenizier
	
	 
	public int firstName(String firstname) {
		String data = "������,������,�ǿ���,���μ�,�迹��,����,������,������,�ڼ���,������,����ö,�̳���,������,������,������,������,������,������,�ֿ���,Ȳ����,�����";
		StringTokenizer stk = new StringTokenizer(data,firstname);
		int name = stk.countTokens() - 1;
		
		return name;
	}//firstName
	
	
	

	public static void main(String[] args) {
		HomeWork hw = new HomeWork();
		//1��
		System.out.println(hw.password());
		
		//2��
		for(int num : hw.lotto()) {
			System.out.print(num + " ");
		}//for
		
		System.out.println();
		
		//3��
		for(String str : hw.stringTokenizier()) {
			System.out.print(str + " ");
		}//for
		
		System.out.println();
		
		//4��
		System.out.println(hw.firstName("��"));
		
		
	}//main;

}//class
