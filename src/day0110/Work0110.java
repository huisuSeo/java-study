package day0110;

/**
 * 1. 이메일을 method의 argument로 입력받아, 유효성 검증을 수행하여 유효하면 true를 무효하면 false를 반환하는
 * method를 작성하세요.<br>
 * 유효성 : 이메일은 5글자이상이며, @과 .이 들어있어야 하고 @은 . 보다 먼저 나와야 한다. 2. 문자열을 입력받아 문자열에 어쩔,
 * 저쩔, 뇌절이라는 단어가 포함되어있다면 “MZ세대” 를 그렇지 않으면 “늙은세대”를 반환하는 method를 작성하세요.<br>
 * *두 method모두 instance method로 작성하여 호출하고 결과를 출력해보세요.
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
		if(mz.contains("어쩔") || mz.contains("저쩔") || mz.contains("뇌절")) {
			System.out.println("MZ세대");
		}else {
			System.out.println("늙은세대");
		}//else
		
	}//mz
	

	
}//class


