package day0106;

/**
 * �����μ��� ���.
 * @author user
 */
public class UseVariableArguments {
	
	/**
	 * Variable Arguments�� ����� method�� JDK1.5+���� ���� ����� �� �ִ�.<br>
	 * V.A�� method���ο��� �迭(�ּҸ� ������ �ִ� ������ ��������)�� ���ȴ�.
	 * @param param
	 */
	public void useVA(int ... param) {
//		System.out.println(param);//������ ���������� �ּҰ� ���.
		for(int i = 0 ; i < param.length ; i++) {
			System.out.print(param[i] + " ");
		}//for
	}//useVA
	
	
//	public void useVA2(int paramI , int ... paramJ) {//Error V.A�� ���� ������ paramenter�θ� ���ǵȴ�.
	public void useVA2(int paramI , int ... paramJ) { //V.A�� ���� ������ paramenter�θ� ���ǵȴ�
		System.out.println(paramI);
	}//useVA2

	public static void main(String[] args) {
		//��üȭ : �ν��Ͻ� method�� ������ ����ϱ� ���ؼ�.
		UseVariableArguments uva = new UseVariableArguments();
		uva.useVA();
		System.out.println("---------------------");
		uva.useVA(1);
		System.out.println("---------------------");
		uva.useVA(1,2,433,5,100,6000);//���� ������ n���� ���� ���� �� �ִ�.
//		uva.useVA(1, "2");//������ ���� �ٸ��� error.
		System.out.println("---------------------");
		uva.useVA2(1,1,2,3,4);
//		uva.useVA2(); //int���� �ݵ�� ���� �ԷµǾ���Ѵ�. V.A�� ���� ����
		
		

	}

}
