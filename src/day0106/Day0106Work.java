package day0106;

/**
 * �Ʒ��� ������ ó���� �� �ִ� method�� �ۼ��ϰ�, ȣ���Ͽ� ��ȯ ���� �޾� ����ϼ���.
1. �ڽ��� ��(last name) �� ���ڷ� ��ȯ�ϴ� method�� �ۼ�.
2. ������ �Է� �޾Ƽ� ������ ��ȯ�ϴ� method�ۼ�
    (���� : 0~100 ���� �� ���� true�� �׷��� �ʴٸ� false ��ȯ)
3. ������ �Է� �޾Ƽ� ���� (��A�� ~ ��F��)�� ���Ͽ� ��ȯ�ϴ� method�ۼ�. (if�� �ۼ�)
4. �����ð��� �ۼ��� printStar�� ȣ���Ͽ� ���� �Ʒ��� ���� ���.
    ��
    �١�
    �ڡڡ�
    �١١١�
5. �������� ����ϴ� method�� �ۼ��ϼ���.
    �Ű����� ���� method�� ȣ���ϸ� ������ 2���� ����ϰ�,
    ���� �־� method�� ȣ���ϸ� �Է��� ���� �������� ����ϴ� method�� �ۼ��� ��
 * @author user
 */
public class Day0106Work {
	
	/**
	 * 1. �ڽ��� ��(last name) �� ���ڷ� ��ȯ�ϴ� method�� �ۼ�.
	 */
	public static void lastname(){
		System.out.println("S");
	}//lastname
	
	/**
	 * 2. ������ �Է� �޾Ƽ� ������ ��ȯ�ϴ� method�ۼ�
    (���� : 0~100 ���� �� ���� true�� �׷��� �ʴٸ� false ��ȯ)
	 */

	
	public static void test(int i) {
		
		if(i > 1 && i < 101) {
			System.out.println(true);
			
		}else{
			System.out.println(false);
		}//if
	}//test
	
	/**
	 * 3. ������ �Է� �޾Ƽ� ���� (��A�� ~ ��F��)�� ���Ͽ� ��ȯ�ϴ� method�ۼ�. (if�� �ۼ�)
	 * @param i
	 */
	public static void grade(int i) {
		if(i <= 59 && i >= 0) {
			System.out.println('F');
		}else if(i <= 69 && i >= 60){
			System.out.println('D');
		}else if(i <= 79 && i >= 70) {
			System.out.println('C');
		}else if(i <= 89 && i >= 80) {
			System.out.println('B');
		}else if(i <= 100 && i >= 90) {
			System.out.println('A');
		}else {
			System.out.println("����");
		}//if
		
		
	}//grade
	
	/**
	 * 5. �������� ����ϴ� method�� �ۼ��ϼ���.
    �Ű����� ���� method�� ȣ���ϸ� ������ 2���� ����ϰ�,
    ���� �־� method�� ȣ���ϸ� �Է��� ���� �������� ����ϴ� method�� �ۼ��� ��
	 */
	public void gugu(int i) {
		
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
				
			}//for
	}//gugu
	
	public void gugu() {
		int i = 2;
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
				
			}//for
		
	}//gugu
	
	
	public static void main(String[] args) {
		
		TestOverload to = new TestOverload();
		
		
		Day0106Work.lastname();
		Day0106Work.test(60);
		Day0106Work.grade(100);
				
		for(int i = 1 ; i < 5 ; i++) {
			if(i % 2 != 0) {
				for(int j = 0 ; j < i ; j++) {
					to.printStar();
				}//for
			}else{
				to.printStar(i);
			}//if
			System.out.println();
		}//for
		
		
		Day0106Work dw = new Day0106Work();
		dw.gugu(3);

	}//main

}//class
