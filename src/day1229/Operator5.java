package day1229;
/**
	논리연산자
	일반논리
	&&, ||
	비트논리
	&, |, ^
*/
class Operator5 {
	public static void main(String[] args) {
		boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;
/************************************************************************
		//&& : 전항과 후항이 모두 true일 때만 true 반환
**************************************************************************/
		System.out.println(flag1 + " && " + flag3 + " = " + (flag1 && flag3));//true
		System.out.println(flag1 + " && " + flag2 + " = " + (flag1 && flag2));//false
		System.out.println(flag2 + " && " + flag3 + " = " + (flag2 && flag3));//false
		System.out.println(flag2 + " && " + flag4 + " = " + (flag2 && flag4));//false

		/************************************************************************
		//|| : 전항과 후항이 모두 false일 때만 false 반환
		*******************************************************************/
		System.out.println(flag1 + " || " + flag3 + " = " + (flag1 || flag3));//true
		System.out.println(flag1 + " || " + flag2 + " = " + (flag1 || flag2));//true
		System.out.println(flag2 + " || " + flag3 + " = " + (flag2 || flag3));//true
		System.out.println(flag2 + " || " + flag4 + " = " + (flag2 || flag4));//false

		flag1 = false;
		flag2 = false;
		flag3 = false;
		System.out.println("flag1 : " + flag1 + ", flag2 : " + flag2 + ", flag3 : " + flag3);
		// &&는 전항이 false라면 후항을 연산하지 않는다.

		flag3 = (flag1 = 3 < 2) && (flag2 = 2 < 3); //전항이 false이므로 후항을 연산하지 않는다.
		System.out.println("flag1 : " + flag1 + ", flag2 : " + flag2 + ", flag3 : " + flag3);

		//int에 i변수에는 아무 숫자나 할당하고, 그 정수가 0에서부터 100 사이라면 true를 출력하고
		//0에서부터 100 사이가 아니라면 false를 출력하는 코드를 작성.

		int i = -1;
		// 비교값 연산자 기준값  형식, 작은 값에서 큰 값으로 비교
		System.out.println(i + "값은 " + (i >= 0 && i <= 100));


		System.out.println("-----------------비트논리----------------------");
		i = 20;
		int j = 15;
		System.out.println(i + " & " + j + " = " + (i & j));//4

		i = 40;
		j = 12;
		System.out.println(i + " | " + j + " = " + (i | j));//44

		i = 45;
		j = 15;
		System.out.println(i + " ^ " + j + " = " + (i ^ j));//34
	}
}
