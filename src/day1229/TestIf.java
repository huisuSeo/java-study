package day1229;
/**
단일 if의 사용.<br>
if(조건식){
	조건에 맞을 때 수행할 문장들...
	}
*/
class TestIf {
	public static void main(String[] args) {
		int i = Integer.parseInt( args[0] );
		int num = Integer.parseInt( args[1] );
		
		//입력한 수를 출력하고, 입력한 수가 5와 같다면 한글로 "오"를 출력.
		System.out.println( i );
		if(i == 5){
			System.out.println("오!");
		}//end if

		if( num < 0){//입력된 num이 음수이므로
			num = -num;//부호를 변경하여 다시 설정 한다.
		}//end if

		System.out.println(args[1] + "의 절대값은 " + num + "입니다.");
		//입력된 3번째 값을 출력하고, "오늘"이라면 "2021-12-29"를 출력한다.
		System.out.println(args[2]);
		if(args[2].equals("오늘")){
			System.out.println("2021-12-29");
		}

	}
}
