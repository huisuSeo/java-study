package day0110;

/**
 * 1. �̸����� method�� argument�� �Է¹޾�, ��ȿ�� ������ �����Ͽ� ��ȿ�ϸ� true�� ��ȿ�ϸ� false�� ��ȯ�ϴ�
 * method�� �ۼ��ϼ���.<br>
 * ��ȿ�� : �̸����� 5�����̻��̸�, @�� .�� ����־�� �ϰ� @�� . ���� ���� ���;� �Ѵ�. 2. ���ڿ��� �Է¹޾� ���ڿ��� ��¿,
 * ��¿, �����̶�� �ܾ ���ԵǾ��ִٸ� ��MZ���롱 �� �׷��� ������ ���������롱�� ��ȯ�ϴ� method�� �ۼ��ϼ���.<br>
 * *�� method��� instance method�� �ۼ��Ͽ� ȣ���ϰ� ����� ����غ�����.
 * 
 * @author user
 */
public class Work0110 {
	private String email;
	private String mz;
	
		
	public void setEmail(String email) {
		this.email = email;
	}//setEmail
	
	public String getEmail() {
		return email;
	}//getEmail
	
	public void setMz(String mz) {
		this.mz = mz;
	}//setEmail
	
	public String getMz() {
		return mz;
	}//getEmail
	
	public void email() {
//		boolean bool = email.length() >= 6 && email.contains("@")
//				&& email.contains(".") && email.indexOf("@") < email.indexOf(".");
		int atIndex = email.indexOf("@");
		boolean bool = email.length() >= 6 && atIndex != 1
				&& email.indexOf(".") != 1 && atIndex < email.indexOf(".");
		System.out.println(bool);

	}//email
		
	public void mz() {
		if(mz.contains("��¿") || mz.contains("��¿") || mz.contains("����")) {
			System.out.println("MZ����");
		}else {
			System.out.println("��������");
		}//else
		
	}//mz
	

	
}//class


