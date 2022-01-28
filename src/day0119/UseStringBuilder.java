package day0119;

/**
 * �� ���ڿ��� �ٷ�� Ŭ����
 * @author user
 *
 */
public class UseStringBuilder {
	
	public void useStringBuffer() {
		StringBuffer sb = new StringBuffer();
		//�� �߰�. append()
		sb.append(2022);//����
		sb.append('A');//����
		sb.append("1.19");//
		sb.append(false);//
		
		System.out.println(sb + " " + sb.length());
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("������ ������ �Դϴ�.");//����
		sb2.insert(4, "2022�� 1�� 19�� ");//����
		sb2.delete(4, 9);//���� 2022��

		
		System.out.println(sb2);
	}//UseStringBuffer
	

		public void useStringBuilder() {
			StringBuffer sb = new StringBuffer();
			//�� �߰�. append()
			sb.append(2022);//����
			sb.append('A');//����
			sb.append("1.19");//
			sb.append(false);//
			
			System.out.println(sb + " " + sb.length());
			
			StringBuilder sb2 = new StringBuilder();
			sb2.append("������ ������ �Դϴ�.");//����
			sb2.insert(4, "2022�� 1�� 19�� ");//����
			sb2.delete(4, 9);//���� 2022��

			
			System.out.println(sb2);
			
			String fileName = "e:/dev/workspace/javase_prj/day0119/UseStringBuilder.java";
			
			StringBuilder sb3 = new StringBuilder(fileName);
			sb3.insert(sb3.lastIndexOf("."), "_bak");
			
			System.out.println(sb3);
//			String temp = sb3.toString();
//			System.out.println(temp.toUpperCase());
			System.out.println(sb3.toString().toUpperCase());
			//���� ���/���ϸ��� "e:/dev/workspace/javase_prj/day0119/UseStringBuilder_bak.java"
			//�� �����Ͽ� ���!!! UseStringBuilder.java ���ϸ�_bak�� �־ ����� ���.
		
	}//UseStringBuilder
	
	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		System.out.println("-----------------useStringBuffer--------------------");
		
		usb.useStringBuffer();
		System.out.println("-----------------useStringBuilder--------------------");
		usb.useStringBuilder();
		
		
		
		
		
	}//main

}//class
